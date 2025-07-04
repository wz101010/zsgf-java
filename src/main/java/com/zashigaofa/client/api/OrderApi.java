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

package com.zashigaofa.client.api;

import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.Pair;

import com.zashigaofa.client.model.CreateOrderRequest;
import com.zashigaofa.client.model.CreateOrderResultApiResponse;
import com.zashigaofa.client.model.OrderApiResponse;
import com.zashigaofa.client.model.OrderListResultApiResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-18T07:36:52.198638406Z[Etc/UTC]", comments = "Generator version: 7.13.0-SNAPSHOT")
public class OrderApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public OrderApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrderApi(ApiClient apiClient) {
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
   * 获取订单详情
   * 根据订单ID获取订单详情
   * @param id 订单ID (required)
   * @param appKey  (required)
   * @return OrderApiResponse
   * @throws ApiException if fails to make API call
   */
  public OrderApiResponse order(Long id, String appKey) throws ApiException {
    ApiResponse<OrderApiResponse> localVarResponse = orderWithHttpInfo(id, appKey);
    return localVarResponse.getData();
  }

  /**
   * 获取订单详情
   * 根据订单ID获取订单详情
   * @param id 订单ID (required)
   * @param appKey  (required)
   * @return ApiResponse&lt;OrderApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrderApiResponse> orderWithHttpInfo(Long id, String appKey) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = orderRequestBuilder(id, appKey);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("order", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<OrderApiResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<OrderApiResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<OrderApiResponse>() {})
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

  private HttpRequest.Builder orderRequestBuilder(Long id, String appKey) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling order");
    }
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling order");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/Order/{appKey}/{id}"
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
   * 创建订单
   * 根据请求参数创建订单
   * @param appKey  (required)
   * @param createOrderRequest 订单创建请求 (optional)
   * @return CreateOrderResultApiResponse
   * @throws ApiException if fails to make API call
   */
  public CreateOrderResultApiResponse orderCreate(String appKey, CreateOrderRequest createOrderRequest) throws ApiException {
    ApiResponse<CreateOrderResultApiResponse> localVarResponse = orderCreateWithHttpInfo(appKey, createOrderRequest);
    return localVarResponse.getData();
  }

  /**
   * 创建订单
   * 根据请求参数创建订单
   * @param appKey  (required)
   * @param createOrderRequest 订单创建请求 (optional)
   * @return ApiResponse&lt;CreateOrderResultApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateOrderResultApiResponse> orderCreateWithHttpInfo(String appKey, CreateOrderRequest createOrderRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = orderCreateRequestBuilder(appKey, createOrderRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("orderCreate", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<CreateOrderResultApiResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<CreateOrderResultApiResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<CreateOrderResultApiResponse>() {})
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

  private HttpRequest.Builder orderCreateRequestBuilder(String appKey, CreateOrderRequest createOrderRequest) throws ApiException {
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling orderCreate");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/Order/{appKey}/Create"
        .replace("{appKey}", ApiClient.urlEncode(appKey.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json-patch+json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(createOrderRequest);
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
   * 获取订单列表
   * 根据查询条件获取订单列表
   * @param appKey  (required)
   * @param status 订单状态 (optional)
   * @param orderNo 系统订单号 (optional)
   * @param tradeNo 支付平台单号 (optional)
   * @param userId 用户ID (optional)
   * @param pctType 商品类型 (optional)
   * @param pctId 商品ID (optional)
   * @param pctName 商品名称 (optional)
   * @param skip 跳过的条数 (optional)
   * @param take 拉取的条数 (optional)
   * @return OrderListResultApiResponse
   * @throws ApiException if fails to make API call
   */
  public OrderListResultApiResponse orders(String appKey, String status, String orderNo, String tradeNo, Long userId, String pctType, String pctId, String pctName, Integer skip, Integer take) throws ApiException {
    ApiResponse<OrderListResultApiResponse> localVarResponse = ordersWithHttpInfo(appKey, status, orderNo, tradeNo, userId, pctType, pctId, pctName, skip, take);
    return localVarResponse.getData();
  }

  /**
   * 获取订单列表
   * 根据查询条件获取订单列表
   * @param appKey  (required)
   * @param status 订单状态 (optional)
   * @param orderNo 系统订单号 (optional)
   * @param tradeNo 支付平台单号 (optional)
   * @param userId 用户ID (optional)
   * @param pctType 商品类型 (optional)
   * @param pctId 商品ID (optional)
   * @param pctName 商品名称 (optional)
   * @param skip 跳过的条数 (optional)
   * @param take 拉取的条数 (optional)
   * @return ApiResponse&lt;OrderListResultApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrderListResultApiResponse> ordersWithHttpInfo(String appKey, String status, String orderNo, String tradeNo, Long userId, String pctType, String pctId, String pctName, Integer skip, Integer take) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = ordersRequestBuilder(appKey, status, orderNo, tradeNo, userId, pctType, pctId, pctName, skip, take);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("orders", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<OrderListResultApiResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<OrderListResultApiResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<OrderListResultApiResponse>() {})
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

  private HttpRequest.Builder ordersRequestBuilder(String appKey, String status, String orderNo, String tradeNo, Long userId, String pctType, String pctId, String pctName, Integer skip, Integer take) throws ApiException {
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling orders");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/Order/{appKey}"
        .replace("{appKey}", ApiClient.urlEncode(appKey.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "status";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("status", status));
    localVarQueryParameterBaseName = "orderNo";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("orderNo", orderNo));
    localVarQueryParameterBaseName = "tradeNo";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("tradeNo", tradeNo));
    localVarQueryParameterBaseName = "userId";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("userId", userId));
    localVarQueryParameterBaseName = "pctType";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("pctType", pctType));
    localVarQueryParameterBaseName = "pctId";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("pctId", pctId));
    localVarQueryParameterBaseName = "pctName";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("pctName", pctName));
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
