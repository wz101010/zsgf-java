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
 * 服务商实体，用于表示和管理系统中的服务提供方信息。
 */
@JsonPropertyOrder({
  ServiceProvider.JSON_PROPERTY_ID,
  ServiceProvider.JSON_PROPERTY_BIZ_CODE,
  ServiceProvider.JSON_PROPERTY_NAME,
  ServiceProvider.JSON_PROPERTY_CODE,
  ServiceProvider.JSON_PROPERTY_ICON,
  ServiceProvider.JSON_PROPERTY_DESCRIPTION,
  ServiceProvider.JSON_PROPERTY_TAGS,
  ServiceProvider.JSON_PROPERTY_SHOW,
  ServiceProvider.JSON_PROPERTY_SHOW_INDEX,
  ServiceProvider.JSON_PROPERTY_CREATE_DATE,
  ServiceProvider.JSON_PROPERTY_LAST_UPDATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-15T06:11:08.446207689Z[Etc/UTC]", comments = "Generator version: 7.13.0-SNAPSHOT")
public class ServiceProvider {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_BIZ_CODE = "bizCode";
  private JsonNullable<String> bizCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CODE = "code";
  private JsonNullable<String> code = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ICON = "icon";
  private JsonNullable<String> icon = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<String> tags = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SHOW = "show";
  @javax.annotation.Nullable
  private Boolean show;

  public static final String JSON_PROPERTY_SHOW_INDEX = "showIndex";
  @javax.annotation.Nullable
  private Integer showIndex;

  public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
  @javax.annotation.Nullable
  private OffsetDateTime createDate;

  public static final String JSON_PROPERTY_LAST_UPDATE = "lastUpdate";
  @javax.annotation.Nullable
  private OffsetDateTime lastUpdate;

  public ServiceProvider() { 
  }

  public ServiceProvider id(@javax.annotation.Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * 服务商的唯一标识符。
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Long id) {
    this.id = id;
  }


  public ServiceProvider bizCode(@javax.annotation.Nullable String bizCode) {
    this.bizCode = JsonNullable.<String>of(bizCode);
    return this;
  }

  /**
   * 服务商的业务代码，用于标识其所属业务领域。
   * @return bizCode
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getBizCode() {
        return bizCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BIZ_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBizCode_JsonNullable() {
    return bizCode;
  }
  
  @JsonProperty(JSON_PROPERTY_BIZ_CODE)
  public void setBizCode_JsonNullable(JsonNullable<String> bizCode) {
    this.bizCode = bizCode;
  }

  public void setBizCode(@javax.annotation.Nullable String bizCode) {
    this.bizCode = JsonNullable.<String>of(bizCode);
  }


  public ServiceProvider name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

  /**
   * 服务商的名称。
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


  public ServiceProvider code(@javax.annotation.Nullable String code) {
    this.code = JsonNullable.<String>of(code);
    return this;
  }

  /**
   * 服务商的唯一代码，用于系统内部标识。
   * @return code
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getCode() {
        return code.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCode_JsonNullable() {
    return code;
  }
  
  @JsonProperty(JSON_PROPERTY_CODE)
  public void setCode_JsonNullable(JsonNullable<String> code) {
    this.code = code;
  }

  public void setCode(@javax.annotation.Nullable String code) {
    this.code = JsonNullable.<String>of(code);
  }


  public ServiceProvider icon(@javax.annotation.Nullable String icon) {
    this.icon = JsonNullable.<String>of(icon);
    return this;
  }

  /**
   * 服务商图标的URL或路径。
   * @return icon
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getIcon() {
        return icon.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIcon_JsonNullable() {
    return icon;
  }
  
  @JsonProperty(JSON_PROPERTY_ICON)
  public void setIcon_JsonNullable(JsonNullable<String> icon) {
    this.icon = icon;
  }

  public void setIcon(@javax.annotation.Nullable String icon) {
    this.icon = JsonNullable.<String>of(icon);
  }


  public ServiceProvider description(@javax.annotation.Nullable String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * 服务商的详细描述信息。
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


  public ServiceProvider tags(@javax.annotation.Nullable String tags) {
    this.tags = JsonNullable.<String>of(tags);
    return this;
  }

  /**
   * 用于分类或标记服务商的标签。
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


  public ServiceProvider show(@javax.annotation.Nullable Boolean show) {
    this.show = show;
    return this;
  }

  /**
   * 指示服务商是否在界面上显示。
   * @return show
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShow() {
    return show;
  }


  @JsonProperty(JSON_PROPERTY_SHOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShow(@javax.annotation.Nullable Boolean show) {
    this.show = show;
  }


  public ServiceProvider showIndex(@javax.annotation.Nullable Integer showIndex) {
    this.showIndex = showIndex;
    return this;
  }

  /**
   * 服务商在界面上的显示顺序。
   * @return showIndex
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getShowIndex() {
    return showIndex;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowIndex(@javax.annotation.Nullable Integer showIndex) {
    this.showIndex = showIndex;
  }


  public ServiceProvider createDate(@javax.annotation.Nullable OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * 服务商记录的创建日期，默认为当前时间。
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


  public ServiceProvider lastUpdate(@javax.annotation.Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * 服务商记录的最后更新日期，默认为当前时间。
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


  /**
   * Return true if this ServiceProvider object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceProvider serviceProvider = (ServiceProvider) o;
    return Objects.equals(this.id, serviceProvider.id) &&
        equalsNullable(this.bizCode, serviceProvider.bizCode) &&
        equalsNullable(this.name, serviceProvider.name) &&
        equalsNullable(this.code, serviceProvider.code) &&
        equalsNullable(this.icon, serviceProvider.icon) &&
        equalsNullable(this.description, serviceProvider.description) &&
        equalsNullable(this.tags, serviceProvider.tags) &&
        Objects.equals(this.show, serviceProvider.show) &&
        Objects.equals(this.showIndex, serviceProvider.showIndex) &&
        Objects.equals(this.createDate, serviceProvider.createDate) &&
        Objects.equals(this.lastUpdate, serviceProvider.lastUpdate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(bizCode), hashCodeNullable(name), hashCodeNullable(code), hashCodeNullable(icon), hashCodeNullable(description), hashCodeNullable(tags), show, showIndex, createDate, lastUpdate);
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
    sb.append("class ServiceProvider {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bizCode: ").append(toIndentedString(bizCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
    sb.append("    showIndex: ").append(toIndentedString(showIndex)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getId()))));
    }

    // add `bizCode` to the URL query string
    if (getBizCode() != null) {
      joiner.add(String.format("%sbizCode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBizCode()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `code` to the URL query string
    if (getCode() != null) {
      joiner.add(String.format("%scode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCode()))));
    }

    // add `icon` to the URL query string
    if (getIcon() != null) {
      joiner.add(String.format("%sicon%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIcon()))));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescription()))));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(String.format("%stags%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTags()))));
    }

    // add `show` to the URL query string
    if (getShow() != null) {
      joiner.add(String.format("%sshow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShow()))));
    }

    // add `showIndex` to the URL query string
    if (getShowIndex() != null) {
      joiner.add(String.format("%sshowIndex%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowIndex()))));
    }

    // add `createDate` to the URL query string
    if (getCreateDate() != null) {
      joiner.add(String.format("%screateDate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCreateDate()))));
    }

    // add `lastUpdate` to the URL query string
    if (getLastUpdate() != null) {
      joiner.add(String.format("%slastUpdate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastUpdate()))));
    }

    return joiner.toString();
  }
}

