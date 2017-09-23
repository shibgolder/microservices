
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
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/{index}</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * </ul>
 * 
 */
public class TenantClientDataTypeDataIdAttributeNameIndexBuilder
    extends AbstractResourceBuilder<TenantClientDataTypeDataIdAttributeNameIndexBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    public final static String RELATIVE_URI = "/{index}";
    /**
     * The static field for the <code>index</code> URI parameter name.
     * 
     */
    public final static String URI_PARAM_INDEX = "index";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    public final static String[] URI_PARAMS_ALL = new String[] {URI_PARAM_INDEX };

    /**
     * Creates a new instance of the {@link TenantClientDataTypeDataIdAttributeNameIndexBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantClientDataTypeDataIdAttributeNameIndexBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameIndexBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantClientDataTypeDataIdAttributeNameIndexBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantClientDataTypeDataIdAttributeNameIndexBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>index</code> URI parameter of this resource.
     * 
     * @param index the new value for the <code>index</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameIndexBuilder fillIndex(final Double index) {
        return this.withUriParam(TenantClientDataTypeDataIdAttributeNameIndexBuilder.URI_PARAM_INDEX, index);
    }

    /**
     * Fill the <code>attributeName</code> URI parameter of this resource.
     * 
     * @param attributeName the new value for the <code>attributeName</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameIndexBuilder fillAttributeName(final String attributeName) {
        return this.withUriParam(TenantClientDataTypeDataIdAttributeNameBuilder.URI_PARAM_ATTRIBUTE_NAME, attributeName);
    }

    /**
     * Fill the <code>dataId</code> URI parameter of this resource.
     * 
     * @param dataId the new value for the <code>dataId</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameIndexBuilder fillDataId(final String dataId) {
        return this.withUriParam(TenantClientDataTypeDataIdBuilder.URI_PARAM_DATA_ID, dataId);
    }

    /**
     * Fill the <code>type</code> URI parameter of this resource.
     * 
     * @param type the new value for the <code>type</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameIndexBuilder fillType(final String type) {
        return this.withUriParam(TenantClientDataTypeBuilder.URI_PARAM_TYPE, type);
    }

    /**
     * Fill the <code>client</code> URI parameter of this resource.
     * 
     * @param client the new value for the <code>client</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameIndexBuilder fillClient(final String client) {
        return this.withUriParam(TenantClientBuilder.URI_PARAM_CLIENT, client);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameIndexBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameIndexBuilder.GetActionBuilder prepareGet() {
        return new TenantClientDataTypeDataIdAttributeNameIndexBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for HEAD action for this resource.
     * 
     * @return an instance of {@link HeadActionBuilder}
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameIndexBuilder.HeadActionBuilder prepareHead() {
        return new TenantClientDataTypeDataIdAttributeNameIndexBuilder.HeadActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for PUT action for this resource.
     * 
     * @return an instance of {@link PutActionBuilder}
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameIndexBuilder.PutActionBuilder preparePut() {
        return new TenantClientDataTypeDataIdAttributeNameIndexBuilder.PutActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for DELETE action for this resource.
     * 
     * @return an instance of {@link DeleteActionBuilder}
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameIndexBuilder.DeleteActionBuilder prepareDelete() {
        return new TenantClientDataTypeDataIdAttributeNameIndexBuilder.DeleteActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameIndexBuilder.AnyActionBuilder prepareAny() {
        return new TenantClientDataTypeDataIdAttributeNameIndexBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantClientDataTypeDataIdAttributeNameIndexBuilder.ArbitraryActionBuilder<TenantClientDataTypeDataIdAttributeNameIndexBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantClientDataTypeDataIdAttributeNameIndexBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantClientDataTypeDataIdAttributeNameIndexBuilder.AnyActionBuilder>
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
        protected TenantClientDataTypeDataIdAttributeNameIndexBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeDataIdAttributeNameIndexBuilder.AnyActionBuilder actionBuilder = new TenantClientDataTypeDataIdAttributeNameIndexBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantClientDataTypeDataIdAttributeNameIndexBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantClientDataTypeDataIdAttributeNameIndexBuilder.ArbitraryActionBuilder<?> >
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
         * Fill the <code>index</code> URI parameter of this resource.
         * 
         * @param index the new value for the <code>index</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillIndex(final Double index) {
            return this.withUriParam(TenantClientDataTypeDataIdAttributeNameIndexBuilder.URI_PARAM_INDEX, index);
        }

        /**
         * Fill the <code>attributeName</code> URI parameter of this resource.
         * 
         * @param attributeName the new value for the <code>attributeName</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillAttributeName(final String attributeName) {
            return this.withUriParam(TenantClientDataTypeDataIdAttributeNameBuilder.URI_PARAM_ATTRIBUTE_NAME, attributeName);
        }

        /**
         * Fill the <code>dataId</code> URI parameter of this resource.
         * 
         * @param dataId the new value for the <code>dataId</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillDataId(final String dataId) {
            return this.withUriParam(TenantClientDataTypeDataIdBuilder.URI_PARAM_DATA_ID, dataId);
        }

        /**
         * Fill the <code>type</code> URI parameter of this resource.
         * 
         * @param type the new value for the <code>type</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillType(final String type) {
            return this.withUriParam(TenantClientDataTypeBuilder.URI_PARAM_TYPE, type);
        }

        /**
         * Fill the <code>client</code> URI parameter of this resource.
         * 
         * @param client the new value for the <code>client</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillClient(final String client) {
            return this.withUriParam(TenantClientBuilder.URI_PARAM_CLIENT, client);
        }

        /**
         * Fill the <code>tenant</code> URI parameter of this resource.
         * 
         * @param tenant the new value for the <code>tenant</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillTenant(final String tenant) {
            return this.withUriParam(TenantBuilder.URI_PARAM_TENANT, tenant);
        }

    }


    /**
     * An implementation of the {@link DeleteActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for DELETE action.	 
     * 
     */
    public static class DeleteActionBuilder
        extends TenantClientDataTypeDataIdAttributeNameIndexBuilder.ArbitraryActionBuilder<TenantClientDataTypeDataIdAttributeNameIndexBuilder.DeleteActionBuilder>
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
        protected TenantClientDataTypeDataIdAttributeNameIndexBuilder.DeleteActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeDataIdAttributeNameIndexBuilder.DeleteActionBuilder actionBuilder = new TenantClientDataTypeDataIdAttributeNameIndexBuilder.DeleteActionBuilder(getTarget(), newRequestParams);
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
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.DeleteActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>version</code> query parameter value.
         * 
         * @param version the value of the <code>version</code> query parameter
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>version</code> query parameter set
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.DeleteActionBuilder withVersion(Integer version) {
            return this.withSingleQuery("version", version);
        }

        /**
         * Sets the <code>compact</code> query parameter value.
         * 
         * @param compact the value of the <code>compact</code> query parameter
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>compact</code> query parameter set
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.DeleteActionBuilder withCompact(Boolean compact) {
            return this.withSingleQuery("compact", compact);
        }

        /**
         * Registers callback to handle the 409 Conflict response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.DeleteActionBuilder onConflict(ResponseCallback callback) {
            return this.withCallbackForCode(409, callback);
        }

        /**
         * Registers callback to handle the 401 Unauthorized response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.DeleteActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.DeleteActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.DeleteActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }


    /**
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends TenantClientDataTypeDataIdAttributeNameIndexBuilder.ArbitraryActionBuilder<TenantClientDataTypeDataIdAttributeNameIndexBuilder.GetActionBuilder>
    {


        /**
         * Creates a new instance of a {@link GetActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public GetActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
            setHttpMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod.GET);
        }

        @Override
        protected TenantClientDataTypeDataIdAttributeNameIndexBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeDataIdAttributeNameIndexBuilder.GetActionBuilder actionBuilder = new TenantClientDataTypeDataIdAttributeNameIndexBuilder.GetActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        /**
         * Sets the <code>If-None-Match</code> header value.
         * 
         * @param ifNoneMatch the value of the <code>If-None-Match</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>If-None-Match</code> header set
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.GetActionBuilder withIfNoneMatch(String ifNoneMatch) {
            return this.withSingleHeader("If-None-Match", ifNoneMatch);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Registers callback to handle the 401 Unauthorized response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.GetActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.GetActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.GetActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }


    /**
     * An implementation of the {@link HeadActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for HEAD action.	 
     * 
     */
    public static class HeadActionBuilder
        extends TenantClientDataTypeDataIdAttributeNameIndexBuilder.ArbitraryActionBuilder<TenantClientDataTypeDataIdAttributeNameIndexBuilder.HeadActionBuilder>
    {


        /**
         * Creates a new instance of a {@link HeadActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public HeadActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
            setHttpMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod.HEAD);
        }

        @Override
        protected TenantClientDataTypeDataIdAttributeNameIndexBuilder.HeadActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeDataIdAttributeNameIndexBuilder.HeadActionBuilder actionBuilder = new TenantClientDataTypeDataIdAttributeNameIndexBuilder.HeadActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link HeadActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.HeadActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Registers callback to handle the 401 Unauthorized response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.HeadActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.HeadActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.HeadActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }


    /**
     * An implementation of the {@link PutActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for PUT action.	 
     * 
     */
    public static class PutActionBuilder
        extends TenantClientDataTypeDataIdAttributeNameIndexBuilder.ArbitraryActionBuilder<TenantClientDataTypeDataIdAttributeNameIndexBuilder.PutActionBuilder>
        implements ActionWithPayloadBuilder<TenantClientDataTypeDataIdAttributeNameIndexBuilder.PutActionBuilder, Object>
    {


        /**
         * Creates a new instance of a {@link PutActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public PutActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
            setHttpMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod.PUT);
        }

        @Override
        protected TenantClientDataTypeDataIdAttributeNameIndexBuilder.PutActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeDataIdAttributeNameIndexBuilder.PutActionBuilder actionBuilder = new TenantClientDataTypeDataIdAttributeNameIndexBuilder.PutActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.PutActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.PutActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.PutActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PutActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.PutActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>version</code> query parameter value.
         * 
         * @param version the value of the <code>version</code> query parameter
         * @return a new instance of {@link PutActionBuilder}, with the <code>version</code> query parameter set
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.PutActionBuilder withVersion(Integer version) {
            return this.withSingleQuery("version", version);
        }

        /**
         * Sets the <code>compact</code> query parameter value.
         * 
         * @param compact the value of the <code>compact</code> query parameter
         * @return a new instance of {@link PutActionBuilder}, with the <code>compact</code> query parameter set
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.PutActionBuilder withCompact(Boolean compact) {
            return this.withSingleQuery("compact", compact);
        }

        /**
         * Registers callback to handle the 404 Not Found response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.PutActionBuilder onNotFound(ResponseCallback callback) {
            return this.withCallbackForCode(404, callback);
        }

        /**
         * Registers callback to handle the 409 Conflict response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.PutActionBuilder onConflict(ResponseCallback callback) {
            return this.withCallbackForCode(409, callback);
        }

        /**
         * Registers callback to handle the 401 Unauthorized response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.PutActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.PutActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdAttributeNameIndexBuilder.PutActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }

}
