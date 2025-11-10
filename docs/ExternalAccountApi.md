# ExternalAccountApi

All URIs are relative to *https://api-dev.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**externalAccountSignIn**](ExternalAccountApi.md#externalAccountSignIn) | **POST** /ExternalAccount/{appKey}/SignIn | 外部账号登录 |
| [**externalAccountSignInWithHttpInfo**](ExternalAccountApi.md#externalAccountSignInWithHttpInfo) | **POST** /ExternalAccount/{appKey}/SignIn | 外部账号登录 |
| [**userExternalAccountBind**](ExternalAccountApi.md#userExternalAccountBind) | **POST** /ExternalAccount/{appKey} | 绑定外部账号 |
| [**userExternalAccountBindWithHttpInfo**](ExternalAccountApi.md#userExternalAccountBindWithHttpInfo) | **POST** /ExternalAccount/{appKey} | 绑定外部账号 |
| [**userOAuthAccounts**](ExternalAccountApi.md#userOAuthAccounts) | **GET** /ExternalAccount/{appKey} | 外部账号列表 |
| [**userOAuthAccountsWithHttpInfo**](ExternalAccountApi.md#userOAuthAccountsWithHttpInfo) | **GET** /ExternalAccount/{appKey} | 外部账号列表 |
| [**userOAuthAccountsPutBind**](ExternalAccountApi.md#userOAuthAccountsPutBind) | **PUT** /ExternalAccount/{appKey}/{id} | 更新绑定账号 |
| [**userOAuthAccountsPutBindWithHttpInfo**](ExternalAccountApi.md#userOAuthAccountsPutBindWithHttpInfo) | **PUT** /ExternalAccount/{appKey}/{id} | 更新绑定账号 |
| [**userOAuthAccountsUnBind**](ExternalAccountApi.md#userOAuthAccountsUnBind) | **DELETE** /ExternalAccount/{appKey}/{id} | 删除绑定账号 |
| [**userOAuthAccountsUnBindWithHttpInfo**](ExternalAccountApi.md#userOAuthAccountsUnBindWithHttpInfo) | **DELETE** /ExternalAccount/{appKey}/{id} | 删除绑定账号 |



## externalAccountSignIn

> TokenModelApiResponse externalAccountSignIn(appKey, userId, externalAccountSignInRequest)

外部账号登录

使用外部账号登录应用

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ExternalAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ExternalAccountApi apiInstance = new ExternalAccountApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String userId = "userId_example"; // String | 
        ExternalAccountSignInRequest externalAccountSignInRequest = new ExternalAccountSignInRequest(); // ExternalAccountSignInRequest | 登录请求参数
        try {
            TokenModelApiResponse result = apiInstance.externalAccountSignIn(appKey, userId, externalAccountSignInRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalAccountApi#externalAccountSignIn");
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
| **externalAccountSignInRequest** | [**ExternalAccountSignInRequest**](ExternalAccountSignInRequest.md)| 登录请求参数 | [optional] |

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

## externalAccountSignInWithHttpInfo

> ApiResponse<TokenModelApiResponse> externalAccountSignIn externalAccountSignInWithHttpInfo(appKey, userId, externalAccountSignInRequest)

外部账号登录

使用外部账号登录应用

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ExternalAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ExternalAccountApi apiInstance = new ExternalAccountApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String userId = "userId_example"; // String | 
        ExternalAccountSignInRequest externalAccountSignInRequest = new ExternalAccountSignInRequest(); // ExternalAccountSignInRequest | 登录请求参数
        try {
            ApiResponse<TokenModelApiResponse> response = apiInstance.externalAccountSignInWithHttpInfo(appKey, userId, externalAccountSignInRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalAccountApi#externalAccountSignIn");
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
| **externalAccountSignInRequest** | [**ExternalAccountSignInRequest**](ExternalAccountSignInRequest.md)| 登录请求参数 | [optional] |

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


## userExternalAccountBind

> BooleanApiResponse userExternalAccountBind(appKey, userId, externalAccountBindRequest)

绑定外部账号

绑定外部账号，如果已存在绑定则直接返回成功

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ExternalAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ExternalAccountApi apiInstance = new ExternalAccountApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String userId = "userId_example"; // String | 
        ExternalAccountBindRequest externalAccountBindRequest = new ExternalAccountBindRequest(); // ExternalAccountBindRequest | 绑定请求参数
        try {
            BooleanApiResponse result = apiInstance.userExternalAccountBind(appKey, userId, externalAccountBindRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalAccountApi#userExternalAccountBind");
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
| **externalAccountBindRequest** | [**ExternalAccountBindRequest**](ExternalAccountBindRequest.md)| 绑定请求参数 | [optional] |

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

## userExternalAccountBindWithHttpInfo

> ApiResponse<BooleanApiResponse> userExternalAccountBind userExternalAccountBindWithHttpInfo(appKey, userId, externalAccountBindRequest)

绑定外部账号

绑定外部账号，如果已存在绑定则直接返回成功

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ExternalAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ExternalAccountApi apiInstance = new ExternalAccountApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String userId = "userId_example"; // String | 
        ExternalAccountBindRequest externalAccountBindRequest = new ExternalAccountBindRequest(); // ExternalAccountBindRequest | 绑定请求参数
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userExternalAccountBindWithHttpInfo(appKey, userId, externalAccountBindRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalAccountApi#userExternalAccountBind");
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
| **externalAccountBindRequest** | [**ExternalAccountBindRequest**](ExternalAccountBindRequest.md)| 绑定请求参数 | [optional] |

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


## userOAuthAccounts

> UserLoginsListApiResponse userOAuthAccounts(appKey, userId)

外部账号列表

获取绑定成功的外部账号列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ExternalAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ExternalAccountApi apiInstance = new ExternalAccountApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String userId = "userId_example"; // String | 
        try {
            UserLoginsListApiResponse result = apiInstance.userOAuthAccounts(appKey, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalAccountApi#userOAuthAccounts");
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

### Return type

[**UserLoginsListApiResponse**](UserLoginsListApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userOAuthAccountsWithHttpInfo

> ApiResponse<UserLoginsListApiResponse> userOAuthAccounts userOAuthAccountsWithHttpInfo(appKey, userId)

外部账号列表

获取绑定成功的外部账号列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ExternalAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ExternalAccountApi apiInstance = new ExternalAccountApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String userId = "userId_example"; // String | 
        try {
            ApiResponse<UserLoginsListApiResponse> response = apiInstance.userOAuthAccountsWithHttpInfo(appKey, userId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalAccountApi#userOAuthAccounts");
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

### Return type

ApiResponse<[**UserLoginsListApiResponse**](UserLoginsListApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userOAuthAccountsPutBind

> BooleanApiResponse userOAuthAccountsPutBind(id, appKey, userId, externalAccountPutRequest)

更新绑定账号

更新绑定的账号信息

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ExternalAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ExternalAccountApi apiInstance = new ExternalAccountApi(defaultClient);
        Long id = 56L; // Long | 绑定ID
        String appKey = "appKey_example"; // String | 
        String userId = "userId_example"; // String | 
        ExternalAccountPutRequest externalAccountPutRequest = new ExternalAccountPutRequest(); // ExternalAccountPutRequest | 更新请求参数
        try {
            BooleanApiResponse result = apiInstance.userOAuthAccountsPutBind(id, appKey, userId, externalAccountPutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalAccountApi#userOAuthAccountsPutBind");
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
| **id** | **Long**| 绑定ID | |
| **appKey** | **String**|  | |
| **userId** | **String**|  | [optional] |
| **externalAccountPutRequest** | [**ExternalAccountPutRequest**](ExternalAccountPutRequest.md)| 更新请求参数 | [optional] |

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

## userOAuthAccountsPutBindWithHttpInfo

> ApiResponse<BooleanApiResponse> userOAuthAccountsPutBind userOAuthAccountsPutBindWithHttpInfo(id, appKey, userId, externalAccountPutRequest)

更新绑定账号

更新绑定的账号信息

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ExternalAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ExternalAccountApi apiInstance = new ExternalAccountApi(defaultClient);
        Long id = 56L; // Long | 绑定ID
        String appKey = "appKey_example"; // String | 
        String userId = "userId_example"; // String | 
        ExternalAccountPutRequest externalAccountPutRequest = new ExternalAccountPutRequest(); // ExternalAccountPutRequest | 更新请求参数
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userOAuthAccountsPutBindWithHttpInfo(id, appKey, userId, externalAccountPutRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalAccountApi#userOAuthAccountsPutBind");
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
| **id** | **Long**| 绑定ID | |
| **appKey** | **String**|  | |
| **userId** | **String**|  | [optional] |
| **externalAccountPutRequest** | [**ExternalAccountPutRequest**](ExternalAccountPutRequest.md)| 更新请求参数 | [optional] |

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


## userOAuthAccountsUnBind

> BooleanApiResponse userOAuthAccountsUnBind(id, appKey, userId)

删除绑定账号

删除绑定的外部账号

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ExternalAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ExternalAccountApi apiInstance = new ExternalAccountApi(defaultClient);
        Long id = 56L; // Long | 绑定ID
        String appKey = "appKey_example"; // String | 
        String userId = "userId_example"; // String | 
        try {
            BooleanApiResponse result = apiInstance.userOAuthAccountsUnBind(id, appKey, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalAccountApi#userOAuthAccountsUnBind");
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
| **id** | **Long**| 绑定ID | |
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

## userOAuthAccountsUnBindWithHttpInfo

> ApiResponse<BooleanApiResponse> userOAuthAccountsUnBind userOAuthAccountsUnBindWithHttpInfo(id, appKey, userId)

删除绑定账号

删除绑定的外部账号

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ExternalAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ExternalAccountApi apiInstance = new ExternalAccountApi(defaultClient);
        Long id = 56L; // Long | 绑定ID
        String appKey = "appKey_example"; // String | 
        String userId = "userId_example"; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userOAuthAccountsUnBindWithHttpInfo(id, appKey, userId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalAccountApi#userOAuthAccountsUnBind");
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
| **id** | **Long**| 绑定ID | |
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

