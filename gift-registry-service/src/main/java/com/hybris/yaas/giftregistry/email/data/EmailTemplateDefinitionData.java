package com.hybris.yaas.giftregistry.email.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Shib Golder
 */
public class EmailTemplateDefinitionData {
	private String code;
	private String owner;
	private String name;
	private String description;

	@JsonProperty("definableAttributes")
	private List<TemplateAttributeDefinitionData> templateAttributeDefinitionDatas;

	public String getCode() {
		return code;
	}

	public void setCode(final String code) {
		this.code = code;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(final String owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public List<TemplateAttributeDefinitionData> getTemplateAttributeDefinitions() {
		return templateAttributeDefinitionDatas;
	}

	public void setTemplateAttributeDefinitions(
			final List<TemplateAttributeDefinitionData> templateAttributeDefinitionDatas) {
		this.templateAttributeDefinitionDatas = templateAttributeDefinitionDatas;
	}
}
