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
 * TradeSettleDetail
 */
@JsonPropertyOrder({
  TradeSettleDetail.JSON_PROPERTY_AMOUNT,
  TradeSettleDetail.JSON_PROPERTY_OPERATION_DT,
  TradeSettleDetail.JSON_PROPERTY_OPERATION_SERIAL_NO,
  TradeSettleDetail.JSON_PROPERTY_OPERATION_TYPE,
  TradeSettleDetail.JSON_PROPERTY_ORI_TRANS_IN,
  TradeSettleDetail.JSON_PROPERTY_ORI_TRANS_OUT,
  TradeSettleDetail.JSON_PROPERTY_TRANS_IN,
  TradeSettleDetail.JSON_PROPERTY_TRANS_OUT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-18T07:36:52.198638406Z[Etc/UTC]", comments = "Generator version: 7.13.0-SNAPSHOT")
public class TradeSettleDetail {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private JsonNullable<String> amount = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OPERATION_DT = "operationDt";
  private JsonNullable<String> operationDt = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OPERATION_SERIAL_NO = "operationSerialNo";
  private JsonNullable<String> operationSerialNo = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OPERATION_TYPE = "operationType";
  private JsonNullable<String> operationType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORI_TRANS_IN = "oriTransIn";
  private JsonNullable<String> oriTransIn = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORI_TRANS_OUT = "oriTransOut";
  private JsonNullable<String> oriTransOut = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TRANS_IN = "transIn";
  private JsonNullable<String> transIn = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TRANS_OUT = "transOut";
  private JsonNullable<String> transOut = JsonNullable.<String>undefined();

  public TradeSettleDetail() { 
  }

  public TradeSettleDetail amount(@javax.annotation.Nullable String amount) {
    this.amount = JsonNullable.<String>of(amount);
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getAmount() {
        return amount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAmount_JsonNullable() {
    return amount;
  }
  
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  public void setAmount_JsonNullable(JsonNullable<String> amount) {
    this.amount = amount;
  }

  public void setAmount(@javax.annotation.Nullable String amount) {
    this.amount = JsonNullable.<String>of(amount);
  }


  public TradeSettleDetail operationDt(@javax.annotation.Nullable String operationDt) {
    this.operationDt = JsonNullable.<String>of(operationDt);
    return this;
  }

  /**
   * Get operationDt
   * @return operationDt
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getOperationDt() {
        return operationDt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPERATION_DT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOperationDt_JsonNullable() {
    return operationDt;
  }
  
  @JsonProperty(JSON_PROPERTY_OPERATION_DT)
  public void setOperationDt_JsonNullable(JsonNullable<String> operationDt) {
    this.operationDt = operationDt;
  }

  public void setOperationDt(@javax.annotation.Nullable String operationDt) {
    this.operationDt = JsonNullable.<String>of(operationDt);
  }


  public TradeSettleDetail operationSerialNo(@javax.annotation.Nullable String operationSerialNo) {
    this.operationSerialNo = JsonNullable.<String>of(operationSerialNo);
    return this;
  }

  /**
   * Get operationSerialNo
   * @return operationSerialNo
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getOperationSerialNo() {
        return operationSerialNo.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPERATION_SERIAL_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOperationSerialNo_JsonNullable() {
    return operationSerialNo;
  }
  
  @JsonProperty(JSON_PROPERTY_OPERATION_SERIAL_NO)
  public void setOperationSerialNo_JsonNullable(JsonNullable<String> operationSerialNo) {
    this.operationSerialNo = operationSerialNo;
  }

  public void setOperationSerialNo(@javax.annotation.Nullable String operationSerialNo) {
    this.operationSerialNo = JsonNullable.<String>of(operationSerialNo);
  }


  public TradeSettleDetail operationType(@javax.annotation.Nullable String operationType) {
    this.operationType = JsonNullable.<String>of(operationType);
    return this;
  }

  /**
   * Get operationType
   * @return operationType
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getOperationType() {
        return operationType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPERATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOperationType_JsonNullable() {
    return operationType;
  }
  
  @JsonProperty(JSON_PROPERTY_OPERATION_TYPE)
  public void setOperationType_JsonNullable(JsonNullable<String> operationType) {
    this.operationType = operationType;
  }

  public void setOperationType(@javax.annotation.Nullable String operationType) {
    this.operationType = JsonNullable.<String>of(operationType);
  }


  public TradeSettleDetail oriTransIn(@javax.annotation.Nullable String oriTransIn) {
    this.oriTransIn = JsonNullable.<String>of(oriTransIn);
    return this;
  }

  /**
   * Get oriTransIn
   * @return oriTransIn
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getOriTransIn() {
        return oriTransIn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORI_TRANS_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOriTransIn_JsonNullable() {
    return oriTransIn;
  }
  
  @JsonProperty(JSON_PROPERTY_ORI_TRANS_IN)
  public void setOriTransIn_JsonNullable(JsonNullable<String> oriTransIn) {
    this.oriTransIn = oriTransIn;
  }

  public void setOriTransIn(@javax.annotation.Nullable String oriTransIn) {
    this.oriTransIn = JsonNullable.<String>of(oriTransIn);
  }


  public TradeSettleDetail oriTransOut(@javax.annotation.Nullable String oriTransOut) {
    this.oriTransOut = JsonNullable.<String>of(oriTransOut);
    return this;
  }

  /**
   * Get oriTransOut
   * @return oriTransOut
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getOriTransOut() {
        return oriTransOut.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORI_TRANS_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOriTransOut_JsonNullable() {
    return oriTransOut;
  }
  
  @JsonProperty(JSON_PROPERTY_ORI_TRANS_OUT)
  public void setOriTransOut_JsonNullable(JsonNullable<String> oriTransOut) {
    this.oriTransOut = oriTransOut;
  }

  public void setOriTransOut(@javax.annotation.Nullable String oriTransOut) {
    this.oriTransOut = JsonNullable.<String>of(oriTransOut);
  }


  public TradeSettleDetail transIn(@javax.annotation.Nullable String transIn) {
    this.transIn = JsonNullable.<String>of(transIn);
    return this;
  }

  /**
   * Get transIn
   * @return transIn
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getTransIn() {
        return transIn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRANS_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTransIn_JsonNullable() {
    return transIn;
  }
  
  @JsonProperty(JSON_PROPERTY_TRANS_IN)
  public void setTransIn_JsonNullable(JsonNullable<String> transIn) {
    this.transIn = transIn;
  }

  public void setTransIn(@javax.annotation.Nullable String transIn) {
    this.transIn = JsonNullable.<String>of(transIn);
  }


  public TradeSettleDetail transOut(@javax.annotation.Nullable String transOut) {
    this.transOut = JsonNullable.<String>of(transOut);
    return this;
  }

  /**
   * Get transOut
   * @return transOut
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getTransOut() {
        return transOut.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRANS_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTransOut_JsonNullable() {
    return transOut;
  }
  
  @JsonProperty(JSON_PROPERTY_TRANS_OUT)
  public void setTransOut_JsonNullable(JsonNullable<String> transOut) {
    this.transOut = transOut;
  }

  public void setTransOut(@javax.annotation.Nullable String transOut) {
    this.transOut = JsonNullable.<String>of(transOut);
  }


  /**
   * Return true if this TradeSettleDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeSettleDetail tradeSettleDetail = (TradeSettleDetail) o;
    return equalsNullable(this.amount, tradeSettleDetail.amount) &&
        equalsNullable(this.operationDt, tradeSettleDetail.operationDt) &&
        equalsNullable(this.operationSerialNo, tradeSettleDetail.operationSerialNo) &&
        equalsNullable(this.operationType, tradeSettleDetail.operationType) &&
        equalsNullable(this.oriTransIn, tradeSettleDetail.oriTransIn) &&
        equalsNullable(this.oriTransOut, tradeSettleDetail.oriTransOut) &&
        equalsNullable(this.transIn, tradeSettleDetail.transIn) &&
        equalsNullable(this.transOut, tradeSettleDetail.transOut);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(amount), hashCodeNullable(operationDt), hashCodeNullable(operationSerialNo), hashCodeNullable(operationType), hashCodeNullable(oriTransIn), hashCodeNullable(oriTransOut), hashCodeNullable(transIn), hashCodeNullable(transOut));
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
    sb.append("class TradeSettleDetail {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    operationDt: ").append(toIndentedString(operationDt)).append("\n");
    sb.append("    operationSerialNo: ").append(toIndentedString(operationSerialNo)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    oriTransIn: ").append(toIndentedString(oriTransIn)).append("\n");
    sb.append("    oriTransOut: ").append(toIndentedString(oriTransOut)).append("\n");
    sb.append("    transIn: ").append(toIndentedString(transIn)).append("\n");
    sb.append("    transOut: ").append(toIndentedString(transOut)).append("\n");
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
      joiner.add(String.format("%samount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAmount()))));
    }

    // add `operationDt` to the URL query string
    if (getOperationDt() != null) {
      joiner.add(String.format("%soperationDt%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOperationDt()))));
    }

    // add `operationSerialNo` to the URL query string
    if (getOperationSerialNo() != null) {
      joiner.add(String.format("%soperationSerialNo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOperationSerialNo()))));
    }

    // add `operationType` to the URL query string
    if (getOperationType() != null) {
      joiner.add(String.format("%soperationType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOperationType()))));
    }

    // add `oriTransIn` to the URL query string
    if (getOriTransIn() != null) {
      joiner.add(String.format("%soriTransIn%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOriTransIn()))));
    }

    // add `oriTransOut` to the URL query string
    if (getOriTransOut() != null) {
      joiner.add(String.format("%soriTransOut%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOriTransOut()))));
    }

    // add `transIn` to the URL query string
    if (getTransIn() != null) {
      joiner.add(String.format("%stransIn%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransIn()))));
    }

    // add `transOut` to the URL query string
    if (getTransOut() != null) {
      joiner.add(String.format("%stransOut%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransOut()))));
    }

    return joiner.toString();
  }
}

