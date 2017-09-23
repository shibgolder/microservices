
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
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/{name}</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * </ul>
 * 
 */
public class TenantClientIndexesTypeNameBuilder
    extends AbstractResourceBuilder<TenantClientIndexesTypeNameBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    public final static String RELATIVE_URI = "/{name}";
    /**
     * The static field for the <code>name</code> URI parameter name.
     * 
     */
    public final static String URI_PARAM_NAME = "name";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    public final static String[] URI_PARAMS_ALL = new String[] {URI_PARAM_NAME };

    /**
     * Creates a new instance of the {@link TenantClientIndexesTypeNameBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantClientIndexesTypeNameBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantClientIndexesTypeNameBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantClientIndexesTypeNameBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantClientIndexesTypeNameBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>name</code> URI parameter of this resource.
     * 
     * @param name the new value for the <code>name</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientIndexesTypeNameBuilder fillName(final String name) {
        return this.withUriParam(TenantClientIndexesTypeNameBuilder.URI_PARAM_NAME, name);
    }

    /**
     * Fill the <code>type</code> URI parameter of this resource.
     * 
     * @param type the new value for the <code>type</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientIndexesTypeNameBuilder fillType(final String type) {
        return this.withUriParam(TenantClientIndexesTypeBuilder.URI_PARAM_TYPE, type);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientIndexesTypeNameBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantClientIndexesBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Fill the <code>client</code> URI parameter of this resource.
     * 
     * @param client the new value for the <code>client</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientIndexesTypeNameBuilder fillClient(final String client) {
        return this.withUriParam(TenantClientIndexesBuilder.URI_PARAM_CLIENT, client);
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public TenantClientIndexesTypeNameBuilder.GetActionBuilder prepareGet() {
        return new TenantClientIndexesTypeNameBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for HEAD action for this resource.
     * 
     * @return an instance of {@link HeadActionBuilder}
     * 
     */
    public TenantClientIndexesTypeNameBuilder.HeadActionBuilder prepareHead() {
        return new TenantClientIndexesTypeNameBuilder.HeadActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for DELETE action for this resource.
     * 
     * @return an instance of {@link DeleteActionBuilder}
     * 
     */
    public TenantClientIndexesTypeNameBuilder.DeleteActionBuilder prepareDelete() {
        return new TenantClientIndexesTypeNameBuilder.DeleteActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantClientIndexesTypeNameBuilder.AnyActionBuilder prepareAny() {
        return new TenantClientIndexesTypeNameBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantClientIndexesTypeNameBuilder.ArbitraryActionBuilder<TenantClientIndexesTypeNameBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantClientIndexesTypeNameBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantClientIndexesTypeNameBuilder.AnyActionBuilder>
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
        protected TenantClientIndexesTypeNameBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientIndexesTypeNameBuilder.AnyActionBuilder actionBuilder = new TenantClientIndexesTypeNameBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantClientIndexesTypeNameBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientIndexesTypeNameBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientIndexesTypeNameBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantClientIndexesTypeNameBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantClientIndexesTypeNameBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantClientIndexesTypeNameBuilder.ArbitraryActionBuilder<?> >
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
         * Fill the <code>name</code> URI parameter of this resource.
         * 
         * @param name the new value for the <code>name</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillName(final String name) {
            return this.withUriParam(TenantClientIndexesTypeNameBuilder.URI_PARAM_NAME, name);
        }

        /**
         * Fill the <code>type</code> URI parameter of this resource.
         * 
         * @param type the new value for the <code>type</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillType(final String type) {
            return this.withUriParam(TenantClientIndexesTypeBuilder.URI_PARAM_TYPE, type);
        }

        /**
         * Fill the <code>tenant</code> URI parameter of this resource.
         * 
         * @param tenant the new value for the <code>tenant</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillTenant(final String tenant) {
            return this.withUriParam(TenantClientIndexesBuilder.URI_PARAM_TENANT, tenant);
        }

        /**
         * Fill the <code>client</code> URI parameter of this resource.
         * 
         * @param client the new value for the <code>client</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillClient(final String client) {
            return this.withUriParam(TenantClientIndexesBuilder.URI_PARAM_CLIENT, client);
        }

    }


    /**
     * An implementation of the {@link DeleteActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for DELETE action.	 
     * 
     */
    public static class DeleteActionBuilder
        extends TenantClientIndexesTypeNameBuilder.ArbitraryActionBuilder<TenantClientIndexesTypeNameBuilder.DeleteActionBuilder>
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
        protected TenantClientIndexesTypeNameBuilder.DeleteActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientIndexesTypeNameBuilder.DeleteActionBuilder actionBuilder = new TenantClientIndexesTypeNameBuilder.DeleteActionBuilder(getTarget(), newRequestParams);
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
        public TenantClientIndexesTypeNameBuilder.DeleteActionBuilder withAuthorization(String authorization) {
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
        public TenantClientIndexesTypeNameBuilder.DeleteActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientIndexesTypeNameBuilder.DeleteActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantClientIndexesTypeNameBuilder.DeleteActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }


    /**
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends TenantClientIndexesTypeNameBuilder.ArbitraryActionBuilder<TenantClientIndexesTypeNameBuilder.GetActionBuilder>
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
        protected TenantClientIndexesTypeNameBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientIndexesTypeNameBuilder.GetActionBuilder actionBuilder = new TenantClientIndexesTypeNameBuilder.GetActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantClientIndexesTypeNameBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>If-None-Match</code> header value.
         * 
         * @param ifNoneMatch the value of the <code>If-None-Match</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>If-None-Match</code> header set
         * 
         */
        public TenantClientIndexesTypeNameBuilder.GetActionBuilder withIfNoneMatch(String ifNoneMatch) {
            return this.withSingleHeader("If-None-Match", ifNoneMatch);
        }

        /**
         * Registers callback to handle the 404 Not Found response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientIndexesTypeNameBuilder.GetActionBuilder onNotFound(ResponseCallback callback) {
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
        public TenantClientIndexesTypeNameBuilder.GetActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientIndexesTypeNameBuilder.GetActionBuilder onForbidden(ResponseCallback callback) {
            return this.withCallbackForCode(403, callback);
        }

    }


    /**
     * An implementation of the {@link HeadActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for HEAD action.	 
     * 
     */
    public static class HeadActionBuilder
        extends TenantClientIndexesTypeNameBuilder.ArbitraryActionBuilder<TenantClientIndexesTypeNameBuilder.HeadActionBuilder>
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
        protected TenantClientIndexesTypeNameBuilder.HeadActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientIndexesTypeNameBuilder.HeadActionBuilder actionBuilder = new TenantClientIndexesTypeNameBuilder.HeadActionBuilder(getTarget(), newRequestParams);
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
        public TenantClientIndexesTypeNameBuilder.HeadActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>If-None-Match</code> header value.
         * 
         * @param ifNoneMatch the value of the <code>If-None-Match</code> header
         * @return a new instance of {@link HeadActionBuilder}, with the <code>If-None-Match</code> header set
         * 
         */
        public TenantClientIndexesTypeNameBuilder.HeadActionBuilder withIfNoneMatch(String ifNoneMatch) {
            return this.withSingleHeader("If-None-Match", ifNoneMatch);
        }

        /**
         * Registers callback to handle the 404 Not Found response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientIndexesTypeNameBuilder.HeadActionBuilder onNotFound(ResponseCallback callback) {
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
        public TenantClientIndexesTypeNameBuilder.HeadActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientIndexesTypeNameBuilder.HeadActionBuilder onForbidden(ResponseCallback callback) {
            return this.withCallbackForCode(403, callback);
        }

    }

}
