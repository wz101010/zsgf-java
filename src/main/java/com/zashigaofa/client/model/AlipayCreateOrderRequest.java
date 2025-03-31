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
 * AlipayCreateOrderRequest
 */
@JsonPropertyOrder({
  AlipayCreateOrderRequest.JSON_PROPERTY_ORDER_NO,
  AlipayCreateOrderRequest.JSON_PROPERTY_AMOUNT,
  AlipayCreateOrderRequest.JSON_PROPERTY_SUBJECT,
  AlipayCreateOrderRequest.JSON_PROPERTY_RETURN_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-31T07:56:41.646456145Z[Etc/UTC]", comments = "Generator version: 7.13.0-SNAPSHOT")
public class AlipayCreateOrderRequest {
  public static final String JSON_PROPERTY_ORDER_NO = "orderNo";
  @javax.annotation.Nonnull
  private String orderNo;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nonnull
  private Double amount;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  @javax.annotation.Nonnull
  private String subject;

  public static final String JSON_PROPERTY_RETURN_URL = "returnUrl";
  private JsonNullable<String> returnUrl = JsonNullable.<String>undefined();

  public AlipayCreateOrderRequest() { 
  }

  public AlipayCreateOrderRequest orderNo(@javax.annotation.Nonnull String orderNo) {
    this.orderNo = orderNo;
    return this;
  }

  /**
   * 自定义订单号
   * @return orderNo
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORDER_NO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOrderNo() {
    return orderNo;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_NO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderNo(@javax.annotation.Nonnull String orderNo) {
    this.orderNo = orderNo;
  }


  public AlipayCreateOrderRequest amount(@javax.annotation.Nonnull Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * 订单金额。例如：0.01
   * minimum: 0.01
   * @return amount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(@javax.annotation.Nonnull Double amount) {
    this.amount = amount;
  }


  public AlipayCreateOrderRequest subject(@javax.annotation.Nonnull String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * 商品名称
   * @return subject
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubject(@javax.annotation.Nonnull String subject) {
    this.subject = subject;
  }


  public AlipayCreateOrderRequest returnUrl(@javax.annotation.Nullable String returnUrl) {
    this.returnUrl = JsonNullable.<String>of(returnUrl);
    return this;
  }

  /**
   * 支付完成后返回的URL地址
   * @return returnUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getReturnUrl() {
        return returnUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RETURN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getReturnUrl_JsonNullable() {
    return returnUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_RETURN_URL)
  public void setReturnUrl_JsonNullable(JsonNullable<String> returnUrl) {
    this.returnUrl = returnUrl;
  }

  public void setReturnUrl(@javax.annotation.Nullable String returnUrl) {
    this.returnUrl = JsonNullable.<String>of(returnUrl);
  }


  /**
   * Return true if this AlipayCreateOrderRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCreateOrderRequest alipayCreateOrderRequest = (AlipayCreateOrderRequest) o;
    return Objects.equals(this.orderNo, alipayCreateOrderRequest.orderNo) &&
        Objects.equals(this.amount, alipayCreateOrderRequest.amount) &&
        Objects.equals(this.subject, alipayCreateOrderRequest.subject) &&
        equalsNullable(this.returnUrl, alipayCreateOrderRequest.returnUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNo, amount, subject, hashCodeNullable(returnUrl));
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
    sb.append("class AlipayCreateOrderRequest {\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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

    // add `orderNo` to the URL query string
    if (getOrderNo() != null) {
      joiner.add(String.format("%sorderNo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOrderNo()))));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAmount()))));
    }

    // add `subject` to the URL query string
    if (getSubject() != null) {
      joiner.add(String.format("%ssubject%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSubject()))));
    }

    // add `returnUrl` to the URL query string
    if (getReturnUrl() != null) {
      joiner.add(String.format("%sreturnUrl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReturnUrl()))));
    }

    return joiner.toString();
  }
}

