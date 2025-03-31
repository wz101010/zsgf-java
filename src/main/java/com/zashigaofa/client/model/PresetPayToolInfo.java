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
 * PresetPayToolInfo
 */
@JsonPropertyOrder({
  PresetPayToolInfo.JSON_PROPERTY_AMOUNT,
  PresetPayToolInfo.JSON_PROPERTY_ASSERT_TYPE_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-31T07:56:41.646456145Z[Etc/UTC]", comments = "Generator version: 7.13.0-SNAPSHOT")
public class PresetPayToolInfo {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private JsonNullable<List<String>> amount = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_ASSERT_TYPE_CODE = "assertTypeCode";
  private JsonNullable<String> assertTypeCode = JsonNullable.<String>undefined();

  public PresetPayToolInfo() { 
  }

  public PresetPayToolInfo amount(@javax.annotation.Nullable List<String> amount) {
    this.amount = JsonNullable.<List<String>>of(amount);
    return this;
  }

  public PresetPayToolInfo addAmountItem(String amountItem) {
    if (this.amount == null || !this.amount.isPresent()) {
      this.amount = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.amount.get().add(amountItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public List<String> getAmount() {
        return amount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getAmount_JsonNullable() {
    return amount;
  }
  
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  public void setAmount_JsonNullable(JsonNullable<List<String>> amount) {
    this.amount = amount;
  }

  public void setAmount(@javax.annotation.Nullable List<String> amount) {
    this.amount = JsonNullable.<List<String>>of(amount);
  }


  public PresetPayToolInfo assertTypeCode(@javax.annotation.Nullable String assertTypeCode) {
    this.assertTypeCode = JsonNullable.<String>of(assertTypeCode);
    return this;
  }

  /**
   * Get assertTypeCode
   * @return assertTypeCode
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getAssertTypeCode() {
        return assertTypeCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSERT_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAssertTypeCode_JsonNullable() {
    return assertTypeCode;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSERT_TYPE_CODE)
  public void setAssertTypeCode_JsonNullable(JsonNullable<String> assertTypeCode) {
    this.assertTypeCode = assertTypeCode;
  }

  public void setAssertTypeCode(@javax.annotation.Nullable String assertTypeCode) {
    this.assertTypeCode = JsonNullable.<String>of(assertTypeCode);
  }


  /**
   * Return true if this PresetPayToolInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresetPayToolInfo presetPayToolInfo = (PresetPayToolInfo) o;
    return equalsNullable(this.amount, presetPayToolInfo.amount) &&
        equalsNullable(this.assertTypeCode, presetPayToolInfo.assertTypeCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(amount), hashCodeNullable(assertTypeCode));
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
    sb.append("class PresetPayToolInfo {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    assertTypeCode: ").append(toIndentedString(assertTypeCode)).append("\n");
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

    // add `amount` to the URL query string
    if (getAmount() != null) {
      for (int i = 0; i < getAmount().size(); i++) {
        joiner.add(String.format("%samount%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getAmount().get(i)))));
      }
    }

    // add `assertTypeCode` to the URL query string
    if (getAssertTypeCode() != null) {
      joiner.add(String.format("%sassertTypeCode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAssertTypeCode()))));
    }

    return joiner.toString();
  }
}

