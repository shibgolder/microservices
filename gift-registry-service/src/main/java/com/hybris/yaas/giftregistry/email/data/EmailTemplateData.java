package com.hybris.yaas.giftregistry.email.data;

import java.io.InputStream;

/**
 * Created by Shib Golder
 */
public class EmailTemplateData {
	private final String code;
	private final String owner;
	private final String fileType;
	private final InputStream dataStream;

	private EmailTemplateData(final Builder builder) {
		this.dataStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(builder.filePath);
		this.code = builder.code;
		this.owner = builder.owner;
		this.fileType = builder.fileType + "_" + builder.locale;
	}

	public String getCode() {
		return code;
	}

	public String getOwner() {
		return owner;
	}

	public String getFileType() {
		return fileType;
	}

	public InputStream getDataStream() {
		return dataStream;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private String filePath;
		private String code;
		private String owner;
		private String fileType;
		private String locale;

		public Builder setFilePath(final String filePath) {
			this.filePath = filePath;
			return this;
		}

		public Builder setCode(final String code) {
			this.code = code;
			return this;
		}

		public Builder setOwner(final String owner) {
			this.owner = owner;
			return this;
		}

		public Builder setFileType(final String fileType) {
			this.fileType = fileType;
			return this;
		}

		public Builder setLocale(final String locale) {
			this.locale = locale;
			return this;
		}

		public EmailTemplateData build() {
			return new EmailTemplateData(this);
		}

	}
}
