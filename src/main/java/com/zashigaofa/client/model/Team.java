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
 * 团队
 */
@JsonPropertyOrder({
  Team.JSON_PROPERTY_ID,
  Team.JSON_PROPERTY_USER_I_D,
  Team.JSON_PROPERTY_CHANNEL_CODE,
  Team.JSON_PROPERTY_CHANNEL_APP_I_D,
  Team.JSON_PROPERTY_ROLE,
  Team.JSON_PROPERTY_PERMISSION,
  Team.JSON_PROPERTY_SHOW,
  Team.JSON_PROPERTY_SHOW_INDEX,
  Team.JSON_PROPERTY_CREATE_DATE,
  Team.JSON_PROPERTY_LAST_UPDATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-31T07:56:41.646456145Z[Etc/UTC]", comments = "Generator version: 7.13.0-SNAPSHOT")
public class Team {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_USER_I_D = "userID";
  @javax.annotation.Nullable
  private Long userID;

  public static final String JSON_PROPERTY_CHANNEL_CODE = "channelCode";
  private JsonNullable<String> channelCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CHANNEL_APP_I_D = "channelAppID";
  private JsonNullable<String> channelAppID = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ROLE = "role";
  private JsonNullable<String> role = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERMISSION = "permission";
  private JsonNullable<String> permission = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SHOW = "show";
  @javax.annotation.Nullable
  private Boolean show;

  public static final String JSON_PROPERTY_SHOW_INDEX = "showIndex";
  @javax.annotation.Nullable
  private Long showIndex;

  public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
  @javax.annotation.Nullable
  private OffsetDateTime createDate;

  public static final String JSON_PROPERTY_LAST_UPDATE = "lastUpdate";
  @javax.annotation.Nullable
  private OffsetDateTime lastUpdate;

  public Team() { 
  }

  public Team id(@javax.annotation.Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * ID
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


  public Team userID(@javax.annotation.Nullable Long userID) {
    this.userID = userID;
    return this;
  }

  /**
   * 用户ID
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


  public Team channelCode(@javax.annotation.Nullable String channelCode) {
    this.channelCode = JsonNullable.<String>of(channelCode);
    return this;
  }

  /**
   * 渠道代码
   * @return channelCode
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getChannelCode() {
        return channelCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHANNEL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getChannelCode_JsonNullable() {
    return channelCode;
  }
  
  @JsonProperty(JSON_PROPERTY_CHANNEL_CODE)
  public void setChannelCode_JsonNullable(JsonNullable<String> channelCode) {
    this.channelCode = channelCode;
  }

  public void setChannelCode(@javax.annotation.Nullable String channelCode) {
    this.channelCode = JsonNullable.<String>of(channelCode);
  }


  public Team channelAppID(@javax.annotation.Nullable String channelAppID) {
    this.channelAppID = JsonNullable.<String>of(channelAppID);
    return this;
  }

  /**
   * 渠道应用ID
   * @return channelAppID
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getChannelAppID() {
        return channelAppID.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHANNEL_APP_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getChannelAppID_JsonNullable() {
    return channelAppID;
  }
  
  @JsonProperty(JSON_PROPERTY_CHANNEL_APP_I_D)
  public void setChannelAppID_JsonNullable(JsonNullable<String> channelAppID) {
    this.channelAppID = channelAppID;
  }

  public void setChannelAppID(@javax.annotation.Nullable String channelAppID) {
    this.channelAppID = JsonNullable.<String>of(channelAppID);
  }


  public Team role(@javax.annotation.Nullable String role) {
    this.role = JsonNullable.<String>of(role);
    return this;
  }

  /**
   * 角色
   * @return role
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getRole() {
        return role.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRole_JsonNullable() {
    return role;
  }
  
  @JsonProperty(JSON_PROPERTY_ROLE)
  public void setRole_JsonNullable(JsonNullable<String> role) {
    this.role = role;
  }

  public void setRole(@javax.annotation.Nullable String role) {
    this.role = JsonNullable.<String>of(role);
  }


  public Team permission(@javax.annotation.Nullable String permission) {
    this.permission = JsonNullable.<String>of(permission);
    return this;
  }

  /**
   * 权限
   * @return permission
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getPermission() {
        return permission.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPermission_JsonNullable() {
    return permission;
  }
  
  @JsonProperty(JSON_PROPERTY_PERMISSION)
  public void setPermission_JsonNullable(JsonNullable<String> permission) {
    this.permission = permission;
  }

  public void setPermission(@javax.annotation.Nullable String permission) {
    this.permission = JsonNullable.<String>of(permission);
  }


  public Team show(@javax.annotation.Nullable Boolean show) {
    this.show = show;
    return this;
  }

  /**
   * 是否显示
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


  public Team showIndex(@javax.annotation.Nullable Long showIndex) {
    this.showIndex = showIndex;
    return this;
  }

  /**
   * 显示顺序
   * @return showIndex
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getShowIndex() {
    return showIndex;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowIndex(@javax.annotation.Nullable Long showIndex) {
    this.showIndex = showIndex;
  }


  public Team createDate(@javax.annotation.Nullable OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * 创建日期
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


  public Team lastUpdate(@javax.annotation.Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * 最后更新日期
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
   * Return true if this Team object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Team team = (Team) o;
    return Objects.equals(this.id, team.id) &&
        Objects.equals(this.userID, team.userID) &&
        equalsNullable(this.channelCode, team.channelCode) &&
        equalsNullable(this.channelAppID, team.channelAppID) &&
        equalsNullable(this.role, team.role) &&
        equalsNullable(this.permission, team.permission) &&
        Objects.equals(this.show, team.show) &&
        Objects.equals(this.showIndex, team.showIndex) &&
        Objects.equals(this.createDate, team.createDate) &&
        Objects.equals(this.lastUpdate, team.lastUpdate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userID, hashCodeNullable(channelCode), hashCodeNullable(channelAppID), hashCodeNullable(role), hashCodeNullable(permission), show, showIndex, createDate, lastUpdate);
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
    sb.append("class Team {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    channelCode: ").append(toIndentedString(channelCode)).append("\n");
    sb.append("    channelAppID: ").append(toIndentedString(channelAppID)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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

    // add `userID` to the URL query string
    if (getUserID() != null) {
      joiner.add(String.format("%suserID%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUserID()))));
    }

    // add `channelCode` to the URL query string
    if (getChannelCode() != null) {
      joiner.add(String.format("%schannelCode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChannelCode()))));
    }

    // add `channelAppID` to the URL query string
    if (getChannelAppID() != null) {
      joiner.add(String.format("%schannelAppID%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChannelAppID()))));
    }

    // add `role` to the URL query string
    if (getRole() != null) {
      joiner.add(String.format("%srole%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRole()))));
    }

    // add `permission` to the URL query string
    if (getPermission() != null) {
      joiner.add(String.format("%spermission%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPermission()))));
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

