/*
 * © 2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 * Please see http://www.sap.com/corporate-en/legal/copyright/index.epx for additional trademark information and
 * notices.
 */
package com.sap.cloud.yaas.rammler.commons.builder;

import com.sap.cloud.yaas.rammler.commons.ProcessingFailureCallback;
import com.sap.cloud.yaas.rammler.commons.ResponseCallback;


/**
 * Interface which describes the variants of making the call as well as some common request builder methods.
 */
public interface ResourceBuilder<T extends ResourceBuilder<? extends Object>>
{
	/**
	 * Registers callback to handle any response having no callback registered. If an exception is thrown inside this
	 * method it will not be processed by {@link #onProcessingFailure(ProcessingFailureCallback)} callback but propagated
	 * outside.
	 *
	 * @param callback callback to register
	 * @return the new instance of the request builder
	 */
	T onDefaultErrorResponse(final ResponseCallback callback);

	/**
	 * Registers a callback to handle any exception in cause of processing the response. It does not get invoked if an
	 * exception is thrown inside any error response callback.
	 *
	 * @param callback callback to register
	 * @return the new instance of the request builder
	 */
	T onProcessingFailure(final ProcessingFailureCallback callback);

	/**
	 * Adds a custom header to the request.
	 *
	 * @param key header key
	 * @param values header values
	 * @return the new instance of the request builder
	 */
	T withHeader(final String key, final Object... values);

	/**
	 * Adds a custom query parameter to the request.
	 *
	 * @param key query parameter key
	 * @param values query parameter values
	 * @return the new instance of the request builder
	 */
	T withQuery(final String key, final Object... values);

	/**
	 * Sets a templated uri parameter value.
	 *
	 * @param key the parameter key
	 * @param value the parameter value
	 * @return the new instance of the request builder
	 */
	T withUriParam(final String key, final Object value);

}
