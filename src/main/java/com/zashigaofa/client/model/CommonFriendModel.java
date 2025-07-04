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
 * CommonFriendModel
 */
@JsonPropertyOrder({
  CommonFriendModel.JSON_PROPERTY_USER_I_D,
  CommonFriendModel.JSON_PROPERTY_NICK_NAME,
  CommonFriendModel.JSON_PROPERTY_AVATAR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-18T07:36:52.198638406Z[Etc/UTC]", comments = "Generator version: 7.13.0-SNAPSHOT")
public class CommonFriendModel {
  public static final String JSON_PROPERTY_USER_I_D = "userID";
  @javax.annotation.Nullable
  private Long userID;

  public static final String JSON_PROPERTY_NICK_NAME = "nickName";
  private JsonNullable<String> nickName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AVATAR = "avatar";
  private JsonNullable<String> avatar = JsonNullable.<String>undefined();

  public CommonFriendModel() { 
  }

  public CommonFriendModel userID(@javax.annotation.Nullable Long userID) {
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


  public CommonFriendModel nickName(@javax.annotation.Nullable String nickName) {
    this.nickName = JsonNullable.<String>of(nickName);
    return this;
  }

  /**
   * 昵称
   * @return nickName
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getNickName() {
        return nickName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NICK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNickName_JsonNullable() {
    return nickName;
  }
  
  @JsonProperty(JSON_PROPERTY_NICK_NAME)
  public void setNickName_JsonNullable(JsonNullable<String> nickName) {
    this.nickName = nickName;
  }

  public void setNickName(@javax.annotation.Nullable String nickName) {
    this.nickName = JsonNullable.<String>of(nickName);
  }


  public CommonFriendModel avatar(@javax.annotation.Nullable String avatar) {
    this.avatar = JsonNullable.<String>of(avatar);
    return this;
  }

  /**
   * 头像
   * @return avatar
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getAvatar() {
        return avatar.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAvatar_JsonNullable() {
    return avatar;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR)
  public void setAvatar_JsonNullable(JsonNullable<String> avatar) {
    this.avatar = avatar;
  }

  public void setAvatar(@javax.annotation.Nullable String avatar) {
    this.avatar = JsonNullable.<String>of(avatar);
  }


  /**
   * Return true if this CommonFriendModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonFriendModel commonFriendModel = (CommonFriendModel) o;
    return Objects.equals(this.userID, commonFriendModel.userID) &&
        equalsNullable(this.nickName, commonFriendModel.nickName) &&
        equalsNullable(this.avatar, commonFriendModel.avatar);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(userID, hashCodeNullable(nickName), hashCodeNullable(avatar));
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
    sb.append("class CommonFriendModel {\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
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

    // add `userID` to the URL query string
    if (getUserID() != null) {
      joiner.add(String.format("%suserID%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUserID()))));
    }

    // add `nickName` to the URL query string
    if (getNickName() != null) {
      joiner.add(String.format("%snickName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNickName()))));
    }

    // add `avatar` to the URL query string
    if (getAvatar() != null) {
      joiner.add(String.format("%savatar%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAvatar()))));
    }

    return joiner.toString();
  }
}

