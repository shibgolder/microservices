
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
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/{type}</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * </ul>
 * 
 */
public class TenantClientAggrTypeBuilder
    extends AbstractResourceBuilder<TenantClientAggrTypeBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    public final static String RELATIVE_URI = "/{type}";
    /**
     * The static field for the <code>type</code> URI parameter name.
     * 
     */
    public final static String URI_PARAM_TYPE = "type";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    public final static String[] URI_PARAMS_ALL = new String[] {URI_PARAM_TYPE };

    /**
     * Creates a new instance of the {@link TenantClientAggrTypeBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantClientAggrTypeBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantClientAggrTypeBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantClientAggrTypeBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantClientAggrTypeBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>type</code> URI parameter of this resource.
     * 
     * @param type the new value for the <code>type</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientAggrTypeBuilder fillType(final String type) {
        return this.withUriParam(TenantClientAggrTypeBuilder.URI_PARAM_TYPE, type);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientAggrTypeBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantClientAggrBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Fill the <code>client</code> URI parameter of this resource.
     * 
     * @param client the new value for the <code>client</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientAggrTypeBuilder fillClient(final String client) {
        return this.withUriParam(TenantClientAggrBuilder.URI_PARAM_CLIENT, client);
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for HEAD action for this resource.
     * 
     * @return an instance of {@link HeadActionBuilder}
     * 
     */
    public TenantClientAggrTypeBuilder.HeadActionBuilder prepareHead() {
        return new TenantClientAggrTypeBuilder.HeadActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public TenantClientAggrTypeBuilder.GetActionBuilder prepareGet() {
        return new TenantClientAggrTypeBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantClientAggrTypeBuilder.AnyActionBuilder prepareAny() {
        return new TenantClientAggrTypeBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantClientAggrTypeBuilder.ArbitraryActionBuilder<TenantClientAggrTypeBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantClientAggrTypeBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantClientAggrTypeBuilder.AnyActionBuilder>
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
        protected TenantClientAggrTypeBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientAggrTypeBuilder.AnyActionBuilder actionBuilder = new TenantClientAggrTypeBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantClientAggrTypeBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientAggrTypeBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientAggrTypeBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantClientAggrTypeBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantClientAggrTypeBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantClientAggrTypeBuilder.ArbitraryActionBuilder<?> >
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
         * Fill the <code>type</code> URI parameter of this resource.
         * 
         * @param type the new value for the <code>type</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillType(final String type) {
            return this.withUriParam(TenantClientAggrTypeBuilder.URI_PARAM_TYPE, type);
        }

        /**
         * Fill the <code>tenant</code> URI parameter of this resource.
         * 
         * @param tenant the new value for the <code>tenant</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillTenant(final String tenant) {
            return this.withUriParam(TenantClientAggrBuilder.URI_PARAM_TENANT, tenant);
        }

        /**
         * Fill the <code>client</code> URI parameter of this resource.
         * 
         * @param client the new value for the <code>client</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillClient(final String client) {
            return this.withUriParam(TenantClientAggrBuilder.URI_PARAM_CLIENT, client);
        }

    }


    /**
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends TenantClientAggrTypeBuilder.ArbitraryActionBuilder<TenantClientAggrTypeBuilder.GetActionBuilder>
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
        protected TenantClientAggrTypeBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientAggrTypeBuilder.GetActionBuilder actionBuilder = new TenantClientAggrTypeBuilder.GetActionBuilder(getTarget(), newRequestParams);
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
        public TenantClientAggrTypeBuilder.GetActionBuilder withIfNoneMatch(String ifNoneMatch) {
            return this.withSingleHeader("If-None-Match", ifNoneMatch);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantClientAggrTypeBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>sum</code> query parameter value.
         * 
         * @param sum the value of the <code>sum</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>sum</code> query parameter set
         * 
         */
        public TenantClientAggrTypeBuilder.GetActionBuilder withSum(String sum) {
            return this.withSingleQuery("sum", sum);
        }

        /**
         * Sets the <code>avg</code> query parameter value.
         * 
         * @param avg the value of the <code>avg</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>avg</code> query parameter set
         * 
         */
        public TenantClientAggrTypeBuilder.GetActionBuilder withAvg(String avg) {
            return this.withSingleQuery("avg", avg);
        }

        /**
         * Sets the <code>count</code> query parameter value.
         * 
         * @param count the value of the <code>count</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>count</code> query parameter set
         * 
         */
        public TenantClientAggrTypeBuilder.GetActionBuilder withCount(Boolean count) {
            return this.withSingleQuery("count", count);
        }

        /**
         * Sets the <code>q</code> query parameter value.
         * 
         * @param q the value of the <code>q</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>q</code> query parameter set
         * 
         */
        public TenantClientAggrTypeBuilder.GetActionBuilder withQ(String q) {
            return this.withSingleQuery("q", q);
        }

        /**
         * Registers callback to handle the 401 Unauthorized response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientAggrTypeBuilder.GetActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientAggrTypeBuilder.GetActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantClientAggrTypeBuilder.GetActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }


    /**
     * An implementation of the {@link HeadActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for HEAD action.	 
     * 
     */
    public static class HeadActionBuilder
        extends TenantClientAggrTypeBuilder.ArbitraryActionBuilder<TenantClientAggrTypeBuilder.HeadActionBuilder>
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
        protected TenantClientAggrTypeBuilder.HeadActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientAggrTypeBuilder.HeadActionBuilder actionBuilder = new TenantClientAggrTypeBuilder.HeadActionBuilder(getTarget(), newRequestParams);
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
        public TenantClientAggrTypeBuilder.HeadActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>q</code> query parameter value.
         * 
         * @param q the value of the <code>q</code> query parameter
         * @return a new instance of {@link HeadActionBuilder}, with the <code>q</code> query parameter set
         * 
         */
        public TenantClientAggrTypeBuilder.HeadActionBuilder withQ(String q) {
            return this.withSingleQuery("q", q);
        }

        /**
         * Registers callback to handle the 401 Unauthorized response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientAggrTypeBuilder.HeadActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientAggrTypeBuilder.HeadActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantClientAggrTypeBuilder.HeadActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }

}
