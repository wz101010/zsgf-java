# AppApi

All URIs are relative to *https://api.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**app**](AppApi.md#app) | **GET** /App/{appKey} | 应用详情 |
| [**appWithHttpInfo**](AppApi.md#appWithHttpInfo) | **GET** /App/{appKey} | 应用详情 |
| [**app2FA**](AppApi.md#app2FA) | **GET** /App/{appKey}/2FA | 双因素验证 获取 |
| [**app2FAWithHttpInfo**](AppApi.md#app2FAWithHttpInfo) | **GET** /App/{appKey}/2FA | 双因素验证 获取 |
| [**app2FACheck**](AppApi.md#app2FACheck) | **GET** /App/{appKey}/2FACheck | 双因素验证 验证 |
| [**app2FACheckWithHttpInfo**](AppApi.md#app2FACheckWithHttpInfo) | **GET** /App/{appKey}/2FACheck | 双因素验证 验证 |
| [**appCheckVersion**](AppApi.md#appCheckVersion) | **GET** /App/{appKey}/CheckVersion | 更新应用数据库 |
| [**appCheckVersionWithHttpInfo**](AppApi.md#appCheckVersionWithHttpInfo) | **GET** /App/{appKey}/CheckVersion | 更新应用数据库 |
| [**appDelete**](AppApi.md#appDelete) | **DELETE** /App/{appKey} | 删除应用 |
| [**appDeleteWithHttpInfo**](AppApi.md#appDeleteWithHttpInfo) | **DELETE** /App/{appKey} | 删除应用 |
| [**appInfo**](AppApi.md#appInfo) | **GET** /App/{appKey}/Info | 应用详情 |
| [**appInfoWithHttpInfo**](AppApi.md#appInfoWithHttpInfo) | **GET** /App/{appKey}/Info | 应用详情 |
| [**appPost**](AppApi.md#appPost) | **POST** /App | 创建应用 |
| [**appPostWithHttpInfo**](AppApi.md#appPostWithHttpInfo) | **POST** /App | 创建应用 |
| [**appPut**](AppApi.md#appPut) | **PUT** /App/{appKey} | 更新应用 |
| [**appPutWithHttpInfo**](AppApi.md#appPutWithHttpInfo) | **PUT** /App/{appKey} | 更新应用 |
| [**appTransfer**](AppApi.md#appTransfer) | **GET** /App/{appKey}/Transfer | 转移应用 |
| [**appTransferWithHttpInfo**](AppApi.md#appTransferWithHttpInfo) | **GET** /App/{appKey}/Transfer | 转移应用 |
| [**apps**](AppApi.md#apps) | **GET** /App | 应用列表 |
| [**appsWithHttpInfo**](AppApi.md#appsWithHttpInfo) | **GET** /App | 应用列表 |



## app

> AppApiResponse app(appKey)

应用详情

根据应用Key获取应用的详细信息。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            AppApiResponse result = apiInstance.app(appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#app");
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

### Return type

[**AppApiResponse**](AppApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## appWithHttpInfo

> ApiResponse<AppApiResponse> app appWithHttpInfo(appKey)

应用详情

根据应用Key获取应用的详细信息。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<AppApiResponse> response = apiInstance.appWithHttpInfo(appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#app");
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

### Return type

ApiResponse<[**AppApiResponse**](AppApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## app2FA

> SetupCodeApiResponse app2FA(appKey)

双因素验证 获取

获取应用的双因素验证信息。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            SetupCodeApiResponse result = apiInstance.app2FA(appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#app2FA");
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

### Return type

[**SetupCodeApiResponse**](SetupCodeApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## app2FAWithHttpInfo

> ApiResponse<SetupCodeApiResponse> app2FA app2FAWithHttpInfo(appKey)

双因素验证 获取

获取应用的双因素验证信息。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<SetupCodeApiResponse> response = apiInstance.app2FAWithHttpInfo(appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#app2FA");
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

### Return type

ApiResponse<[**SetupCodeApiResponse**](SetupCodeApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## app2FACheck

> BooleanApiResponse app2FACheck(appKey, code)

双因素验证 验证

验证应用的双因素验证代码。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String code = "code_example"; // String | 双因素验证代码
        try {
            BooleanApiResponse result = apiInstance.app2FACheck(appKey, code);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#app2FACheck");
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
| **code** | **String**| 双因素验证代码 | [optional] |

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

## app2FACheckWithHttpInfo

> ApiResponse<BooleanApiResponse> app2FACheck app2FACheckWithHttpInfo(appKey, code)

双因素验证 验证

验证应用的双因素验证代码。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String code = "code_example"; // String | 双因素验证代码
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.app2FACheckWithHttpInfo(appKey, code);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#app2FACheck");
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
| **code** | **String**| 双因素验证代码 | [optional] |

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


## appCheckVersion

> AppCheckVersionResultApiResponse appCheckVersion(appKey, checkOnly)

更新应用数据库

检查应用数据库的版本，如果有未应用的迁移且checkOnly为false，则应用这些迁移。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Boolean checkOnly = true; // Boolean | 是否仅检查版本
        try {
            AppCheckVersionResultApiResponse result = apiInstance.appCheckVersion(appKey, checkOnly);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#appCheckVersion");
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
| **checkOnly** | **Boolean**| 是否仅检查版本 | [optional] [default to true] |

### Return type

[**AppCheckVersionResultApiResponse**](AppCheckVersionResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## appCheckVersionWithHttpInfo

> ApiResponse<AppCheckVersionResultApiResponse> appCheckVersion appCheckVersionWithHttpInfo(appKey, checkOnly)

更新应用数据库

检查应用数据库的版本，如果有未应用的迁移且checkOnly为false，则应用这些迁移。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Boolean checkOnly = true; // Boolean | 是否仅检查版本
        try {
            ApiResponse<AppCheckVersionResultApiResponse> response = apiInstance.appCheckVersionWithHttpInfo(appKey, checkOnly);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#appCheckVersion");
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
| **checkOnly** | **Boolean**| 是否仅检查版本 | [optional] [default to true] |

### Return type

ApiResponse<[**AppCheckVersionResultApiResponse**](AppCheckVersionResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## appDelete

> BooleanApiResponse appDelete(appKey)

删除应用

根据应用Key删除应用。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            BooleanApiResponse result = apiInstance.appDelete(appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#appDelete");
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

## appDeleteWithHttpInfo

> ApiResponse<BooleanApiResponse> appDelete appDeleteWithHttpInfo(appKey)

删除应用

根据应用Key删除应用。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.appDeleteWithHttpInfo(appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#appDelete");
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


## appInfo

> AppInfoResultApiResponse appInfo(appKey, propCode)

应用详情

根据应用Key获取应用的详细信息和属性。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String propCode = "propCode_example"; // String | 属性代码
        try {
            AppInfoResultApiResponse result = apiInstance.appInfo(appKey, propCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#appInfo");
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
| **propCode** | **String**| 属性代码 | [optional] |

### Return type

[**AppInfoResultApiResponse**](AppInfoResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## appInfoWithHttpInfo

> ApiResponse<AppInfoResultApiResponse> appInfo appInfoWithHttpInfo(appKey, propCode)

应用详情

根据应用Key获取应用的详细信息和属性。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String propCode = "propCode_example"; // String | 属性代码
        try {
            ApiResponse<AppInfoResultApiResponse> response = apiInstance.appInfoWithHttpInfo(appKey, propCode);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#appInfo");
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
| **propCode** | **String**| 属性代码 | [optional] |

### Return type

ApiResponse<[**AppInfoResultApiResponse**](AppInfoResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## appPost

> AppPostResultApiResponse appPost(app)

创建应用

创建一个新的应用。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        App app = new App(); // App | 应用对象
        try {
            AppPostResultApiResponse result = apiInstance.appPost(app);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#appPost");
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
| **app** | [**App**](App.md)| 应用对象 | [optional] |

### Return type

[**AppPostResultApiResponse**](AppPostResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## appPostWithHttpInfo

> ApiResponse<AppPostResultApiResponse> appPost appPostWithHttpInfo(app)

创建应用

创建一个新的应用。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        App app = new App(); // App | 应用对象
        try {
            ApiResponse<AppPostResultApiResponse> response = apiInstance.appPostWithHttpInfo(app);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#appPost");
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
| **app** | [**App**](App.md)| 应用对象 | [optional] |

### Return type

ApiResponse<[**AppPostResultApiResponse**](AppPostResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## appPut

> BooleanApiResponse appPut(appKey, app)

更新应用

根据应用Key更新应用信息。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        App app = new App(); // App | 应用对象
        try {
            BooleanApiResponse result = apiInstance.appPut(appKey, app);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#appPut");
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
| **app** | [**App**](App.md)| 应用对象 | [optional] |

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

## appPutWithHttpInfo

> ApiResponse<BooleanApiResponse> appPut appPutWithHttpInfo(appKey, app)

更新应用

根据应用Key更新应用信息。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        App app = new App(); // App | 应用对象
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.appPutWithHttpInfo(appKey, app);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#appPut");
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
| **app** | [**App**](App.md)| 应用对象 | [optional] |

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


## appTransfer

> AppApiResponse appTransfer(appKey, projectId)

转移应用

将应用转移到另一个项目。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Long projectId = 56L; // Long | 目标项目ID
        try {
            AppApiResponse result = apiInstance.appTransfer(appKey, projectId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#appTransfer");
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
| **projectId** | **Long**| 目标项目ID | [optional] |

### Return type

[**AppApiResponse**](AppApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## appTransferWithHttpInfo

> ApiResponse<AppApiResponse> appTransfer appTransferWithHttpInfo(appKey, projectId)

转移应用

将应用转移到另一个项目。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Long projectId = 56L; // Long | 目标项目ID
        try {
            ApiResponse<AppApiResponse> response = apiInstance.appTransferWithHttpInfo(appKey, projectId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#appTransfer");
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
| **projectId** | **Long**| 目标项目ID | [optional] |

### Return type

ApiResponse<[**AppApiResponse**](AppApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## apps

> AppListResultApiResponse apps(projectId, skip, take)

应用列表

根据项目ID获取应用列表，支持分页。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        Long projectId = 56L; // Long | 项目ID
        Integer skip = 56; // Integer | 跳过的记录数
        Integer take = 56; // Integer | 获取的记录数
        try {
            AppListResultApiResponse result = apiInstance.apps(projectId, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#apps");
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
| **projectId** | **Long**| 项目ID | [optional] |
| **skip** | **Integer**| 跳过的记录数 | [optional] |
| **take** | **Integer**| 获取的记录数 | [optional] |

### Return type

[**AppListResultApiResponse**](AppListResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## appsWithHttpInfo

> ApiResponse<AppListResultApiResponse> apps appsWithHttpInfo(projectId, skip, take)

应用列表

根据项目ID获取应用列表，支持分页。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AppApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AppApi apiInstance = new AppApi(defaultClient);
        Long projectId = 56L; // Long | 项目ID
        Integer skip = 56; // Integer | 跳过的记录数
        Integer take = 56; // Integer | 获取的记录数
        try {
            ApiResponse<AppListResultApiResponse> response = apiInstance.appsWithHttpInfo(projectId, skip, take);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#apps");
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
| **projectId** | **Long**| 项目ID | [optional] |
| **skip** | **Integer**| 跳过的记录数 | [optional] |
| **take** | **Integer**| 获取的记录数 | [optional] |

### Return type

ApiResponse<[**AppListResultApiResponse**](AppListResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

