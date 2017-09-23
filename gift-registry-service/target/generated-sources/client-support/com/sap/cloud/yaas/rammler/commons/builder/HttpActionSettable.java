/*
 * © 2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 * Please see http://www.sap.com/corporate-en/legal/copyright/index.epx for additional trademark information and
 * notices.
 */
package com.sap.cloud.yaas.rammler.commons.builder;



/**
 * An interface for request builders that are capable of setting the HTTP action at runtime.
 */
public interface HttpActionSettable<T extends AbstractActionBuilder<? extends Object>>
{
	/**
	 * Sets the http method.
	 *
	 * @param theMethod the https method
	 * @return the instance of the request builder
	 */
	T fillMethod(final ActionBuilder.HttpMethod theMethod);
}
