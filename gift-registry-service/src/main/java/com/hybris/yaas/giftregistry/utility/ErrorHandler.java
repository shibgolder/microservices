package com.hybris.yaas.giftregistry.utility;

import com.sap.cloud.yaas.servicesdk.authorization.AccessToken;
import com.sap.cloud.yaas.servicesdk.authorization.integration.AccessTokenInvalidException;

import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.core.Response;

/**
 * 
 * @author Shib Golder
 *
 */


public class ErrorHandler {

	public static RuntimeException resolveErrorResponse(final Response response, final AccessToken token) {
		switch (response.getStatus()) {
			case 401:
				return new AccessTokenInvalidException("request unauthorized", token);
			case 403:
				return new AccessTokenInvalidException("request forbidden", token);
			default:
				return new InternalServerErrorException(response);
		}
	}
}
