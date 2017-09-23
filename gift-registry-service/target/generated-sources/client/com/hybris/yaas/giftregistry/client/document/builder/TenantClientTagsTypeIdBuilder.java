
package com.hybris.yaas.giftregistry.client.document.builder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import com.sap.cloud.yaas.rammler.commons.RequestParams;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractActionBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractResourceBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.ActionWithPayloadBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.HttpActionSettable;


/**
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/{id}</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * <li>{@link #tagName()}</li>
 * </ul>
 * 
 */
public class TenantClientTagsTypeIdBuilder
    extends AbstractResourceBuilder<TenantClientTagsTypeIdBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    public final static String RELATIVE_URI = "/{id}";
    /**
     * The static field for the <code>id</code> URI parameter name.
     * 
     */
    public final static String URI_PARAM_ID = "id";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    public final static String[] URI_PARAMS_ALL = new String[] {URI_PARAM_ID };

    /**
     * Creates a new instance of the {@link TenantClientTagsTypeIdBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantClientTagsTypeIdBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantClientTagsTypeIdBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantClientTagsTypeIdBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantClientTagsTypeIdBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>id</code> URI parameter of this resource.
     * 
     * @param id the new value for the <code>id</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientTagsTypeIdBuilder fillId(final String id) {
        return this.withUriParam(TenantClientTagsTypeIdBuilder.URI_PARAM_ID, id);
    }

    /**
     * Fill the <code>type</code> URI parameter of this resource.
     * 
     * @param type the new value for the <code>type</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientTagsTypeIdBuilder fillType(final String type) {
        return this.withUriParam(TenantClientTagsTypeBuilder.URI_PARAM_TYPE, type);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientTagsTypeIdBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantClientTagsBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Fill the <code>client</code> URI parameter of this resource.
     * 
     * @param client the new value for the <code>client</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientTagsTypeIdBuilder fillClient(final String client) {
        return this.withUriParam(TenantClientTagsBuilder.URI_PARAM_CLIENT, client);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tagName}</code>.
     * 
     * @return an instance of {@link TenantClientTagsTypeIdTagNameBuilder}
     * 
     */
    public TenantClientTagsTypeIdTagNameBuilder tagName() {
        return new TenantClientTagsTypeIdTagNameBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tagName}</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #tagName()} method instead.
     * 
     * @return an instance of {@link TenantClientTagsTypeIdTagNameBuilder}
     * @param tagName the value of the <code>tagName</code> URI parameter
     * 
     */
    public TenantClientTagsTypeIdTagNameBuilder tagName(String tagName) {
        TenantClientTagsTypeIdTagNameBuilder resourceBuilder = new TenantClientTagsTypeIdTagNameBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillTagName(tagName);
        return resourceBuilder;
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantClientTagsTypeIdBuilder.AnyActionBuilder prepareAny() {
        return new TenantClientTagsTypeIdBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantClientTagsTypeIdBuilder.ArbitraryActionBuilder<TenantClientTagsTypeIdBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantClientTagsTypeIdBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantClientTagsTypeIdBuilder.AnyActionBuilder>
    {


        /**
         * Creates a new instance of a {@link AnyActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public AnyActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
        }

        @Override
        protected TenantClientTagsTypeIdBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientTagsTypeIdBuilder.AnyActionBuilder actionBuilder = new TenantClientTagsTypeIdBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantClientTagsTypeIdBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientTagsTypeIdBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientTagsTypeIdBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantClientTagsTypeIdBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantClientTagsTypeIdBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
            actionBuilder.setHttpMethod(theMethod);
            return actionBuilder;
        }

    }


    /**
     * Base abstract class for all {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder}s for this resource.
     * 
     * @param <T> the type of the builder which will be produced by the builder methods
     * 
     */
    public static abstract class ArbitraryActionBuilder<T extends TenantClientTagsTypeIdBuilder.ArbitraryActionBuilder<?> >
        extends AbstractActionBuilder<T>
    {


        /**
         * Creates a new instance of the {@link ArbitraryActionBuilder}, for given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget instance
         * @param requestParams the given RequestParams instance
         * 
         */
        public ArbitraryActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
        }

        /**
         * Fill the <code>id</code> URI parameter of this resource.
         * 
         * @param id the new value for the <code>id</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillId(final String id) {
            return this.withUriParam(TenantClientTagsTypeIdBuilder.URI_PARAM_ID, id);
        }

        /**
         * Fill the <code>type</code> URI parameter of this resource.
         * 
         * @param type the new value for the <code>type</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillType(final String type) {
            return this.withUriParam(TenantClientTagsTypeBuilder.URI_PARAM_TYPE, type);
        }

        /**
         * Fill the <code>tenant</code> URI parameter of this resource.
         * 
         * @param tenant the new value for the <code>tenant</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillTenant(final String tenant) {
            return this.withUriParam(TenantClientTagsBuilder.URI_PARAM_TENANT, tenant);
        }

        /**
         * Fill the <code>client</code> URI parameter of this resource.
         * 
         * @param client the new value for the <code>client</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillClient(final String client) {
            return this.withUriParam(TenantClientTagsBuilder.URI_PARAM_CLIENT, client);
        }

    }

}
