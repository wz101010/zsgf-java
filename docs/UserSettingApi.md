# UserSettingApi

All URIs are relative to *https://api.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userSetting**](UserSettingApi.md#userSetting) | **GET** /UserSetting/{appKey}/{id} | 获取用户配置项详情 |
| [**userSettingWithHttpInfo**](UserSettingApi.md#userSettingWithHttpInfo) | **GET** /UserSetting/{appKey}/{id} | 获取用户配置项详情 |
| [**userSettingDelete**](UserSettingApi.md#userSettingDelete) | **DELETE** /UserSetting/{appKey}/{id} | 删除用户配置项 |
| [**userSettingDeleteWithHttpInfo**](UserSettingApi.md#userSettingDeleteWithHttpInfo) | **DELETE** /UserSetting/{appKey}/{id} | 删除用户配置项 |
| [**userSettingPost**](UserSettingApi.md#userSettingPost) | **POST** /UserSetting/{appKey} | 添加用户配置项 |
| [**userSettingPostWithHttpInfo**](UserSettingApi.md#userSettingPostWithHttpInfo) | **POST** /UserSetting/{appKey} | 添加用户配置项 |
| [**userSettingPut**](UserSettingApi.md#userSettingPut) | **PUT** /UserSetting/{appKey}/{id} | 更新用户配置项 |
| [**userSettingPutWithHttpInfo**](UserSettingApi.md#userSettingPutWithHttpInfo) | **PUT** /UserSetting/{appKey}/{id} | 更新用户配置项 |
| [**userSettings**](UserSettingApi.md#userSettings) | **GET** /UserSetting/{appKey} | 获取用户配置列表 |
| [**userSettingsWithHttpInfo**](UserSettingApi.md#userSettingsWithHttpInfo) | **GET** /UserSetting/{appKey} | 获取用户配置列表 |



## userSetting

> UserSettingApiResponse userSetting(id, appKey)

获取用户配置项详情

根据配置项ID获取用户配置项详情

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        Long id = 56L; // Long | 配置项ID
        String appKey = "appKey_example"; // String | 
        try {
            UserSettingApiResponse result = apiInstance.userSetting(id, appKey);
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
| **id** | **Long**| 配置项ID | |
| **appKey** | **String**|  | |

### Return type

[**UserSettingApiResponse**](UserSettingApiResponse.md)


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

> ApiResponse<UserSettingApiResponse> userSetting userSettingWithHttpInfo(id, appKey)

获取用户配置项详情

根据配置项ID获取用户配置项详情

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        Long id = 56L; // Long | 配置项ID
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<UserSettingApiResponse> response = apiInstance.userSettingWithHttpInfo(id, appKey);
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
| **id** | **Long**| 配置项ID | |
| **appKey** | **String**|  | |

### Return type

ApiResponse<[**UserSettingApiResponse**](UserSettingApiResponse.md)>


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

> BooleanApiResponse userSettingDelete(id, appKey)

删除用户配置项

根据配置项ID删除用户配置项

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        Long id = 56L; // Long | 配置项ID
        String appKey = "appKey_example"; // String | 
        try {
            BooleanApiResponse result = apiInstance.userSettingDelete(id, appKey);
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
| **id** | **Long**| 配置项ID | |
| **appKey** | **String**|  | |

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

## userSettingDeleteWithHttpInfo

> ApiResponse<BooleanApiResponse> userSettingDelete userSettingDeleteWithHttpInfo(id, appKey)

删除用户配置项

根据配置项ID删除用户配置项

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        Long id = 56L; // Long | 配置项ID
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userSettingDeleteWithHttpInfo(id, appKey);
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
| **id** | **Long**| 配置项ID | |
| **appKey** | **String**|  | |

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


## userSettingPost

> UserSettingPostResultApiResponse userSettingPost(appKey, userSetting)

添加用户配置项

添加新的用户配置项

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        UserSetting userSetting = new UserSetting(); // UserSetting | 配置项内容
        try {
            UserSettingPostResultApiResponse result = apiInstance.userSettingPost(appKey, userSetting);
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
| **userSetting** | [**UserSetting**](UserSetting.md)| 配置项内容 | [optional] |

### Return type

[**UserSettingPostResultApiResponse**](UserSettingPostResultApiResponse.md)


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

> ApiResponse<UserSettingPostResultApiResponse> userSettingPost userSettingPostWithHttpInfo(appKey, userSetting)

添加用户配置项

添加新的用户配置项

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        UserSetting userSetting = new UserSetting(); // UserSetting | 配置项内容
        try {
            ApiResponse<UserSettingPostResultApiResponse> response = apiInstance.userSettingPostWithHttpInfo(appKey, userSetting);
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
| **userSetting** | [**UserSetting**](UserSetting.md)| 配置项内容 | [optional] |

### Return type

ApiResponse<[**UserSettingPostResultApiResponse**](UserSettingPostResultApiResponse.md)>


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

> BooleanApiResponse userSettingPut(id, appKey, userSetting)

更新用户配置项

根据配置项ID更新用户配置项内容

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        Long id = 56L; // Long | 配置项ID
        String appKey = "appKey_example"; // String | 
        UserSetting userSetting = new UserSetting(); // UserSetting | 配置项内容
        try {
            BooleanApiResponse result = apiInstance.userSettingPut(id, appKey, userSetting);
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
| **id** | **Long**| 配置项ID | |
| **appKey** | **String**|  | |
| **userSetting** | [**UserSetting**](UserSetting.md)| 配置项内容 | [optional] |

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

## userSettingPutWithHttpInfo

> ApiResponse<BooleanApiResponse> userSettingPut userSettingPutWithHttpInfo(id, appKey, userSetting)

更新用户配置项

根据配置项ID更新用户配置项内容

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        Long id = 56L; // Long | 配置项ID
        String appKey = "appKey_example"; // String | 
        UserSetting userSetting = new UserSetting(); // UserSetting | 配置项内容
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userSettingPutWithHttpInfo(id, appKey, userSetting);
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
| **id** | **Long**| 配置项ID | |
| **appKey** | **String**|  | |
| **userSetting** | [**UserSetting**](UserSetting.md)| 配置项内容 | [optional] |

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


## userSettings

> UserSettingListApiResponse userSettings(appKey, userId, code, tag)

获取用户配置列表

根据用户ID、配置项代码和标签获取用户配置列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Long userId = 56L; // Long | 用户ID
        String code = "code_example"; // String | 配置项代码
        String tag = "tag_example"; // String | 配置项标签
        try {
            UserSettingListApiResponse result = apiInstance.userSettings(appKey, userId, code, tag);
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
| **userId** | **Long**| 用户ID | [optional] |
| **code** | **String**| 配置项代码 | [optional] |
| **tag** | **String**| 配置项标签 | [optional] |

### Return type

[**UserSettingListApiResponse**](UserSettingListApiResponse.md)


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

> ApiResponse<UserSettingListApiResponse> userSettings userSettingsWithHttpInfo(appKey, userId, code, tag)

获取用户配置列表

根据用户ID、配置项代码和标签获取用户配置列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserSettingApi apiInstance = new UserSettingApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Long userId = 56L; // Long | 用户ID
        String code = "code_example"; // String | 配置项代码
        String tag = "tag_example"; // String | 配置项标签
        try {
            ApiResponse<UserSettingListApiResponse> response = apiInstance.userSettingsWithHttpInfo(appKey, userId, code, tag);
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
| **userId** | **Long**| 用户ID | [optional] |
| **code** | **String**| 配置项代码 | [optional] |
| **tag** | **String**| 配置项标签 | [optional] |

### Return type

ApiResponse<[**UserSettingListApiResponse**](UserSettingListApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

