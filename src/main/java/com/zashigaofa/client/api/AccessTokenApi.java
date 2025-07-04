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

import com.zashigaofa.client.model.AccessTokenListResultApiResponse;
import com.zashigaofa.client.model.AccessTokenPostRequest;
import com.zashigaofa.client.model.AccessTokenPutRequest;
import com.zashigaofa.client.model.BooleanApiResponse;
import com.zashigaofa.client.model.TokenModelApiResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

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
public class AccessTokenApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public AccessTokenApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccessTokenApi(ApiClient apiClient) {
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
   * 删除令牌
   * 删除用户令牌
   * @param id  (required)
   * @param appKey  (required)
   * @return BooleanApiResponse
   * @throws ApiException if fails to make API call
   */
  public BooleanApiResponse accessTokenDelete(Long id, String appKey) throws ApiException {
    ApiResponse<BooleanApiResponse> localVarResponse = accessTokenDeleteWithHttpInfo(id, appKey);
    return localVarResponse.getData();
  }

  /**
   * 删除令牌
   * 删除用户令牌
   * @param id  (required)
   * @param appKey  (required)
   * @return ApiResponse&lt;BooleanApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BooleanApiResponse> accessTokenDeleteWithHttpInfo(Long id, String appKey) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = accessTokenDeleteRequestBuilder(id, appKey);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("accessTokenDelete", localVarResponse);
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

  private HttpRequest.Builder accessTokenDeleteRequestBuilder(Long id, String appKey) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling accessTokenDelete");
    }
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling accessTokenDelete");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/AccessToken/{appKey}/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()))
        .replace("{appKey}", ApiClient.urlEncode(appKey.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 创建令牌
   * 创建新的用户令牌
   * @param appKey  (required)
   * @param accessTokenPostRequest  (optional)
   * @return TokenModelApiResponse
   * @throws ApiException if fails to make API call
   */
  public TokenModelApiResponse accessTokenPost(String appKey, AccessTokenPostRequest accessTokenPostRequest) throws ApiException {
    ApiResponse<TokenModelApiResponse> localVarResponse = accessTokenPostWithHttpInfo(appKey, accessTokenPostRequest);
    return localVarResponse.getData();
  }

  /**
   * 创建令牌
   * 创建新的用户令牌
   * @param appKey  (required)
   * @param accessTokenPostRequest  (optional)
   * @return ApiResponse&lt;TokenModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TokenModelApiResponse> accessTokenPostWithHttpInfo(String appKey, AccessTokenPostRequest accessTokenPostRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = accessTokenPostRequestBuilder(appKey, accessTokenPostRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("accessTokenPost", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<TokenModelApiResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<TokenModelApiResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<TokenModelApiResponse>() {})
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

  private HttpRequest.Builder accessTokenPostRequestBuilder(String appKey, AccessTokenPostRequest accessTokenPostRequest) throws ApiException {
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling accessTokenPost");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/AccessToken/{appKey}"
        .replace("{appKey}", ApiClient.urlEncode(appKey.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json-patch+json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(accessTokenPostRequest);
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
   * 更新令牌
   * 更新现有的用户令牌
   * @param id  (required)
   * @param appKey  (required)
   * @param accessTokenPutRequest  (optional)
   * @return BooleanApiResponse
   * @throws ApiException if fails to make API call
   */
  public BooleanApiResponse accessTokenPut(Long id, String appKey, AccessTokenPutRequest accessTokenPutRequest) throws ApiException {
    ApiResponse<BooleanApiResponse> localVarResponse = accessTokenPutWithHttpInfo(id, appKey, accessTokenPutRequest);
    return localVarResponse.getData();
  }

  /**
   * 更新令牌
   * 更新现有的用户令牌
   * @param id  (required)
   * @param appKey  (required)
   * @param accessTokenPutRequest  (optional)
   * @return ApiResponse&lt;BooleanApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BooleanApiResponse> accessTokenPutWithHttpInfo(Long id, String appKey, AccessTokenPutRequest accessTokenPutRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = accessTokenPutRequestBuilder(id, appKey, accessTokenPutRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("accessTokenPut", localVarResponse);
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

  private HttpRequest.Builder accessTokenPutRequestBuilder(Long id, String appKey, AccessTokenPutRequest accessTokenPutRequest) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling accessTokenPut");
    }
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling accessTokenPut");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/AccessToken/{appKey}/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()))
        .replace("{appKey}", ApiClient.urlEncode(appKey.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json-patch+json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(accessTokenPutRequest);
      localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
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
   * 令牌列表
   * 获取用户令牌列表
   * @param appKey  (required)
   * @param userId  (optional)
   * @param skip  (optional)
   * @param take  (optional)
   * @return AccessTokenListResultApiResponse
   * @throws ApiException if fails to make API call
   */
  public AccessTokenListResultApiResponse accessTokens(String appKey, Long userId, Integer skip, Integer take) throws ApiException {
    ApiResponse<AccessTokenListResultApiResponse> localVarResponse = accessTokensWithHttpInfo(appKey, userId, skip, take);
    return localVarResponse.getData();
  }

  /**
   * 令牌列表
   * 获取用户令牌列表
   * @param appKey  (required)
   * @param userId  (optional)
   * @param skip  (optional)
   * @param take  (optional)
   * @return ApiResponse&lt;AccessTokenListResultApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccessTokenListResultApiResponse> accessTokensWithHttpInfo(String appKey, Long userId, Integer skip, Integer take) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = accessTokensRequestBuilder(appKey, userId, skip, take);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("accessTokens", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<AccessTokenListResultApiResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<AccessTokenListResultApiResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<AccessTokenListResultApiResponse>() {})
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

  private HttpRequest.Builder accessTokensRequestBuilder(String appKey, Long userId, Integer skip, Integer take) throws ApiException {
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling accessTokens");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/AccessToken/{appKey}"
        .replace("{appKey}", ApiClient.urlEncode(appKey.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "userId";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("userId", userId));
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
