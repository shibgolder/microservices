/*
 * © 2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 * Please see http://www.sap.com/corporate-en/legal/copyright/index.epx for additional trademark information and
 * notices.
 */
package com.sap.cloud.yaas.rammler.commons;



/**
 * Callback for handling exceptions on response processing.
 */
public interface ProcessingFailureCallback
{
	/**
	 * Handles an exception on response processing on client side. When the exception occurs on entity unmarshalling a
	 * {@link javax.ws.rs.ProcessingException} gets passed, not a {@link javax.ws.rs.WebApplicationException}.
	 * 
	 * It will stop the exception from propagating.
	 * 
	 * @param throwable the exception happened on client side while processing the response
	 */
	void handleProcessingFailure(final Throwable throwable);
}
