/*
 * © 2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 * Please see http://www.sap.com/corporate-en/legal/copyright/index.epx for additional trademark information and
 * notices.
 */
package com.sap.cloud.yaas.rammler.commons;




import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;

import org.glassfish.jersey.internal.util.collection.ImmutableMultivaluedMap;
import org.glassfish.jersey.message.internal.HeaderUtils;


/**
 * Represents a (templated) REST endpoint with values for the:
 * - URI parameters
 * - headers
 * - query parameters
 * to be filled in later, as well as:
 * - error callbacks.
 */
public class RequestParams
{
	private final MultivaluedMap<String, Object> headers;
	private final MultivaluedMap<String, Object> queries;
	private final Map<String, Object> uriParams;
	private final CallbackHandler.CallbackHandlerBuilder callbackHandlerBuilder;

	/**
	 * Creates new instance of {@link RequestParams}.
	 */
	public RequestParams()
	{
		this(HeaderUtils.empty(), HeaderUtils.empty(), Collections.<String, Object>emptyMap(), null);
	}

	private RequestParams(final MultivaluedMap<String, Object> headers, final MultivaluedMap<String, Object> queries,
			final Map<String, Object> uriParams, final CallbackHandler givenCallbackHandler)
	{
		this.headers = new MultivaluedHashMap<String, Object>(headers);
		this.queries = new MultivaluedHashMap<String, Object>(queries);
		this.uriParams = new HashMap<>(uriParams);
		this.callbackHandlerBuilder = givenCallbackHandler == null ?
				CallbackHandler.builder()
				: CallbackHandler.builder(givenCallbackHandler);

	}

	/**
	 * Returns a copy of the current {@link RequestParams}.
	 * 
	 * @return a copy of the current object
	 */
	public RequestParams makeACopy()
	{
		return new RequestParams(headers, queries, uriParams, callbackHandlerBuilder.buildCallbackHandler());
	}

	public Map<String, Object> getUriParams()
	{
		return Collections.unmodifiableMap(uriParams);
	}

	public MultivaluedMap<String, Object> getAllHeaders()
	{
		return new ImmutableMultivaluedMap<>(headers);
	}

	public MultivaluedMap<String, Object> getAllQueries()
	{
		return new ImmutableMultivaluedMap<>(queries);
	}

	public CallbackHandler getCallbackHandler()
	{
		return callbackHandlerBuilder.buildCallbackHandler();
	}

	/**
	 * Returns a new copy of this {@link RequestParams}, with a new header appended. If the header
	 * already exists, it will be replaced.
	 * 
	 * @param key the header name
	 * @param value the header value
	 * @return a new {@link RequestParams} instance
	 */
	public RequestParams withSingleHeader(final String key, final Object value)
	{
		final RequestParams requestParams = this.makeACopy();
		requestParams.headers.putSingle(key, value);
		return requestParams;
	}

	/**
	 * Returns a new copy of this {@link RequestParams}, with a number of new repeatable header values.
	 * 
	 * @param key the header name
	 * @param values the new header values
	 * @return a new {@link RequestParams} instance
	 */
	public RequestParams withRepeatableHeader(final String key, final Object... values)
	{
		final RequestParams requestParams = this.makeACopy();
		requestParams.headers.addAll(key, values);
		return requestParams;
	}

	/**
	 * Returns a new copy of this {@link RequestParams}, with a new query parameter appended. If the query parameter
	 * already exists, it will be replaced.
	 * 
	 * @param key the query parameter name
	 * @param value the query parameter value
	 * @return a new {@link RequestParams} instance
	 */
	public RequestParams withSingleQuery(final String key, final Object value)
	{
		final RequestParams requestParams = this.makeACopy();
		requestParams.queries.putSingle(key, value);
		return requestParams;
	}

	/**
	 * Returns a new copy of this {@link RequestParams}, with a number of new repeatable query parameter values.
	 * 
	 * @param key the query parameter name
	 * @param values the new query parameter values
	 * @return a new {@link RequestParams} instance
	 */
	public RequestParams withRepeatableQuery(final String key, final Object... values)
	{
		final RequestParams requestParams = this.makeACopy();
		requestParams.queries.addAll(key, values);
		return requestParams;
	}

	/**
	 * Returns a new copy of this {@link RequestParams}, with a new URI parameter value appended. If the URI parameter
	 * already exists, it will be replaced.
	 *
	 * @param newUriParam the param name
	 * @param uriParamValue the param value
	 * @return a new {@link RequestParams} instance
	 */
	public RequestParams withUriParam(final String newUriParam, final Object uriParamValue)
	{
		final RequestParams requestParams = this.makeACopy();
		requestParams.uriParams.put(newUriParam, uriParamValue);
		return requestParams;
	}

	/**
	 * Returns a new copy of this {@link RequestParams}, with a new error callback for request execution failure
	 * appended. If such callback has already been defined, it will be replaced.
	 * 
	 * @param callback the callback
	 * @return a new {@link RequestParams} instance
	 */
	public RequestParams withCallbackForFailure(final ProcessingFailureCallback callback)
	{
		final RequestParams requestParams = this.makeACopy();
		requestParams.callbackHandlerBuilder.setCallbackForFailure(callback);
		return requestParams;
	}

	/**
	 * Returns a new copy of this {@link RequestParams}, with a new error callback for undefined error response code
	 * appended. If such callback has already been defined, it will be replaced.
	 * 
	 * @param callback the callback
	 * @return a new {@link RequestParams} instance
	 */
	public RequestParams withCallbackForUndefinedError(final ResponseCallback callback)
	{
		final RequestParams requestParams = this.makeACopy();
		requestParams.callbackHandlerBuilder.setCallbackForUndefinedError(callback);
		return requestParams;
	}

	/**
	 * Returns a new copy of this {@link RequestParams}, with a new error callback for given error response code
	 * appended. If a callback for such code has already been defined, it will be replaced.
	 * 
	 * @param code the HTTP response code
	 * @param callback the callback for that code
	 * @return a new {@link RequestParams} instance
	 */
	public RequestParams withCallbackForCode(final int code, final ResponseCallback callback)
	{
		final RequestParams requestParams = this.makeACopy();
		requestParams.callbackHandlerBuilder.setCallbackForCode(code, callback);
		return requestParams;
	}


}
