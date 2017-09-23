
package com.hybris.yaas.giftregistry.client.email;

import java.net.URI;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import com.hybris.yaas.giftregistry.client.email.builder.TenantSendAsyncBuilder;
import com.hybris.yaas.giftregistry.client.email.builder.TenantSendBuilder;
import com.hybris.yaas.giftregistry.client.email.builder.TenantSendSyncBuilder;
import com.hybris.yaas.giftregistry.client.email.builder.TenantTemplatesBuilder;
import com.hybris.yaas.giftregistry.client.email.builder.TenantTemplatesClientBuilder;
import com.sap.cloud.yaas.rammler.commons.RequestParams;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractResourceBuilder;


/**
 * This the entrance point to the Email Service client.
 * <p>
 * It is a wrapper for a JAX-RS REST client that will call the Email Service.
 * <p>
 * Specifying the path which we want to call, as well as other request parameters, is done by using immutable builders:
 * modifying any property of the current request is creating a new instance of a builder. This assures that building the
 * client is thread safe.
 * <p>
 * Available builders for this API's resources:
 * <ul>
 * <li>{@link #tenantSendAsync()}</li>
 * <li>{@link #tenantSendSync()}</li>
 * <li>{@link #tenantSend()}</li>
 * <li>{@link #tenantTemplates()}</li>
 * <li>{@link #tenantTemplatesClient()}</li>
 * </ul>
 * 
 */
public class EmailServiceClient
    extends AbstractResourceBuilder<EmailServiceClient>
{

    /**
     * The default URL or the repository service, as defined in the RAML.
     * 
     */
    public final static String DEFAULT_BASE_URI = "https://api.yaas.io/hybris/email/v1";
    private final String baseUri;
    private final Client client;

    /**
     * Creates an instance of the {@link EmailServiceClient} for the given URI.
     * 
     * @param baseUri the base URI of the service
     * 
     */
    public EmailServiceClient(final String baseUri) {
        this(baseUri, ClientBuilder.newClient(), new RequestParams());
    }

    /**
     * Creates an instance of the {@link EmailServiceClient} for the given URI.
     * 
     * @param baseUri the base URI of the service
     * 
     */
    public EmailServiceClient(final URI baseUri) {
        this(baseUri.toString(), ClientBuilder.newClient(), new RequestParams());
    }

    /**
     * Creates an instance of the {@link EmailServiceClient} for the given URI, based on the supplied JAX-RS client
     * instance.
     * <p>
     * Use this constructor to customize the JAX-RS client to use.
     * 
     * @param baseUri the base URI of the service
     * @param client an instance of JAX-RS client
     * 
     */
    public EmailServiceClient(final String baseUri, final Client client) {
        this(baseUri, client, new RequestParams());
    }

    private EmailServiceClient(final String baseUri, final Client client, final RequestParams params) {
        super(baseUri, client, params);
        this.baseUri = baseUri;
        this.client = client;
    }

    @Override
    protected EmailServiceClient makeACopy(final RequestParams params) {
        return new EmailServiceClient(baseUri, client, params);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/send-async</code>.
     * 
     * @return an instance of {@link TenantSendAsyncBuilder}
     * 
     */
    public TenantSendAsyncBuilder tenantSendAsync() {
        return new TenantSendAsyncBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/send-async</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #tenantSendAsync()} method instead.
     * 
     * @return an instance of {@link TenantSendAsyncBuilder}
     * @param tenant the value of the <code>tenant</code> URI parameter
     * 
     */
    public TenantSendAsyncBuilder tenantSendAsync(String tenant) {
        TenantSendAsyncBuilder resourceBuilder = new TenantSendAsyncBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillTenant(tenant);
        return resourceBuilder;
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/send-sync</code>.
     * 
     * @return an instance of {@link TenantSendSyncBuilder}
     * 
     */
    public TenantSendSyncBuilder tenantSendSync() {
        return new TenantSendSyncBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/send-sync</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #tenantSendSync()} method instead.
     * 
     * @return an instance of {@link TenantSendSyncBuilder}
     * @param tenant the value of the <code>tenant</code> URI parameter
     * 
     */
    public TenantSendSyncBuilder tenantSendSync(String tenant) {
        TenantSendSyncBuilder resourceBuilder = new TenantSendSyncBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillTenant(tenant);
        return resourceBuilder;
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/send</code>.
     * 
     * @return an instance of {@link TenantSendBuilder}
     * 
     */
    public TenantSendBuilder tenantSend() {
        return new TenantSendBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/send</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #tenantSend()} method instead.
     * 
     * @return an instance of {@link TenantSendBuilder}
     * @param tenant the value of the <code>tenant</code> URI parameter
     * 
     */
    public TenantSendBuilder tenantSend(String tenant) {
        TenantSendBuilder resourceBuilder = new TenantSendBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillTenant(tenant);
        return resourceBuilder;
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/templates</code>.
     * 
     * @return an instance of {@link TenantTemplatesBuilder}
     * 
     */
    public TenantTemplatesBuilder tenantTemplates() {
        return new TenantTemplatesBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/templates</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #tenantTemplates()} method instead.
     * 
     * @return an instance of {@link TenantTemplatesBuilder}
     * @param tenant the value of the <code>tenant</code> URI parameter
     * 
     */
    public TenantTemplatesBuilder tenantTemplates(String tenant) {
        TenantTemplatesBuilder resourceBuilder = new TenantTemplatesBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillTenant(tenant);
        return resourceBuilder;
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/templates/{client}</code>.
     * 
     * @return an instance of {@link TenantTemplatesClientBuilder}
     * 
     */
    public TenantTemplatesClientBuilder tenantTemplatesClient() {
        return new TenantTemplatesClientBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/templates/{client}</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #tenantTemplatesClient()} method instead.
     * 
     * @return an instance of {@link TenantTemplatesClientBuilder}
     * @param tenant the value of the <code>tenant</code> URI parameter
     * @param client the value of the <code>client</code> URI parameter
     * 
     */
    public TenantTemplatesClientBuilder tenantTemplatesClient(String tenant, String client) {
        TenantTemplatesClientBuilder resourceBuilder = new TenantTemplatesClientBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillTenant(tenant);
        resourceBuilder = resourceBuilder.fillClient(client);
        return resourceBuilder;
    }

}
