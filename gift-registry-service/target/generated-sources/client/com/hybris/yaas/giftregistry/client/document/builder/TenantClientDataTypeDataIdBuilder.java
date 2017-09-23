
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
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/{dataId}</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * <li>{@link #attributeName()}</li>
 * </ul>
 * 
 */
public class TenantClientDataTypeDataIdBuilder
    extends AbstractResourceBuilder<TenantClientDataTypeDataIdBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    public final static String RELATIVE_URI = "/{dataId}";
    /**
     * The static field for the <code>dataId</code> URI parameter name.
     * 
     */
    public final static String URI_PARAM_DATA_ID = "dataId";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    public final static String[] URI_PARAMS_ALL = new String[] {URI_PARAM_DATA_ID };

    /**
     * Creates a new instance of the {@link TenantClientDataTypeDataIdBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantClientDataTypeDataIdBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantClientDataTypeDataIdBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantClientDataTypeDataIdBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantClientDataTypeDataIdBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>dataId</code> URI parameter of this resource.
     * 
     * @param dataId the new value for the <code>dataId</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataTypeDataIdBuilder fillDataId(final String dataId) {
        return this.withUriParam(TenantClientDataTypeDataIdBuilder.URI_PARAM_DATA_ID, dataId);
    }

    /**
     * Fill the <code>type</code> URI parameter of this resource.
     * 
     * @param type the new value for the <code>type</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataTypeDataIdBuilder fillType(final String type) {
        return this.withUriParam(TenantClientDataTypeBuilder.URI_PARAM_TYPE, type);
    }

    /**
     * Fill the <code>client</code> URI parameter of this resource.
     * 
     * @param client the new value for the <code>client</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataTypeDataIdBuilder fillClient(final String client) {
        return this.withUriParam(TenantClientBuilder.URI_PARAM_CLIENT, client);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataTypeDataIdBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{attributeName}</code>.
     * 
     * @return an instance of {@link TenantClientDataTypeDataIdAttributeNameBuilder}
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameBuilder attributeName() {
        return new TenantClientDataTypeDataIdAttributeNameBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{attributeName}</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #attributeName()} method instead.
     * 
     * @return an instance of {@link TenantClientDataTypeDataIdAttributeNameBuilder}
     * @param attributeName the value of the <code>attributeName</code> URI parameter
     * 
     */
    public TenantClientDataTypeDataIdAttributeNameBuilder attributeName(String attributeName) {
        TenantClientDataTypeDataIdAttributeNameBuilder resourceBuilder = new TenantClientDataTypeDataIdAttributeNameBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillAttributeName(attributeName);
        return resourceBuilder;
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public TenantClientDataTypeDataIdBuilder.GetActionBuilder prepareGet() {
        return new TenantClientDataTypeDataIdBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for HEAD action for this resource.
     * 
     * @return an instance of {@link HeadActionBuilder}
     * 
     */
    public TenantClientDataTypeDataIdBuilder.HeadActionBuilder prepareHead() {
        return new TenantClientDataTypeDataIdBuilder.HeadActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for POST action for this resource.
     * 
     * @return an instance of {@link PostActionBuilder}
     * 
     */
    public TenantClientDataTypeDataIdBuilder.PostActionBuilder preparePost() {
        return new TenantClientDataTypeDataIdBuilder.PostActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for PUT action for this resource.
     * 
     * @return an instance of {@link PutActionBuilder}
     * 
     */
    public TenantClientDataTypeDataIdBuilder.PutActionBuilder preparePut() {
        return new TenantClientDataTypeDataIdBuilder.PutActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for DELETE action for this resource.
     * 
     * @return an instance of {@link DeleteActionBuilder}
     * 
     */
    public TenantClientDataTypeDataIdBuilder.DeleteActionBuilder prepareDelete() {
        return new TenantClientDataTypeDataIdBuilder.DeleteActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantClientDataTypeDataIdBuilder.AnyActionBuilder prepareAny() {
        return new TenantClientDataTypeDataIdBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantClientDataTypeDataIdBuilder.ArbitraryActionBuilder<TenantClientDataTypeDataIdBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantClientDataTypeDataIdBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantClientDataTypeDataIdBuilder.AnyActionBuilder>
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
        protected TenantClientDataTypeDataIdBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeDataIdBuilder.AnyActionBuilder actionBuilder = new TenantClientDataTypeDataIdBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantClientDataTypeDataIdBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeDataIdBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeDataIdBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantClientDataTypeDataIdBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantClientDataTypeDataIdBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantClientDataTypeDataIdBuilder.ArbitraryActionBuilder<?> >
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
        extends TenantClientDataTypeDataIdBuilder.ArbitraryActionBuilder<TenantClientDataTypeDataIdBuilder.DeleteActionBuilder>
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
        protected TenantClientDataTypeDataIdBuilder.DeleteActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeDataIdBuilder.DeleteActionBuilder actionBuilder = new TenantClientDataTypeDataIdBuilder.DeleteActionBuilder(getTarget(), newRequestParams);
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
        public TenantClientDataTypeDataIdBuilder.DeleteActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>version</code> query parameter value.
         * 
         * @param version the value of the <code>version</code> query parameter
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>version</code> query parameter set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.DeleteActionBuilder withVersion(Integer version) {
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
        public TenantClientDataTypeDataIdBuilder.DeleteActionBuilder onNotFound(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdBuilder.DeleteActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdBuilder.DeleteActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdBuilder.DeleteActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }


    /**
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends TenantClientDataTypeDataIdBuilder.ArbitraryActionBuilder<TenantClientDataTypeDataIdBuilder.GetActionBuilder>
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
        protected TenantClientDataTypeDataIdBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeDataIdBuilder.GetActionBuilder actionBuilder = new TenantClientDataTypeDataIdBuilder.GetActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        /**
         * Sets the <code>hybris-metaData</code> header value.
         * 
         * @param hybrisMetaData the value of the <code>hybris-metaData</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>hybris-metaData</code> header set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.GetActionBuilder withHybrisMetaData(String hybrisMetaData) {
            return this.withSingleHeader("hybris-metaData", hybrisMetaData);
        }

        /**
         * Appends a new header value to the <code>Accept-Language</code> multiple header.
         * 
         * @param acceptLanguage the new value of the <code>Accept-Language</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Accept-Language</code> header value added
         * 
         */
        public TenantClientDataTypeDataIdBuilder.GetActionBuilder withAcceptLanguage(String acceptLanguage) {
            return this.withRepeatableHeader("Accept-Language", acceptLanguage);
        }

        /**
         * Appends a new header value to the <code>hybris-languages</code> multiple header.
         * 
         * @param hybrisLanguages the new value of the <code>hybris-languages</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>hybris-languages</code> header value added
         * 
         */
        public TenantClientDataTypeDataIdBuilder.GetActionBuilder withHybrisLanguages(String hybrisLanguages) {
            return this.withRepeatableHeader("hybris-languages", hybrisLanguages);
        }

        /**
         * Sets the <code>hybris-currencies</code> header value.
         * 
         * @param hybrisCurrencies the value of the <code>hybris-currencies</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>hybris-currencies</code> header set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.GetActionBuilder withHybrisCurrencies(String hybrisCurrencies) {
            return this.withSingleHeader("hybris-currencies", hybrisCurrencies);
        }

        /**
         * Sets the <code>If-None-Match</code> header value.
         * 
         * @param ifNoneMatch the value of the <code>If-None-Match</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>If-None-Match</code> header set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.GetActionBuilder withIfNoneMatch(String ifNoneMatch) {
            return this.withSingleHeader("If-None-Match", ifNoneMatch);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>fields</code> query parameter value.
         * 
         * @param fields the value of the <code>fields</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>fields</code> query parameter set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.GetActionBuilder withFields(String fields) {
            return this.withSingleQuery("fields", fields);
        }

        /**
         * Registers callback to handle the 404 Not Found response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientDataTypeDataIdBuilder.GetActionBuilder onNotFound(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdBuilder.GetActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdBuilder.GetActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdBuilder.GetActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }


    /**
     * An implementation of the {@link HeadActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for HEAD action.	 
     * 
     */
    public static class HeadActionBuilder
        extends TenantClientDataTypeDataIdBuilder.ArbitraryActionBuilder<TenantClientDataTypeDataIdBuilder.HeadActionBuilder>
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
        protected TenantClientDataTypeDataIdBuilder.HeadActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeDataIdBuilder.HeadActionBuilder actionBuilder = new TenantClientDataTypeDataIdBuilder.HeadActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        /**
         * Sets the <code>hybris-metaData</code> header value.
         * 
         * @param hybrisMetaData the value of the <code>hybris-metaData</code> header
         * @return a new instance of {@link HeadActionBuilder}, with the <code>hybris-metaData</code> header set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.HeadActionBuilder withHybrisMetaData(String hybrisMetaData) {
            return this.withSingleHeader("hybris-metaData", hybrisMetaData);
        }

        /**
         * Appends a new header value to the <code>Accept-Language</code> multiple header.
         * 
         * @param acceptLanguage the new value of the <code>Accept-Language</code> header
         * @return a new instance of {@link HeadActionBuilder}, with the <code>Accept-Language</code> header value added
         * 
         */
        public TenantClientDataTypeDataIdBuilder.HeadActionBuilder withAcceptLanguage(String acceptLanguage) {
            return this.withRepeatableHeader("Accept-Language", acceptLanguage);
        }

        /**
         * Appends a new header value to the <code>hybris-languages</code> multiple header.
         * 
         * @param hybrisLanguages the new value of the <code>hybris-languages</code> header
         * @return a new instance of {@link HeadActionBuilder}, with the <code>hybris-languages</code> header value added
         * 
         */
        public TenantClientDataTypeDataIdBuilder.HeadActionBuilder withHybrisLanguages(String hybrisLanguages) {
            return this.withRepeatableHeader("hybris-languages", hybrisLanguages);
        }

        /**
         * Sets the <code>hybris-currencies</code> header value.
         * 
         * @param hybrisCurrencies the value of the <code>hybris-currencies</code> header
         * @return a new instance of {@link HeadActionBuilder}, with the <code>hybris-currencies</code> header set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.HeadActionBuilder withHybrisCurrencies(String hybrisCurrencies) {
            return this.withSingleHeader("hybris-currencies", hybrisCurrencies);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link HeadActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.HeadActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>fields</code> query parameter value.
         * 
         * @param fields the value of the <code>fields</code> query parameter
         * @return a new instance of {@link HeadActionBuilder}, with the <code>fields</code> query parameter set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.HeadActionBuilder withFields(String fields) {
            return this.withSingleQuery("fields", fields);
        }

        /**
         * Registers callback to handle the 404 Not Found response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientDataTypeDataIdBuilder.HeadActionBuilder onNotFound(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdBuilder.HeadActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdBuilder.HeadActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdBuilder.HeadActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }


    /**
     * An implementation of the {@link PostActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for POST action.	 
     * 
     */
    public static class PostActionBuilder
        extends TenantClientDataTypeDataIdBuilder.ArbitraryActionBuilder<TenantClientDataTypeDataIdBuilder.PostActionBuilder>
        implements ActionWithPayloadBuilder<TenantClientDataTypeDataIdBuilder.PostActionBuilder, Object>
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
        protected TenantClientDataTypeDataIdBuilder.PostActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeDataIdBuilder.PostActionBuilder actionBuilder = new TenantClientDataTypeDataIdBuilder.PostActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantClientDataTypeDataIdBuilder.PostActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeDataIdBuilder.PostActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeDataIdBuilder.PostActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>hybris-languages</code> header value.
         * 
         * @param hybrisLanguages the value of the <code>hybris-languages</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>hybris-languages</code> header set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.PostActionBuilder withHybrisLanguages(String hybrisLanguages) {
            return this.withSingleHeader("hybris-languages", hybrisLanguages);
        }

        /**
         * Sets the <code>hybris-metaData</code> header value.
         * 
         * @param hybrisMetaData the value of the <code>hybris-metaData</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>hybris-metaData</code> header set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.PostActionBuilder withHybrisMetaData(String hybrisMetaData) {
            return this.withSingleHeader("hybris-metaData", hybrisMetaData);
        }

        /**
         * Sets the <code>Content-Language</code> header value.
         * 
         * @param contentLanguage the value of the <code>Content-Language</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>Content-Language</code> header set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.PostActionBuilder withContentLanguage(String contentLanguage) {
            return this.withSingleHeader("Content-Language", contentLanguage);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.PostActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Registers callback to handle the 409 Conflict response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientDataTypeDataIdBuilder.PostActionBuilder onConflict(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdBuilder.PostActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdBuilder.PostActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdBuilder.PostActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }


    /**
     * An implementation of the {@link PutActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for PUT action.	 
     * 
     */
    public static class PutActionBuilder
        extends TenantClientDataTypeDataIdBuilder.ArbitraryActionBuilder<TenantClientDataTypeDataIdBuilder.PutActionBuilder>
        implements ActionWithPayloadBuilder<TenantClientDataTypeDataIdBuilder.PutActionBuilder, Object>
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
        protected TenantClientDataTypeDataIdBuilder.PutActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataTypeDataIdBuilder.PutActionBuilder actionBuilder = new TenantClientDataTypeDataIdBuilder.PutActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantClientDataTypeDataIdBuilder.PutActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeDataIdBuilder.PutActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataTypeDataIdBuilder.PutActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>hybris-languages</code> header value.
         * 
         * @param hybrisLanguages the value of the <code>hybris-languages</code> header
         * @return a new instance of {@link PutActionBuilder}, with the <code>hybris-languages</code> header set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.PutActionBuilder withHybrisLanguages(String hybrisLanguages) {
            return this.withSingleHeader("hybris-languages", hybrisLanguages);
        }

        /**
         * Sets the <code>hybris-metaData</code> header value.
         * 
         * @param hybrisMetaData the value of the <code>hybris-metaData</code> header
         * @return a new instance of {@link PutActionBuilder}, with the <code>hybris-metaData</code> header set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.PutActionBuilder withHybrisMetaData(String hybrisMetaData) {
            return this.withSingleHeader("hybris-metaData", hybrisMetaData);
        }

        /**
         * Sets the <code>Content-Language</code> header value.
         * 
         * @param contentLanguage the value of the <code>Content-Language</code> header
         * @return a new instance of {@link PutActionBuilder}, with the <code>Content-Language</code> header set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.PutActionBuilder withContentLanguage(String contentLanguage) {
            return this.withSingleHeader("Content-Language", contentLanguage);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PutActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.PutActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>version</code> query parameter value.
         * 
         * @param version the value of the <code>version</code> query parameter
         * @return a new instance of {@link PutActionBuilder}, with the <code>version</code> query parameter set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.PutActionBuilder withVersion(Integer version) {
            return this.withSingleQuery("version", version);
        }

        /**
         * Sets the <code>partial</code> query parameter value.
         * 
         * @param partial the value of the <code>partial</code> query parameter
         * @return a new instance of {@link PutActionBuilder}, with the <code>partial</code> query parameter set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.PutActionBuilder withPartial(Boolean partial) {
            return this.withSingleQuery("partial", partial);
        }

        /**
         * Sets the <code>patch</code> query parameter value.
         * 
         * @param patch the value of the <code>patch</code> query parameter
         * @return a new instance of {@link PutActionBuilder}, with the <code>patch</code> query parameter set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.PutActionBuilder withPatch(Boolean patch) {
            return this.withSingleQuery("patch", patch);
        }

        /**
         * Sets the <code>upsert</code> query parameter value.
         * 
         * @param upsert the value of the <code>upsert</code> query parameter
         * @return a new instance of {@link PutActionBuilder}, with the <code>upsert</code> query parameter set
         * 
         */
        public TenantClientDataTypeDataIdBuilder.PutActionBuilder withUpsert(Boolean upsert) {
            return this.withSingleQuery("upsert", upsert);
        }

        /**
         * Registers callback to handle the 404 Not Found response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantClientDataTypeDataIdBuilder.PutActionBuilder onNotFound(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdBuilder.PutActionBuilder onConflict(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdBuilder.PutActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdBuilder.PutActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantClientDataTypeDataIdBuilder.PutActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }

}
