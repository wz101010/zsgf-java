# ServiceSettingApi

All URIs are relative to *https://api-staging.paomo.fun*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**serviceSetting**](ServiceSettingApi.md#serviceSetting) | **GET** /ServiceSetting/{id} | 配置详情 |
| [**serviceSettingWithHttpInfo**](ServiceSettingApi.md#serviceSettingWithHttpInfo) | **GET** /ServiceSetting/{id} | 配置详情 |
| [**serviceSettingDelete**](ServiceSettingApi.md#serviceSettingDelete) | **DELETE** /ServiceSetting/{id} | 删除配置 |
| [**serviceSettingDeleteWithHttpInfo**](ServiceSettingApi.md#serviceSettingDeleteWithHttpInfo) | **DELETE** /ServiceSetting/{id} | 删除配置 |
| [**serviceSettingGroup**](ServiceSettingApi.md#serviceSettingGroup) | **GET** /ServiceSetting/Groups/{id} | 服务分组详情 |
| [**serviceSettingGroupWithHttpInfo**](ServiceSettingApi.md#serviceSettingGroupWithHttpInfo) | **GET** /ServiceSetting/Groups/{id} | 服务分组详情 |
| [**serviceSettingGroupDelete**](ServiceSettingApi.md#serviceSettingGroupDelete) | **DELETE** /ServiceSetting/Groups/{id} | 删除服务分组 |
| [**serviceSettingGroupDeleteWithHttpInfo**](ServiceSettingApi.md#serviceSettingGroupDeleteWithHttpInfo) | **DELETE** /ServiceSetting/Groups/{id} | 删除服务分组 |
| [**serviceSettingGroupPost**](ServiceSettingApi.md#serviceSettingGroupPost) | **POST** /ServiceSetting/Groups | 添加服务分组 |
| [**serviceSettingGroupPostWithHttpInfo**](ServiceSettingApi.md#serviceSettingGroupPostWithHttpInfo) | **POST** /ServiceSetting/Groups | 添加服务分组 |
| [**serviceSettingGroupPut**](ServiceSettingApi.md#serviceSettingGroupPut) | **PUT** /ServiceSetting/Groups/{id} | 更新服务分组 |
| [**serviceSettingGroupPutWithHttpInfo**](ServiceSettingApi.md#serviceSettingGroupPutWithHttpInfo) | **PUT** /ServiceSetting/Groups/{id} | 更新服务分组 |
| [**serviceSettingGroups**](ServiceSettingApi.md#serviceSettingGroups) | **GET** /ServiceSetting/Groups | 服务分组 |
| [**serviceSettingGroupsWithHttpInfo**](ServiceSettingApi.md#serviceSettingGroupsWithHttpInfo) | **GET** /ServiceSetting/Groups | 服务分组 |
| [**serviceSettingItem**](ServiceSettingApi.md#serviceSettingItem) | **GET** /ServiceSetting/Items/{id} | 服务配置详情 |
| [**serviceSettingItemWithHttpInfo**](ServiceSettingApi.md#serviceSettingItemWithHttpInfo) | **GET** /ServiceSetting/Items/{id} | 服务配置详情 |
| [**serviceSettingItemDelete**](ServiceSettingApi.md#serviceSettingItemDelete) | **DELETE** /ServiceSetting/Items/{id} | 删除服务配置 |
| [**serviceSettingItemDeleteWithHttpInfo**](ServiceSettingApi.md#serviceSettingItemDeleteWithHttpInfo) | **DELETE** /ServiceSetting/Items/{id} | 删除服务配置 |
| [**serviceSettingItemPost**](ServiceSettingApi.md#serviceSettingItemPost) | **POST** /ServiceSetting/Items | 添加服务配置 |
| [**serviceSettingItemPostWithHttpInfo**](ServiceSettingApi.md#serviceSettingItemPostWithHttpInfo) | **POST** /ServiceSetting/Items | 添加服务配置 |
| [**serviceSettingItemPut**](ServiceSettingApi.md#serviceSettingItemPut) | **PUT** /ServiceSetting/Items/{id} | 更新服务配置 |
| [**serviceSettingItemPutWithHttpInfo**](ServiceSettingApi.md#serviceSettingItemPutWithHttpInfo) | **PUT** /ServiceSetting/Items/{id} | 更新服务配置 |
| [**serviceSettingItems**](ServiceSettingApi.md#serviceSettingItems) | **GET** /ServiceSetting/Items | 服务配置列表 |
| [**serviceSettingItemsWithHttpInfo**](ServiceSettingApi.md#serviceSettingItemsWithHttpInfo) | **GET** /ServiceSetting/Items | 服务配置列表 |
| [**serviceSettingPost**](ServiceSettingApi.md#serviceSettingPost) | **POST** /ServiceSetting | 增加配置 |
| [**serviceSettingPostWithHttpInfo**](ServiceSettingApi.md#serviceSettingPostWithHttpInfo) | **POST** /ServiceSetting | 增加配置 |
| [**serviceSettingProvider**](ServiceSettingApi.md#serviceSettingProvider) | **GET** /ServiceSetting/Providers/{id} | 服务商详情 |
| [**serviceSettingProviderWithHttpInfo**](ServiceSettingApi.md#serviceSettingProviderWithHttpInfo) | **GET** /ServiceSetting/Providers/{id} | 服务商详情 |
| [**serviceSettingProviderDelete**](ServiceSettingApi.md#serviceSettingProviderDelete) | **DELETE** /ServiceSetting/Providers/{id} | 删除服务商 |
| [**serviceSettingProviderDeleteWithHttpInfo**](ServiceSettingApi.md#serviceSettingProviderDeleteWithHttpInfo) | **DELETE** /ServiceSetting/Providers/{id} | 删除服务商 |
| [**serviceSettingProviderPost**](ServiceSettingApi.md#serviceSettingProviderPost) | **POST** /ServiceSetting/Providers | 添加服务商 |
| [**serviceSettingProviderPostWithHttpInfo**](ServiceSettingApi.md#serviceSettingProviderPostWithHttpInfo) | **POST** /ServiceSetting/Providers | 添加服务商 |
| [**serviceSettingProviderPut**](ServiceSettingApi.md#serviceSettingProviderPut) | **PUT** /ServiceSetting/Providers/{id} | 更新服务商 |
| [**serviceSettingProviderPutWithHttpInfo**](ServiceSettingApi.md#serviceSettingProviderPutWithHttpInfo) | **PUT** /ServiceSetting/Providers/{id} | 更新服务商 |
| [**serviceSettingProviders**](ServiceSettingApi.md#serviceSettingProviders) | **GET** /ServiceSetting/Providers | 服务商列表 |
| [**serviceSettingProvidersWithHttpInfo**](ServiceSettingApi.md#serviceSettingProvidersWithHttpInfo) | **GET** /ServiceSetting/Providers | 服务商列表 |
| [**serviceSettingPut**](ServiceSettingApi.md#serviceSettingPut) | **PUT** /ServiceSetting/{id} | 更新配置 |
| [**serviceSettingPutWithHttpInfo**](ServiceSettingApi.md#serviceSettingPutWithHttpInfo) | **PUT** /ServiceSetting/{id} | 更新配置 |
| [**serviceSettings**](ServiceSettingApi.md#serviceSettings) | **GET** /ServiceSetting | 配置列表 |
| [**serviceSettingsWithHttpInfo**](ServiceSettingApi.md#serviceSettingsWithHttpInfo) | **GET** /ServiceSetting | 配置列表 |



## serviceSetting

> JObjectApiResult serviceSetting(id)

配置详情

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            JObjectApiResult result = apiInstance.serviceSetting(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSetting");
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

## serviceSettingWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSetting serviceSettingWithHttpInfo(id)

配置详情

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSetting");
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


## serviceSettingDelete

> JObjectApiResult serviceSettingDelete(id)

删除配置

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            JObjectApiResult result = apiInstance.serviceSettingDelete(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingDelete");
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

## serviceSettingDeleteWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSettingDelete serviceSettingDeleteWithHttpInfo(id)

删除配置

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingDeleteWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingDelete");
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


## serviceSettingGroup

> JObjectApiResult serviceSettingGroup(id)

服务分组详情

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            JObjectApiResult result = apiInstance.serviceSettingGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingGroup");
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

## serviceSettingGroupWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSettingGroup serviceSettingGroupWithHttpInfo(id)

服务分组详情

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingGroupWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingGroup");
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


## serviceSettingGroupDelete

> JObjectApiResult serviceSettingGroupDelete(id)

删除服务分组

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            JObjectApiResult result = apiInstance.serviceSettingGroupDelete(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingGroupDelete");
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

## serviceSettingGroupDeleteWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSettingGroupDelete serviceSettingGroupDeleteWithHttpInfo(id)

删除服务分组

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingGroupDeleteWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingGroupDelete");
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


## serviceSettingGroupPost

> JObjectApiResult serviceSettingGroupPost(serviceGroup)

添加服务分组

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        ServiceGroup serviceGroup = new ServiceGroup(); // ServiceGroup | 
        try {
            JObjectApiResult result = apiInstance.serviceSettingGroupPost(serviceGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingGroupPost");
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
| **serviceGroup** | [**ServiceGroup**](ServiceGroup.md)|  | [optional] |

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

## serviceSettingGroupPostWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSettingGroupPost serviceSettingGroupPostWithHttpInfo(serviceGroup)

添加服务分组

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        ServiceGroup serviceGroup = new ServiceGroup(); // ServiceGroup | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingGroupPostWithHttpInfo(serviceGroup);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingGroupPost");
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
| **serviceGroup** | [**ServiceGroup**](ServiceGroup.md)|  | [optional] |

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


## serviceSettingGroupPut

> JObjectApiResult serviceSettingGroupPut(id, serviceGroup)

更新服务分组

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        ServiceGroup serviceGroup = new ServiceGroup(); // ServiceGroup | 
        try {
            JObjectApiResult result = apiInstance.serviceSettingGroupPut(id, serviceGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingGroupPut");
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
| **serviceGroup** | [**ServiceGroup**](ServiceGroup.md)|  | [optional] |

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

## serviceSettingGroupPutWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSettingGroupPut serviceSettingGroupPutWithHttpInfo(id, serviceGroup)

更新服务分组

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        ServiceGroup serviceGroup = new ServiceGroup(); // ServiceGroup | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingGroupPutWithHttpInfo(id, serviceGroup);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingGroupPut");
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
| **serviceGroup** | [**ServiceGroup**](ServiceGroup.md)|  | [optional] |

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


## serviceSettingGroups

> JObjectApiResult serviceSettingGroups(providerId, showFlag)

服务分组

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long providerId = 56L; // Long | 
        Boolean showFlag = false; // Boolean | 
        try {
            JObjectApiResult result = apiInstance.serviceSettingGroups(providerId, showFlag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingGroups");
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
| **providerId** | **Long**|  | [optional] |
| **showFlag** | **Boolean**|  | [optional] [default to false] |

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

## serviceSettingGroupsWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSettingGroups serviceSettingGroupsWithHttpInfo(providerId, showFlag)

服务分组

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long providerId = 56L; // Long | 
        Boolean showFlag = false; // Boolean | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingGroupsWithHttpInfo(providerId, showFlag);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingGroups");
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
| **providerId** | **Long**|  | [optional] |
| **showFlag** | **Boolean**|  | [optional] [default to false] |

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


## serviceSettingItem

> JObjectApiResult serviceSettingItem(id)

服务配置详情

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            JObjectApiResult result = apiInstance.serviceSettingItem(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingItem");
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

## serviceSettingItemWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSettingItem serviceSettingItemWithHttpInfo(id)

服务配置详情

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingItemWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingItem");
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


## serviceSettingItemDelete

> JObjectApiResult serviceSettingItemDelete(id)

删除服务配置

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            JObjectApiResult result = apiInstance.serviceSettingItemDelete(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingItemDelete");
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

## serviceSettingItemDeleteWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSettingItemDelete serviceSettingItemDeleteWithHttpInfo(id)

删除服务配置

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingItemDeleteWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingItemDelete");
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


## serviceSettingItemPost

> JObjectApiResult serviceSettingItemPost(serviceItem)

添加服务配置

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        ServiceItem serviceItem = new ServiceItem(); // ServiceItem | 
        try {
            JObjectApiResult result = apiInstance.serviceSettingItemPost(serviceItem);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingItemPost");
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
| **serviceItem** | [**ServiceItem**](ServiceItem.md)|  | [optional] |

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

## serviceSettingItemPostWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSettingItemPost serviceSettingItemPostWithHttpInfo(serviceItem)

添加服务配置

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        ServiceItem serviceItem = new ServiceItem(); // ServiceItem | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingItemPostWithHttpInfo(serviceItem);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingItemPost");
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
| **serviceItem** | [**ServiceItem**](ServiceItem.md)|  | [optional] |

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


## serviceSettingItemPut

> JObjectApiResult serviceSettingItemPut(id, serviceItem)

更新服务配置

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        ServiceItem serviceItem = new ServiceItem(); // ServiceItem | 
        try {
            JObjectApiResult result = apiInstance.serviceSettingItemPut(id, serviceItem);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingItemPut");
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
| **serviceItem** | [**ServiceItem**](ServiceItem.md)|  | [optional] |

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

## serviceSettingItemPutWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSettingItemPut serviceSettingItemPutWithHttpInfo(id, serviceItem)

更新服务配置

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        ServiceItem serviceItem = new ServiceItem(); // ServiceItem | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingItemPutWithHttpInfo(id, serviceItem);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingItemPut");
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
| **serviceItem** | [**ServiceItem**](ServiceItem.md)|  | [optional] |

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


## serviceSettingItems

> JObjectApiResult serviceSettingItems(bizCode, providerCode, groupCode, showFlag)

服务配置列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        String bizCode = "bizCode_example"; // String | 
        String providerCode = "providerCode_example"; // String | 
        String groupCode = "groupCode_example"; // String | 
        Boolean showFlag = false; // Boolean | 
        try {
            JObjectApiResult result = apiInstance.serviceSettingItems(bizCode, providerCode, groupCode, showFlag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingItems");
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
| **bizCode** | **String**|  | [optional] |
| **providerCode** | **String**|  | [optional] |
| **groupCode** | **String**|  | [optional] |
| **showFlag** | **Boolean**|  | [optional] [default to false] |

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

## serviceSettingItemsWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSettingItems serviceSettingItemsWithHttpInfo(bizCode, providerCode, groupCode, showFlag)

服务配置列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        String bizCode = "bizCode_example"; // String | 
        String providerCode = "providerCode_example"; // String | 
        String groupCode = "groupCode_example"; // String | 
        Boolean showFlag = false; // Boolean | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingItemsWithHttpInfo(bizCode, providerCode, groupCode, showFlag);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingItems");
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
| **bizCode** | **String**|  | [optional] |
| **providerCode** | **String**|  | [optional] |
| **groupCode** | **String**|  | [optional] |
| **showFlag** | **Boolean**|  | [optional] [default to false] |

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


## serviceSettingPost

> JObjectApiResult serviceSettingPost(settings)

增加配置

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Settings settings = new Settings(); // Settings | 
        try {
            JObjectApiResult result = apiInstance.serviceSettingPost(settings);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingPost");
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
| **settings** | [**Settings**](Settings.md)|  | [optional] |

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

## serviceSettingPostWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSettingPost serviceSettingPostWithHttpInfo(settings)

增加配置

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Settings settings = new Settings(); // Settings | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingPostWithHttpInfo(settings);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingPost");
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
| **settings** | [**Settings**](Settings.md)|  | [optional] |

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


## serviceSettingProvider

> JObjectApiResult serviceSettingProvider(id)

服务商详情

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            JObjectApiResult result = apiInstance.serviceSettingProvider(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingProvider");
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

## serviceSettingProviderWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSettingProvider serviceSettingProviderWithHttpInfo(id)

服务商详情

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingProviderWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingProvider");
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


## serviceSettingProviderDelete

> JObjectApiResult serviceSettingProviderDelete(id)

删除服务商

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            JObjectApiResult result = apiInstance.serviceSettingProviderDelete(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingProviderDelete");
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

## serviceSettingProviderDeleteWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSettingProviderDelete serviceSettingProviderDeleteWithHttpInfo(id)

删除服务商

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingProviderDeleteWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingProviderDelete");
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


## serviceSettingProviderPost

> JObjectApiResult serviceSettingProviderPost(serviceProvider)

添加服务商

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        ServiceProvider serviceProvider = new ServiceProvider(); // ServiceProvider | 
        try {
            JObjectApiResult result = apiInstance.serviceSettingProviderPost(serviceProvider);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingProviderPost");
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
| **serviceProvider** | [**ServiceProvider**](ServiceProvider.md)|  | [optional] |

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

## serviceSettingProviderPostWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSettingProviderPost serviceSettingProviderPostWithHttpInfo(serviceProvider)

添加服务商

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        ServiceProvider serviceProvider = new ServiceProvider(); // ServiceProvider | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingProviderPostWithHttpInfo(serviceProvider);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingProviderPost");
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
| **serviceProvider** | [**ServiceProvider**](ServiceProvider.md)|  | [optional] |

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


## serviceSettingProviderPut

> JObjectApiResult serviceSettingProviderPut(id, serviceProvider)

更新服务商

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        ServiceProvider serviceProvider = new ServiceProvider(); // ServiceProvider | 
        try {
            JObjectApiResult result = apiInstance.serviceSettingProviderPut(id, serviceProvider);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingProviderPut");
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
| **serviceProvider** | [**ServiceProvider**](ServiceProvider.md)|  | [optional] |

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

## serviceSettingProviderPutWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSettingProviderPut serviceSettingProviderPutWithHttpInfo(id, serviceProvider)

更新服务商

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        ServiceProvider serviceProvider = new ServiceProvider(); // ServiceProvider | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingProviderPutWithHttpInfo(id, serviceProvider);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingProviderPut");
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
| **serviceProvider** | [**ServiceProvider**](ServiceProvider.md)|  | [optional] |

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


## serviceSettingProviders

> JObjectApiResult serviceSettingProviders(bizCode, showFlag)

服务商列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        String bizCode = "bizCode_example"; // String | 
        Boolean showFlag = false; // Boolean | 
        try {
            JObjectApiResult result = apiInstance.serviceSettingProviders(bizCode, showFlag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingProviders");
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
| **bizCode** | **String**|  | [optional] |
| **showFlag** | **Boolean**|  | [optional] [default to false] |

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

## serviceSettingProvidersWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSettingProviders serviceSettingProvidersWithHttpInfo(bizCode, showFlag)

服务商列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        String bizCode = "bizCode_example"; // String | 
        Boolean showFlag = false; // Boolean | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingProvidersWithHttpInfo(bizCode, showFlag);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingProviders");
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
| **bizCode** | **String**|  | [optional] |
| **showFlag** | **Boolean**|  | [optional] [default to false] |

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


## serviceSettingPut

> JObjectApiResult serviceSettingPut(id, settings)

更新配置

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        Settings settings = new Settings(); // Settings | 
        try {
            JObjectApiResult result = apiInstance.serviceSettingPut(id, settings);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingPut");
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
| **settings** | [**Settings**](Settings.md)|  | [optional] |

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

## serviceSettingPutWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSettingPut serviceSettingPutWithHttpInfo(id, settings)

更新配置

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 
        Settings settings = new Settings(); // Settings | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingPutWithHttpInfo(id, settings);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettingPut");
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
| **settings** | [**Settings**](Settings.md)|  | [optional] |

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


## serviceSettings

> JObjectApiResult serviceSettings(bizCode, bizId, providerCode, groupCode, tag, code)

配置列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        String bizCode = "bizCode_example"; // String | 
        String bizId = "bizId_example"; // String | 
        String providerCode = "providerCode_example"; // String | 
        String groupCode = "groupCode_example"; // String | 
        String tag = "tag_example"; // String | 
        String code = "code_example"; // String | 
        try {
            JObjectApiResult result = apiInstance.serviceSettings(bizCode, bizId, providerCode, groupCode, tag, code);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettings");
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
| **bizCode** | **String**|  | |
| **bizId** | **String**|  | |
| **providerCode** | **String**|  | [optional] |
| **groupCode** | **String**|  | [optional] |
| **tag** | **String**|  | [optional] |
| **code** | **String**|  | [optional] |

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

## serviceSettingsWithHttpInfo

> ApiResponse<JObjectApiResult> serviceSettings serviceSettingsWithHttpInfo(bizCode, bizId, providerCode, groupCode, tag, code)

配置列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.ServiceSettingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        String bizCode = "bizCode_example"; // String | 
        String bizId = "bizId_example"; // String | 
        String providerCode = "providerCode_example"; // String | 
        String groupCode = "groupCode_example"; // String | 
        String tag = "tag_example"; // String | 
        String code = "code_example"; // String | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.serviceSettingsWithHttpInfo(bizCode, bizId, providerCode, groupCode, tag, code);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceSettingApi#serviceSettings");
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
| **bizCode** | **String**|  | |
| **bizId** | **String**|  | |
| **providerCode** | **String**|  | [optional] |
| **groupCode** | **String**|  | [optional] |
| **tag** | **String**|  | [optional] |
| **code** | **String**|  | [optional] |

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

