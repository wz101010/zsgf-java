/*
 * 全部  API 文档
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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.zashigaofa.client.ApiClient;
/**
 * DirectoryItem
 */
@JsonPropertyOrder({
  DirectoryItem.JSON_PROPERTY_NAME,
  DirectoryItem.JSON_PROPERTY_CREATE_DATE,
  DirectoryItem.JSON_PROPERTY_LAST_UPDATE,
  DirectoryItem.JSON_PROPERTY_FILE_SIZE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-31T07:56:41.646456145Z[Etc/UTC]", comments = "Generator version: 7.13.0-SNAPSHOT")
public class DirectoryItem {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
  @javax.annotation.Nullable
  private OffsetDateTime createDate;

  public static final String JSON_PROPERTY_LAST_UPDATE = "lastUpdate";
  @javax.annotation.Nullable
  private OffsetDateTime lastUpdate;

  public static final String JSON_PROPERTY_FILE_SIZE = "fileSize";
  private JsonNullable<Long> fileSize = JsonNullable.<Long>undefined();

  public DirectoryItem() { 
  }

  public DirectoryItem name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public DirectoryItem createDate(@javax.annotation.Nullable OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreateDate() {
    return createDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateDate(@javax.annotation.Nullable OffsetDateTime createDate) {
    this.createDate = createDate;
  }


  public DirectoryItem lastUpdate(@javax.annotation.Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Get lastUpdate
   * @return lastUpdate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdate(@javax.annotation.Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  public DirectoryItem fileSize(@javax.annotation.Nullable Long fileSize) {
    this.fileSize = JsonNullable.<Long>of(fileSize);
    return this;
  }

  /**
   * Get fileSize
   * @return fileSize
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Long getFileSize() {
        return fileSize.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getFileSize_JsonNullable() {
    return fileSize;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  public void setFileSize_JsonNullable(JsonNullable<Long> fileSize) {
    this.fileSize = fileSize;
  }

  public void setFileSize(@javax.annotation.Nullable Long fileSize) {
    this.fileSize = JsonNullable.<Long>of(fileSize);
  }


  /**
   * Return true if this DirectoryItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectoryItem directoryItem = (DirectoryItem) o;
    return equalsNullable(this.name, directoryItem.name) &&
        Objects.equals(this.createDate, directoryItem.createDate) &&
        Objects.equals(this.lastUpdate, directoryItem.lastUpdate) &&
        equalsNullable(this.fileSize, directoryItem.fileSize);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), createDate, lastUpdate, hashCodeNullable(fileSize));
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
    sb.append("class DirectoryItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `createDate` to the URL query string
    if (getCreateDate() != null) {
      joiner.add(String.format("%screateDate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCreateDate()))));
    }

    // add `lastUpdate` to the URL query string
    if (getLastUpdate() != null) {
      joiner.add(String.format("%slastUpdate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastUpdate()))));
    }

    // add `fileSize` to the URL query string
    if (getFileSize() != null) {
      joiner.add(String.format("%sfileSize%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFileSize()))));
    }

    return joiner.toString();
  }
}

