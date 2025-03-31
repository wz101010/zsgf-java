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

package com.zashigaofa.client.api;

import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.Pair;

import com.zashigaofa.client.model.BooleanApiResponse;
import com.zashigaofa.client.model.CurrencyConsumeRequest;
import com.zashigaofa.client.model.ExchangeCurrencyRequest;
import java.time.OffsetDateTime;
import com.zashigaofa.client.model.RechargePointRequest;
import com.zashigaofa.client.model.UserCurrencyCurrencyTransResultApiResponse;
import com.zashigaofa.client.model.UserCurrencyListApiResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-31T07:56:41.646456145Z[Etc/UTC]", comments = "Generator version: 7.13.0-SNAPSHOT")
public class UserCurrencyApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public UserCurrencyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserCurrencyApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * 获取用户资产
   * 根据用户ID获取用户的资产列表
   * @param id 用户ID (required)
   * @param appKey  (required)
   * @return UserCurrencyListApiResponse
   * @throws ApiException if fails to make API call
   */
  public UserCurrencyListApiResponse userCurrencies(Long id, String appKey) throws ApiException {
    ApiResponse<UserCurrencyListApiResponse> localVarResponse = userCurrenciesWithHttpInfo(id, appKey);
    return localVarResponse.getData();
  }

  /**
   * 获取用户资产
   * 根据用户ID获取用户的资产列表
   * @param id 用户ID (required)
   * @param appKey  (required)
   * @return ApiResponse&lt;UserCurrencyListApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserCurrencyListApiResponse> userCurrenciesWithHttpInfo(Long id, String appKey) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = userCurrenciesRequestBuilder(id, appKey);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("userCurrencies", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<UserCurrencyListApiResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<UserCurrencyListApiResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<UserCurrencyListApiResponse>() {})
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder userCurrenciesRequestBuilder(Long id, String appKey) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling userCurrencies");
    }
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling userCurrencies");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/UserCurrency/{appKey}/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()))
        .replace("{appKey}", ApiClient.urlEncode(appKey.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 消费虚拟币
   * 根据提供的参数进行虚拟币消费
   * @param nonce 随机数 (required)
   * @param timestamp 时间戳（允许与服务器时间误差在1分钟内） (required)
   * @param signature 签名 (required)
   * @param appKey  (required)
   * @param currencyConsumeRequest 消费请求参数 (optional)
   * @return BooleanApiResponse
   * @throws ApiException if fails to make API call
   */
  public BooleanApiResponse userCurrencyConsume(String nonce, Long timestamp, String signature, String appKey, CurrencyConsumeRequest currencyConsumeRequest) throws ApiException {
    ApiResponse<BooleanApiResponse> localVarResponse = userCurrencyConsumeWithHttpInfo(nonce, timestamp, signature, appKey, currencyConsumeRequest);
    return localVarResponse.getData();
  }

  /**
   * 消费虚拟币
   * 根据提供的参数进行虚拟币消费
   * @param nonce 随机数 (required)
   * @param timestamp 时间戳（允许与服务器时间误差在1分钟内） (required)
   * @param signature 签名 (required)
   * @param appKey  (required)
   * @param currencyConsumeRequest 消费请求参数 (optional)
   * @return ApiResponse&lt;BooleanApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BooleanApiResponse> userCurrencyConsumeWithHttpInfo(String nonce, Long timestamp, String signature, String appKey, CurrencyConsumeRequest currencyConsumeRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = userCurrencyConsumeRequestBuilder(nonce, timestamp, signature, appKey, currencyConsumeRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("userCurrencyConsume", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<BooleanApiResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<BooleanApiResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<BooleanApiResponse>() {})
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder userCurrencyConsumeRequestBuilder(String nonce, Long timestamp, String signature, String appKey, CurrencyConsumeRequest currencyConsumeRequest) throws ApiException {
    // verify the required parameter 'nonce' is set
    if (nonce == null) {
      throw new ApiException(400, "Missing the required parameter 'nonce' when calling userCurrencyConsume");
    }
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling userCurrencyConsume");
    }
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling userCurrencyConsume");
    }
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling userCurrencyConsume");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/UserCurrency/{appKey}/CurrencyConsume"
        .replace("{appKey}", ApiClient.urlEncode(appKey.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "nonce";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("nonce", nonce));
    localVarQueryParameterBaseName = "timestamp";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("timestamp", timestamp));
    localVarQueryParameterBaseName = "signature";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("signature", signature));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Content-Type", "application/json-patch+json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(currencyConsumeRequest);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 兑换虚拟币
   * 根据提供的参数进行虚拟币兑换
   * @param nonce 随机数 (required)
   * @param timestamp 时间戳（允许与服务器时间误差在1分钟内） (required)
   * @param signature 签名 (required)
   * @param appKey  (required)
   * @param exchangeCurrencyRequest 兑换请求参数 (optional)
   * @return BooleanApiResponse
   * @throws ApiException if fails to make API call
   */
  public BooleanApiResponse userCurrencyExchange(String nonce, Long timestamp, String signature, String appKey, ExchangeCurrencyRequest exchangeCurrencyRequest) throws ApiException {
    ApiResponse<BooleanApiResponse> localVarResponse = userCurrencyExchangeWithHttpInfo(nonce, timestamp, signature, appKey, exchangeCurrencyRequest);
    return localVarResponse.getData();
  }

  /**
   * 兑换虚拟币
   * 根据提供的参数进行虚拟币兑换
   * @param nonce 随机数 (required)
   * @param timestamp 时间戳（允许与服务器时间误差在1分钟内） (required)
   * @param signature 签名 (required)
   * @param appKey  (required)
   * @param exchangeCurrencyRequest 兑换请求参数 (optional)
   * @return ApiResponse&lt;BooleanApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BooleanApiResponse> userCurrencyExchangeWithHttpInfo(String nonce, Long timestamp, String signature, String appKey, ExchangeCurrencyRequest exchangeCurrencyRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = userCurrencyExchangeRequestBuilder(nonce, timestamp, signature, appKey, exchangeCurrencyRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("userCurrencyExchange", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<BooleanApiResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<BooleanApiResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<BooleanApiResponse>() {})
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder userCurrencyExchangeRequestBuilder(String nonce, Long timestamp, String signature, String appKey, ExchangeCurrencyRequest exchangeCurrencyRequest) throws ApiException {
    // verify the required parameter 'nonce' is set
    if (nonce == null) {
      throw new ApiException(400, "Missing the required parameter 'nonce' when calling userCurrencyExchange");
    }
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling userCurrencyExchange");
    }
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling userCurrencyExchange");
    }
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling userCurrencyExchange");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/UserCurrency/{appKey}/CurrencyExchange"
        .replace("{appKey}", ApiClient.urlEncode(appKey.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "nonce";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("nonce", nonce));
    localVarQueryParameterBaseName = "timestamp";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("timestamp", timestamp));
    localVarQueryParameterBaseName = "signature";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("signature", signature));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Content-Type", "application/json-patch+json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(exchangeCurrencyRequest);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 充值虚拟币
   * 根据提供的参数进行虚拟币充值
   * @param nonce 随机数 (required)
   * @param timestamp 时间戳（允许与服务器时间误差在1分钟内） (required)
   * @param signature 签名 (required)
   * @param appKey  (required)
   * @param rechargePointRequest 充值请求参数 (optional)
   * @return BooleanApiResponse
   * @throws ApiException if fails to make API call
   */
  public BooleanApiResponse userCurrencyRecharge(String nonce, Long timestamp, String signature, String appKey, RechargePointRequest rechargePointRequest) throws ApiException {
    ApiResponse<BooleanApiResponse> localVarResponse = userCurrencyRechargeWithHttpInfo(nonce, timestamp, signature, appKey, rechargePointRequest);
    return localVarResponse.getData();
  }

  /**
   * 充值虚拟币
   * 根据提供的参数进行虚拟币充值
   * @param nonce 随机数 (required)
   * @param timestamp 时间戳（允许与服务器时间误差在1分钟内） (required)
   * @param signature 签名 (required)
   * @param appKey  (required)
   * @param rechargePointRequest 充值请求参数 (optional)
   * @return ApiResponse&lt;BooleanApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BooleanApiResponse> userCurrencyRechargeWithHttpInfo(String nonce, Long timestamp, String signature, String appKey, RechargePointRequest rechargePointRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = userCurrencyRechargeRequestBuilder(nonce, timestamp, signature, appKey, rechargePointRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("userCurrencyRecharge", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<BooleanApiResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<BooleanApiResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<BooleanApiResponse>() {})
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder userCurrencyRechargeRequestBuilder(String nonce, Long timestamp, String signature, String appKey, RechargePointRequest rechargePointRequest) throws ApiException {
    // verify the required parameter 'nonce' is set
    if (nonce == null) {
      throw new ApiException(400, "Missing the required parameter 'nonce' when calling userCurrencyRecharge");
    }
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling userCurrencyRecharge");
    }
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling userCurrencyRecharge");
    }
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling userCurrencyRecharge");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/UserCurrency/{appKey}/CurrencyRecharge"
        .replace("{appKey}", ApiClient.urlEncode(appKey.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "nonce";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("nonce", nonce));
    localVarQueryParameterBaseName = "timestamp";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("timestamp", timestamp));
    localVarQueryParameterBaseName = "signature";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("signature", signature));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Content-Type", "application/json-patch+json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(rechargePointRequest);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 虚拟币交易记录
   * 根据提供的参数获取虚拟币交易记录
   * @param appKey  (required)
   * @param transType 交易类型 (optional)
   * @param curCode 货币代码 (optional)
   * @param startTime 开始时间 (optional)
   * @param endTime 结束时间 (optional)
   * @param skip 跳过的条数 (optional)
   * @param take 拉取的条数 (optional)
   * @return UserCurrencyCurrencyTransResultApiResponse
   * @throws ApiException if fails to make API call
   */
  public UserCurrencyCurrencyTransResultApiResponse userCurrencyTransactions(String appKey, String transType, String curCode, OffsetDateTime startTime, OffsetDateTime endTime, Integer skip, Integer take) throws ApiException {
    ApiResponse<UserCurrencyCurrencyTransResultApiResponse> localVarResponse = userCurrencyTransactionsWithHttpInfo(appKey, transType, curCode, startTime, endTime, skip, take);
    return localVarResponse.getData();
  }

  /**
   * 虚拟币交易记录
   * 根据提供的参数获取虚拟币交易记录
   * @param appKey  (required)
   * @param transType 交易类型 (optional)
   * @param curCode 货币代码 (optional)
   * @param startTime 开始时间 (optional)
   * @param endTime 结束时间 (optional)
   * @param skip 跳过的条数 (optional)
   * @param take 拉取的条数 (optional)
   * @return ApiResponse&lt;UserCurrencyCurrencyTransResultApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserCurrencyCurrencyTransResultApiResponse> userCurrencyTransactionsWithHttpInfo(String appKey, String transType, String curCode, OffsetDateTime startTime, OffsetDateTime endTime, Integer skip, Integer take) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = userCurrencyTransactionsRequestBuilder(appKey, transType, curCode, startTime, endTime, skip, take);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("userCurrencyTransactions", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<UserCurrencyCurrencyTransResultApiResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<UserCurrencyCurrencyTransResultApiResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<UserCurrencyCurrencyTransResultApiResponse>() {})
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder userCurrencyTransactionsRequestBuilder(String appKey, String transType, String curCode, OffsetDateTime startTime, OffsetDateTime endTime, Integer skip, Integer take) throws ApiException {
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling userCurrencyTransactions");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/UserCurrency/{appKey}/CurrencyTransactions"
        .replace("{appKey}", ApiClient.urlEncode(appKey.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "transType";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("transType", transType));
    localVarQueryParameterBaseName = "curCode";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("curCode", curCode));
    localVarQueryParameterBaseName = "startTime";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("startTime", startTime));
    localVarQueryParameterBaseName = "endTime";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("endTime", endTime));
    localVarQueryParameterBaseName = "skip";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("skip", skip));
    localVarQueryParameterBaseName = "take";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("take", take));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

}
