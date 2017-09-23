
package com.hybris.yaas.giftregistry.client.document.builder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import com.sap.cloud.yaas.rammler.commons.RequestParams;
import com.sap.cloud.yaas.rammler.commons.ResponseCallback;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractActionBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractResourceBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.ActionWithPayloadBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.HttpActionSettable;


/**
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/{tagName}</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * </ul>
 * 
 */
public class TenantClientTagsTypeIdTagNameBuilder
    extends AbstractResourceBuilder<TenantClientTagsTypeIdTagNameBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    public final static String RELATIVE_URI = "/{tagName}";
    /**
     * The static field for the <code>tagName</code> URI parameter name.
     * 
     */
    public final static String URI_PARAM_TAG_NAME = "tagName";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    public final static String[] URI_PARAMS_ALL = new String[] {URI_PARAM_TAG_NAME };

    /**
     * Creates a new instance of the {@link TenantClientTagsTypeIdTagNameBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantClientTagsTypeIdTagNameBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantClientTagsTypeIdTagNameBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantClientTagsTypeIdTagNameBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantClientTagsTypeIdTagNameBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>tagName</code> URI parameter of this resource.
     * 
     * @param tagName the new value for the <code>tagName</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientTagsTypeIdTagNameBuilder fillTagName(final String tagName) {
        return this.withUriParam(TenantClientTagsTypeIdTagNameBuilder.URI_PARAM_TAG_NAME, tagName);
    }

    /**
     * Fill the <code>id</code> URI parameter of this resource.
     * 
     * @param id the new value for the <code>id</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientTagsTypeIdTagNameBuilder fillId(final String id) {
        return this.withUriParam(TenantClientTagsTypeIdBuilder.URI_PARAM_ID, id);
    }

    /**
     * Fill the <code>type</code> URI parameter of this resource.
     * 
     * @param type the new value for the <code>type</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientTagsTypeIdTagNameBuilder fillType(final String type) {
        return this.withUriParam(TenantClientTagsTypeBuilder.URI_PARAM_TYPE, type);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientTagsTypeIdTagNameBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantClientTagsBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Fill the <code>client</code> URI parameter of this resource.
     * 
     * @param client the new value for the <code>client</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientTagsTypeIdTagNameBuilder fillClient(final String client) {
        return this.withUriParam(TenantClientTagsBuilder.URI_PARAM_CLIENT, client);
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for POST action for this resource.
     * 
     * @return an instance of {@link PostActionBuilder}
     * 
     */
    public TenantClientTagsTypeIdTagNameBuilder.PostActionBuilder preparePost() {
        return new TenantClientTagsTypeIdTagNameBuilder.PostActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for DELETE action for this resource.
     * 
     * @return an instance of {@link DeleteActionBuilder}
     * 
     */
    public TenantClientTagsTypeIdTagNameBuilder.DeleteActionBuilder prepareDelete() {
        return new TenantClientTagsTypeIdTagNameBuilder.DeleteActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantClientTagsTypeIdTagNameBuilder.AnyActionBuilder prepareAny() {
        return new TenantClientTagsTypeIdTagNameBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantClientTagsTypeIdTagNameBuilder.ArbitraryActionBuilder<TenantClientTagsTypeIdTagNameBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantClientTagsTypeIdTagNameBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantClientTagsTypeIdTagNameBuilder.AnyActionBuilder>
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
        protected TenantClientTagsTypeIdTagNameBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientTagsTypeIdTagNameBuilder.AnyActionBuilder actionBuilder = new TenantClientTagsTypeIdTagNameBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantClientTagsTypeIdTagNameBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientTagsTypeIdTagNameBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientTagsTypeIdTagNameBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantClientTagsTypeIdTagNameBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantClientTagsTypeIdTagNameBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantClientTagsTypeIdTagNameBuilder.ArbitraryActionBuilder<?> >
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
         * Fill the <code>tagName</code> URI parameter of this resource.
         * 
         * @param tagName the new value for the <code>tagName</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillTagName(final String tagName) {
            return this.withUriParam(TenantClientTagsTypeIdTagNameBuilder.URI_PARAM_TAG_NAME, tagName);
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


    /**
     * An implementation of the {@link DeleteActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for DELETE action.	 
     * 
     */
    public static class DeleteActionBuilder
        extends TenantClientTagsTypeIdTagNameBuilder.ArbitraryActionBuilder<TenantClientTagsTypeIdTagNameBuilder.DeleteActionBuilder>
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
        protected TenantClientTagsTypeIdTagNameBuilder.DeleteActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientTagsTypeIdTagNameBuilder.DeleteActionBuilder actionBuilder = new TenantClientTagsTypeIdTagNameBuilder.DeleteActionBuilder(getTarget(), newRequestParams);
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
        public TenantClientTagsTypeIdTagNameBuilder.DeleteActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>tags</code> query parameter value.
         * 
         * @param tags the value of the <code>tags</code> query parameter
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>tags</code> query parameter set
         * 
         */
        public TenantClientTagsTypeIdTagNameBuilder.DeleteActionBuilder withTags(String tags) {
            return this.withSingleQuery("tags", tags);
        }

        /**
         * Sets the <code>removeEmpty</code> query parameter value.
         * 
         * @param removeEmpty the value of the <code>removeEmpty</code> query parameter
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>removeEmpty</code> query parameter set
         * 
         */
        public TenantClientTagsTypeIdTagNameBuilder.DeleteActionBuilder withRemoveEmpty(Boolean removeEmpty) {
            return this.withSingleQuery("removeEmpty", removeEmpty);
        }

        /**
         * Sets the <code>version</code> query parameter value.
         * 
         * @param version the value of the <code>version</code> query parameter
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>version</code> query parameter set
         * 
         */
        public TenantClientTagsTypeIdTagNameBuilder.DeleteActionBuilder withVersion(Integer version) {
            return this.withSingleQuery("version", version);
        }

        /**
         * Registers callback to handle the 404 Not Found response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientTagsTypeIdTagNameBuilder.DeleteActionBuilder onNotFound(ResponseCallback callback) {
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
        public TenantClientTagsTypeIdTagNameBuilder.DeleteActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientTagsTypeIdTagNameBuilder.DeleteActionBuilder onForbidden(ResponseCallback callback) {
            return this.withCallbackForCode(403, callback);
        }

        /**
         * Registers callback to handle the 400 Bad Request response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientTagsTypeIdTagNameBuilder.DeleteActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

        /**
         * Registers callback to handle the 409 Conflict response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientTagsTypeIdTagNameBuilder.DeleteActionBuilder onConflict(ResponseCallback callback) {
            return this.withCallbackForCode(409, callback);
        }

    }


    /**
     * An implementation of the {@link PostActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for POST action.	 
     * 
     */
    public static class PostActionBuilder
        extends TenantClientTagsTypeIdTagNameBuilder.ArbitraryActionBuilder<TenantClientTagsTypeIdTagNameBuilder.PostActionBuilder>
        implements ActionWithPayloadBuilder<TenantClientTagsTypeIdTagNameBuilder.PostActionBuilder, Object>
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
        protected TenantClientTagsTypeIdTagNameBuilder.PostActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientTagsTypeIdTagNameBuilder.PostActionBuilder actionBuilder = new TenantClientTagsTypeIdTagNameBuilder.PostActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantClientTagsTypeIdTagNameBuilder.PostActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientTagsTypeIdTagNameBuilder.PostActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientTagsTypeIdTagNameBuilder.PostActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantClientTagsTypeIdTagNameBuilder.PostActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>tags</code> query parameter value.
         * 
         * @param tags the value of the <code>tags</code> query parameter
         * @return a new instance of {@link PostActionBuilder}, with the <code>tags</code> query parameter set
         * 
         */
        public TenantClientTagsTypeIdTagNameBuilder.PostActionBuilder withTags(String tags) {
            return this.withSingleQuery("tags", tags);
        }

        /**
         * Sets the <code>version</code> query parameter value.
         * 
         * @param version the value of the <code>version</code> query parameter
         * @return a new instance of {@link PostActionBuilder}, with the <code>version</code> query parameter set
         * 
         */
        public TenantClientTagsTypeIdTagNameBuilder.PostActionBuilder withVersion(Integer version) {
            return this.withSingleQuery("version", version);
        }

        /**
         * Registers callback to handle the 404 Not Found response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientTagsTypeIdTagNameBuilder.PostActionBuilder onNotFound(ResponseCallback callback) {
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
        public TenantClientTagsTypeIdTagNameBuilder.PostActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientTagsTypeIdTagNameBuilder.PostActionBuilder onForbidden(ResponseCallback callback) {
            return this.withCallbackForCode(403, callback);
        }

        /**
         * Registers callback to handle the 400 Bad Request response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientTagsTypeIdTagNameBuilder.PostActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

        /**
         * Registers callback to handle the 409 Conflict response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientTagsTypeIdTagNameBuilder.PostActionBuilder onConflict(ResponseCallback callback) {
            return this.withCallbackForCode(409, callback);
        }

    }

}
