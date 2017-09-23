
package com.hybris.yaas.giftregistry.client.schema.builder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import com.sap.cloud.yaas.rammler.commons.RequestParams;
import com.sap.cloud.yaas.rammler.commons.ResponseCallback;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractActionBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractResourceBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.ActionWithPayloadBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.HttpActionSettable;


/**
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/{tenant}/{schema}/tags/{tag}</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * </ul>
 * 
 */
public class TenantSchemaTagsTagBuilder
    extends AbstractResourceBuilder<TenantSchemaTagsTagBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    public final static String RELATIVE_URI = "/{tenant}/{schema}/tags/{tag}";
    /**
     * The static field for the <code>tenant</code> URI parameter name.
     * 
     */
    public final static String URI_PARAM_TENANT = "tenant";
    /**
     * The static field for the <code>schema</code> URI parameter name.
     * 
     */
    public final static String URI_PARAM_SCHEMA = "schema";
    /**
     * The static field for the <code>tag</code> URI parameter name.
     * 
     */
    public final static String URI_PARAM_TAG = "tag";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    public final static String[] URI_PARAMS_ALL = new String[] {URI_PARAM_TENANT, URI_PARAM_SCHEMA, URI_PARAM_TAG };

    /**
     * Creates a new instance of the {@link TenantSchemaTagsTagBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantSchemaTagsTagBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantSchemaTagsTagBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantSchemaTagsTagBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantSchemaTagsTagBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantSchemaTagsTagBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantSchemaTagsTagBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Fill the <code>schema</code> URI parameter of this resource.
     * 
     * @param schema the new value for the <code>schema</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantSchemaTagsTagBuilder fillSchema(final String schema) {
        return this.withUriParam(TenantSchemaTagsTagBuilder.URI_PARAM_SCHEMA, schema);
    }

    /**
     * Fill the <code>tag</code> URI parameter of this resource.
     * 
     * @param tag the new value for the <code>tag</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantSchemaTagsTagBuilder fillTag(final String tag) {
        return this.withUriParam(TenantSchemaTagsTagBuilder.URI_PARAM_TAG, tag);
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for POST action for this resource.
     * 
     * @return an instance of {@link PostActionBuilder}
     * 
     */
    public TenantSchemaTagsTagBuilder.PostActionBuilder preparePost() {
        return new TenantSchemaTagsTagBuilder.PostActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for DELETE action for this resource.
     * 
     * @return an instance of {@link DeleteActionBuilder}
     * 
     */
    public TenantSchemaTagsTagBuilder.DeleteActionBuilder prepareDelete() {
        return new TenantSchemaTagsTagBuilder.DeleteActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantSchemaTagsTagBuilder.AnyActionBuilder prepareAny() {
        return new TenantSchemaTagsTagBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantSchemaTagsTagBuilder.ArbitraryActionBuilder<TenantSchemaTagsTagBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantSchemaTagsTagBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantSchemaTagsTagBuilder.AnyActionBuilder>
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
        protected TenantSchemaTagsTagBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantSchemaTagsTagBuilder.AnyActionBuilder actionBuilder = new TenantSchemaTagsTagBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantSchemaTagsTagBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantSchemaTagsTagBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantSchemaTagsTagBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantSchemaTagsTagBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantSchemaTagsTagBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantSchemaTagsTagBuilder.ArbitraryActionBuilder<?> >
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
         * Fill the <code>tenant</code> URI parameter of this resource.
         * 
         * @param tenant the new value for the <code>tenant</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillTenant(final String tenant) {
            return this.withUriParam(TenantSchemaTagsTagBuilder.URI_PARAM_TENANT, tenant);
        }

        /**
         * Fill the <code>schema</code> URI parameter of this resource.
         * 
         * @param schema the new value for the <code>schema</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillSchema(final String schema) {
            return this.withUriParam(TenantSchemaTagsTagBuilder.URI_PARAM_SCHEMA, schema);
        }

        /**
         * Fill the <code>tag</code> URI parameter of this resource.
         * 
         * @param tag the new value for the <code>tag</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillTag(final String tag) {
            return this.withUriParam(TenantSchemaTagsTagBuilder.URI_PARAM_TAG, tag);
        }

    }


    /**
     * An implementation of the {@link DeleteActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for DELETE action.	 
     * 
     */
    public static class DeleteActionBuilder
        extends TenantSchemaTagsTagBuilder.ArbitraryActionBuilder<TenantSchemaTagsTagBuilder.DeleteActionBuilder>
    {


        /**
         * Creates a new instance of a {@link DeleteActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public DeleteActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
            setHttpMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod.DELETE);
        }

        @Override
        protected TenantSchemaTagsTagBuilder.DeleteActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantSchemaTagsTagBuilder.DeleteActionBuilder actionBuilder = new TenantSchemaTagsTagBuilder.DeleteActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantSchemaTagsTagBuilder.DeleteActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>tags</code> query parameter value.
         * 
         * @param tags the value of the <code>tags</code> query parameter
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>tags</code> query parameter set
         * 
         */
        public TenantSchemaTagsTagBuilder.DeleteActionBuilder withTags(String tags) {
            return this.withSingleQuery("tags", tags);
        }

        /**
         * Sets the <code>removeEmpty</code> query parameter value.
         * 
         * @param removeEmpty the value of the <code>removeEmpty</code> query parameter
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>removeEmpty</code> query parameter set
         * 
         */
        public TenantSchemaTagsTagBuilder.DeleteActionBuilder withRemoveEmpty(Boolean removeEmpty) {
            return this.withSingleQuery("removeEmpty", removeEmpty);
        }

        /**
         * Registers callback to handle the 404 Not Found response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantSchemaTagsTagBuilder.DeleteActionBuilder onNotFound(ResponseCallback callback) {
            return this.withCallbackForCode(404, callback);
        }

        /**
         * Registers callback to handle the 401 Unauthorized response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantSchemaTagsTagBuilder.DeleteActionBuilder onUnauthorized(ResponseCallback callback) {
            return this.withCallbackForCode(401, callback);
        }

        /**
         * Registers callback to handle the 403 Forbidden response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantSchemaTagsTagBuilder.DeleteActionBuilder onForbidden(ResponseCallback callback) {
            return this.withCallbackForCode(403, callback);
        }

    }


    /**
     * An implementation of the {@link PostActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for POST action.	 
     * 
     */
    public static class PostActionBuilder
        extends TenantSchemaTagsTagBuilder.ArbitraryActionBuilder<TenantSchemaTagsTagBuilder.PostActionBuilder>
        implements ActionWithPayloadBuilder<TenantSchemaTagsTagBuilder.PostActionBuilder, Object>
    {


        /**
         * Creates a new instance of a {@link PostActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public PostActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
            setHttpMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod.POST);
        }

        @Override
        protected TenantSchemaTagsTagBuilder.PostActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantSchemaTagsTagBuilder.PostActionBuilder actionBuilder = new TenantSchemaTagsTagBuilder.PostActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantSchemaTagsTagBuilder.PostActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantSchemaTagsTagBuilder.PostActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantSchemaTagsTagBuilder.PostActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantSchemaTagsTagBuilder.PostActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>tags</code> query parameter value.
         * 
         * @param tags the value of the <code>tags</code> query parameter
         * @return a new instance of {@link PostActionBuilder}, with the <code>tags</code> query parameter set
         * 
         */
        public TenantSchemaTagsTagBuilder.PostActionBuilder withTags(String tags) {
            return this.withSingleQuery("tags", tags);
        }

        /**
         * Registers callback to handle the 404 Not Found response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantSchemaTagsTagBuilder.PostActionBuilder onNotFound(ResponseCallback callback) {
            return this.withCallbackForCode(404, callback);
        }

        /**
         * Registers callback to handle the 401 Unauthorized response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantSchemaTagsTagBuilder.PostActionBuilder onUnauthorized(ResponseCallback callback) {
            return this.withCallbackForCode(401, callback);
        }

        /**
         * Registers callback to handle the 403 Forbidden response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantSchemaTagsTagBuilder.PostActionBuilder onForbidden(ResponseCallback callback) {
            return this.withCallbackForCode(403, callback);
        }

    }

}
