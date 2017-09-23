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

import javax.ws.rs.client.InvocationCallback;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Class for holding the list of registered request error callbacks. There are three types of error callback:
 * - one callback for every defined response code
 * - callback for any response code that was not covered by the previous map
 * - callback that should be called on request/response processing exception
 */
public final class CallbackHandler implements InvocationCallback<Response>
{
	private static final int UNDEFINED_ERROR_RESPONSE_CODE = 0;
	private static final Logger LOG = LoggerFactory.getLogger(CallbackHandler.class);

	private final Map<Integer, ResponseCallback> callbacks;
	private final ProcessingFailureCallback failureCallback;

	/**
	 * Creates a new instance of a {@link CallbackHandler}.
	 * 
	 * @param callbacks the map of {@link ResponseCallback}s and their response codes
	 * @param failureCallback the callback which will be executed in case the request itself failed (so no error code
	 *           available)
	 */
	private CallbackHandler(final Map<Integer, ResponseCallback> callbacks, final ProcessingFailureCallback failureCallback)
	{
		this.callbacks = callbacks;
		this.failureCallback = failureCallback;
	}

	@Override
	public void completed(final Response response)
	{
		final ResponseCallback callback = resolveCallback(response);
		if (callback == null)
		{
			LOG.debug("Got response with status " + response.getStatus() + " but found no callback");
		}
		else
		{
			LOG.debug("Invoking the callback for " + response.getStatus());
			callback.handle(response);
		}
	}

	@Override
	public void failed(final Throwable throwable)
	{
		if (failureCallback == null)
		{
			LOG.error("Got " + throwable.getClass().getSimpleName() + " but no handler registered to process it", throwable);
		}
		else
		{
			LOG.debug("Invoking the failure callback for the caught " + throwable.getClass() + " exception");
			failureCallback.handleProcessingFailure(throwable);
		}
	}

	/**
	 * Handles the request or response processing error, using a registered callback handler, if applicable.
	 * See also {@link #failed(Throwable)}.
	 *
	 * @param throwable the exception thrown during processing the request or response
	 * @return whether the callback was executed (true) or not, as there was none registered
	 */
	public boolean handlesFailure(final Throwable throwable)
	{
		if (failureCallback == null)
		{
			LOG.error("Got " + throwable.getClass().getSimpleName() + " but no handler registered to process it", throwable);
			return false;
		}
		else
		{
			LOG.debug("Invoking the failure callback for the caught " + throwable.getClass() + " exception");
			failureCallback.handleProcessingFailure(throwable);
			return true;
		}
	}

	private ResponseCallback resolveCallback(final Response response)
	{
		ResponseCallback callback = callbacks.get(response.getStatus());
		if (callback == null && !Family.SUCCESSFUL.equals(response.getStatusInfo().getFamily()))
		{
			callback = callbacks.get(UNDEFINED_ERROR_RESPONSE_CODE);
		}
		return callback;
	}

	public ProcessingFailureCallback getCallbackForFailure()
	{
		return failureCallback;
	}

	public Map<Integer, ResponseCallback> getCallbacks()
	{
		return Collections.unmodifiableMap(callbacks);
	}

	/**
	 * Returns new {@link CallbackHandlerBuilder} builder.
	 * 
	 * @return an instance of {@link CallbackHandlerBuilder}
	 */
	protected static CallbackHandlerBuilder builder()
	{
		return new CallbackHandlerBuilder();
	}

	/**
	 * Returns new {@link CallbackHandlerBuilder} builder, initialized with values from another {@link CallbackHandler}.
	 * 
	 * @param callbackHandler the callback handler to initialize the builder with
	 * @return an instance of {@link CallbackHandlerBuilder}
	 */
	protected static CallbackHandlerBuilder builder(final CallbackHandler callbackHandler)
	{
		final CallbackHandlerBuilder builder = new CallbackHandlerBuilder();
		builder.builtFailureCallback = callbackHandler.getCallbackForFailure();
		builder.builtCallbacks.putAll(callbackHandler.getCallbacks());
		return builder;
	}

	/**
	 * A builder for the {@link CallbackHandler}.
	 */
	public static class CallbackHandlerBuilder
	{
		private final Map<Integer, ResponseCallback> builtCallbacks = new HashMap<>();
		private ProcessingFailureCallback builtFailureCallback;

		/**
		 * Registers a handler for correctly processed response on client side. The method registers the response callback
		 * based on the responses status code.
		 *
		 * @param code the code which the handled is registerd for
		 * @param callback a callback logic
		 */
		public void setCallbackForCode(final int code, final ResponseCallback callback)
		{
			this.builtCallbacks.put(code, callback);
		}

		/**
		 * Registers a handler for correctly processed response on client side. It is called when for the received status
		 * response code there is no other explict global or local response callback {@link ResponseCallback} registered
		 * with method {@link #setCallbackForCode(int, ResponseCallback)}.
		 *
		 * @param callback the callback itself
		 */
		public void setCallbackForUndefinedError(final ResponseCallback callback)
		{
			this.builtCallbacks.put(UNDEFINED_ERROR_RESPONSE_CODE, callback);
		}

		/**
		 * Registers a handler for incorrectly processed response on client side e.g client side unmarshalling or there is
		 * no explicitly registered response handler for non unsuccessful response (according to
		 * {@link javax.ws.rs.core.Response.StatusType#getFamily}.
		 * It is said to be consuming the exception which is the client one.
		 *
		 * @param callback the callback itself to react on exception
		 */
		public void setCallbackForFailure(final ProcessingFailureCallback callback)
		{
			builtFailureCallback = callback;
		}

		/**
		 * Returns an instance of currently built {@link CallbackHandler}.
		 * 
		 * @return an instance of {@link CallbackHandler}
		 */
		public CallbackHandler buildCallbackHandler()
		{
			return new CallbackHandler(Collections.unmodifiableMap(builtCallbacks), builtFailureCallback);
		}
	}

}
