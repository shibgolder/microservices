
package com.hybris.yaas.giftregistry.client.schema;

import java.net.URI;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import com.hybris.yaas.giftregistry.client.schema.builder.TenantAllTagvaluesBuilder;
import com.hybris.yaas.giftregistry.client.schema.builder.TenantAllTagvaluesTagBuilder;
import com.hybris.yaas.giftregistry.client.schema.builder.TenantBuilder;
import com.hybris.yaas.giftregistry.client.schema.builder.TenantSchemaBuilder;
import com.hybris.yaas.giftregistry.client.schema.builder.TenantSchemaMetadataBuilder;
import com.hybris.yaas.giftregistry.client.schema.builder.TenantSchemaTagsBuilder;
import com.hybris.yaas.giftregistry.client.schema.builder.TenantSchemaTagsTagBuilder;
import com.sap.cloud.yaas.rammler.commons.RequestParams;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractResourceBuilder;


/**
 * This the entrance point to the Schema client.
 * <p>
 * It is a wrapper for a JAX-RS REST client that will call the Schema.
 * <p>
 * Specifying the path which we want to call, as well as other request parameters, is done by using immutable builders:
 * modifying any property of the current request is creating a new instance of a builder. This assures that building the
 * client is thread safe.
 * <p>
 * Available builders for this API's resources:
 * <ul>
 * <li>{@link #tenant()}</li>
 * <li>{@link #tenantSchema()}</li>
 * <li>{@link #tenantSchemaMetadata()}</li>
 * <li>{@link #tenantSchemaTags()}</li>
 * <li>{@link #tenantSchemaTagsTag()}</li>
 * <li>{@link #tenantAllTagvalues()}</li>
 * <li>{@link #tenantAllTagvaluesTag()}</li>
 * </ul>
 * 
 */
