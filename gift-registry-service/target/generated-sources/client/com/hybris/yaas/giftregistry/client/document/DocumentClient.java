
package com.hybris.yaas.giftregistry.client.document;

import java.net.URI;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import com.hybris.yaas.giftregistry.client.document.builder.AllBuilder;
import com.hybris.yaas.giftregistry.client.document.builder.TenantBuilder;
import com.hybris.yaas.giftregistry.client.document.builder.TenantClientAggrBuilder;
import com.hybris.yaas.giftregistry.client.document.builder.TenantClientIndexesBuilder;
import com.hybris.yaas.giftregistry.client.document.builder.TenantClientTagsBuilder;
import com.sap.cloud.yaas.rammler.commons.RequestParams;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractResourceBuilder;


/**
 * This the entrance point to the Document client.
 * <p>
 * It is a wrapper for a JAX-RS REST client that will call the Document.
 * <p>
 * Specifying the path which we want to call, as well as other request parameters, is done by using immutable builders:
 * modifying any property of the current request is creating a new instance of a builder. This assures that building the
 * client is thread safe.
 * <p>
 * Available builders for this API's resources:
 * <ul>
 * <li>{@link #all()}</li>
 * <li>{@link #tenant()}</li>
 * <li>{@link #tenantClientAggr()}</li>
 * <li>{@link #tenantClientIndexes()}</li>
 * <li>{@link #tenantClientTags()}</li>
 * </ul>
 * 
 */
public class DocumentClient
    extends AbstractResourceBuilder<DocumentClient>
{

    /**
     * The default URL or the repository service, as defined in the RAML.
     * 
     */
    public final static String DEFAULT_BASE_URI = "https://api.yaas.io/hybris/document/v1";
    private final String baseUri;
    private final Client client;

    /**
     * Creates an instance of the {@link DocumentClient} for the given URI.
     * 
     * @param baseUri the base URI of the service
     * 
     */
    public DocumentClient(final String baseUri) {
        this(baseUri, ClientBuilder.newClient(), new RequestParams());
    }

    /**
     * Creates an instance of the {@link DocumentClient} for the given URI.
     * 
     * @param baseUri the base URI of the service
     * 
     */
    public DocumentClient(final URI baseUri) {
        this(baseUri.toString(), ClientBuilder.newClient(), new RequestParams());
    }

    /**
     * Creates an instance of the {@link DocumentClient} for the given URI, based on the supplied JAX-RS client
     * instance.
     * <p>
     * Use this constructor to customize the JAX-RS client to use.
     * 
     * @param baseUri the base URI of the service
     * @param client an instance of JAX-RS client
     * 
     */
    public DocumentClient(final String baseUri, final Client client) {
        this(baseUri, client, new RequestParams());
    }

    private DocumentClient(final String baseUri, final Client client, final RequestParams params) {
        super(baseUri, client, params);
        this.baseUri = baseUri;
        this.client = client;
    }

    @Override
    protected DocumentClient makeACopy(final RequestParams params) {
        return new DocumentClient(baseUri, client, params);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/all</code>.
     * 
     * @return an instance of {@link AllBuilder}
     * 
     */
    public AllBuilder all() {
        return new AllBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}</code>.
     * 
     * @return an instance of {@link TenantBuilder}
     * 
     */
    public TenantBuilder tenant() {
        return new TenantBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #tenant()} method instead.
     * 
     * @return an instance of {@link TenantBuilder}
     * @param tenant the value of the <code>tenant</code> URI parameter
     * 
     */
    public TenantBuilder tenant(String tenant) {
        TenantBuilder resourceBuilder = new TenantBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillTenant(tenant);
        return resourceBuilder;
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/{client}/aggr</code>.
     * 
     * @return an instance of {@link TenantClientAggrBuilder}
     * 
     */
    public TenantClientAggrBuilder tenantClientAggr() {
        return new TenantClientAggrBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/{client}/aggr</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #tenantClientAggr()} method instead.
     * 
     * @return an instance of {@link TenantClientAggrBuilder}
     * @param tenant the value of the <code>tenant</code> URI parameter
     * @param client the value of the <code>client</code> URI parameter
     * 
     */
    public TenantClientAggrBuilder tenantClientAggr(String tenant, String client) {
        TenantClientAggrBuilder resourceBuilder = new TenantClientAggrBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillTenant(tenant);
        resourceBuilder = resourceBuilder.fillClient(client);
        return resourceBuilder;
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/{client}/indexes</code>.
     * 
     * @return an instance of {@link TenantClientIndexesBuilder}
     * 
     */
    public TenantClientIndexesBuilder tenantClientIndexes() {
        return new TenantClientIndexesBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/{client}/indexes</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #tenantClientIndexes()} method instead.
     * 
     * @return an instance of {@link TenantClientIndexesBuilder}
     * @param tenant the value of the <code>tenant</code> URI parameter
     * @param client the value of the <code>client</code> URI parameter
     * 
     */
    public TenantClientIndexesBuilder tenantClientIndexes(String tenant, String client) {
        TenantClientIndexesBuilder resourceBuilder = new TenantClientIndexesBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillTenant(tenant);
        resourceBuilder = resourceBuilder.fillClient(client);
        return resourceBuilder;
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/{client}/tags</code>.
     * 
     * @return an instance of {@link TenantClientTagsBuilder}
     * 
     */
    public TenantClientTagsBuilder tenantClientTags() {
        return new TenantClientTagsBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/{client}/tags</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #tenantClientTags()} method instead.
     * 
     * @return an instance of {@link TenantClientTagsBuilder}
     * @param tenant the value of the <code>tenant</code> URI parameter
     * @param client the value of the <code>client</code> URI parameter
     * 
     */
    public TenantClientTagsBuilder tenantClientTags(String tenant, String client) {
        TenantClientTagsBuilder resourceBuilder = new TenantClientTagsBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillTenant(tenant);
        resourceBuilder = resourceBuilder.fillClient(client);
        return resourceBuilder;
    }

}
