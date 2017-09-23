package com.hybris.yaas.giftregistry.resources;

import javax.ws.rs.core.Response;

@javax.ws.rs.Path("/giftRegistries")
public interface GiftRegistriesResource
{
	@javax.ws.rs.GET
	@javax.ws.rs.Produces({"application/json"})
	Response get(@javax.ws.rs.BeanParam @javax.validation.Valid final CountableParameters countable, @javax.ws.rs.BeanParam @javax.validation.Valid final PagedParameters paged, @javax.ws.rs.BeanParam @javax.validation.Valid final SortableParameters sortable, @javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware);

	@javax.ws.rs.POST
	@javax.ws.rs.Consumes({"application/json"})
	Response post(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.validation.Valid final GiftRegistry giftRegistry);

	@javax.ws.rs.Path("/{giftRegistryId}")
	@javax.ws.rs.GET
	@javax.ws.rs.Produces({"application/json"})
	Response getByGiftRegistryId(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("giftRegistryId") final java.lang.String giftRegistryId);

	@javax.ws.rs.Path("/{giftRegistryId}")
	@javax.ws.rs.PUT
	@javax.ws.rs.Consumes({"application/json"})
	Response putByGiftRegistryId(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("giftRegistryId") final java.lang.String giftRegistryId, @javax.validation.Valid final GiftRegistry giftRegistry);

	@javax.ws.rs.Path("/{giftRegistryId}")
	@javax.ws.rs.DELETE
	Response deleteByGiftRegistryId(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("giftRegistryId") final java.lang.String giftRegistryId);

	@javax.ws.rs.Path("/{giftRegistryId}/gifts")
	@javax.ws.rs.GET
	@javax.ws.rs.Produces({"application/json"})
	Response getByGiftRegistryIdGifts(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("giftRegistryId") final java.lang.String giftRegistryId);

	@javax.ws.rs.Path("/{giftRegistryId}/gifts")
	@javax.ws.rs.POST
	@javax.ws.rs.Consumes({"application/json"})
	Response postByGiftRegistryIdGifts(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("giftRegistryId") final java.lang.String giftRegistryId, @javax.validation.Valid final Gift gift);

	@javax.ws.rs.Path("/{giftRegistryId}/gifts/{giftId}")
	@javax.ws.rs.GET
	@javax.ws.rs.Produces({"application/json"})
	Response getByGiftRegistryIdGiftsByGiftId(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("giftRegistryId") final java.lang.String giftRegistryId, @javax.ws.rs.PathParam("giftId") final java.lang.String giftId);

	@javax.ws.rs.Path("/{giftRegistryId}/gifts/{giftId}")
	@javax.ws.rs.PUT
	@javax.ws.rs.Consumes({"application/json"})
	Response putByGiftRegistryIdGiftsByGiftId(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("giftRegistryId") final java.lang.String giftRegistryId, @javax.ws.rs.PathParam("giftId") final java.lang.String giftId, @javax.validation.Valid final Gift gift);

	@javax.ws.rs.Path("/{giftRegistryId}/gifts/{giftId}")
	@javax.ws.rs.DELETE
	Response deleteByGiftRegistryIdGiftsByGiftId(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("giftRegistryId") final java.lang.String giftRegistryId, @javax.ws.rs.PathParam("giftId") final java.lang.String giftId);

	@javax.ws.rs.Path("/{giftRegistryId}/share/email")
	@javax.ws.rs.POST
	@javax.ws.rs.Consumes({"application/json"})
	Response postByGiftRegistryIdShareEmail(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("giftRegistryId") final java.lang.String giftRegistryId, @javax.validation.Valid final Email email);

}
