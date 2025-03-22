# UserSettingApi

All URIs are relative to *https://api-staging.paomo.fun*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userSetting**](UserSettingApi.md#userSetting) | **GET** /UserSetting/{appKey}/{id} | 用户配置项详情 |
| [**userSettingWithHttpInfo**](UserSettingApi.md#userSettingWithHttpInfo) | **GET** /UserSetting/{appKey}/{id} | 用户配置项详情 |
| [**userSettingDelete**](UserSettingApi.md#userSettingDelete) | **DELETE** /UserSetting/{appKey}/{id} | 删除用户配置项 |
| [**userSettingDeleteWithHttpInfo**](UserSettingApi.md#userSettingDeleteWithHttpInfo) | **DELETE** /UserSetting/{appKey}/{id} | 删除用户配置项 |
| [**userSettingPost**](UserSettingApi.md#userSettingPost) | **POST** /UserSetting/{appKey} | 添加用户配置项 |
| [**userSettingPostWithHttpInfo**](UserSettingApi.md#userSettingPostWithHttpInfo) | **POST** /UserSetting/{appKey} | 添加用户配置项 |
| [**userSettingPut**](UserSettingApi.md#userSettingPut) | **PUT** /UserSetting/{appKey}/{id} | 更新用户配置项 |
| [**userSettingPutWithHttpInfo**](UserSettingApi.md#userSettingPutWithHttpInfo) | **PUT** /UserSetting/{appKey}/{id} | 更新用户配置项 |
| [**userSettings**](UserSettingApi.md#userSettings) | **GET** /UserSetting/{appKey} | 用户配置列表 |
| [**userSettingsWithHttpInfo**](UserSettingApi.md#userSettingsWithHttpInfo) | **GET** /UserSetting/{appKey} | 用户配置列表 |



## userSetting

> JObjectApiResult userSetting(id, appKey)

用户配置项详情

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        Long id = 56L; // Long | 
        String appKey = "appKey_example"; // String | 
        try {
            JObjectApiResult result = apiInstance.userSetting(id, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSettingApi#userSetting");
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

### Return type

[**JObjectApiResult**](JObjectApiResult.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userSettingWithHttpInfo

> ApiResponse<JObjectApiResult> userSetting userSettingWithHttpInfo(id, appKey)

用户配置项详情

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        Long id = 56L; // Long | 
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.userSettingWithHttpInfo(id, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSettingApi#userSetting");
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

### Return type

ApiResponse<[**JObjectApiResult**](JObjectApiResult.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userSettingDelete

> JObjectApiResult userSettingDelete(id, appKey)

删除用户配置项

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        Long id = 56L; // Long | 
        String appKey = "appKey_example"; // String | 
        try {
            JObjectApiResult result = apiInstance.userSettingDelete(id, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSettingApi#userSettingDelete");
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

### Return type

[**JObjectApiResult**](JObjectApiResult.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userSettingDeleteWithHttpInfo

> ApiResponse<JObjectApiResult> userSettingDelete userSettingDeleteWithHttpInfo(id, appKey)

删除用户配置项

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        Long id = 56L; // Long | 
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.userSettingDeleteWithHttpInfo(id, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSettingApi#userSettingDelete");
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

### Return type

ApiResponse<[**JObjectApiResult**](JObjectApiResult.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userSettingPost

> JObjectApiResult userSettingPost(appKey, userSetting)

添加用户配置项

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        UserSetting userSetting = new UserSetting(); // UserSetting | 
        try {
            JObjectApiResult result = apiInstance.userSettingPost(appKey, userSetting);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSettingApi#userSettingPost");
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
| **userSetting** | [**UserSetting**](UserSetting.md)|  | [optional] |

### Return type

[**JObjectApiResult**](JObjectApiResult.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userSettingPostWithHttpInfo

> ApiResponse<JObjectApiResult> userSettingPost userSettingPostWithHttpInfo(appKey, userSetting)

添加用户配置项

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        UserSetting userSetting = new UserSetting(); // UserSetting | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.userSettingPostWithHttpInfo(appKey, userSetting);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSettingApi#userSettingPost");
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
| **userSetting** | [**UserSetting**](UserSetting.md)|  | [optional] |

### Return type

ApiResponse<[**JObjectApiResult**](JObjectApiResult.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userSettingPut

> JObjectApiResult userSettingPut(id, appKey, userSetting)

更新用户配置项

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        Long id = 56L; // Long | 
        String appKey = "appKey_example"; // String | 
        UserSetting userSetting = new UserSetting(); // UserSetting | 
        try {
            JObjectApiResult result = apiInstance.userSettingPut(id, appKey, userSetting);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSettingApi#userSettingPut");
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
| **userSetting** | [**UserSetting**](UserSetting.md)|  | [optional] |

### Return type

[**JObjectApiResult**](JObjectApiResult.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userSettingPutWithHttpInfo

> ApiResponse<JObjectApiResult> userSettingPut userSettingPutWithHttpInfo(id, appKey, userSetting)

更新用户配置项

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        Long id = 56L; // Long | 
        String appKey = "appKey_example"; // String | 
        UserSetting userSetting = new UserSetting(); // UserSetting | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.userSettingPutWithHttpInfo(id, appKey, userSetting);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSettingApi#userSettingPut");
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
| **userSetting** | [**UserSetting**](UserSetting.md)|  | [optional] |

### Return type

ApiResponse<[**JObjectApiResult**](JObjectApiResult.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userSettings

> JObjectApiResult userSettings(appKey, userId, code, tag)

用户配置列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Long userId = 56L; // Long | 
        String code = "code_example"; // String | 
        String tag = "tag_example"; // String | 
        try {
            JObjectApiResult result = apiInstance.userSettings(appKey, userId, code, tag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSettingApi#userSettings");
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
| **userId** | **Long**|  | [optional] |
| **code** | **String**|  | [optional] |
| **tag** | **String**|  | [optional] |

### Return type

[**JObjectApiResult**](JObjectApiResult.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userSettingsWithHttpInfo

> ApiResponse<JObjectApiResult> userSettings userSettingsWithHttpInfo(appKey, userId, code, tag)

用户配置列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Long userId = 56L; // Long | 
        String code = "code_example"; // String | 
        String tag = "tag_example"; // String | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.userSettingsWithHttpInfo(appKey, userId, code, tag);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSettingApi#userSettings");
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
| **userId** | **Long**|  | [optional] |
| **code** | **String**|  | [optional] |
| **tag** | **String**|  | [optional] |

### Return type

ApiResponse<[**JObjectApiResult**](JObjectApiResult.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

