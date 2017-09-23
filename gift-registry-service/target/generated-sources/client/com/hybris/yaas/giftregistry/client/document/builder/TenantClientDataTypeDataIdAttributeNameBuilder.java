
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
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/{attributeName}</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * <li>{@link #index()}</li>
 * </ul>
 * 
 */
public class TenantClientDataTypeDataIdAttributeNameBuilder
    extends AbstractResourceBuilder<TenantClientDataTypeDataIdAttributeNameBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    public final static String RELATIVE_URI = "/{attributeName}";
    /**
     * The static field for the <code>attributeName</code> URI parameter name.
     * 
     */
    public final static String URI_PARAM_ATTRIBUTE_NAME = "attributeName";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    public final static String[] URI_PARAMS_ALL = new String[] {URI_PARAM_ATTRIBUTE_NAME };

    /**
     * Creates a new instance of the {@link TenantClientDataTypeDataIdAttributeNameBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantClientDataTypeDataIdAttributeNameBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantClientDataTypeDataIdAttributeNameBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantClientDataTypeDataIdAttributeNameBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>attributeName</code> URI parameter of this resource.
     * 
     * @param attributeName the new value for the <code>attributeName</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameBuilder fillAttributeName(final String attributeName) {
        return this.withUriParam(TenantClientDataTypeDataIdAttributeNameBuilder.URI_PARAM_ATTRIBUTE_NAME, attributeName);
    }

    /**
     * Fill the <code>dataId</code> URI parameter of this resource.
     * 
     * @param dataId the new value for the <code>dataId</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameBuilder fillDataId(final String dataId) {
        return this.withUriParam(TenantClientDataTypeDataIdBuilder.URI_PARAM_DATA_ID, dataId);
    }

    /**
     * Fill the <code>type</code> URI parameter of this resource.
     * 
     * @param type the new value for the <code>type</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameBuilder fillType(final String type) {
        return this.withUriParam(TenantClientDataTypeBuilder.URI_PARAM_TYPE, type);
    }

    /**
     * Fill the <code>client</code> URI parameter of this resource.
     * 
     * @param client the new value for the <code>client</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameBuilder fillClient(final String client) {
        return this.withUriParam(TenantClientBuilder.URI_PARAM_CLIENT, client);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{index}</code>.
     * 
     * @return an instance of {@link TenantClientDataTypeDataIdAttributeNameIndexBuilder}
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameIndexBuilder index() {
        return new TenantClientDataTypeDataIdAttributeNameIndexBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{index}</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #index()} method instead.
     * 
     * @return an instance of {@link TenantClientDataTypeDataIdAttributeNameIndexBuilder}
     * @param index the value of the <code>index</code> URI parameter
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameIndexBuilder index(Double index) {
        TenantClientDataTypeDataIdAttributeNameIndexBuilder resourceBuilder = new TenantClientDataTypeDataIdAttributeNameIndexBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillIndex(index);
        return resourceBuilder;
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for POST action for this resource.
     * 
     * @return an instance of {@link PostActionBuilder}
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameBuilder.PostActionBuilder preparePost() {
        return new TenantClientDataTypeDataIdAttributeNameBuilder.PostActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for DELETE action for this resource.
     * 
     * @return an instance of {@link DeleteActionBuilder}
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameBuilder.DeleteActionBuilder prepareDelete() {
        return new TenantClientDataTypeDataIdAttributeNameBuilder.DeleteActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameBuilder.AnyActionBuilder prepareAny() {
        return new TenantClientDataTypeDataIdAttributeNameBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantClientDataTypeDataIdAttributeNameBuilder.ArbitraryActionBuilder<TenantClientDataTypeDataIdAttributeNameBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantClientDataTypeDataIdAttributeNameBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantClientDataTypeDataIdAttributeNameBuilder.AnyActionBuilder>
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
        protected TenantClientDataTypeDataIdAttributeNameBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeDataIdAttributeNameBuilder.AnyActionBuilder actionBuilder = new TenantClientDataTypeDataIdAttributeNameBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantClientDataTypeDataIdAttributeNameBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeDataIdAttributeNameBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeDataIdAttributeNameBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantClientDataTypeDataIdAttributeNameBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantClientDataTypeDataIdAttributeNameBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantClientDataTypeDataIdAttributeNameBuilder.ArbitraryActionBuilder<?> >
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
        extends TenantClientDataTypeDataIdAttributeNameBuilder.ArbitraryActionBuilder<TenantClientDataTypeDataIdAttributeNameBuilder.DeleteActionBuilder>
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
        protected TenantClientDataTypeDataIdAttributeNameBuilder.DeleteActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeDataIdAttributeNameBuilder.DeleteActionBuilder actionBuilder = new TenantClientDataTypeDataIdAttributeNameBuilder.DeleteActionBuilder(getTarget(), newRequestParams);
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
        public TenantClientDataTypeDataIdAttributeNameBuilder.DeleteActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>version</code> query parameter value.
         * 
         * @param version the value of the <code>version</code> query parameter
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>version</code> query parameter set
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameBuilder.DeleteActionBuilder withVersion(Integer version) {
            return this.withSingleQuery("version", version);
        }

        /**
         * Registers callback to handle the 401 Unauthorized response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameBuilder.DeleteActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdAttributeNameBuilder.DeleteActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdAttributeNameBuilder.DeleteActionBuilder onBadRequest(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdAttributeNameBuilder.DeleteActionBuilder onConflict(ResponseCallback callback) {
            return this.withCallbackForCode(409, callback);
        }

    }


    /**
     * An implementation of the {@link PostActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for POST action.	 
     * 
     */
    public static class PostActionBuilder
        extends TenantClientDataTypeDataIdAttributeNameBuilder.ArbitraryActionBuilder<TenantClientDataTypeDataIdAttributeNameBuilder.PostActionBuilder>
        implements ActionWithPayloadBuilder<TenantClientDataTypeDataIdAttributeNameBuilder.PostActionBuilder, Object>
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
        protected TenantClientDataTypeDataIdAttributeNameBuilder.PostActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeDataIdAttributeNameBuilder.PostActionBuilder actionBuilder = new TenantClientDataTypeDataIdAttributeNameBuilder.PostActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantClientDataTypeDataIdAttributeNameBuilder.PostActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeDataIdAttributeNameBuilder.PostActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeDataIdAttributeNameBuilder.PostActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameBuilder.PostActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>version</code> query parameter value.
         * 
         * @param version the value of the <code>version</code> query parameter
         * @return a new instance of {@link PostActionBuilder}, with the <code>version</code> query parameter set
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameBuilder.PostActionBuilder withVersion(Integer version) {
            return this.withSingleQuery("version", version);
        }

        /**
         * Registers callback to handle the 401 Unauthorized response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameBuilder.PostActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdAttributeNameBuilder.PostActionBuilder onForbidden(ResponseCallback callback) {
            return this.withCallbackForCode(403, callback);
        }

        /**
         * Registers callback to handle the 409 Conflict response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameBuilder.PostActionBuilder onConflict(ResponseCallback callback) {
            return this.withCallbackForCode(409, callback);
        }

        /**
         * Registers callback to handle the 400 Bad Request response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientDataTypeDataIdAttributeNameBuilder.PostActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }

}
