# AuthorizePolicyApi

All URIs are relative to *https://api.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authorizePolicies**](AuthorizePolicyApi.md#authorizePolicies) | **GET** /AuthorizePolicy/{appKey} | 获取鉴权策略列表 |
| [**authorizePoliciesWithHttpInfo**](AuthorizePolicyApi.md#authorizePoliciesWithHttpInfo) | **GET** /AuthorizePolicy/{appKey} | 获取鉴权策略列表 |
| [**authorizePolicy**](AuthorizePolicyApi.md#authorizePolicy) | **GET** /AuthorizePolicy/{appKey}/{id} | 获取鉴权策略详情 |
| [**authorizePolicyWithHttpInfo**](AuthorizePolicyApi.md#authorizePolicyWithHttpInfo) | **GET** /AuthorizePolicy/{appKey}/{id} | 获取鉴权策略详情 |
| [**authorizePolicyDelete**](AuthorizePolicyApi.md#authorizePolicyDelete) | **DELETE** /AuthorizePolicy/{appKey}/{id} | 删除鉴权策略 |
| [**authorizePolicyDeleteWithHttpInfo**](AuthorizePolicyApi.md#authorizePolicyDeleteWithHttpInfo) | **DELETE** /AuthorizePolicy/{appKey}/{id} | 删除鉴权策略 |
| [**authorizePolicyPost**](AuthorizePolicyApi.md#authorizePolicyPost) | **POST** /AuthorizePolicy/{appKey} | 添加鉴权策略 |
| [**authorizePolicyPostWithHttpInfo**](AuthorizePolicyApi.md#authorizePolicyPostWithHttpInfo) | **POST** /AuthorizePolicy/{appKey} | 添加鉴权策略 |
| [**authorizePolicyPut**](AuthorizePolicyApi.md#authorizePolicyPut) | **PUT** /AuthorizePolicy/{appKey}/{id} | 更新鉴权策略 |
| [**authorizePolicyPutWithHttpInfo**](AuthorizePolicyApi.md#authorizePolicyPutWithHttpInfo) | **PUT** /AuthorizePolicy/{appKey}/{id} | 更新鉴权策略 |



## authorizePolicies

> AuthorizePolicyListApiResponse authorizePolicies(appKey, authType, policyName)

获取鉴权策略列表

根据鉴权类型和策略名称获取鉴权策略列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AuthorizePolicyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AuthorizePolicyApi apiInstance = new AuthorizePolicyApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String authType = "authType_example"; // String | 鉴权类型（access_token、user、role）
        String policyName = "policyName_example"; // String | 策略名称
        try {
            AuthorizePolicyListApiResponse result = apiInstance.authorizePolicies(appKey, authType, policyName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizePolicyApi#authorizePolicies");
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
| **authType** | **String**| 鉴权类型（access_token、user、role） | [optional] |
| **policyName** | **String**| 策略名称 | [optional] |

### Return type

[**AuthorizePolicyListApiResponse**](AuthorizePolicyListApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## authorizePoliciesWithHttpInfo

> ApiResponse<AuthorizePolicyListApiResponse> authorizePolicies authorizePoliciesWithHttpInfo(appKey, authType, policyName)

获取鉴权策略列表

根据鉴权类型和策略名称获取鉴权策略列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AuthorizePolicyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AuthorizePolicyApi apiInstance = new AuthorizePolicyApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String authType = "authType_example"; // String | 鉴权类型（access_token、user、role）
        String policyName = "policyName_example"; // String | 策略名称
        try {
            ApiResponse<AuthorizePolicyListApiResponse> response = apiInstance.authorizePoliciesWithHttpInfo(appKey, authType, policyName);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizePolicyApi#authorizePolicies");
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
| **authType** | **String**| 鉴权类型（access_token、user、role） | [optional] |
| **policyName** | **String**| 策略名称 | [optional] |

### Return type

ApiResponse<[**AuthorizePolicyListApiResponse**](AuthorizePolicyListApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## authorizePolicy

> AuthorizePolicyApiResponse authorizePolicy(id, appKey)

获取鉴权策略详情

根据鉴权策略ID获取鉴权策略详情

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AuthorizePolicyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AuthorizePolicyApi apiInstance = new AuthorizePolicyApi(defaultClient);
        Long id = 56L; // Long | 鉴权策略ID
        String appKey = "appKey_example"; // String | 
        try {
            AuthorizePolicyApiResponse result = apiInstance.authorizePolicy(id, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizePolicyApi#authorizePolicy");
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
| **id** | **Long**| 鉴权策略ID | |
| **appKey** | **String**|  | |

### Return type

[**AuthorizePolicyApiResponse**](AuthorizePolicyApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## authorizePolicyWithHttpInfo

> ApiResponse<AuthorizePolicyApiResponse> authorizePolicy authorizePolicyWithHttpInfo(id, appKey)

获取鉴权策略详情

根据鉴权策略ID获取鉴权策略详情

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AuthorizePolicyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AuthorizePolicyApi apiInstance = new AuthorizePolicyApi(defaultClient);
        Long id = 56L; // Long | 鉴权策略ID
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<AuthorizePolicyApiResponse> response = apiInstance.authorizePolicyWithHttpInfo(id, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizePolicyApi#authorizePolicy");
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
| **id** | **Long**| 鉴权策略ID | |
| **appKey** | **String**|  | |

### Return type

ApiResponse<[**AuthorizePolicyApiResponse**](AuthorizePolicyApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## authorizePolicyDelete

> BooleanApiResponse authorizePolicyDelete(id, appKey)

删除鉴权策略

根据鉴权策略ID删除鉴权策略

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AuthorizePolicyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AuthorizePolicyApi apiInstance = new AuthorizePolicyApi(defaultClient);
        Long id = 56L; // Long | 鉴权策略ID
        String appKey = "appKey_example"; // String | 
        try {
            BooleanApiResponse result = apiInstance.authorizePolicyDelete(id, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizePolicyApi#authorizePolicyDelete");
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
| **id** | **Long**| 鉴权策略ID | |
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

## authorizePolicyDeleteWithHttpInfo

> ApiResponse<BooleanApiResponse> authorizePolicyDelete authorizePolicyDeleteWithHttpInfo(id, appKey)

删除鉴权策略

根据鉴权策略ID删除鉴权策略

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AuthorizePolicyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AuthorizePolicyApi apiInstance = new AuthorizePolicyApi(defaultClient);
        Long id = 56L; // Long | 鉴权策略ID
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.authorizePolicyDeleteWithHttpInfo(id, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizePolicyApi#authorizePolicyDelete");
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
| **id** | **Long**| 鉴权策略ID | |
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


## authorizePolicyPost

> CreatePostResultApiResponse authorizePolicyPost(appKey, authorizePolicy)

添加鉴权策略

添加新的鉴权策略

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AuthorizePolicyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AuthorizePolicyApi apiInstance = new AuthorizePolicyApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AuthorizePolicy authorizePolicy = new AuthorizePolicy(); // AuthorizePolicy | 鉴权策略对象
        try {
            CreatePostResultApiResponse result = apiInstance.authorizePolicyPost(appKey, authorizePolicy);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizePolicyApi#authorizePolicyPost");
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
| **authorizePolicy** | [**AuthorizePolicy**](AuthorizePolicy.md)| 鉴权策略对象 | [optional] |

### Return type

[**CreatePostResultApiResponse**](CreatePostResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## authorizePolicyPostWithHttpInfo

> ApiResponse<CreatePostResultApiResponse> authorizePolicyPost authorizePolicyPostWithHttpInfo(appKey, authorizePolicy)

添加鉴权策略

添加新的鉴权策略

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AuthorizePolicyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AuthorizePolicyApi apiInstance = new AuthorizePolicyApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AuthorizePolicy authorizePolicy = new AuthorizePolicy(); // AuthorizePolicy | 鉴权策略对象
        try {
            ApiResponse<CreatePostResultApiResponse> response = apiInstance.authorizePolicyPostWithHttpInfo(appKey, authorizePolicy);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizePolicyApi#authorizePolicyPost");
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
| **authorizePolicy** | [**AuthorizePolicy**](AuthorizePolicy.md)| 鉴权策略对象 | [optional] |

### Return type

ApiResponse<[**CreatePostResultApiResponse**](CreatePostResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## authorizePolicyPut

> BooleanApiResponse authorizePolicyPut(id, appKey, authorizePolicy)

更新鉴权策略

根据鉴权策略ID更新鉴权策略

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AuthorizePolicyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AuthorizePolicyApi apiInstance = new AuthorizePolicyApi(defaultClient);
        Long id = 56L; // Long | 鉴权策略ID
        String appKey = "appKey_example"; // String | 
        AuthorizePolicy authorizePolicy = new AuthorizePolicy(); // AuthorizePolicy | 鉴权策略对象
        try {
            BooleanApiResponse result = apiInstance.authorizePolicyPut(id, appKey, authorizePolicy);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizePolicyApi#authorizePolicyPut");
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
| **id** | **Long**| 鉴权策略ID | |
| **appKey** | **String**|  | |
| **authorizePolicy** | [**AuthorizePolicy**](AuthorizePolicy.md)| 鉴权策略对象 | [optional] |

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

## authorizePolicyPutWithHttpInfo

> ApiResponse<BooleanApiResponse> authorizePolicyPut authorizePolicyPutWithHttpInfo(id, appKey, authorizePolicy)

更新鉴权策略

根据鉴权策略ID更新鉴权策略

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AuthorizePolicyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AuthorizePolicyApi apiInstance = new AuthorizePolicyApi(defaultClient);
        Long id = 56L; // Long | 鉴权策略ID
        String appKey = "appKey_example"; // String | 
        AuthorizePolicy authorizePolicy = new AuthorizePolicy(); // AuthorizePolicy | 鉴权策略对象
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.authorizePolicyPutWithHttpInfo(id, appKey, authorizePolicy);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizePolicyApi#authorizePolicyPut");
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
| **id** | **Long**| 鉴权策略ID | |
| **appKey** | **String**|  | |
| **authorizePolicy** | [**AuthorizePolicy**](AuthorizePolicy.md)| 鉴权策略对象 | [optional] |

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

