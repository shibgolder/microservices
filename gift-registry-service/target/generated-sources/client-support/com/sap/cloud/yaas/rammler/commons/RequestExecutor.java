/*
 * © 2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 * Please see http://www.sap.com/corporate-en/legal/copyright/index.epx for additional trademark information and
 * notices.
 */
package com.sap.cloud.yaas.rammler.commons;

import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.function.Supplier;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.concurrent.FutureAdapter;


/**
 * A class capable of performing the actual execution of a request (Invocation).
 * It provides sync (execute()) and async (queue()) execution.
 */
public class RequestExecutor
{
	private static final Logger LOG = LoggerFactory.getLogger(RequestExecutor.class);

	private final CallbackHandler callbackHandler;

	/**
	 * Creates a new instance of this {@link RequestExecutor}, using the given {@link CallbackHandler}.
	 * 
	 * @param callbackHandler the callback handler to be used
	 */
	public RequestExecutor(final CallbackHandler callbackHandler)
	{
		this.callbackHandler = callbackHandler;
	}

	/**
	 * Execute the request synchronously, and return an object of type {@link Response}.
	 *
	 * @param invocation the request invocation object
	 * @return the response
	 */
	public Response execute(final Invocation invocation)
	{
		final Response response = handleCallError(() -> {
			return invocation.invoke();
		});
		callbackHandler.completed(response);
		return response;
	}

	/**
	 * Execute the request synchronously, and return an object of custom type, provided by the clazz parameter.
	 *
	 * @param invocation the request invocation object
	 * @param clazz the class object representing the type to which the response body should be converted
	 * @param <T> the expected type of the response body
	 * @return the response converted to given type
	 */
	public <T> T execute(final Invocation invocation, final Class<T> clazz)
	{
		final Response response = handleCallError(() -> {
			return invocation.invoke();
		});

		// dont catch exceptions from the handler
		callbackHandler.completed(response);

		return handleUnmarshallingError((final Class<T> c) -> {
			return response.readEntity(c);
		}, clazz);
	}

	/**
	 * Execute the request synchronously, and return an object of custom type, provided by the gt parameter.
	 *
	 * @param invocation the request invocation object
	 * @param gt {@link GenericType} object representing the type to which the response body should be converted
	 * @param <T> the expected type of the response body
	 * @return the response converted to given type
	 */
	public <T> T execute(final Invocation invocation, final GenericType<T> gt)
	{
		final Response response = handleCallError(() -> {
			return invocation.invoke();
		});

		// dont catch exceptions from the handler
		callbackHandler.completed(response);

		return handleUnmarshallingError((final GenericType<T> c) -> {
			return response.readEntity(c);
		}, gt);
	}

	/**
	 * Execute the request asynchronously, and return an object of type {@link Response}.
	 *
	 * @param invocation the request invocation object
	 * @return the future of response
	 */
	public Future<Response> queue(final Invocation invocation)
	{
		return invocation.submit(callbackHandler);
	}

	/**
	 * Execute the request asynchronously, and return an object of custom type, provided by the clazz parameter.
	 *
	 * @param invocation the request invocation object
	 * @param clazz the class object representing the type to which the response body should be converted
	 * @param <T> the expected type of the response body
	 * @return the future of the given type
	 */
	public <T> Future<T> queue(final Invocation invocation, final Class<T> clazz)
	{
		final Future<Response> result = invocation.submit(callbackHandler);
		return new FutureAdapter<T, Response>(result)
		{
			@Override
			protected T adapt(final Response response)
			{
				return handleUnmarshallingError((final Class<T> c) -> {
					return response.readEntity(c);
				}, clazz);
			}
		};
	}

	/**
	 * Execute the request asynchronously, and return an object of custom type, provided by the gt parameter.
	 *
	 * @param invocation the request invocation object
	 * @param gt {@link GenericType} object representing the type to which the response body should be converted
	 * @param <T> the expected type of the response body
	 * @return the future of the given type
	 */
	public <T> Future<T> queue(final Invocation invocation, final GenericType<T> gt)
	{
		final Future<Response> result = invocation.submit(callbackHandler);
		return new FutureAdapter<T, Response>(result)
		{
			@Override
			protected T adapt(final Response response)
			{
				return handleUnmarshallingError((final GenericType<T> c) -> {
					return response.readEntity(c);
				}, gt);
			}
		};
	}

	private Response handleCallError(final Supplier<Response> supplier)
	{
		try
		{
			return supplier.get();
		}
		// CHECKSTYLE IGNORE IllegalCatchCheck NEXT 1 LINES
		catch (final RuntimeException e)// NOPMD // NOSONAR
		{
			LOG.warn("Exception executing the REST call: " + e.getMessage(), e);
			return handleTheErrorOrNot(e);
		}
	}

	private <O, I> O handleUnmarshallingError(final Function<I, O> function, final I clazz)
	{
		try
		{
			return function.apply(clazz);
		}
		// CHECKSTYLE IGNORE IllegalCatchCheck NEXT 1 LINES
		catch (final RuntimeException e)// NOPMD // NOSONAR
		{
			LOG.warn("Exception unmarshalling the entity: " + e.getMessage(), e);
			return handleTheErrorOrNot(e);
		}
	}

	private <T> T handleTheErrorOrNot(final RuntimeException e)
	{
		if (callbackHandler.handlesFailure(e))
		{
			// if the error was handled then return null
			return null;
		}
		else
		{
			// otherwise rethrow the exception
			throw e;
		}
	}
}
