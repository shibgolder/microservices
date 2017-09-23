package com.hybris.yaas.giftregistry.document.data;

import java.net.URI;
import java.util.Date;

/**
 * @author leonid.krasnov
 */
public class DocumentMetaData {

   private URI schema;
   private Integer version;
   private Date createdAt;
   private Date modifiedAt;

   public DocumentMetaData() {

   }

   public DocumentMetaData(final URI schema) {
      this.schema = schema;
   }

   public Date getModifiedAt() {
      return modifiedAt;
   }

   public URI getSchema() {
      return schema;
   }

   public Integer getVersion() {
      return version;
   }

   public Date getCreatedAt() {
      return createdAt;
   }
}