public class SchemaClient
    extends AbstractResourceBuilder<SchemaClient>
{

    /**
     * The default URL or the repository service, as defined in the RAML.
     * 
     */
    public final static String DEFAULT_BASE_URI = "https://api.yaas.io/hybris/schema/v1";
    private final String baseUri;
    private final Client client;

    /**
     * Creates an instance of the {@link SchemaClient} for the given URI.
     * 
     * @param baseUri the base URI of the service
     * 
     */
    public SchemaClient(final String baseUri) {
        this(baseUri, ClientBuilder.newClient(), new RequestParams());
    }

    /**
     * Creates an instance of the {@link SchemaClient} for the given URI.
     * 
     * @param baseUri the base URI of the service
     * 
     */
    public SchemaClient(final URI baseUri) {
        this(baseUri.toString(), ClientBuilder.newClient(), new RequestParams());
    }

    /**
     * Creates an instance of the {@link SchemaClient} for the given URI, based on the supplied JAX-RS client
     * instance.
     * <p>
     * Use this constructor to customize the JAX-RS client to use.
     * 
     * @param baseUri the base URI of the service
     * @param client an instance of JAX-RS client
     * 
     */
    public SchemaClient(final String baseUri, final Client client) {
        this(baseUri, client, new RequestParams());
    }

    private SchemaClient(final String baseUri, final Client client, final RequestParams params) {
        super(baseUri, client, params);
        this.baseUri = baseUri;
        this.client = client;
    }

    @Override
    protected SchemaClient makeACopy(final RequestParams params) {
        return new SchemaClient(baseUri, client, params);
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
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/{schema}</code>.
     * 
     * @return an instance of {@link TenantSchemaBuilder}
     * 
     */
    public TenantSchemaBuilder tenantSchema() {
        return new TenantSchemaBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/{schema}</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #tenantSchema()} method instead.
     * 
     * @return an instance of {@link TenantSchemaBuilder}
     * @param tenant the value of the <code>tenant</code> URI parameter
     * @param schema the value of the <code>schema</code> URI parameter
     * 
     */
    public TenantSchemaBuilder tenantSchema(String tenant, String schema) {
        TenantSchemaBuilder resourceBuilder = new TenantSchemaBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillTenant(tenant);
        resourceBuilder = resourceBuilder.fillSchema(schema);
        return resourceBuilder;
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/{schema}/metadata</code>.
     * 
     * @return an instance of {@link TenantSchemaMetadataBuilder}
     * 
     */
    public TenantSchemaMetadataBuilder tenantSchemaMetadata() {
        return new TenantSchemaMetadataBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/{schema}/metadata</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #tenantSchemaMetadata()} method instead.
     * 
     * @return an instance of {@link TenantSchemaMetadataBuilder}
     * @param tenant the value of the <code>tenant</code> URI parameter
     * @param schema the value of the <code>schema</code> URI parameter
     * 
     */
    public TenantSchemaMetadataBuilder tenantSchemaMetadata(String tenant, String schema) {
        TenantSchemaMetadataBuilder resourceBuilder = new TenantSchemaMetadataBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillTenant(tenant);
        resourceBuilder = resourceBuilder.fillSchema(schema);
        return resourceBuilder;
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/{schema}/tags</code>.
     * 
     * @return an instance of {@link TenantSchemaTagsBuilder}
     * 
     */
    public TenantSchemaTagsBuilder tenantSchemaTags() {
        return new TenantSchemaTagsBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/{schema}/tags</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #tenantSchemaTags()} method instead.
     * 
     * @return an instance of {@link TenantSchemaTagsBuilder}
     * @param tenant the value of the <code>tenant</code> URI parameter
     * @param schema the value of the <code>schema</code> URI parameter
     * 
     */
    public TenantSchemaTagsBuilder tenantSchemaTags(String tenant, String schema) {
        TenantSchemaTagsBuilder resourceBuilder = new TenantSchemaTagsBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillTenant(tenant);
        resourceBuilder = resourceBuilder.fillSchema(schema);
        return resourceBuilder;
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/{schema}/tags/{tag}</code>.
     * 
     * @return an instance of {@link TenantSchemaTagsTagBuilder}
     * 
     */
    public TenantSchemaTagsTagBuilder tenantSchemaTagsTag() {
        return new TenantSchemaTagsTagBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/{schema}/tags/{tag}</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #tenantSchemaTagsTag()} method instead.
     * 
     * @return an instance of {@link TenantSchemaTagsTagBuilder}
     * @param tenant the value of the <code>tenant</code> URI parameter
     * @param schema the value of the <code>schema</code> URI parameter
     * @param tag the value of the <code>tag</code> URI parameter
     * 
     */
    public TenantSchemaTagsTagBuilder tenantSchemaTagsTag(String tenant, String schema, String tag) {
        TenantSchemaTagsTagBuilder resourceBuilder = new TenantSchemaTagsTagBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillTenant(tenant);
        resourceBuilder = resourceBuilder.fillSchema(schema);
        resourceBuilder = resourceBuilder.fillTag(tag);
        return resourceBuilder;
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/all/tagvalues</code>.
     * 
     * @return an instance of {@link TenantAllTagvaluesBuilder}
     * 
     */
    public TenantAllTagvaluesBuilder tenantAllTagvalues() {
        return new TenantAllTagvaluesBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/all/tagvalues</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #tenantAllTagvalues()} method instead.
     * 
     * @return an instance of {@link TenantAllTagvaluesBuilder}
     * @param tenant the value of the <code>tenant</code> URI parameter
     * 
     */
    public TenantAllTagvaluesBuilder tenantAllTagvalues(String tenant) {
        TenantAllTagvaluesBuilder resourceBuilder = new TenantAllTagvaluesBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillTenant(tenant);
        return resourceBuilder;
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/all/tagvalues/{tag}</code>.
     * 
     * @return an instance of {@link TenantAllTagvaluesTagBuilder}
     * 
     */
    public TenantAllTagvaluesTagBuilder tenantAllTagvaluesTag() {
        return new TenantAllTagvaluesTagBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/all/tagvalues/{tag}</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #tenantAllTagvaluesTag()} method instead.
     * 
     * @return an instance of {@link TenantAllTagvaluesTagBuilder}
     * @param tenant the value of the <code>tenant</code> URI parameter
     * @param tag the value of the <code>tag</code> URI parameter
     * 
     */
    public TenantAllTagvaluesTagBuilder tenantAllTagvaluesTag(String tenant, String tag) {
        TenantAllTagvaluesTagBuilder resourceBuilder = new TenantAllTagvaluesTagBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillTenant(tenant);
        resourceBuilder = resourceBuilder.fillTag(tag);
        return resourceBuilder;
    }

}
