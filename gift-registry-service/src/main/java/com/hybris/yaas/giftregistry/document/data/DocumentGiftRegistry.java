package com.hybris.yaas.giftregistry.document.data;

import java.net.URI;
import java.util.Date;
import java.util.List;

/**
 * @author leonid.krasnov
 */
public class DocumentGiftRegistry {

   private String id;
   private URI url;
   private String ownerId;
   private String title;
   private Date createdAt;
   private List<String> giftIds;
   private List<String> contributorIds;
   private Object description;
   private DocumentMetaData metadata;

   public String getId() {
      return id;
   }

   public void setId(final String id) {
      this.id = id;
   }

   public URI getUrl() {
      return url;
   }

   public void setUrl(final URI url) {
      this.url = url;
   }

   public String getOwnerId() {
      return ownerId;
   }

   public void setOwnerId(final String ownerId) {
      this.ownerId = ownerId;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(final String title) {
      this.title = title;
   }

   public Date getCreatedAt() {
      return createdAt;
   }

   public void setCreatedAt(final Date createdAt) {
      this.createdAt = createdAt;
   }

   public List<String> getGiftIds() {
      return giftIds;
   }

   public void setGiftIds(final List<String> giftIds) {
      this.giftIds = giftIds;
   }

   public List<String> getContributorIds() {
      return contributorIds;
   }

   public void setContributorIds(final List<String> contributorIds) {
      this.contributorIds = contributorIds;
   }

   public Object getDescription() {
      return description;
   }

   public void setDescription(final Object description) {
      this.description = description;
   }

   public DocumentMetaData getMetadata() {
      return metadata;
   }

   public void setMetaData(DocumentMetaData metadata) {
      this.metadata = metadata;
   }
}
