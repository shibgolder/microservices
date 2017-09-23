
package com.hybris.yaas.giftregistry.resources;

import java.net.URI;
import java.util.ArrayList;

import javax.inject.Singleton;
import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hybris.yaas.giftregistry.service.GiftRegistryService;
import com.sap.cloud.yaas.servicesdk.jerseysupport.pagination.PaginatedCollection;
import com.sap.cloud.yaas.servicesdk.jerseysupport.pagination.PaginationRequest;

/**
* Resource class containing the custom logic. Please put your logic here!
*/
@Component("apiGiftRegistriesResource")
@Singleton
public class DefaultGiftRegistriesResource implements GiftRegistriesResource
{
	@Context
	private UriInfo uriInfo;

	@Autowired
	private GiftRegistryService giftRegistryService;

	/* GET / */
	@Override
	public Response get(final CountableParameters countable, final PagedParameters paged,
							  final SortableParameters sortable, final YaasAwareParameters yaasAware)
	{
		final PaginationRequest paginationRequest = new PaginationRequest(paged.getPageNumber(), paged.getPageSize(), countable.isTotalCount());

		final PaginatedCollection<GiftRegistry> giftRegistries = giftRegistryService.getGiftRegistries(yaasAware, paginationRequest, sortable);

		return giftRegistries.decorateResponse(Response.ok(giftRegistries), uriInfo).build();
	}

	/* POST / */
	@Override
	public Response post(final YaasAwareParameters yaasAware, final GiftRegistry giftRegistry)
	{
		final String giftRegistryId = giftRegistryService.createGiftRegistry(yaasAware, giftRegistry);

		final URI createUri = UriBuilder.fromUri(uriInfo.getAbsolutePath())
				.path("{giftRegistryId}")
				.build(giftRegistryId);

		return Response.created(createUri).build();
	}

	/* GET /{giftRegistryId} */
	@Override
	public Response getByGiftRegistryId(final YaasAwareParameters yaasAware, final String giftRegistryId)
	{
		final GiftRegistry giftRegistry = giftRegistryService.getGiftRegistry(yaasAware, giftRegistryId);

		return Response.ok().entity(giftRegistry).build();
	}

	/* PUT /{giftRegistryId} */
	@Override
	public Response putByGiftRegistryId(final YaasAwareParameters yaasAware, final String giftRegistryId, final GiftRegistry giftRegistry)
	{
		// place some logic here
		return Response.ok().build();
	}

	/* DELETE /{giftRegistryId} */
	@Override
	public Response deleteByGiftRegistryId(final YaasAwareParameters yaasAware, final String giftRegistryId)
	{
		giftRegistryService.deleteGiftRegistry(yaasAware, giftRegistryId);
		return Response.noContent().build();
	}

	/* GET /{giftRegistryId}/gifts */
	@Override
	public Response getByGiftRegistryIdGifts(final YaasAwareParameters yaasAware, final String giftRegistryId)
	{
		// place some logic here
		return Response.ok().entity(new ArrayList<Gift>()).build();
	}

	/* POST /{giftRegistryId}/gifts */
	@Override
	public Response postByGiftRegistryIdGifts(final YaasAwareParameters yaasAware, final String giftRegistryId, final Gift gift)
	{
		// place some logic here
		return Response.created(uriInfo.getAbsolutePath()).build();
	}

	/* GET /{giftRegistryId}/gifts/{giftId} */
	@Override
	public Response getByGiftRegistryIdGiftsByGiftId(final YaasAwareParameters yaasAware, final String giftRegistryId, final String giftId)
	{
		// place some logic here
		return Response.ok().entity(new Gift()).build();
	}

	/* PUT /{giftRegistryId}/gifts/{giftId} */
	@Override
	public Response putByGiftRegistryIdGiftsByGiftId(final YaasAwareParameters yaasAware, final String giftRegistryId, final String giftId, final Gift gift)
	{
		// place some logic here
		return Response.ok().build();
	}

	/* DELETE /{giftRegistryId}/gifts/{giftId} */
	@Override
	public Response deleteByGiftRegistryIdGiftsByGiftId(final YaasAwareParameters yaasAware, final java.lang.String giftRegistryId, final java.lang.String giftId)
	{
		// place some logic here
		return Response.noContent()
			.build();
	}

	@Override
	public Response postByGiftRegistryIdShareEmail(@BeanParam @Valid YaasAwareParameters yaasAware, String giftRegistryId, @Valid Email email) {
		boolean isEmailSent = giftRegistryService.shareGiftRegistryByEmail(yaasAware, giftRegistryId, email);
		if(isEmailSent){
			return Response.ok().build();
		}
		throw new InternalServerErrorException("Unable to send Email..");
	}


}
