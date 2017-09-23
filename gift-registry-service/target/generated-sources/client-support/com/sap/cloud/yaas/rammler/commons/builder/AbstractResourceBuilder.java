/*
 * © 2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 * Please see http://www.sap.com/corporate-en/legal/copyright/index.epx for additional trademark information and
 * notices.
 */
package com.sap.cloud.yaas.rammler.commons.builder;

import com.sap.cloud.yaas.rammler.commons.ProcessingFailureCallback;
import com.sap.cloud.yaas.rammler.commons.RequestParams;
import com.sap.cloud.yaas.rammler.commons.ResponseCallback;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;


/**
 * An intermediate {@link ResourceBuilder} implementation, that contains information about the {@link WebTarget} and
 * request parameters, as well as methods tp modify them.
 * 
 * The implementing classes must implement the {@link #makeACopy(RequestParams)} method, so that the builder can
 * be copied on any change to its parameters (these objects are immmutable).
 */
public abstract class AbstractResourceBuilder<T extends AbstractResourceBuilder<? extends Object>> implements ResourceBuilder<T>
{
	private final RequestParams requestParams;
	private final WebTarget target;

	/**
	 * Creates new instance of the {@link AbstractResourceBuilder}, with given target URL for the client, an
	 * optionally preconfigured client instance, and optionally preconfigured request parameters.
	 * 
	 * @param baseUrl the base URL of the service which the client will call
	 * @param client the JAX RS client
	 * @param requestParams the request parameters
	 */
	protected AbstractResourceBuilder(final String baseUrl, final Client client, final RequestParams requestParams)
	{
		this.requestParams = requestParams;
		this.target = client.target(baseUrl);
	}

	/**
	 * Creates new instance of the {@link AbstractResourceBuilder}, with given {@link WebTarget}, pointing to the
	 * current endpoint's URL, and optionally preconfigured request parameters.
	 * 
	 * @param target the web target, pointing to the current endpoint's URL
	 * @param requestParams the request parameters
	 */
	protected AbstractResourceBuilder(final WebTarget target, final RequestParams requestParams)
	{
		this.requestParams = requestParams;
		this.target = target;
	}

	/**
	 * Creates new instance of the {@link AbstractResourceBuilder}, with given {@link WebTarget}, pointing to the
	 * current endpoint.
	 * 
	 * @param target the web target, pointing to the current endpoint's URL
	 * @param requestParams the request params
	 * @param newUriParam optionally, new URI parameters to append in form of a URI path template
	 */
	protected AbstractResourceBuilder(final WebTarget target, final RequestParams requestParams, final String relativeUri)
	{
		this.requestParams = requestParams;
		this.target = relativeUri != null ? target.path(relativeUri) : target;
	}

	/**
	 * Creates a copy of current object. The members that are not immutable will be copied as well.
	 * 
	 * @param newRequestParams the new request parameters to override the existing ones
	 * @return a new copy of current object, with optionally new request parameters
	 */
	protected abstract T makeACopy(final RequestParams newRequestParams);

	@Override
	public T onProcessingFailure(final ProcessingFailureCallback callback)
	{
		return makeACopy(getRequestParams().withCallbackForFailure(callback));
	}

	@Override
	public T onDefaultErrorResponse(final ResponseCallback callback)
	{
		return makeACopy(getRequestParams().withCallbackForUndefinedError(callback));
	}

	@Override
	public T withHeader(final String key, final Object... values)
	{
		return makeACopy(getRequestParams().withRepeatableHeader(key, values));
	}

	@Override
	public T withQuery(final String key, final Object... values)
	{
		return makeACopy(getRequestParams().withRepeatableQuery(key, values));
	}

	@Override
	public T withUriParam(final String key, final Object value)
	{
		return makeACopy(this.getRequestParams().withUriParam(key, value));
	}

	/**
	 * Returns a new copy of this resource builder, with a new header appended. If the header
	 * already exists, it will be replaced.
	 * 
	 * @param key the header name
	 * @param value the header value
	 * @return a new {@link ResourceBuilder} instance
	 */
	protected T withSingleHeader(final String key, final Object value)
	{
		return this.makeACopy(getRequestParams().withSingleHeader(key, value));
	}

	/**
	 * Returns a new copy of this {@link ResourceBuilder}, with a new repeatable header appended to a set of existing
	 * repeatable headers.
	 * 
	 * @param key the header name
	 * @param value the new header value
	 * @return a new {@link ResourceBuilder} instance
	 */
	protected T withRepeatableHeader(final String key, final Object value)
	{
		return makeACopy(getRequestParams().withRepeatableHeader(key, value));
	}

	/**
	 * Returns a new copy of this {@link ResourceBuilder}, with a new query parameter appended. If the query parameter
	 * already exists, it will be replaced.
	 * 
	 * @param key the query parameter name
	 * @param value the query parameter value
	 * @return a new {@link ResourceBuilder} instance
	 */
	protected T withSingleQuery(final String key, final Object value)
	{
		return makeACopy(getRequestParams().withSingleQuery(key, value));
	}

	/**
	 * Returns a new copy of this {@link ResourceBuilder}, with a new repeatable query parameter appended to a set of
	 * existing repeatable query parameters.
	 * 
	 * @param key the query parameter name
	 * @param value the new query parameter value
	 * @return a new {@link ResourceBuilder} instance
	 */
	protected T withRepeatableQuery(final String key, final Object value)
	{
		return makeACopy(getRequestParams().withRepeatableQuery(key, value));
	}

	/**
	 * Returns a new copy of this {@link ResourceBuilder}, with a new error callback for given error response code
	 * appended. If a callback for such code has already been defined, it will be replaced.
	 * 
	 * @param callback the callback
	 * @return a new {@link ResourceBuilder} instance
	 */
	protected T withCallbackForCode(final int code, final ResponseCallback callback)
	{
		return makeACopy(getRequestParams().withCallbackForCode(code, callback));
	}

	/**
	 * Returns the stored {@link RequestParams} object.
	 * 
	 * @return the requestParams
	 */
	protected RequestParams getRequestParams()
	{
		return requestParams;
	}

	/**
	 * Returns the stored {@link WebTarget} object.
	 * 
	 * @return the target
	 */
	protected WebTarget getTarget()
	{
		return target;
	}
}
