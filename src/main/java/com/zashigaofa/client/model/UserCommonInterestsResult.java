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
import com.zashigaofa.client.model.CommonFriendModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.zashigaofa.client.ApiClient;
/**
 * UserCommonInterestsResult
 */
@JsonPropertyOrder({
  UserCommonInterestsResult.JSON_PROPERTY_TOTAL_FOLLOWERS,
  UserCommonInterestsResult.JSON_PROPERTY_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-31T07:56:41.646456145Z[Etc/UTC]", comments = "Generator version: 7.13.0-SNAPSHOT")
public class UserCommonInterestsResult {
  public static final String JSON_PROPERTY_TOTAL_FOLLOWERS = "totalFollowers";
  @javax.annotation.Nullable
  private Long totalFollowers;

  public static final String JSON_PROPERTY_DATA = "data";
  private JsonNullable<List<CommonFriendModel>> data = JsonNullable.<List<CommonFriendModel>>undefined();

  public UserCommonInterestsResult() { 
  }

  public UserCommonInterestsResult totalFollowers(@javax.annotation.Nullable Long totalFollowers) {
    this.totalFollowers = totalFollowers;
    return this;
  }

  /**
   * Get totalFollowers
   * @return totalFollowers
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_FOLLOWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalFollowers() {
    return totalFollowers;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_FOLLOWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalFollowers(@javax.annotation.Nullable Long totalFollowers) {
    this.totalFollowers = totalFollowers;
  }


  public UserCommonInterestsResult data(@javax.annotation.Nullable List<CommonFriendModel> data) {
    this.data = JsonNullable.<List<CommonFriendModel>>of(data);
    return this;
  }

  public UserCommonInterestsResult addDataItem(CommonFriendModel dataItem) {
    if (this.data == null || !this.data.isPresent()) {
      this.data = JsonNullable.<List<CommonFriendModel>>of(new ArrayList<>());
    }
    try {
      this.data.get().add(dataItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public List<CommonFriendModel> getData() {
        return data.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<CommonFriendModel>> getData_JsonNullable() {
    return data;
  }
  
  @JsonProperty(JSON_PROPERTY_DATA)
  public void setData_JsonNullable(JsonNullable<List<CommonFriendModel>> data) {
    this.data = data;
  }

  public void setData(@javax.annotation.Nullable List<CommonFriendModel> data) {
    this.data = JsonNullable.<List<CommonFriendModel>>of(data);
  }


  /**
   * Return true if this UserCommonInterestsResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCommonInterestsResult userCommonInterestsResult = (UserCommonInterestsResult) o;
    return Objects.equals(this.totalFollowers, userCommonInterestsResult.totalFollowers) &&
        equalsNullable(this.data, userCommonInterestsResult.data);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalFollowers, hashCodeNullable(data));
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
    sb.append("class UserCommonInterestsResult {\n");
    sb.append("    totalFollowers: ").append(toIndentedString(totalFollowers)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

    // add `totalFollowers` to the URL query string
    if (getTotalFollowers() != null) {
      joiner.add(String.format("%stotalFollowers%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalFollowers()))));
    }

    // add `data` to the URL query string
    if (getData() != null) {
      for (int i = 0; i < getData().size(); i++) {
        if (getData().get(i) != null) {
          joiner.add(getData().get(i).toUrlQueryString(String.format("%sdata%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

