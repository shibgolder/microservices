package com.hybris.yaas.giftregistry.service;

import com.hybris.yaas.giftregistry.document.DocumentClientService;
import com.hybris.yaas.giftregistry.document.data.DocumentCreateResponse;
import com.hybris.yaas.giftregistry.document.data.DocumentGiftRegistry;
import com.hybris.yaas.giftregistry.email.EmailClientService;
import com.hybris.yaas.giftregistry.email.data.EmailData;
import com.hybris.yaas.giftregistry.resources.Email;
import com.hybris.yaas.giftregistry.resources.GiftRegistry;
import com.hybris.yaas.giftregistry.resources.SortableParameters;
import com.hybris.yaas.giftregistry.resources.YaasAwareParameters;
import com.sap.cloud.yaas.servicesdk.authorization.AuthorizationScope;
import com.sap.cloud.yaas.servicesdk.authorization.DiagnosticContext;
import com.sap.cloud.yaas.servicesdk.authorization.integration.AuthorizedExecutionTemplate;
import com.sap.cloud.yaas.servicesdk.jerseysupport.pagination.PaginatedCollection;
import com.sap.cloud.yaas.servicesdk.jerseysupport.pagination.PaginationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * @author leonid.krasnov
 */
@Service
public class GiftRegistryService {

   private final static String SCOPE_DOCUMENT_MANAGE = "hybris.document_manage";
   private static final String SCOPE_DOCUMENT_VIEW = "hybris.document_view";
    private static final String SCOPE_EMAIL_SEND = "hybris.email_send";
    private static final String SCOPE_EMAIL_MANAGE = "hybris.email_manage";


   @Autowired
   private AuthorizedExecutionTemplate authorizedExecutionTemplate;
   @Autowired
   private ConversionService conversionService;
   @Autowired
   private DocumentClientService documentClientService;
   @Autowired
   private EmailClientService emailClient;

   public String createGiftRegistry(final YaasAwareParameters yaasAware, final GiftRegistry giftRegistry) {
      final DocumentGiftRegistry documentGiftRegistry = conversionService.convert(giftRegistry, DocumentGiftRegistry.class);

      final DocumentCreateResponse createResponse = authorizedExecutionTemplate.executeAuthorized(
            new AuthorizationScope(yaasAware.getHybrisTenant(), Arrays.asList(SCOPE_DOCUMENT_MANAGE)),
            new DiagnosticContext(yaasAware.getHybrisRequestId(), yaasAware.getHybrisHop()),
            accessToken -> documentClientService
                  .createDocumentGiftRegistry(yaasAware, documentGiftRegistry, accessToken));

      return createResponse.getId();
   }

   public PaginatedCollection<GiftRegistry> getGiftRegistries(final YaasAwareParameters yaasAware,
                                                              final PaginationRequest paginationRequest,
                                                              final SortableParameters sortableParameters) {
      final PaginatedCollection<DocumentGiftRegistry> documentGiftRegistries = authorizedExecutionTemplate.executeAuthorized(
            new AuthorizationScope(yaasAware.getHybrisTenant(), Arrays.asList(SCOPE_DOCUMENT_VIEW)),
            new DiagnosticContext(yaasAware.getHybrisRequestId(), yaasAware.getHybrisHop()),
            accessToken -> documentClientService
                  .getDocumentGiftRegistries(yaasAware, paginationRequest, sortableParameters, accessToken));

      final List<GiftRegistry> giftRegistries = StreamSupport
            .stream(documentGiftRegistries.spliterator(), false)
            .map(documentGiftRegistry -> conversionService.convert(documentGiftRegistry, GiftRegistry.class))
            .collect(Collectors.toList());

      return PaginatedCollection.of(giftRegistries)
            .withPageNumber(documentGiftRegistries.getPageNumber())
            .withPageSize(documentGiftRegistries.getPageSize())
            .withNextPage(documentGiftRegistries.hasNextPage())
            .withTotalCount(documentGiftRegistries.getTotalCount())
            .build();
   }


   /**
    * Share Gift Registry via email..
    * @param yaasAware
    * @param giftRegistryId
    * @return boolean
    */
   public boolean shareGiftRegistryByEmail(final YaasAwareParameters yaasAware, final String giftRegistryId, Email email){

      final GiftRegistry giftRegistry = this.getGiftRegistry(yaasAware, giftRegistryId);
      final EmailData emailData =  conversionService.convert(email, EmailData.class);
      
      final boolean created = authorizedExecutionTemplate.executeAuthorized(
              new AuthorizationScope(yaasAware.getHybrisTenant(), Arrays.asList(SCOPE_EMAIL_MANAGE)),
              new DiagnosticContext(yaasAware.getHybrisRequestId(), yaasAware.getHybrisHop()),
              token -> emailClient.createTemplate(yaasAware, token));

      if (created) {
             authorizedExecutionTemplate.executeAuthorized(
                  new AuthorizationScope(yaasAware.getHybrisTenant(), Arrays.asList(SCOPE_EMAIL_MANAGE)),
                  new DiagnosticContext(yaasAware.getHybrisRequestId(), yaasAware.getHybrisHop()),
                 token -> {
                    emailClient.uploadTemplateSubject(yaasAware, token);
                    return null;
                 });

             authorizedExecutionTemplate.executeAuthorized(
                  new AuthorizationScope(yaasAware.getHybrisTenant(), Arrays.asList(SCOPE_EMAIL_MANAGE)),
                  new DiagnosticContext(yaasAware.getHybrisRequestId(), yaasAware.getHybrisHop()),
                 token -> {
                    emailClient.uploadTemplateBody(yaasAware, token);
                    return null;
                 });
      }

      return authorizedExecutionTemplate.executeAuthorized(
              new AuthorizationScope(yaasAware.getHybrisTenant(), Arrays.asList(SCOPE_EMAIL_SEND)),
              new DiagnosticContext(yaasAware.getHybrisRequestId(), yaasAware.getHybrisHop()),
              token -> {
                 emailClient.sendMail(yaasAware, giftRegistry, emailData, token);
                 return true;
              });
   }
   
   public GiftRegistry getGiftRegistry(final YaasAwareParameters yaasAware, final String giftRegistryId) {
      final DocumentGiftRegistry documentGiftRegistry = authorizedExecutionTemplate.executeAuthorized(
            new AuthorizationScope(yaasAware.getHybrisTenant(), Arrays.asList(SCOPE_DOCUMENT_VIEW)),
            new DiagnosticContext(yaasAware.getHybrisRequestId(), yaasAware.getHybrisHop()),
            accessToken -> documentClientService
                  .getDocumentGiftRegistry(yaasAware, giftRegistryId, accessToken));

      return conversionService.convert(documentGiftRegistry, GiftRegistry.class);

   }
   
   public void deleteGiftRegistry(YaasAwareParameters yaasAware, String giftRegistryId) {

		authorizedExecutionTemplate.executeAuthorized(
				new AuthorizationScope(yaasAware.getHybrisTenant(), Arrays.asList(SCOPE_DOCUMENT_MANAGE)),
				new DiagnosticContext(yaasAware.getHybrisRequestId(), yaasAware.getHybrisHop()),
				accessToken -> {
               documentClientService.deleteGiftRegistry(yaasAware, giftRegistryId, accessToken);

               return null;
            });
		
	}

}
