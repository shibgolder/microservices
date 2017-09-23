
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
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/data/{type}</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * <li>{@link #dataId()}</li>
 * </ul>
 * 
 */
public class TenantClientDataTypeBuilder
    extends AbstractResourceBuilder<TenantClientDataTypeBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    public final static String RELATIVE_URI = "/data/{type}";
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
     * Creates a new instance of the {@link TenantClientDataTypeBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantClientDataTypeBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantClientDataTypeBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantClientDataTypeBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantClientDataTypeBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>type</code> URI parameter of this resource.
     * 
     * @param type the new value for the <code>type</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataTypeBuilder fillType(final String type) {
        return this.withUriParam(TenantClientDataTypeBuilder.URI_PARAM_TYPE, type);
    }

    /**
     * Fill the <code>client</code> URI parameter of this resource.
     * 
     * @param client the new value for the <code>client</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataTypeBuilder fillClient(final String client) {
        return this.withUriParam(TenantClientBuilder.URI_PARAM_CLIENT, client);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataTypeBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{dataId}</code>.
     * 
     * @return an instance of {@link TenantClientDataTypeDataIdBuilder}
     * 
     */
    public TenantClientDataTypeDataIdBuilder dataId() {
        return new TenantClientDataTypeDataIdBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{dataId}</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #dataId()} method instead.
     * 
     * @return an instance of {@link TenantClientDataTypeDataIdBuilder}
     * @param dataId the value of the <code>dataId</code> URI parameter
     * 
     */
    public TenantClientDataTypeDataIdBuilder dataId(String dataId) {
        TenantClientDataTypeDataIdBuilder resourceBuilder = new TenantClientDataTypeDataIdBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillDataId(dataId);
        return resourceBuilder;
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for HEAD action for this resource.
     * 
     * @return an instance of {@link HeadActionBuilder}
     * 
     */
    public TenantClientDataTypeBuilder.HeadActionBuilder prepareHead() {
        return new TenantClientDataTypeBuilder.HeadActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public TenantClientDataTypeBuilder.GetActionBuilder prepareGet() {
        return new TenantClientDataTypeBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for POST action for this resource.
     * 
     * @return an instance of {@link PostActionBuilder}
     * 
     */
    public TenantClientDataTypeBuilder.PostActionBuilder preparePost() {
        return new TenantClientDataTypeBuilder.PostActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for DELETE action for this resource.
     * 
     * @return an instance of {@link DeleteActionBuilder}
     * 
     */
    public TenantClientDataTypeBuilder.DeleteActionBuilder prepareDelete() {
        return new TenantClientDataTypeBuilder.DeleteActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for PUT action for this resource.
     * 
     * @return an instance of {@link PutActionBuilder}
     * 
     */
    public TenantClientDataTypeBuilder.PutActionBuilder preparePut() {
        return new TenantClientDataTypeBuilder.PutActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantClientDataTypeBuilder.AnyActionBuilder prepareAny() {
        return new TenantClientDataTypeBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantClientDataTypeBuilder.ArbitraryActionBuilder<TenantClientDataTypeBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantClientDataTypeBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantClientDataTypeBuilder.AnyActionBuilder>
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
        protected TenantClientDataTypeBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeBuilder.AnyActionBuilder actionBuilder = new TenantClientDataTypeBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantClientDataTypeBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantClientDataTypeBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantClientDataTypeBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantClientDataTypeBuilder.ArbitraryActionBuilder<?> >
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
        extends TenantClientDataTypeBuilder.ArbitraryActionBuilder<TenantClientDataTypeBuilder.DeleteActionBuilder>
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
        protected TenantClientDataTypeBuilder.DeleteActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeBuilder.DeleteActionBuilder actionBuilder = new TenantClientDataTypeBuilder.DeleteActionBuilder(getTarget(), newRequestParams);
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
        public TenantClientDataTypeBuilder.DeleteActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>hybris-metaData</code> header value.
         * 
         * @param hybrisMetaData the value of the <code>hybris-metaData</code> header
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>hybris-metaData</code> header set
         * 
         */
        public TenantClientDataTypeBuilder.DeleteActionBuilder withHybrisMetaData(String hybrisMetaData) {
            return this.withSingleHeader("hybris-metaData", hybrisMetaData);
        }

        /**
         * Sets the <code>drop</code> query parameter value.
         * 
         * @param drop the value of the <code>drop</code> query parameter
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>drop</code> query parameter set
         * 
         */
        public TenantClientDataTypeBuilder.DeleteActionBuilder withDrop(String drop) {
            return this.withSingleQuery("drop", drop);
        }

        /**
         * Sets the <code>q</code> query parameter value.
         * 
         * @param q the value of the <code>q</code> query parameter
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>q</code> query parameter set
         * 
         */
        public TenantClientDataTypeBuilder.DeleteActionBuilder withQ(String q) {
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
        public TenantClientDataTypeBuilder.DeleteActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientDataTypeBuilder.DeleteActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantClientDataTypeBuilder.DeleteActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }


    /**
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends TenantClientDataTypeBuilder.ArbitraryActionBuilder<TenantClientDataTypeBuilder.GetActionBuilder>
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
        protected TenantClientDataTypeBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeBuilder.GetActionBuilder actionBuilder = new TenantClientDataTypeBuilder.GetActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        /**
         * Appends a new header value to the <code>Accept-Language</code> multiple header.
         * 
         * @param acceptLanguage the new value of the <code>Accept-Language</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Accept-Language</code> header value added
         * 
         */
        public TenantClientDataTypeBuilder.GetActionBuilder withAcceptLanguage(String acceptLanguage) {
            return this.withRepeatableHeader("Accept-Language", acceptLanguage);
        }

        /**
         * Appends a new header value to the <code>hybris-languages</code> multiple header.
         * 
         * @param hybrisLanguages the new value of the <code>hybris-languages</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>hybris-languages</code> header value added
         * 
         */
        public TenantClientDataTypeBuilder.GetActionBuilder withHybrisLanguages(String hybrisLanguages) {
            return this.withRepeatableHeader("hybris-languages", hybrisLanguages);
        }

        /**
         * Sets the <code>hybris-currencies</code> header value.
         * 
         * @param hybrisCurrencies the value of the <code>hybris-currencies</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>hybris-currencies</code> header set
         * 
         */
        public TenantClientDataTypeBuilder.GetActionBuilder withHybrisCurrencies(String hybrisCurrencies) {
            return this.withSingleHeader("hybris-currencies", hybrisCurrencies);
        }

        /**
         * Sets the <code>If-None-Match</code> header value.
         * 
         * @param ifNoneMatch the value of the <code>If-None-Match</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>If-None-Match</code> header set
         * 
         */
        public TenantClientDataTypeBuilder.GetActionBuilder withIfNoneMatch(String ifNoneMatch) {
            return this.withSingleHeader("If-None-Match", ifNoneMatch);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantClientDataTypeBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>hybris-metaData</code> header value.
         * 
         * @param hybrisMetaData the value of the <code>hybris-metaData</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>hybris-metaData</code> header set
         * 
         */
        public TenantClientDataTypeBuilder.GetActionBuilder withHybrisMetaData(String hybrisMetaData) {
            return this.withSingleHeader("hybris-metaData", hybrisMetaData);
        }

        /**
         * Sets the <code>q</code> query parameter value.
         * 
         * @param q the value of the <code>q</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>q</code> query parameter set
         * 
         */
        public TenantClientDataTypeBuilder.GetActionBuilder withQ(String q) {
            return this.withSingleQuery("q", q);
        }

        /**
         * Sets the <code>sort</code> query parameter value.
         * 
         * @param sort the value of the <code>sort</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>sort</code> query parameter set
         * 
         */
        public TenantClientDataTypeBuilder.GetActionBuilder withSort(String sort) {
            return this.withSingleQuery("sort", sort);
        }

        /**
         * Sets the <code>pageNumber</code> query parameter value.
         * 
         * @param pageNumber the value of the <code>pageNumber</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>pageNumber</code> query parameter set
         * 
         */
        public TenantClientDataTypeBuilder.GetActionBuilder withPageNumber(Integer pageNumber) {
            return this.withSingleQuery("pageNumber", pageNumber);
        }

        /**
         * Sets the <code>pageSize</code> query parameter value.
         * 
         * @param pageSize the value of the <code>pageSize</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>pageSize</code> query parameter set
         * 
         */
        public TenantClientDataTypeBuilder.GetActionBuilder withPageSize(Integer pageSize) {
            return this.withSingleQuery("pageSize", pageSize);
        }

        /**
         * Sets the <code>totalCount</code> query parameter value.
         * 
         * @param totalCount the value of the <code>totalCount</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>totalCount</code> query parameter set
         * 
         */
        public TenantClientDataTypeBuilder.GetActionBuilder withTotalCount(Boolean totalCount) {
            return this.withSingleQuery("totalCount", totalCount);
        }

        /**
         * Sets the <code>fields</code> query parameter value.
         * 
         * @param fields the value of the <code>fields</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>fields</code> query parameter set
         * 
         */
        public TenantClientDataTypeBuilder.GetActionBuilder withFields(String fields) {
            return this.withSingleQuery("fields", fields);
        }

        /**
         * Registers callback to handle the 408 Request Timeout response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientDataTypeBuilder.GetActionBuilder onRequestTimeout(ResponseCallback callback) {
            return this.withCallbackForCode(408, callback);
        }

        /**
         * Registers callback to handle the 401 Unauthorized response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientDataTypeBuilder.GetActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientDataTypeBuilder.GetActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantClientDataTypeBuilder.GetActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }


    /**
     * An implementation of the {@link HeadActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for HEAD action.	 
     * 
     */
    public static class HeadActionBuilder
        extends TenantClientDataTypeBuilder.ArbitraryActionBuilder<TenantClientDataTypeBuilder.HeadActionBuilder>
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
        protected TenantClientDataTypeBuilder.HeadActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeBuilder.HeadActionBuilder actionBuilder = new TenantClientDataTypeBuilder.HeadActionBuilder(getTarget(), newRequestParams);
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
        public TenantClientDataTypeBuilder.HeadActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>hybris-metaData</code> header value.
         * 
         * @param hybrisMetaData the value of the <code>hybris-metaData</code> header
         * @return a new instance of {@link HeadActionBuilder}, with the <code>hybris-metaData</code> header set
         * 
         */
        public TenantClientDataTypeBuilder.HeadActionBuilder withHybrisMetaData(String hybrisMetaData) {
            return this.withSingleHeader("hybris-metaData", hybrisMetaData);
        }

        /**
         * Sets the <code>q</code> query parameter value.
         * 
         * @param q the value of the <code>q</code> query parameter
         * @return a new instance of {@link HeadActionBuilder}, with the <code>q</code> query parameter set
         * 
         */
        public TenantClientDataTypeBuilder.HeadActionBuilder withQ(String q) {
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
        public TenantClientDataTypeBuilder.HeadActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientDataTypeBuilder.HeadActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantClientDataTypeBuilder.HeadActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }


    /**
     * An implementation of the {@link PostActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for POST action.	 
     * 
     */
    public static class PostActionBuilder
        extends TenantClientDataTypeBuilder.ArbitraryActionBuilder<TenantClientDataTypeBuilder.PostActionBuilder>
        implements ActionWithPayloadBuilder<TenantClientDataTypeBuilder.PostActionBuilder, Object>
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
        protected TenantClientDataTypeBuilder.PostActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeBuilder.PostActionBuilder actionBuilder = new TenantClientDataTypeBuilder.PostActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantClientDataTypeBuilder.PostActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeBuilder.PostActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeBuilder.PostActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>hybris-languages</code> header value.
         * 
         * @param hybrisLanguages the value of the <code>hybris-languages</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>hybris-languages</code> header set
         * 
         */
        public TenantClientDataTypeBuilder.PostActionBuilder withHybrisLanguages(String hybrisLanguages) {
            return this.withSingleHeader("hybris-languages", hybrisLanguages);
        }

        /**
         * Sets the <code>Content-Language</code> header value.
         * 
         * @param contentLanguage the value of the <code>Content-Language</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>Content-Language</code> header set
         * 
         */
        public TenantClientDataTypeBuilder.PostActionBuilder withContentLanguage(String contentLanguage) {
            return this.withSingleHeader("Content-Language", contentLanguage);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantClientDataTypeBuilder.PostActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>hybris-metaData</code> header value.
         * 
         * @param hybrisMetaData the value of the <code>hybris-metaData</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>hybris-metaData</code> header set
         * 
         */
        public TenantClientDataTypeBuilder.PostActionBuilder withHybrisMetaData(String hybrisMetaData) {
            return this.withSingleHeader("hybris-metaData", hybrisMetaData);
        }

        /**
         * Registers callback to handle the 409 Conflict response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientDataTypeBuilder.PostActionBuilder onConflict(ResponseCallback callback) {
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
        public TenantClientDataTypeBuilder.PostActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientDataTypeBuilder.PostActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantClientDataTypeBuilder.PostActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }


    /**
     * An implementation of the {@link PutActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for PUT action.	 
     * 
     */
    public static class PutActionBuilder
        extends TenantClientDataTypeBuilder.ArbitraryActionBuilder<TenantClientDataTypeBuilder.PutActionBuilder>
        implements ActionWithPayloadBuilder<TenantClientDataTypeBuilder.PutActionBuilder, Object>
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
        protected TenantClientDataTypeBuilder.PutActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeBuilder.PutActionBuilder actionBuilder = new TenantClientDataTypeBuilder.PutActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantClientDataTypeBuilder.PutActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeBuilder.PutActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeBuilder.PutActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>hybris-languages</code> header value.
         * 
         * @param hybrisLanguages the value of the <code>hybris-languages</code> header
         * @return a new instance of {@link PutActionBuilder}, with the <code>hybris-languages</code> header set
         * 
         */
        public TenantClientDataTypeBuilder.PutActionBuilder withHybrisLanguages(String hybrisLanguages) {
            return this.withSingleHeader("hybris-languages", hybrisLanguages);
        }

        /**
         * Sets the <code>Content-Language</code> header value.
         * 
         * @param contentLanguage the value of the <code>Content-Language</code> header
         * @return a new instance of {@link PutActionBuilder}, with the <code>Content-Language</code> header set
         * 
         */
        public TenantClientDataTypeBuilder.PutActionBuilder withContentLanguage(String contentLanguage) {
            return this.withSingleHeader("Content-Language", contentLanguage);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PutActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantClientDataTypeBuilder.PutActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>hybris-metaData</code> header value.
         * 
         * @param hybrisMetaData the value of the <code>hybris-metaData</code> header
         * @return a new instance of {@link PutActionBuilder}, with the <code>hybris-metaData</code> header set
         * 
         */
        public TenantClientDataTypeBuilder.PutActionBuilder withHybrisMetaData(String hybrisMetaData) {
            return this.withSingleHeader("hybris-metaData", hybrisMetaData);
        }

        /**
         * Sets the <code>q</code> query parameter value.
         * 
         * @param q the value of the <code>q</code> query parameter
         * @return a new instance of {@link PutActionBuilder}, with the <code>q</code> query parameter set
         * 
         */
        public TenantClientDataTypeBuilder.PutActionBuilder withQ(String q) {
            return this.withSingleQuery("q", q);
        }

        /**
         * Registers callback to handle the 409 Conflict response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientDataTypeBuilder.PutActionBuilder onConflict(ResponseCallback callback) {
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
        public TenantClientDataTypeBuilder.PutActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientDataTypeBuilder.PutActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantClientDataTypeBuilder.PutActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }

}
