package com.hybris.yaas.giftregistry.resources;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto.
 */
@javax.annotation.Generated(value = "hybris", date = "Thu May 26 16:18:39 CDT 2016")
@XmlRootElement
@JsonAutoDetect(isGetterVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE,
		creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE)
public class Email
{

	@com.fasterxml.jackson.annotation.JsonProperty(value="toAddress")
	@javax.validation.constraints.Size(max=200)
	@org.hibernate.validator.constraints.Email
	private java.lang.String _toAddress;

	@com.fasterxml.jackson.annotation.JsonProperty(value="toName")
	@javax.validation.constraints.Pattern(regexp="^[\\p{L}0-9\\s]*$")
	@javax.validation.constraints.Size(min=1,max=100)
	private java.lang.String _toName;

	@com.fasterxml.jackson.annotation.JsonProperty(value="to")
	@javax.validation.Valid
	private java.util.List<com.hybris.yaas.giftregistry.resources.Emailaddress> _to;
	
	public java.lang.String getToAddress()
	{
		return _toAddress;
	}
	
	public java.lang.String getToName()
	{
		return _toName;
	}
	
	public java.util.List<com.hybris.yaas.giftregistry.resources.Emailaddress> getTo()
	{
		return _to;
	}

	public void setToAddress(final java.lang.String _toAddress)
	{
		this._toAddress = _toAddress;
	}

	public void setToName(final java.lang.String _toName)
	{
		this._toName = _toName;
	}

	public void setTo(final java.util.List<com.hybris.yaas.giftregistry.resources.Emailaddress> _to)
	{
		this._to = _to;
	}
}
