/*
 * © 2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 * Please see http://www.sap.com/corporate-en/legal/copyright/index.epx for additional trademark information and
 * notices.
 */
package com.sap.cloud.yaas.rammler.commons.builder;

import com.sap.cloud.yaas.rammler.commons.RequestExecutor;
import com.sap.cloud.yaas.rammler.commons.RequestParams;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;


/**
 * An requestDefinition execution abstraction delegates to {@link javax.ws.rs.client.Invocation}.
 */
public abstract class AbstractActionBuilder<T extends AbstractActionBuilder<? extends Object>> extends AbstractResourceBuilder<T>
		implements
		ActionBuilder<T>
{
	private Entity<? extends Object> requestPayload;
	private HttpMethod httpMethod;

	protected AbstractActionBuilder(final WebTarget target, final RequestParams requestParams)
	{
		super(target, requestParams);
	}

	/**
	 * Sets payload of the message in the {@link Entity} format
	 * 
	 * @param payload the payload
	 * @return the action builder with the payload set
	 */
	protected T withRequestPayload(final Entity<? extends Object> payload)
	{
		final T builder = makeACopy(getRequestParams().makeACopy());
		builder.setRequestPayload(payload);
		return builder;
	}

	/**
	 * Sets payload of "application/json" media type.
	 * 
	 * @param payload the payload to serialize
	 * @return the action builder with the payload set
	 */
	protected T withRequestPayload(final Object payload)
	{
		final T builder = makeACopy(getRequestParams().makeACopy());
		builder.setRequestPayload(Entity.entity(payload, "application/json"));
		return builder;
	}

	/**
	 * Sets payload of custom media type.
	 * 
	 * @param payload the payload to serialize
	 * @param the media type, like in {@link javax.ws.rs.core.MediaType}, e.g. "application/json"
	 * @return the action builder with the payload set
	 */
	protected T withRequestPayload(final Object payload, final String mediaType)
	{
		final T builder = makeACopy(getRequestParams().makeACopy());
		builder.setRequestPayload(Entity.entity(payload, mediaType));
		return builder;
	}

	@Override
	public Response execute()
	{
		return new RequestExecutor(getRequestParams().getCallbackHandler()).execute(buildRequest());
	}

	@Override
	public <K> K execute(final Class<K> clazz)
	{
		return new RequestExecutor(getRequestParams().getCallbackHandler()).execute(buildRequest(), clazz);
	}

	@Override
	public <K> K execute(final GenericType<K> gt)
	{
		return new RequestExecutor(getRequestParams().getCallbackHandler()).execute(buildRequest(), gt);
	}

	@Override
	public Future<Response> queue()
	{
		return new RequestExecutor(getRequestParams().getCallbackHandler()).queue(buildRequest());
	}

	@Override
	public <K> Future<K> queue(final Class<K> clazz)
	{
		return new RequestExecutor(getRequestParams().getCallbackHandler()).queue(buildRequest(), clazz);
	}

	@Override
	public <K> Future<K> queue(final GenericType<K> gt)
	{
		return new RequestExecutor(getRequestParams().getCallbackHandler()).queue(buildRequest(), gt);
	}

	protected void setHttpMethod(final HttpMethod theMethod)
	{
		this.httpMethod = theMethod;
	}

	protected void setRequestPayload(final Entity<? extends Object> requestPayload)
	{
		this.requestPayload = requestPayload;
	}

	protected Entity<? extends Object> getRequestPayload()
	{
		return requestPayload;
	}

	protected HttpMethod getHttpMethod()
	{
		return httpMethod;
	}

	private WebTarget applyQueryParams(final WebTarget initial, final MultivaluedMap<String, Object> queryParams)
	{
		WebTarget result = initial;
		for (final Map.Entry<String, List<Object>> pair : queryParams.entrySet())
		{
			result = result.queryParam(pair.getKey(), pair.getValue().toArray());
		}
		return result;
	}

	private Invocation buildRequest()
	{
		if (httpMethod == null)
		{
			throw new IllegalArgumentException("The HTTP method has not been specified for this requestDefinition");
		}

		final WebTarget resolvedTarget = getTarget().resolveTemplates(getRequestParams().getUriParams());
		final Builder builder = applyQueryParams(resolvedTarget, getRequestParams().getAllQueries()).request().headers(
				getRequestParams().getAllHeaders());
		if (requestPayload == null)
		{
			return builder.build(httpMethod.toString());
		}
		else
		{
			return builder.build(httpMethod.toString(), requestPayload);
		}
	}
}
