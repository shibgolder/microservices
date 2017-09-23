package com.hybris.yaas.giftregistry.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.sap.cloud.yaas.servicesdk.patternsupport.traits.YaasAwareTrait;
import org.glassfish.jersey.server.ResourceConfig;
import org.junit.Assert;
import org.junit.Test;


public final class DefaultGiftRegistriesResourceTest extends AbstractResourceTest
{
	private static final String tenant = "giftregistrytest";
	private static final String client = "giftregistrytest.storefront";

	/**
	 * Server side root resource /giftRegistries,
	 * evaluated with some default value(s).
	 */
	private static final String ROOT_RESOURCE_PATH = "/giftRegistries";

	/* get() /giftRegistries */
	@Test
	public void testGet()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");

		final Response response = target.request()
				.header(YaasAwareTrait.Headers.CLIENT, client)
				.header(YaasAwareTrait.Headers.TENANT, tenant)
				.get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* post(entity) /giftRegistries */
	@Test
	public void testPostWithGiftRegistry()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");
		final GiftRegistry entityBody = new GiftRegistry();
		entityBody.setOwnerId("test");
		entityBody.setTitle("test");
		final Entity<GiftRegistry> entity = Entity.entity(entityBody,"application/json");

		final Response response = target.request()
				.header(YaasAwareTrait.Headers.CLIENT, client)
				.header(YaasAwareTrait.Headers.TENANT, tenant)
				.post(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.CREATED.getStatusCode(), response.getStatus());
	}

	/* get() /giftRegistries/giftRegistryId */
	@Test
	public void testGetByGiftRegistryId()
	{
		final GiftRegistry giftRegistry = new GiftRegistry();
		giftRegistry.setOwnerId("test");
		giftRegistry.setTitle("test");
		final Response createResponse = createGiftRegistry(giftRegistry);

		final String location = createResponse.getHeaderString(HttpHeaders.LOCATION);
		final String id = location.replaceFirst(".*/([^/?]+).*", "$1");

		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/" + id);

		final Response response = target.request()
				.header(YaasAwareTrait.Headers.CLIENT, client)
				.header(YaasAwareTrait.Headers.TENANT, tenant)
				.get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* put(entity) /giftRegistries/giftRegistryId */
	@Test
	public void testPutByGiftRegistryIdWithGiftRegistry()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/giftRegistryId");
		final GiftRegistry entityBody = new GiftRegistry();
		final Entity<GiftRegistry> entity = Entity.entity(entityBody,"application/json");

		final Response response = target.request().put(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* delete() /giftRegistries/giftRegistryId */
	@Test
	public void testDeleteByGiftRegistryId()
	{
		final GiftRegistry giftRegistry = new GiftRegistry();
		giftRegistry.setOwnerId("test");
		giftRegistry.setTitle("test");
		final Response createResponse = createGiftRegistry(giftRegistry);

		final String location = createResponse.getHeaderString(HttpHeaders.LOCATION);
		final String id = location.replaceFirst(".*/([^/?]+).*", "$1");

		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/" + id);

		final Response response = target.request()
				.header(YaasAwareTrait.Headers.CLIENT, client)
				.header(YaasAwareTrait.Headers.TENANT, tenant)
				.delete();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.NO_CONTENT.getStatusCode(), response.getStatus());
	}

	/* get() /giftRegistries/giftRegistryId/gifts */
	@Test
	public void testGetByGiftRegistryIdGifts()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/giftRegistryId/gifts");

		final Response response = target.request().get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* post(entity) /giftRegistries/giftRegistryId/gifts */
	@Test
	public void testPostByGiftRegistryIdGiftsWithGift()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/giftRegistryId/gifts");
		final Gift entityBody = new Gift();
		final Entity<Gift> entity = Entity.entity(entityBody,"application/json");

		final Response response = target.request().post(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.CREATED.getStatusCode(), response.getStatus());
	}

	/* get() /giftRegistries/giftRegistryId/gifts/giftId */
	@Test
	public void testGetByGiftRegistryIdGiftsByGiftId()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/giftRegistryId/gifts/giftId");

		final Response response = target.request().get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* put(entity) /giftRegistries/giftRegistryId/gifts/giftId */
	@Test
	public void testPutByGiftRegistryIdGiftsByGiftIdWithGift()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/giftRegistryId/gifts/giftId");
		final Gift entityBody = new Gift();
		final Entity<Gift> entity = Entity.entity(entityBody,"application/json");

		final Response response = target.request().put(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* delete() /giftRegistries/giftRegistryId/gifts/giftId */
	@Test
	public void testDeleteByGiftRegistryIdGiftsByGiftId()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/giftRegistryId/gifts/giftId");

		final Response response = target.request().delete();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.NO_CONTENT.getStatusCode(), response.getStatus());
	}


	/* put(entity) /giftRegistries/giftRegistryId/share/email */
	@Test
	public void testPostByGiftRegistryIdShareEmailWithEmail()
	{
		final GiftRegistry giftRegistry = new GiftRegistry();
		giftRegistry.setOwnerId("GiftRegistry Email Owner");
		giftRegistry.setTitle("GiftRegistry Email Title");

		final Response createResponse = createGiftRegistry(giftRegistry);
		final String id = createResponse.getHeaderString(HttpHeaders.LOCATION).replaceFirst(".*/([^/?]+).*", "$1");
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/" + id).path("/share/email");
		
		final Email emailBody = new Email();
		List<Emailaddress> to = new ArrayList<Emailaddress>();
		final Emailaddress address1 = new Emailaddress();
		address1.setName("Shib official");
		address1.setAddress("shib.golder@sap.com");
		to.add(address1);
		final Emailaddress address2 = new Emailaddress();
		address2.setName("Shib personal");
		address2.setAddress("contactshib@gmail.com");
		to.add(address2);
		emailBody.setTo(to);
		final Entity<Email> entity = Entity.entity(emailBody,"application/json");
		
		final Response response = target.request()
				.header(YaasAwareTrait.Headers.CLIENT, client)
				.header(YaasAwareTrait.Headers.TENANT, tenant)
				.post(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	

	@Override
	protected ResourceConfig configureApplication()
	{
		final ResourceConfig application = new ResourceConfig();
		application.register(DefaultGiftRegistriesResource.class);
		return application;
	}

	private Response createGiftRegistry(final GiftRegistry giftRegistry) {
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");
		final Entity<GiftRegistry> entity = Entity.entity(giftRegistry,"application/json");

		final Response response = target.request()
				.header(YaasAwareTrait.Headers.CLIENT, client)
				.header(YaasAwareTrait.Headers.TENANT, tenant)
				.post(entity);

		return response;
	}
}
