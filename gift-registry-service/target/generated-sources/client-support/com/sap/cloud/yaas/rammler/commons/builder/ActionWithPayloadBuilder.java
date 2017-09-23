/*
 * © 2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 * Please see http://www.sap.com/corporate-en/legal/copyright/index.epx for additional trademark information and
 * notices.
 */
package com.sap.cloud.yaas.rammler.commons.builder;

import javax.ws.rs.client.Entity;


/**
 * An interface for an action builder that is capable of taking a request body.
 *
 * T - the ActionBuilder type
 * K - the type of the payload object
 */
public interface ActionWithPayloadBuilder<T extends ActionBuilder<? extends Object>, K>
{
	/**
	 * Add payload information to the request.
	 *
	 * @param payload the payload
	 * @return new instance of the action builder
	 */
	T withPayload(final Entity<? extends Object> payload);

	/**
	 * Add payload information to the request.
	 *
	 * @param payload the payload
	 * @return new instance of the action builder
	 */
	T withPayload(final K payload);

	/**
	 * Add payload information to the request.
	 *
	 * @param payload the payload
	 * @param mediaType the media type
	 * @return new instance of the action builder
	 */
	T withPayload(final K payload, final String mediaType);
}
