/*
 * © 2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 * Please see http://www.sap.com/corporate-en/legal/copyright/index.epx for additional trademark information and
 * notices.
 */
package com.sap.cloud.yaas.rammler.commons;

import javax.ws.rs.core.Response;


/**
 * Callback for reacting on a response.
 */
public interface ResponseCallback
{
	/**
	 * Processes the received response.
	 *
	 * @param response the response received
	 */
	void handle(final Response response);
}
