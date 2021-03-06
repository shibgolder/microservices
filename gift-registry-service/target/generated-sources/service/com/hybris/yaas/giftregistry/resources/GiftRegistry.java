package com.hybris.yaas.giftregistry.resources;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import javax.xml.bind.annotation.XmlRootElement;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


import com.hybris.yaas.giftregistry.resources.util.OneOfDeserializerUtility;
/**
 * Generated dto.
 */
@javax.annotation.Generated(value = "hybris", date = "Thu May 26 16:18:39 CDT 2016")
@XmlRootElement
@JsonAutoDetect(isGetterVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE,
		creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE)
public class GiftRegistry
{

	@com.fasterxml.jackson.annotation.JsonProperty(value="id")
	private java.lang.String _id;

	@com.fasterxml.jackson.annotation.JsonProperty(value="url")
	private java.net.URI _url;

	@com.fasterxml.jackson.annotation.JsonProperty(value="ownerId")
	@javax.validation.constraints.Pattern(regexp="^.+")
	@javax.validation.constraints.NotNull
	private java.lang.String _ownerId;

	@com.fasterxml.jackson.annotation.JsonProperty(value="title")
	@javax.validation.constraints.Pattern(regexp="^.+")
	@javax.validation.constraints.NotNull
	private java.lang.String _title;

	@com.fasterxml.jackson.annotation.JsonProperty(value="createdAt")
	private java.util.Date _createdAt;

	@com.fasterxml.jackson.annotation.JsonProperty(value="giftIds")
	@javax.validation.Valid
	private java.util.List<java.lang.String> _giftIds;

	@com.fasterxml.jackson.annotation.JsonProperty(value="contributorIds")
	@javax.validation.Valid
	private java.util.List<java.lang.String> _contributorIds;

	@JsonDeserialize(using=DescriptionOneOfDeserializer.class)
	@com.fasterxml.jackson.annotation.JsonProperty(value="description")
	@javax.validation.Valid
	private Object _description;
	
	public java.lang.String getId()
	{
		return _id;
	}
	
	public java.net.URI getUrl()
	{
		return _url;
	}
	
	public java.lang.String getOwnerId()
	{
		return _ownerId;
	}
	
	public java.lang.String getTitle()
	{
		return _title;
	}
	
	public java.util.Date getCreatedAt()
	{
		return _createdAt;
	}
	
	public java.util.List<java.lang.String> getGiftIds()
	{
		return _giftIds;
	}
	
	public java.util.List<java.lang.String> getContributorIds()
	{
		return _contributorIds;
	}

	/**
	 * Gets the value of the oneOf property {@code description} as type {@code T},
	 * which is usually inferred from context.
	 * <p>
	 * It is recommended to call {@link #isDescriptionTypeOf(Class)} beforehand,
	 * to make sure that the oneOf property is currently of type {@code T}.
	 * 
	 * @param <T> Type expected for oneOf property {@code description}.
	 * @return The value of {@code description} as type {@code T}. May be {@code null}.
	 * @throws ClassCastException If the reference value of {@code description} is not of type {@code T}.
	 */
	@SuppressWarnings("unchecked")
	public <T> T getDescription() throws ClassCastException
	{
		return (T)_description;
	}

	public void setId(final java.lang.String _id)
	{
		this._id = _id;
	}

	public void setUrl(final java.net.URI _url)
	{
		this._url = _url;
	}

	public void setOwnerId(final java.lang.String _ownerId)
	{
		this._ownerId = _ownerId;
	}

	public void setTitle(final java.lang.String _title)
	{
		this._title = _title;
	}

	public void setCreatedAt(final java.util.Date _createdAt)
	{
		this._createdAt = _createdAt;
	}

	public void setGiftIds(final java.util.List<java.lang.String> _giftIds)
	{
		this._giftIds = _giftIds;
	}

	public void setContributorIds(final java.util.List<java.lang.String> _contributorIds)
	{
		this._contributorIds = _contributorIds;
	}

	/**
	 * Sets the oneOf property {@code description} to a value of
	 * type java.lang.String.
	 * <p>
	 * It is intentionally marked as {@link JsonIgnore} to avoid an ambiguity during deserialization.
	 *
	 * @param _description The value to set.
	 */
	@com.fasterxml.jackson.annotation.JsonIgnore
	public void setDescription(final java.lang.String _description)
	{
		this._description = _description;
	}

	/**
	 * Sets the oneOf property {@code description} to a value of
	 * type java.util.Map<java.lang.String, java.lang.String>.
	 * <p>
	 * It is intentionally marked as {@link JsonIgnore} to avoid an ambiguity during deserialization.
	 *
	 * @param _description The value to set.
	 */
	@com.fasterxml.jackson.annotation.JsonIgnore
	public void setDescription(final java.util.Map<java.lang.String, java.lang.String> _description)
	{
		this._description = _description;
	}

	/**
	 * Checks whether the oneOf property {@code description} has a non-{@code null} value.
	 * <p>
	 * Hint:<br>
	 * Use it to check if {@code description} is null, which cannot be
	 * easily achieved with {@link #isDescriptionTypeOf(Class)}.
	 * <p/>
	 * Returns the same result as:<br>
	 * <code>
	 * getDescription() != null;
	 * </code>
	 *
	 * @return {@code false}, if {@code description} is {@code null}, otherwise {@code true}.
	 */
	public boolean hasDescription()
	{
		return _description != null;
	}

	/**
	 * Checks whether the oneOf property {@code description} is assignable to the given type.
	 * <p>
	 * This method is consistent with the {@code instanceof} operator. In particular, it will always return {@code false},
	 * if {@code description} is {@code null}.
	 *
	 * @param clazz A type-token denoting the type to check against.
	 * @return {@code true}, if {@code description} is assignable to {@code clazz}, otherwise {@code false}.
	 * @throws java.lang.IllegalArgumentException If the given {@code clazz} is {@code null}.
	 */
	public boolean isDescriptionTypeOf(final Class<?> clazz) throws IllegalArgumentException
	{
		if (clazz == null) 
		{
			throw new IllegalArgumentException("Given class may not be null.");
		}
		if (_description == null)
		{
			return false;
		}
		return clazz.isAssignableFrom(_description.getClass());
	}

	private static final class DescriptionOneOfDeserializer extends JsonDeserializer<Object>
	{
		private static final Class<?>[] SUPPORTED_TYPES = {java.lang.String.class,java.util.Map.class};

		@Override
		public Object deserialize(final JsonParser jsonParser, final DeserializationContext ctx) throws IOException
		{
			return OneOfDeserializerUtility.deserialize(jsonParser, SUPPORTED_TYPES);
		}
	}
}
