package com.hybris.yaas.giftregistry.email;

import com.hybris.yaas.giftregistry.client.email.EmailServiceClient;
import com.hybris.yaas.giftregistry.email.data.EmailData;
import com.hybris.yaas.giftregistry.email.data.EmailTemplateData;
import com.hybris.yaas.giftregistry.email.data.EmailTemplateDefinitionData;
import com.hybris.yaas.giftregistry.email.data.TemplateAttributeDefinitionData;
import com.hybris.yaas.giftregistry.email.data.TemplateAttributeValueData;
import com.hybris.yaas.giftregistry.resources.GiftRegistry;
import com.hybris.yaas.giftregistry.resources.YaasAwareParameters;
import com.hybris.yaas.giftregistry.utility.ErrorHandler;
import com.sap.cloud.yaas.servicesdk.authorization.AccessToken;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * @author Shib Golder
 */
@Service
public class EmailClientService {

    private final String TEMPLATE_CODE = "giftregistry";
    private final String locale = Locale.ENGLISH.getLanguage();

    @Value("${YAAS_CLIENT}")
    private String client;

    @Inject
    private EmailServiceClient emailClient;

    /**
     *  This method will be used to create the meta data of the email templates
     * @param yaasAware
     * @param token
     * @return boolean
     */
    public boolean createTemplate(final YaasAwareParameters yaasAware, final AccessToken token) {

        final EmailTemplateDefinitionData emailTemplateDefinitionData = new EmailTemplateDefinitionData();
        emailTemplateDefinitionData.setCode(TEMPLATE_CODE);
        emailTemplateDefinitionData.setOwner(client);
        emailTemplateDefinitionData.setName("Giftregistry Created Mail");
        emailTemplateDefinitionData.setDescription("Template for Giftregistry Created Mail");

        final List<TemplateAttributeDefinitionData> templateAttributeDefinitionData = new ArrayList<TemplateAttributeDefinitionData>();
        templateAttributeDefinitionData.add(new TemplateAttributeDefinitionData("ownerId", true));
        templateAttributeDefinitionData.add(new TemplateAttributeDefinitionData("title", true));
        templateAttributeDefinitionData.add(new TemplateAttributeDefinitionData("description", false));
        emailTemplateDefinitionData.setTemplateAttributeDefinitions(templateAttributeDefinitionData);

        final Response response = emailClient
                .tenantTemplates(yaasAware.getHybrisTenant())
                .preparePost()
                .withAuthorization(token.toAuthorizationHeaderValue())
                .withPayload(Entity.json(emailTemplateDefinitionData))
                .execute();

        if (response.getStatus() == Response.Status.CREATED.getStatusCode()) {
            return true;
        } else if (response.getStatus() == Response.Status.CONFLICT.getStatusCode()) {
            return false;
        }
        throw ErrorHandler.resolveErrorResponse(response, token);
    }

    public void uploadTemplateSubject(final YaasAwareParameters yaasAware, final AccessToken token) {
        uploadTemplateMedia(yaasAware, "subject", token);
    }

    public void uploadTemplateBody(final YaasAwareParameters yaasAware, final AccessToken token) {
        uploadTemplateMedia(yaasAware, "body", token);
    }

    /**
     * Upload the email template to Yaas
     * @param yaasAware
     * @param type
     * @param token
     */
    private void uploadTemplateMedia(final YaasAwareParameters yaasAware, final String type, final AccessToken token) {
        final EmailTemplateData template = EmailTemplateData.builder()
                .setFilePath("templates" + File.separator + type + ".vm")
                .setCode(TEMPLATE_CODE)
                .setOwner(yaasAware.getHybrisTenant())
                .setFileType(type)
                .setLocale(locale)
                .build();

        final Response response = emailClient
                .tenantTemplatesClient(yaasAware.getHybrisTenant(), client)
                .code(template.getCode())
                .fileType(template.getFileType())
                .preparePut()
                .withAuthorization(token.toAuthorizationHeaderValue())
                .withPayload(Entity.entity(template.getDataStream(), MediaType.APPLICATION_OCTET_STREAM_TYPE))
                .execute();

        if (response.getStatus() == Response.Status.CREATED.getStatusCode() || response.getStatus() == Response.Status.OK.getStatusCode()) {
            return;
        }
        throw ErrorHandler.resolveErrorResponse(response, token);
    }

    /**
     * Send email using Yaas
     * @param yaasAware
     * @param giftRegistry
     * @param emailData
     * @param token
     */
    public void sendMail(final YaasAwareParameters yaasAware, final GiftRegistry giftRegistry, final EmailData emailData,
                         final AccessToken token) {

        emailData.setFromAddress("noreply@" + yaasAware.getHybrisTenant() + ".mail.yaas.io");
        emailData.setTemplateOwner(client);
        emailData.setTemplateCode(TEMPLATE_CODE);
        emailData.setLocale(locale);

        final List<TemplateAttributeValueData> templateAttributeValueData = new ArrayList<TemplateAttributeValueData>();
        templateAttributeValueData.add(new TemplateAttributeValueData("ownerId", giftRegistry.getOwnerId()));
        templateAttributeValueData.add(new TemplateAttributeValueData("title", giftRegistry.getTitle()));
        if (giftRegistry.getDescription() == null) {
        	giftRegistry.setDescription("Welcome to Gift Registry ...Feel Free to choose the gift..");
        }
        templateAttributeValueData.add(new TemplateAttributeValueData("description", giftRegistry.getDescription()));
        
        emailData.setAttributes(templateAttributeValueData);

        final Response response = emailClient
                .tenantSendAsync(yaasAware.getHybrisTenant())
                .preparePost()
                .withAuthorization(token.toAuthorizationHeaderValue())
                .withPayload(Entity.json(emailData)).execute();

        if (response.getStatus() == Response.Status.CREATED.getStatusCode()) {
            return;
        }
        throw ErrorHandler.resolveErrorResponse(response, token);
    }

}
