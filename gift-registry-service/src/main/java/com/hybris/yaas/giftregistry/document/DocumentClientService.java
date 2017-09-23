package com.hybris.yaas.giftregistry.document;

import com.hybris.yaas.giftregistry.client.document.DocumentClient;
import com.hybris.yaas.giftregistry.document.data.DocumentCreateResponse;
import com.hybris.yaas.giftregistry.document.data.DocumentGiftRegistry;
import com.hybris.yaas.giftregistry.resources.Error;
import com.hybris.yaas.giftregistry.resources.SortableParameters;
import com.hybris.yaas.giftregistry.resources.YaasAwareParameters;
import com.hybris.yaas.giftregistry.utility.ErrorHandler;
import com.sap.cloud.yaas.servicesdk.authorization.AccessToken;
import com.sap.cloud.yaas.servicesdk.jerseysupport.pagination.PaginatedCollection;
import com.sap.cloud.yaas.servicesdk.jerseysupport.pagination.PaginationRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author leonid.krasnov
 */
@Service
public class DocumentClientService {
   private static final Logger LOG = LoggerFactory.getLogger(DocumentClientService.class);

   private final static String DATA_TYPE_GIFT_REGISTRY = "giftRegistry";
   private final static String DATA_TYPE_GIFT = "gift";

   private final static int MAX_CREATE_TRIES = 5;

   @Value("${YAAS_CLIENT}")
   private String client;

   @Autowired
   private DocumentClient documentClient;

   public PaginatedCollection<DocumentGiftRegistry> getDocumentGiftRegistries(final YaasAwareParameters yaasAware,
                                                                              final PaginationRequest paginationRequest,
                                                                              final SortableParameters sortableParameters,
                                                                              final AccessToken accessToken) {
      final Response response = documentClient
            .tenant(yaasAware.getHybrisTenant())
            .client(client)
            .dataType(DATA_TYPE_GIFT_REGISTRY)
            .prepareGet()
            .withAuthorization(accessToken.toAuthorizationHeaderValue())
            .withPageNumber(paginationRequest.getPageNumber())
            .withPageSize(paginationRequest.getPageSize())
            .withTotalCount(paginationRequest.isCountingTotal())
            .withSort(sortableParameters.getSort())
            .execute();

      if (response.getStatus() == Response.Status.OK.getStatusCode()) {
         final List<DocumentGiftRegistry> documents = response.readEntity(new GenericType<List<DocumentGiftRegistry>>() {});
         return PaginatedCollection.of(documents).with(response, paginationRequest).build();
      }
      else if(response.getStatus() == Response.Status.NOT_FOUND.getStatusCode()) {
         return PaginatedCollection.of(Collections.<DocumentGiftRegistry>emptyList()).build();
      }

      throw ErrorHandler.resolveErrorResponse(response, accessToken);
   }

   public DocumentCreateResponse createDocumentGiftRegistry(final YaasAwareParameters yaasAware, final DocumentGiftRegistry documentGiftRegistry,
                                  final AccessToken accessToken) {
      for(int numTries = 0; numTries < MAX_CREATE_TRIES; numTries++) {
         final Response response = documentClient
               .tenant(yaasAware.getHybrisTenant())
               .client(client)
               .dataType(DATA_TYPE_GIFT_REGISTRY)
               .preparePost()
               .withAuthorization(accessToken.toAuthorizationHeaderValue())
               .withPayload(documentGiftRegistry)
               .execute();
         if (response.getStatus() == Response.Status.CREATED.getStatusCode()) {
            return response.readEntity(DocumentCreateResponse.class);
         }

         final Error error = response.readEntity(Error.class);

         // Only try again if error message is about duplicate ID being generated
         if(!error.getMessage().contains("Duplicated ID in schema")) {
            throw ErrorHandler.resolveErrorResponse(response, accessToken);
         }

      }

      throw new InternalServerErrorException("Error creating gift registry");
   }

   public DocumentGiftRegistry getDocumentGiftRegistry(final YaasAwareParameters yaasAware,
                                                       final String giftRegistryId, final AccessToken accessToken) {
      final Response response = documentClient
            .tenant(yaasAware.getHybrisTenant())
            .client(client)
            .dataType(DATA_TYPE_GIFT_REGISTRY)
            .dataId(giftRegistryId)
            .prepareGet()
            .withAuthorization(accessToken.toAuthorizationHeaderValue())
            .execute();
      if (response.getStatus() == Response.Status.OK.getStatusCode()) {
         return response.readEntity(DocumentGiftRegistry.class);
      }
      else if(response.getStatus() == Response.Status.NOT_FOUND.getStatusCode()) {
         throw new NotFoundException("Gift registry with id " + giftRegistryId + "not found", response);
      }

      throw ErrorHandler.resolveErrorResponse(response, accessToken);
   }
   
   public void deleteGiftRegistry(YaasAwareParameters yaasAware, String giftRegistryId, AccessToken accessToken) {
		final Response response = documentClient
            .tenant(yaasAware.getHybrisTenant())
            .client(client)
				.dataType(DATA_TYPE_GIFT_REGISTRY)
            .dataId(giftRegistryId)
            .prepareDelete()
				.withAuthorization(accessToken.toAuthorizationHeaderValue())
            .execute();

		if (response.getStatus() == Response.Status.NO_CONTENT.getStatusCode()) {
			return;
		}
      else if (response.getStatus() == Response.Status.NOT_FOUND.getStatusCode()) {
			throw new NotFoundException("Cannot find GiftRegistry with ID " + giftRegistryId, response);
		}

      throw ErrorHandler.resolveErrorResponse(response, accessToken);
	}

}
