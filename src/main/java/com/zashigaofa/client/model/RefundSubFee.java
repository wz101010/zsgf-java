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
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.zashigaofa.client.ApiClient;
/**
 * RefundSubFee
 */
@JsonPropertyOrder({
  RefundSubFee.JSON_PROPERTY_REFUND_CHARGE_FEE,
  RefundSubFee.JSON_PROPERTY_SWITCH_FEE_RATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-31T07:56:41.646456145Z[Etc/UTC]", comments = "Generator version: 7.13.0-SNAPSHOT")
public class RefundSubFee {
  public static final String JSON_PROPERTY_REFUND_CHARGE_FEE = "refundChargeFee";
  private JsonNullable<String> refundChargeFee = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SWITCH_FEE_RATE = "switchFeeRate";
  private JsonNullable<String> switchFeeRate = JsonNullable.<String>undefined();

  public RefundSubFee() { 
  }

  public RefundSubFee refundChargeFee(@javax.annotation.Nullable String refundChargeFee) {
    this.refundChargeFee = JsonNullable.<String>of(refundChargeFee);
    return this;
  }

  /**
   * Get refundChargeFee
   * @return refundChargeFee
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getRefundChargeFee() {
        return refundChargeFee.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REFUND_CHARGE_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRefundChargeFee_JsonNullable() {
    return refundChargeFee;
  }
  
  @JsonProperty(JSON_PROPERTY_REFUND_CHARGE_FEE)
  public void setRefundChargeFee_JsonNullable(JsonNullable<String> refundChargeFee) {
    this.refundChargeFee = refundChargeFee;
  }

  public void setRefundChargeFee(@javax.annotation.Nullable String refundChargeFee) {
    this.refundChargeFee = JsonNullable.<String>of(refundChargeFee);
  }


  public RefundSubFee switchFeeRate(@javax.annotation.Nullable String switchFeeRate) {
    this.switchFeeRate = JsonNullable.<String>of(switchFeeRate);
    return this;
  }

  /**
   * Get switchFeeRate
   * @return switchFeeRate
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getSwitchFeeRate() {
        return switchFeeRate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SWITCH_FEE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSwitchFeeRate_JsonNullable() {
    return switchFeeRate;
  }
  
  @JsonProperty(JSON_PROPERTY_SWITCH_FEE_RATE)
  public void setSwitchFeeRate_JsonNullable(JsonNullable<String> switchFeeRate) {
    this.switchFeeRate = switchFeeRate;
  }

  public void setSwitchFeeRate(@javax.annotation.Nullable String switchFeeRate) {
    this.switchFeeRate = JsonNullable.<String>of(switchFeeRate);
  }


  /**
   * Return true if this RefundSubFee object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundSubFee refundSubFee = (RefundSubFee) o;
    return equalsNullable(this.refundChargeFee, refundSubFee.refundChargeFee) &&
        equalsNullable(this.switchFeeRate, refundSubFee.switchFeeRate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(refundChargeFee), hashCodeNullable(switchFeeRate));
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
    sb.append("class RefundSubFee {\n");
    sb.append("    refundChargeFee: ").append(toIndentedString(refundChargeFee)).append("\n");
    sb.append("    switchFeeRate: ").append(toIndentedString(switchFeeRate)).append("\n");
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

    // add `refundChargeFee` to the URL query string
    if (getRefundChargeFee() != null) {
      joiner.add(String.format("%srefundChargeFee%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRefundChargeFee()))));
    }

    // add `switchFeeRate` to the URL query string
    if (getSwitchFeeRate() != null) {
      joiner.add(String.format("%sswitchFeeRate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSwitchFeeRate()))));
    }

    return joiner.toString();
  }
}

