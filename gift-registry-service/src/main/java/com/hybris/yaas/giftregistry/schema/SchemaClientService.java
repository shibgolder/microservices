package com.hybris.yaas.giftregistry.schema;

import com.hybris.yaas.giftregistry.client.schema.SchemaClient;
import com.sap.cloud.yaas.servicesdk.authorization.AccessToken;
import com.sap.cloud.yaas.servicesdk.authorization.AuthorizationScope;
import com.sap.cloud.yaas.servicesdk.authorization.integration.AuthorizedExecutionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author leonid.krasnov
 */
@Service
public class SchemaClientService {
   private static final Logger LOG = LoggerFactory.getLogger(SchemaClientService.class);

   private final static String SCHEMA_FOLDER_PATH = "schemas/";
   private final static String SCOPE_SCHEMA_MANAGE = "hybris.schema_manage";

   @Value("${SCHEMA_GIFT_REGISTRY}")
   private String giftRegistrySchemaJson;
   @Value("${SCHEMA_GIFT}")
   private String giftSchemaJson;
   @Value("${DEV_TEAM}")
   private String tenant;

   private URI giftRegistrySchemaURI;
   private URI giftSchemaURI;

   @Autowired
   private SchemaClient schemaClient;
   @Autowired
   private AuthorizedExecutionTemplate authorizedExecutionTemplate;

   @PostConstruct
   public void prepareSchemas() {
      authorizedExecutionTemplate.executeAuthorized(
            new AuthorizationScope(tenant, Arrays.asList(SCOPE_SCHEMA_MANAGE)),
            null,
            accessToken -> {
               if(getSchema(giftRegistrySchemaJson, accessToken).getStatus() != Response.Status.OK.getStatusCode()) {
                  final byte[] giftRegistrySchema = readSchemaFromFile(giftRegistrySchemaJson);
                  createSchema(giftRegistrySchema, giftRegistrySchemaJson, accessToken);
               }

               if(getSchema(giftSchemaJson, accessToken).getStatus() != Response.Status.OK.getStatusCode()) {
                  final byte[] giftSchema = readSchemaFromFile(giftSchemaJson);
                  createSchema(giftSchema, giftSchemaJson, accessToken);
               }

               return null;
            }
      );

      final UriBuilder builder = UriBuilder.fromPath(SchemaClient.DEFAULT_BASE_URI).path("{tenant}").path("{schema}");
      giftRegistrySchemaURI = builder.build(tenant, giftRegistrySchemaJson);
      giftSchemaURI = builder.build(tenant, giftSchemaJson);
   }

   public void createSchema(final byte[] schemaJson, final String schemaName, final AccessToken accessToken) {
      final Response response = schemaClient
            .tenantSchema()
            .fillTenant(tenant)
            .fillSchema(schemaName)
            .preparePost()
            .withPayload(Entity.entity(schemaJson, MediaType.APPLICATION_JSON_TYPE))
            .withAuthorization(accessToken.toAuthorizationHeaderValue())
            .execute();

      if (response.getStatus() != Response.Status.CREATED.getStatusCode()) {
         LOG.error("Error creating schema", response);
      }
   }

   public Response getSchema(final String schemaName, final AccessToken accessToken) {
      final Response response = schemaClient
            .tenantSchema()
            .fillTenant(tenant)
            .fillSchema(schemaName)
            .prepareGet()
            .withAuthorization(accessToken.toAuthorizationHeaderValue())
            .execute();

      return response;
   }

   public URI getGiftRegistrySchemaURI() {
      return giftRegistrySchemaURI;
   }

   public URI getGiftSchemaURI() {
      return giftSchemaURI;
   }

   private byte[] readSchemaFromFile(final String schemaFileName) {
      try {
         final URL url = getClass().getClassLoader().getResource(SCHEMA_FOLDER_PATH + schemaFileName);
         final Path path = Paths.get(url.toURI());

         return Files.readAllBytes(path);
      } catch (IOException | URISyntaxException e) {
         LOG.error("Error reading schema file " + schemaFileName, e);
      }

      return null;
   }
}
