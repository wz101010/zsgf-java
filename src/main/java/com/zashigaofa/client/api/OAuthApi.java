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

import com.zashigaofa.client.model.AppUserConsentModelListApiResponse;
import com.zashigaofa.client.model.AuthorizeResultApiResponse;
import com.zashigaofa.client.model.BooleanApiResponse;
import com.zashigaofa.client.model.GrantRequest;
import com.zashigaofa.client.model.GrantResultApiResponse;
import com.zashigaofa.client.model.ProfileResultApiResponse;

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
public class OAuthApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public OAuthApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OAuthApi(ApiClient apiClient) {
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
   * 获取access_token
   * 
   * @param appKey  (required)
   * @param scheme 身份源 (optional)
   * @param code 授权码 (optional)
   * @return AuthorizeResultApiResponse
   * @throws ApiException if fails to make API call
   */
  public AuthorizeResultApiResponse oAuthAuthorize(String appKey, String scheme, String code) throws ApiException {
    ApiResponse<AuthorizeResultApiResponse> localVarResponse = oAuthAuthorizeWithHttpInfo(appKey, scheme, code);
    return localVarResponse.getData();
  }

  /**
   * 获取access_token
   * 
   * @param appKey  (required)
   * @param scheme 身份源 (optional)
   * @param code 授权码 (optional)
   * @return ApiResponse&lt;AuthorizeResultApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AuthorizeResultApiResponse> oAuthAuthorizeWithHttpInfo(String appKey, String scheme, String code) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = oAuthAuthorizeRequestBuilder(appKey, scheme, code);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("oAuthAuthorize", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<AuthorizeResultApiResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<AuthorizeResultApiResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<AuthorizeResultApiResponse>() {})
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

  private HttpRequest.Builder oAuthAuthorizeRequestBuilder(String appKey, String scheme, String code) throws ApiException {
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling oAuthAuthorize");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/OAuth/{appKey}/Authorize"
        .replace("{appKey}", ApiClient.urlEncode(appKey.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "scheme";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("scheme", scheme));
    localVarQueryParameterBaseName = "code";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("code", code));

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

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 授权记录
   * 
   * @param appKey  (required)
   * @return AppUserConsentModelListApiResponse
   * @throws ApiException if fails to make API call
   */
  public AppUserConsentModelListApiResponse oAuthConsents(String appKey) throws ApiException {
    ApiResponse<AppUserConsentModelListApiResponse> localVarResponse = oAuthConsentsWithHttpInfo(appKey);
    return localVarResponse.getData();
  }

  /**
   * 授权记录
   * 
   * @param appKey  (required)
   * @return ApiResponse&lt;AppUserConsentModelListApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AppUserConsentModelListApiResponse> oAuthConsentsWithHttpInfo(String appKey) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = oAuthConsentsRequestBuilder(appKey);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("oAuthConsents", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<AppUserConsentModelListApiResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<AppUserConsentModelListApiResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<AppUserConsentModelListApiResponse>() {})
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

  private HttpRequest.Builder oAuthConsentsRequestBuilder(String appKey) throws ApiException {
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling oAuthConsents");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/OAuth/{appKey}/Consents"
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
   * 删除授权记录
   * 
   * @param id  (required)
   * @param appKey  (required)
   * @return BooleanApiResponse
   * @throws ApiException if fails to make API call
   */
  public BooleanApiResponse oAuthDeleteConsent(Long id, String appKey) throws ApiException {
    ApiResponse<BooleanApiResponse> localVarResponse = oAuthDeleteConsentWithHttpInfo(id, appKey);
    return localVarResponse.getData();
  }

  /**
   * 删除授权记录
   * 
   * @param id  (required)
   * @param appKey  (required)
   * @return ApiResponse&lt;BooleanApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BooleanApiResponse> oAuthDeleteConsentWithHttpInfo(Long id, String appKey) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = oAuthDeleteConsentRequestBuilder(id, appKey);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("oAuthDeleteConsent", localVarResponse);
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

  private HttpRequest.Builder oAuthDeleteConsentRequestBuilder(Long id, String appKey) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling oAuthDeleteConsent");
    }
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling oAuthDeleteConsent");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/OAuth/{appKey}/Consents/{id}"
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
   * 申请授权码
   * 
   * @param appKey  (required)
   * @param scheme 身份源，固定填：app (optional)
   * @param grantRequest 授权详情 (optional)
   * @return GrantResultApiResponse
   * @throws ApiException if fails to make API call
   */
  public GrantResultApiResponse oAuthGrantCode(String appKey, String scheme, GrantRequest grantRequest) throws ApiException {
    ApiResponse<GrantResultApiResponse> localVarResponse = oAuthGrantCodeWithHttpInfo(appKey, scheme, grantRequest);
    return localVarResponse.getData();
  }

  /**
   * 申请授权码
   * 
   * @param appKey  (required)
   * @param scheme 身份源，固定填：app (optional)
   * @param grantRequest 授权详情 (optional)
   * @return ApiResponse&lt;GrantResultApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GrantResultApiResponse> oAuthGrantCodeWithHttpInfo(String appKey, String scheme, GrantRequest grantRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = oAuthGrantCodeRequestBuilder(appKey, scheme, grantRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("oAuthGrantCode", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<GrantResultApiResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<GrantResultApiResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GrantResultApiResponse>() {})
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

  private HttpRequest.Builder oAuthGrantCodeRequestBuilder(String appKey, String scheme, GrantRequest grantRequest) throws ApiException {
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling oAuthGrantCode");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/OAuth/{appKey}/GrantCode"
        .replace("{appKey}", ApiClient.urlEncode(appKey.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "scheme";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("scheme", scheme));

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
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(grantRequest);
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
   * 获取个人资料
   * 
   * @param appKey  (required)
   * @return ProfileResultApiResponse
   * @throws ApiException if fails to make API call
   */
  public ProfileResultApiResponse oAuthProfile(String appKey) throws ApiException {
    ApiResponse<ProfileResultApiResponse> localVarResponse = oAuthProfileWithHttpInfo(appKey);
    return localVarResponse.getData();
  }

  /**
   * 获取个人资料
   * 
   * @param appKey  (required)
   * @return ApiResponse&lt;ProfileResultApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ProfileResultApiResponse> oAuthProfileWithHttpInfo(String appKey) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = oAuthProfileRequestBuilder(appKey);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("oAuthProfile", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<ProfileResultApiResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<ProfileResultApiResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<ProfileResultApiResponse>() {})
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

  private HttpRequest.Builder oAuthProfileRequestBuilder(String appKey) throws ApiException {
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling oAuthProfile");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/OAuth/{appKey}/Profile"
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

}
