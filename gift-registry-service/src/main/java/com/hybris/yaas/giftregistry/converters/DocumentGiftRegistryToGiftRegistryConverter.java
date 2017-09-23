package com.hybris.yaas.giftregistry.converters;

import com.hybris.yaas.giftregistry.document.data.DocumentGiftRegistry;
import com.hybris.yaas.giftregistry.resources.GiftRegistry;
import org.springframework.core.convert.converter.Converter;

import java.util.Map;

/**
 * @author leonid.krasnov
 */
public class DocumentGiftRegistryToGiftRegistryConverter implements Converter<DocumentGiftRegistry, GiftRegistry> {

   @Override
   public GiftRegistry convert(final DocumentGiftRegistry documentGiftRegistry) {
      final GiftRegistry giftRegistry = new GiftRegistry();

      giftRegistry.setOwnerId(documentGiftRegistry.getOwnerId());
      giftRegistry.setTitle(documentGiftRegistry.getTitle());
      giftRegistry.setContributorIds(documentGiftRegistry.getContributorIds());
      giftRegistry.setCreatedAt(documentGiftRegistry.getCreatedAt());
      giftRegistry.setGiftIds(documentGiftRegistry.getGiftIds());
      giftRegistry.setUrl(documentGiftRegistry.getUrl());

      if (documentGiftRegistry.getDescription() instanceof String) {
         giftRegistry.setDescription((String) documentGiftRegistry.getDescription());
      }
      else if (documentGiftRegistry.getDescription() instanceof Map) {
         giftRegistry.setDescription((Map<String, String>) documentGiftRegistry.getDescription());
      }
      giftRegistry.setId(documentGiftRegistry.getId());

      return giftRegistry;
   }

}
