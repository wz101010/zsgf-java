# AccessTokenApi

All URIs are relative to *https://api-dev.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accessTokenDelete**](AccessTokenApi.md#accessTokenDelete) | **DELETE** /AccessToken/{appKey}/{id} | 删除令牌 |
| [**accessTokenDeleteWithHttpInfo**](AccessTokenApi.md#accessTokenDeleteWithHttpInfo) | **DELETE** /AccessToken/{appKey}/{id} | 删除令牌 |
| [**accessTokenPost**](AccessTokenApi.md#accessTokenPost) | **POST** /AccessToken/{appKey} | 创建令牌 |
| [**accessTokenPostWithHttpInfo**](AccessTokenApi.md#accessTokenPostWithHttpInfo) | **POST** /AccessToken/{appKey} | 创建令牌 |
| [**accessTokenPut**](AccessTokenApi.md#accessTokenPut) | **PUT** /AccessToken/{appKey}/{id} | 更新令牌 |
| [**accessTokenPutWithHttpInfo**](AccessTokenApi.md#accessTokenPutWithHttpInfo) | **PUT** /AccessToken/{appKey}/{id} | 更新令牌 |
| [**accessTokens**](AccessTokenApi.md#accessTokens) | **GET** /AccessToken/{appKey} | 令牌列表 |
| [**accessTokensWithHttpInfo**](AccessTokenApi.md#accessTokensWithHttpInfo) | **GET** /AccessToken/{appKey} | 令牌列表 |



## accessTokenDelete

> BooleanApiResponse accessTokenDelete(id, appKey, userId)

删除令牌

删除用户令牌

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AccessTokenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AccessTokenApi apiInstance = new AccessTokenApi(defaultClient);
        Long id = 56L; // Long | 
        String appKey = "appKey_example"; // String | 
        String userId = "userId_example"; // String | 
        try {
            BooleanApiResponse result = apiInstance.accessTokenDelete(id, appKey, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokenApi#accessTokenDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |
| **appKey** | **String**|  | |
| **userId** | **String**|  | [optional] |

### Return type

[**BooleanApiResponse**](BooleanApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## accessTokenDeleteWithHttpInfo

> ApiResponse<BooleanApiResponse> accessTokenDelete accessTokenDeleteWithHttpInfo(id, appKey, userId)

删除令牌

删除用户令牌

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AccessTokenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AccessTokenApi apiInstance = new AccessTokenApi(defaultClient);
        Long id = 56L; // Long | 
        String appKey = "appKey_example"; // String | 
        String userId = "userId_example"; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.accessTokenDeleteWithHttpInfo(id, appKey, userId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokenApi#accessTokenDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |
| **appKey** | **String**|  | |
| **userId** | **String**|  | [optional] |

### Return type

ApiResponse<[**BooleanApiResponse**](BooleanApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## accessTokenPost

> TokenModelApiResponse accessTokenPost(appKey, userId, accessTokenPostRequest)

创建令牌

创建新的用户令牌

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AccessTokenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AccessTokenApi apiInstance = new AccessTokenApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String userId = "userId_example"; // String | 
        AccessTokenPostRequest accessTokenPostRequest = new AccessTokenPostRequest(); // AccessTokenPostRequest | 
        try {
            TokenModelApiResponse result = apiInstance.accessTokenPost(appKey, userId, accessTokenPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokenApi#accessTokenPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appKey** | **String**|  | |
| **userId** | **String**|  | [optional] |
| **accessTokenPostRequest** | [**AccessTokenPostRequest**](AccessTokenPostRequest.md)|  | [optional] |

### Return type

[**TokenModelApiResponse**](TokenModelApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## accessTokenPostWithHttpInfo

> ApiResponse<TokenModelApiResponse> accessTokenPost accessTokenPostWithHttpInfo(appKey, userId, accessTokenPostRequest)

创建令牌

创建新的用户令牌

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AccessTokenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AccessTokenApi apiInstance = new AccessTokenApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String userId = "userId_example"; // String | 
        AccessTokenPostRequest accessTokenPostRequest = new AccessTokenPostRequest(); // AccessTokenPostRequest | 
        try {
            ApiResponse<TokenModelApiResponse> response = apiInstance.accessTokenPostWithHttpInfo(appKey, userId, accessTokenPostRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokenApi#accessTokenPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appKey** | **String**|  | |
| **userId** | **String**|  | [optional] |
| **accessTokenPostRequest** | [**AccessTokenPostRequest**](AccessTokenPostRequest.md)|  | [optional] |

### Return type

ApiResponse<[**TokenModelApiResponse**](TokenModelApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## accessTokenPut

> BooleanApiResponse accessTokenPut(id, appKey, userId, accessTokenPutRequest)

更新令牌

更新现有的用户令牌

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AccessTokenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AccessTokenApi apiInstance = new AccessTokenApi(defaultClient);
        Long id = 56L; // Long | 
        String appKey = "appKey_example"; // String | 
        String userId = "userId_example"; // String | 
        AccessTokenPutRequest accessTokenPutRequest = new AccessTokenPutRequest(); // AccessTokenPutRequest | 
        try {
            BooleanApiResponse result = apiInstance.accessTokenPut(id, appKey, userId, accessTokenPutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokenApi#accessTokenPut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |
| **appKey** | **String**|  | |
| **userId** | **String**|  | [optional] |
| **accessTokenPutRequest** | [**AccessTokenPutRequest**](AccessTokenPutRequest.md)|  | [optional] |

### Return type

[**BooleanApiResponse**](BooleanApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## accessTokenPutWithHttpInfo

> ApiResponse<BooleanApiResponse> accessTokenPut accessTokenPutWithHttpInfo(id, appKey, userId, accessTokenPutRequest)

更新令牌

更新现有的用户令牌

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AccessTokenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AccessTokenApi apiInstance = new AccessTokenApi(defaultClient);
        Long id = 56L; // Long | 
        String appKey = "appKey_example"; // String | 
        String userId = "userId_example"; // String | 
        AccessTokenPutRequest accessTokenPutRequest = new AccessTokenPutRequest(); // AccessTokenPutRequest | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.accessTokenPutWithHttpInfo(id, appKey, userId, accessTokenPutRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokenApi#accessTokenPut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | |
| **appKey** | **String**|  | |
| **userId** | **String**|  | [optional] |
| **accessTokenPutRequest** | [**AccessTokenPutRequest**](AccessTokenPutRequest.md)|  | [optional] |

### Return type

ApiResponse<[**BooleanApiResponse**](BooleanApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## accessTokens

> AccessTokenListResultApiResponse accessTokens(appKey, skip, take, userId)

令牌列表

获取用户令牌列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AccessTokenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AccessTokenApi apiInstance = new AccessTokenApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Integer skip = 56; // Integer | 
        Integer take = 56; // Integer | 
        String userId = "userId_example"; // String | 
        try {
            AccessTokenListResultApiResponse result = apiInstance.accessTokens(appKey, skip, take, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokenApi#accessTokens");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appKey** | **String**|  | |
| **skip** | **Integer**|  | [optional] |
| **take** | **Integer**|  | [optional] |
| **userId** | **String**|  | [optional] |

### Return type

[**AccessTokenListResultApiResponse**](AccessTokenListResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## accessTokensWithHttpInfo

> ApiResponse<AccessTokenListResultApiResponse> accessTokens accessTokensWithHttpInfo(appKey, skip, take, userId)

令牌列表

获取用户令牌列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AccessTokenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AccessTokenApi apiInstance = new AccessTokenApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Integer skip = 56; // Integer | 
        Integer take = 56; // Integer | 
        String userId = "userId_example"; // String | 
        try {
            ApiResponse<AccessTokenListResultApiResponse> response = apiInstance.accessTokensWithHttpInfo(appKey, skip, take, userId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokenApi#accessTokens");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appKey** | **String**|  | |
| **skip** | **Integer**|  | [optional] |
| **take** | **Integer**|  | [optional] |
| **userId** | **String**|  | [optional] |

### Return type

ApiResponse<[**AccessTokenListResultApiResponse**](AccessTokenListResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

