/*
 * © 2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 * Please see http://www.sap.com/corporate-en/legal/copyright/index.epx for additional trademark information and
 * notices.
 */
package com.sap.cloud.yaas.rammler.commons.builder;

import java.util.concurrent.Future;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;


/**
 * Interface which describes the variants of making the call (through different HTTP methods), as well as some common
 * action builder methods.
 */
public interface ActionBuilder<T extends ActionBuilder<? extends Object>> extends ResourceBuilder<T>
{
	/**
	 * An enum for HTTP method.
	 */
	enum HttpMethod
	{
		/**
		 * DELETE HTTP method.
		 */
		DELETE,
		/**
		 * POST HTTP method.
		 */
		POST,
		/**
		 * GET HTTP method.
		 */
		GET,
		/**
		 * PUT HTTP method.
		 */
		PUT,
		/**
		 * HEAD HTTP method.
		 */
		HEAD
	}

	/**
	 * Execute the request synchronously.
	 * 
	 * @return response
	 */
	Response execute();

	/**
	 * Execute the request synchronously.
	 *
	 * @param clazz the type of response
	 * @param <K> the type of the expected response
	 * @return K the future for the expected response
	 */
	<K> K execute(final Class<K> clazz);

	/**
	 * Execute the request synchronously.
	 *
	 * @param gt the type of response
	 * @param <K> the type of the expected response
	 * @return K the future for the expected response
	 */
	<K> K execute(final GenericType<K> gt);

	/**
	 * Execute the request asynchronously.
	 *
	 * @return response
	 */
	Future<Response> queue();

	/**
	 * Execute the request asynchronously.
	 *
	 * @param clazz the type of response
	 * @param <K> the type of the expected response
	 * @return K the future for the expected response
	 */
	<K> Future<K> queue(final Class<K> clazz);

	/**
	 * Execute the request asynchronously.
	 *
	 * @param gt the type of response
	 * @param <K> the type of the expected response
	 * @return K the future for the expected response
	 */
	<K> Future<K> queue(final GenericType<K> gt);

}
