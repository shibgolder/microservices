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
public class Emailaddress
{

	@com.fasterxml.jackson.annotation.JsonProperty(value="address")
	@javax.validation.constraints.Size(max=200)
	@org.hibernate.validator.constraints.Email
	@javax.validation.constraints.NotNull
	private java.lang.String _address;

	@com.fasterxml.jackson.annotation.JsonProperty(value="name")
	@javax.validation.constraints.Pattern(regexp="^[\\p{L}0-9\\s]*$")
	@javax.validation.constraints.Size(min=1,max=100)
	private java.lang.String _name;
	
	public java.lang.String getAddress()
	{
		return _address;
	}
	
	public java.lang.String getName()
	{
		return _name;
	}

	public void setAddress(final java.lang.String _address)
	{
		this._address = _address;
	}

	public void setName(final java.lang.String _name)
	{
		this._name = _name;
	}
}
