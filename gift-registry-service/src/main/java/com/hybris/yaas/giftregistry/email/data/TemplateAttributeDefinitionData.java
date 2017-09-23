package com.hybris.yaas.giftregistry.email.data;

/**
 * Represents email template attribute definition. Email template attribute is a
 * placeholder that is filled with some concrete value when sending email.
 *
 * @see TemplateAttributeValueData
 * @author Shib Golder
 */
public class TemplateAttributeDefinitionData {
	private String key;
	private Boolean mandatory;

	public TemplateAttributeDefinitionData() {
		// default
	}

	public TemplateAttributeDefinitionData(final String key, final boolean mandatory) {
		this.key = key;
		this.mandatory = mandatory;
	}

	public String getKey() {
		return key;
	}

	public void setKey(final String key) {
		this.key = key;
	}

	public Boolean getMandatory() {
		return mandatory;
	}

	public void setMandatory(final Boolean mandatory) {
		this.mandatory = mandatory;
	}
}
