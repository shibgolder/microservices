package com.hybris.yaas.giftregistry.email.data;

import java.util.List;

/**
 * @author  Shib Golder
 */
public class EmailData {
	private String toAddress;
	private String toName;
	private List<EmailAddressData> to;
	private List<EmailAddressData> cc;
	private List<EmailAddressData> bcc;
	private String fromAddress;
	private String templateCode;
	
	
	
	/**
	 * @return the cc
	 */
	public List<EmailAddressData> getCc() {
		return cc;
	}

	/**
	 * @param cc the cc to set
	 */
	public void setCc(List<EmailAddressData> cc) {
		this.cc = cc;
	}

	/**
	 * @return the bcc
	 */
	public List<EmailAddressData> getBcc() {
		return bcc;
	}

	/**
	 * @param bcc the bcc to set
	 */
	public void setBcc(List<EmailAddressData> bcc) {
		this.bcc = bcc;
	}

	/**
	 * @return the to
	 */
	public List<EmailAddressData> getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(List<EmailAddressData> to) {
		this.to = to;
	}

	private String templateOwner;
	private String locale;
	private List<TemplateAttributeValueData> attributes;

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(final String toAddress) {
		this.toAddress = toAddress;
	}

	public String getToName() {
		return toName;
	}

	public void setToName(final String toName) {
		this.toName = toName;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(final String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getTemplateCode() {
		return templateCode;
	}

	public void setTemplateCode(final String templateCode) {
		this.templateCode = templateCode;
	}

	public String getTemplateOwner() {
		return templateOwner;
	}

	public void setTemplateOwner(final String templateOwner) {
		this.templateOwner = templateOwner;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(final String locale) {
		this.locale = locale;
	}

	public List<TemplateAttributeValueData> getAttributes() {
		return attributes;
	}

	public void setAttributes(final List<TemplateAttributeValueData> attributeValues) {
		this.attributes = attributeValues;
	}
}
