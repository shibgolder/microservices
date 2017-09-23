package com.hybris.yaas.giftregistry.converters;

import com.hybris.yaas.giftregistry.document.data.DocumentGiftRegistry;
import com.hybris.yaas.giftregistry.document.data.DocumentMetaData;
import com.hybris.yaas.giftregistry.resources.GiftRegistry;
import com.hybris.yaas.giftregistry.schema.SchemaClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;

/**
 * @author leonid.krasnov
 */
public class GiftRegistryToDocumentGiftRegistryConverter implements Converter<GiftRegistry, DocumentGiftRegistry> {

   @Autowired
   private SchemaClientService schemaClientService;

   @Override
   public DocumentGiftRegistry convert(final GiftRegistry giftRegistry) {
      final DocumentGiftRegistry documentGiftRegistry = new DocumentGiftRegistry();

      documentGiftRegistry.setTitle(giftRegistry.getTitle());
      documentGiftRegistry.setId(giftRegistry.getId());
      documentGiftRegistry.setUrl(giftRegistry.getUrl());
      documentGiftRegistry.setOwnerId(giftRegistry.getOwnerId());
      documentGiftRegistry.setCreatedAt(giftRegistry.getCreatedAt());
      documentGiftRegistry.setDescription(giftRegistry.getDescription());
      documentGiftRegistry.setGiftIds(giftRegistry.getGiftIds() == null ? new ArrayList<>() : giftRegistry.getGiftIds());
      documentGiftRegistry.setContributorIds(
            giftRegistry.getContributorIds() == null ? new ArrayList<>() : giftRegistry.getContributorIds());

      documentGiftRegistry.setMetaData(new DocumentMetaData(schemaClientService.getGiftRegistrySchemaURI()));

      return documentGiftRegistry;
   }

}
