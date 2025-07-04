/*
 * 用户全部 API 文档
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.zashigaofa.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.zashigaofa.client.ApiClient;
/**
 * AccessTokenPostRequest
 */
@JsonPropertyOrder({
  AccessTokenPostRequest.JSON_PROPERTY_TITLE,
  AccessTokenPostRequest.JSON_PROPERTY_TAGS,
  AccessTokenPostRequest.JSON_PROPERTY_USER_I_D,
  AccessTokenPostRequest.JSON_PROPERTY_DESCRIPTION,
  AccessTokenPostRequest.JSON_PROPERTY_PERMISSIONS,
  AccessTokenPostRequest.JSON_PROPERTY_EXPIRE_IN_DAYS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-18T07:36:52.198638406Z[Etc/UTC]", comments = "Generator version: 7.13.0-SNAPSHOT")
public class AccessTokenPostRequest {
  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nonnull
  private String title;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<String> tags = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_I_D = "userID";
  @javax.annotation.Nullable
  private Long userID;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private JsonNullable<String> permissions = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXPIRE_IN_DAYS = "expireInDays";
  @javax.annotation.Nullable
  private Integer expireInDays;

  public AccessTokenPostRequest() { 
  }

  public AccessTokenPostRequest title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }


  public AccessTokenPostRequest tags(@javax.annotation.Nullable String tags) {
    this.tags = JsonNullable.<String>of(tags);
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getTags() {
        return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTags_JsonNullable() {
    return tags;
  }
  
  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<String> tags) {
    this.tags = tags;
  }

  public void setTags(@javax.annotation.Nullable String tags) {
    this.tags = JsonNullable.<String>of(tags);
  }


  public AccessTokenPostRequest userID(@javax.annotation.Nullable Long userID) {
    this.userID = userID;
    return this;
  }

  /**
   * Get userID
   * @return userID
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUserID() {
    return userID;
  }


  @JsonProperty(JSON_PROPERTY_USER_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserID(@javax.annotation.Nullable Long userID) {
    this.userID = userID;
  }


  public AccessTokenPostRequest description(@javax.annotation.Nullable String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public AccessTokenPostRequest permissions(@javax.annotation.Nullable String permissions) {
    this.permissions = JsonNullable.<String>of(permissions);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getPermissions() {
        return permissions.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPermissions_JsonNullable() {
    return permissions;
  }
  
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  public void setPermissions_JsonNullable(JsonNullable<String> permissions) {
    this.permissions = permissions;
  }

  public void setPermissions(@javax.annotation.Nullable String permissions) {
    this.permissions = JsonNullable.<String>of(permissions);
  }


  public AccessTokenPostRequest expireInDays(@javax.annotation.Nullable Integer expireInDays) {
    this.expireInDays = expireInDays;
    return this;
  }

  /**
   * Get expireInDays
   * minimum: -1
   * maximum: 3650
   * @return expireInDays
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRE_IN_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getExpireInDays() {
    return expireInDays;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRE_IN_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpireInDays(@javax.annotation.Nullable Integer expireInDays) {
    this.expireInDays = expireInDays;
  }


  /**
   * Return true if this AccessTokenPostRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessTokenPostRequest accessTokenPostRequest = (AccessTokenPostRequest) o;
    return Objects.equals(this.title, accessTokenPostRequest.title) &&
        equalsNullable(this.tags, accessTokenPostRequest.tags) &&
        Objects.equals(this.userID, accessTokenPostRequest.userID) &&
        equalsNullable(this.description, accessTokenPostRequest.description) &&
        equalsNullable(this.permissions, accessTokenPostRequest.permissions) &&
        Objects.equals(this.expireInDays, accessTokenPostRequest.expireInDays);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, hashCodeNullable(tags), userID, hashCodeNullable(description), hashCodeNullable(permissions), expireInDays);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenPostRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    expireInDays: ").append(toIndentedString(expireInDays)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format("%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(String.format("%stags%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTags()))));
    }

    // add `userID` to the URL query string
    if (getUserID() != null) {
      joiner.add(String.format("%suserID%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUserID()))));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescription()))));
    }

    // add `permissions` to the URL query string
    if (getPermissions() != null) {
      joiner.add(String.format("%spermissions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPermissions()))));
    }

    // add `expireInDays` to the URL query string
    if (getExpireInDays() != null) {
      joiner.add(String.format("%sexpireInDays%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExpireInDays()))));
    }

    return joiner.toString();
  }
}

