package com.hybris.yaas.giftregistry.resources;

/**
 * Generated parameter dto.
 */
@javax.annotation.Generated(value = "hybris", date = "Thu May 26 16:18:39 CDT 2016")
public class YaasAwareParameters
{
	@javax.validation.constraints.Pattern(regexp="^[a-z][a-z0-9]+$")
	@javax.validation.constraints.Size(min=3,max=16)
	@javax.ws.rs.HeaderParam("hybris-tenant")
	private java.lang.String hybrisTenant;

	@javax.validation.constraints.Pattern(regexp="^[a-z][a-z0-9-]{1,14}[a-z0-9][.][a-z][a-z0-9-]{0,22}[a-z0-9]$")
	@javax.validation.constraints.Size(min=6,max=41)
	@javax.ws.rs.HeaderParam("hybris-client")
	private java.lang.String hybrisClient;

	@javax.ws.rs.HeaderParam("hybris-user")
	private java.lang.String hybrisUser;

	@javax.validation.constraints.Pattern(regexp="^([a-zA-Z0-9._=-]{1,128}( [a-zA-Z0-9._=-]{1,128})*)?$")
	@javax.ws.rs.HeaderParam("hybris-scopes")
	private java.lang.String hybrisScopes;

	@javax.ws.rs.HeaderParam("hybris-request-id")
	private java.lang.String hybrisRequestId;

	@javax.validation.constraints.DecimalMin(value="1")
	@javax.ws.rs.DefaultValue("1")	@javax.ws.rs.HeaderParam("hybris-hop")
	private java.lang.Integer hybrisHop;

	public java.lang.String getHybrisTenant()
	{
		return hybrisTenant;
	}

	public java.lang.String getHybrisClient()
	{
		return hybrisClient;
	}

	public java.lang.String getHybrisUser()
	{
		return hybrisUser;
	}

	public java.lang.String getHybrisScopes()
	{
		return hybrisScopes;
	}

	public java.lang.String getHybrisRequestId()
	{
		return hybrisRequestId;
	}

	public java.lang.Integer getHybrisHop()
	{
		return hybrisHop;
	}

	public void setHybrisTenant(final java.lang.String hybrisTenant)
	{
		this.hybrisTenant = hybrisTenant;
	}

	public void setHybrisClient(final java.lang.String hybrisClient)
	{
		this.hybrisClient = hybrisClient;
	}

	public void setHybrisUser(final java.lang.String hybrisUser)
	{
		this.hybrisUser = hybrisUser;
	}

	public void setHybrisScopes(final java.lang.String hybrisScopes)
	{
		this.hybrisScopes = hybrisScopes;
	}

	public void setHybrisRequestId(final java.lang.String hybrisRequestId)
	{
		this.hybrisRequestId = hybrisRequestId;
	}

	public void setHybrisHop(final java.lang.Integer hybrisHop)
	{
		this.hybrisHop = hybrisHop;
	}

}
