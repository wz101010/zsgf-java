# ServiceSettingApi

All URIs are relative to *https://api.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**serviceSetting**](ServiceSettingApi.md#serviceSetting) | **GET** /ServiceSetting/{id} | 获取配置详情 |
| [**serviceSettingWithHttpInfo**](ServiceSettingApi.md#serviceSettingWithHttpInfo) | **GET** /ServiceSetting/{id} | 获取配置详情 |
| [**serviceSettingDelete**](ServiceSettingApi.md#serviceSettingDelete) | **DELETE** /ServiceSetting/{id} | 删除配置 |
| [**serviceSettingDeleteWithHttpInfo**](ServiceSettingApi.md#serviceSettingDeleteWithHttpInfo) | **DELETE** /ServiceSetting/{id} | 删除配置 |
| [**serviceSettingGroup**](ServiceSettingApi.md#serviceSettingGroup) | **GET** /ServiceSetting/Groups/{id} | 获取服务分组详情 |
| [**serviceSettingGroupWithHttpInfo**](ServiceSettingApi.md#serviceSettingGroupWithHttpInfo) | **GET** /ServiceSetting/Groups/{id} | 获取服务分组详情 |
| [**serviceSettingGroupDelete**](ServiceSettingApi.md#serviceSettingGroupDelete) | **DELETE** /ServiceSetting/Groups/{id} | 删除服务分组 |
| [**serviceSettingGroupDeleteWithHttpInfo**](ServiceSettingApi.md#serviceSettingGroupDeleteWithHttpInfo) | **DELETE** /ServiceSetting/Groups/{id} | 删除服务分组 |
| [**serviceSettingGroupPost**](ServiceSettingApi.md#serviceSettingGroupPost) | **POST** /ServiceSetting/Groups | 添加服务分组 |
| [**serviceSettingGroupPostWithHttpInfo**](ServiceSettingApi.md#serviceSettingGroupPostWithHttpInfo) | **POST** /ServiceSetting/Groups | 添加服务分组 |
| [**serviceSettingGroupPut**](ServiceSettingApi.md#serviceSettingGroupPut) | **PUT** /ServiceSetting/Groups/{id} | 更新服务分组 |
| [**serviceSettingGroupPutWithHttpInfo**](ServiceSettingApi.md#serviceSettingGroupPutWithHttpInfo) | **PUT** /ServiceSetting/Groups/{id} | 更新服务分组 |
| [**serviceSettingGroups**](ServiceSettingApi.md#serviceSettingGroups) | **GET** /ServiceSetting/Groups | 获取服务分组列表 |
| [**serviceSettingGroupsWithHttpInfo**](ServiceSettingApi.md#serviceSettingGroupsWithHttpInfo) | **GET** /ServiceSetting/Groups | 获取服务分组列表 |
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
| [**serviceSettingProvider**](ServiceSettingApi.md#serviceSettingProvider) | **GET** /ServiceSetting/Providers/{id} | 获取服务商详情 |
| [**serviceSettingProviderWithHttpInfo**](ServiceSettingApi.md#serviceSettingProviderWithHttpInfo) | **GET** /ServiceSetting/Providers/{id} | 获取服务商详情 |
| [**serviceSettingProviderDelete**](ServiceSettingApi.md#serviceSettingProviderDelete) | **DELETE** /ServiceSetting/Providers/{id} | 删除服务商 |
| [**serviceSettingProviderDeleteWithHttpInfo**](ServiceSettingApi.md#serviceSettingProviderDeleteWithHttpInfo) | **DELETE** /ServiceSetting/Providers/{id} | 删除服务商 |
| [**serviceSettingProviderPost**](ServiceSettingApi.md#serviceSettingProviderPost) | **POST** /ServiceSetting/Providers | 添加服务商 |
| [**serviceSettingProviderPostWithHttpInfo**](ServiceSettingApi.md#serviceSettingProviderPostWithHttpInfo) | **POST** /ServiceSetting/Providers | 添加服务商 |
| [**serviceSettingProviderPut**](ServiceSettingApi.md#serviceSettingProviderPut) | **PUT** /ServiceSetting/Providers/{id} | 更新服务商 |
| [**serviceSettingProviderPutWithHttpInfo**](ServiceSettingApi.md#serviceSettingProviderPutWithHttpInfo) | **PUT** /ServiceSetting/Providers/{id} | 更新服务商 |
| [**serviceSettingProviders**](ServiceSettingApi.md#serviceSettingProviders) | **GET** /ServiceSetting/Providers | 获取服务商列表 |
| [**serviceSettingProvidersWithHttpInfo**](ServiceSettingApi.md#serviceSettingProvidersWithHttpInfo) | **GET** /ServiceSetting/Providers | 获取服务商列表 |
| [**serviceSettingPut**](ServiceSettingApi.md#serviceSettingPut) | **PUT** /ServiceSetting/{id} | 更新配置 |
| [**serviceSettingPutWithHttpInfo**](ServiceSettingApi.md#serviceSettingPutWithHttpInfo) | **PUT** /ServiceSetting/{id} | 更新配置 |
| [**serviceSettings**](ServiceSettingApi.md#serviceSettings) | **GET** /ServiceSetting | 获取配置列表 |
| [**serviceSettingsWithHttpInfo**](ServiceSettingApi.md#serviceSettingsWithHttpInfo) | **GET** /ServiceSetting | 获取配置列表 |



## serviceSetting

> SettingsApiResponse serviceSetting(id)

获取配置详情

根据配置ID获取配置详情

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 配置ID
        try {
            SettingsApiResponse result = apiInstance.serviceSetting(id);
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
| **id** | **Long**| 配置ID | |

### Return type

[**SettingsApiResponse**](SettingsApiResponse.md)


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

> ApiResponse<SettingsApiResponse> serviceSetting serviceSettingWithHttpInfo(id)

获取配置详情

根据配置ID获取配置详情

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 配置ID
        try {
            ApiResponse<SettingsApiResponse> response = apiInstance.serviceSettingWithHttpInfo(id);
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
| **id** | **Long**| 配置ID | |

### Return type

ApiResponse<[**SettingsApiResponse**](SettingsApiResponse.md)>


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

> BooleanApiResponse serviceSettingDelete(id)

删除配置

根据配置ID删除配置

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 配置ID
        try {
            BooleanApiResponse result = apiInstance.serviceSettingDelete(id);
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
| **id** | **Long**| 配置ID | |

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

## serviceSettingDeleteWithHttpInfo

> ApiResponse<BooleanApiResponse> serviceSettingDelete serviceSettingDeleteWithHttpInfo(id)

删除配置

根据配置ID删除配置

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 配置ID
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.serviceSettingDeleteWithHttpInfo(id);
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
| **id** | **Long**| 配置ID | |

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


## serviceSettingGroup

> ServiceGroupApiResponse serviceSettingGroup(id)

获取服务分组详情

根据服务分组ID获取服务分组详情

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 服务分组ID
        try {
            ServiceGroupApiResponse result = apiInstance.serviceSettingGroup(id);
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
| **id** | **Long**| 服务分组ID | |

### Return type

[**ServiceGroupApiResponse**](ServiceGroupApiResponse.md)


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

> ApiResponse<ServiceGroupApiResponse> serviceSettingGroup serviceSettingGroupWithHttpInfo(id)

获取服务分组详情

根据服务分组ID获取服务分组详情

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 服务分组ID
        try {
            ApiResponse<ServiceGroupApiResponse> response = apiInstance.serviceSettingGroupWithHttpInfo(id);
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
| **id** | **Long**| 服务分组ID | |

### Return type

ApiResponse<[**ServiceGroupApiResponse**](ServiceGroupApiResponse.md)>


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

> BooleanApiResponse serviceSettingGroupDelete(id)

删除服务分组

根据服务分组ID删除服务分组

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 服务分组ID
        try {
            BooleanApiResponse result = apiInstance.serviceSettingGroupDelete(id);
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
| **id** | **Long**| 服务分组ID | |

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

## serviceSettingGroupDeleteWithHttpInfo

> ApiResponse<BooleanApiResponse> serviceSettingGroupDelete serviceSettingGroupDeleteWithHttpInfo(id)

删除服务分组

根据服务分组ID删除服务分组

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 服务分组ID
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.serviceSettingGroupDeleteWithHttpInfo(id);
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
| **id** | **Long**| 服务分组ID | |

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


## serviceSettingGroupPost

> ServiceSettingGroupPostResultApiResponse serviceSettingGroupPost(serviceGroup)

添加服务分组

添加新的服务分组

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        ServiceGroup serviceGroup = new ServiceGroup(); // ServiceGroup | 服务分组实体
        try {
            ServiceSettingGroupPostResultApiResponse result = apiInstance.serviceSettingGroupPost(serviceGroup);
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
| **serviceGroup** | [**ServiceGroup**](ServiceGroup.md)| 服务分组实体 | [optional] |

### Return type

[**ServiceSettingGroupPostResultApiResponse**](ServiceSettingGroupPostResultApiResponse.md)


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

> ApiResponse<ServiceSettingGroupPostResultApiResponse> serviceSettingGroupPost serviceSettingGroupPostWithHttpInfo(serviceGroup)

添加服务分组

添加新的服务分组

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        ServiceGroup serviceGroup = new ServiceGroup(); // ServiceGroup | 服务分组实体
        try {
            ApiResponse<ServiceSettingGroupPostResultApiResponse> response = apiInstance.serviceSettingGroupPostWithHttpInfo(serviceGroup);
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
| **serviceGroup** | [**ServiceGroup**](ServiceGroup.md)| 服务分组实体 | [optional] |

### Return type

ApiResponse<[**ServiceSettingGroupPostResultApiResponse**](ServiceSettingGroupPostResultApiResponse.md)>


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

> BooleanApiResponse serviceSettingGroupPut(id, serviceGroup)

更新服务分组

根据服务分组ID更新服务分组信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 服务分组ID
        ServiceGroup serviceGroup = new ServiceGroup(); // ServiceGroup | 服务分组实体
        try {
            BooleanApiResponse result = apiInstance.serviceSettingGroupPut(id, serviceGroup);
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
| **id** | **Long**| 服务分组ID | |
| **serviceGroup** | [**ServiceGroup**](ServiceGroup.md)| 服务分组实体 | [optional] |

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

## serviceSettingGroupPutWithHttpInfo

> ApiResponse<BooleanApiResponse> serviceSettingGroupPut serviceSettingGroupPutWithHttpInfo(id, serviceGroup)

更新服务分组

根据服务分组ID更新服务分组信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 服务分组ID
        ServiceGroup serviceGroup = new ServiceGroup(); // ServiceGroup | 服务分组实体
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.serviceSettingGroupPutWithHttpInfo(id, serviceGroup);
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
| **id** | **Long**| 服务分组ID | |
| **serviceGroup** | [**ServiceGroup**](ServiceGroup.md)| 服务分组实体 | [optional] |

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


## serviceSettingGroups

> ServiceGroupListApiResponse serviceSettingGroups(providerId, showFlag)

获取服务分组列表

根据服务商ID和显示标志获取服务分组列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long providerId = 56L; // Long | 服务商ID
        Boolean showFlag = false; // Boolean | 是否显示
        try {
            ServiceGroupListApiResponse result = apiInstance.serviceSettingGroups(providerId, showFlag);
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
| **providerId** | **Long**| 服务商ID | [optional] |
| **showFlag** | **Boolean**| 是否显示 | [optional] [default to false] |

### Return type

[**ServiceGroupListApiResponse**](ServiceGroupListApiResponse.md)


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

> ApiResponse<ServiceGroupListApiResponse> serviceSettingGroups serviceSettingGroupsWithHttpInfo(providerId, showFlag)

获取服务分组列表

根据服务商ID和显示标志获取服务分组列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long providerId = 56L; // Long | 服务商ID
        Boolean showFlag = false; // Boolean | 是否显示
        try {
            ApiResponse<ServiceGroupListApiResponse> response = apiInstance.serviceSettingGroupsWithHttpInfo(providerId, showFlag);
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
| **providerId** | **Long**| 服务商ID | [optional] |
| **showFlag** | **Boolean**| 是否显示 | [optional] [default to false] |

### Return type

ApiResponse<[**ServiceGroupListApiResponse**](ServiceGroupListApiResponse.md)>


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

> ServiceItemApiResponse serviceSettingItem(id)

服务配置详情

根据服务配置ID获取服务配置详情

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 服务配置ID
        try {
            ServiceItemApiResponse result = apiInstance.serviceSettingItem(id);
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
| **id** | **Long**| 服务配置ID | |

### Return type

[**ServiceItemApiResponse**](ServiceItemApiResponse.md)


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

> ApiResponse<ServiceItemApiResponse> serviceSettingItem serviceSettingItemWithHttpInfo(id)

服务配置详情

根据服务配置ID获取服务配置详情

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 服务配置ID
        try {
            ApiResponse<ServiceItemApiResponse> response = apiInstance.serviceSettingItemWithHttpInfo(id);
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
| **id** | **Long**| 服务配置ID | |

### Return type

ApiResponse<[**ServiceItemApiResponse**](ServiceItemApiResponse.md)>


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

> BooleanApiResponse serviceSettingItemDelete(id)

删除服务配置

根据服务配置ID删除服务配置

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 服务配置ID
        try {
            BooleanApiResponse result = apiInstance.serviceSettingItemDelete(id);
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
| **id** | **Long**| 服务配置ID | |

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

## serviceSettingItemDeleteWithHttpInfo

> ApiResponse<BooleanApiResponse> serviceSettingItemDelete serviceSettingItemDeleteWithHttpInfo(id)

删除服务配置

根据服务配置ID删除服务配置

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 服务配置ID
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.serviceSettingItemDeleteWithHttpInfo(id);
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
| **id** | **Long**| 服务配置ID | |

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


## serviceSettingItemPost

> ServiceSettingItemPostResultApiResponse serviceSettingItemPost(serviceItem)

添加服务配置

添加新的服务配置

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        ServiceItem serviceItem = new ServiceItem(); // ServiceItem | 服务配置实体
        try {
            ServiceSettingItemPostResultApiResponse result = apiInstance.serviceSettingItemPost(serviceItem);
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
| **serviceItem** | [**ServiceItem**](ServiceItem.md)| 服务配置实体 | [optional] |

### Return type

[**ServiceSettingItemPostResultApiResponse**](ServiceSettingItemPostResultApiResponse.md)


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

> ApiResponse<ServiceSettingItemPostResultApiResponse> serviceSettingItemPost serviceSettingItemPostWithHttpInfo(serviceItem)

添加服务配置

添加新的服务配置

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        ServiceItem serviceItem = new ServiceItem(); // ServiceItem | 服务配置实体
        try {
            ApiResponse<ServiceSettingItemPostResultApiResponse> response = apiInstance.serviceSettingItemPostWithHttpInfo(serviceItem);
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
| **serviceItem** | [**ServiceItem**](ServiceItem.md)| 服务配置实体 | [optional] |

### Return type

ApiResponse<[**ServiceSettingItemPostResultApiResponse**](ServiceSettingItemPostResultApiResponse.md)>


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

> BooleanApiResponse serviceSettingItemPut(id, serviceItem)

更新服务配置

根据服务配置ID更新服务配置信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 服务配置ID
        ServiceItem serviceItem = new ServiceItem(); // ServiceItem | 服务配置实体
        try {
            BooleanApiResponse result = apiInstance.serviceSettingItemPut(id, serviceItem);
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
| **id** | **Long**| 服务配置ID | |
| **serviceItem** | [**ServiceItem**](ServiceItem.md)| 服务配置实体 | [optional] |

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

## serviceSettingItemPutWithHttpInfo

> ApiResponse<BooleanApiResponse> serviceSettingItemPut serviceSettingItemPutWithHttpInfo(id, serviceItem)

更新服务配置

根据服务配置ID更新服务配置信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 服务配置ID
        ServiceItem serviceItem = new ServiceItem(); // ServiceItem | 服务配置实体
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.serviceSettingItemPutWithHttpInfo(id, serviceItem);
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
| **id** | **Long**| 服务配置ID | |
| **serviceItem** | [**ServiceItem**](ServiceItem.md)| 服务配置实体 | [optional] |

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


## serviceSettingItems

> ServiceItemListApiResponse serviceSettingItems(bizCode, providerCode, groupCode, showFlag)

服务配置列表

根据业务代码、服务商代码、分组代码和显示标志获取服务配置列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        String bizCode = "bizCode_example"; // String | 业务代码
        String providerCode = "providerCode_example"; // String | 服务商代码
        String groupCode = "groupCode_example"; // String | 分组代码
        Boolean showFlag = false; // Boolean | 是否显示
        try {
            ServiceItemListApiResponse result = apiInstance.serviceSettingItems(bizCode, providerCode, groupCode, showFlag);
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
| **bizCode** | **String**| 业务代码 | [optional] |
| **providerCode** | **String**| 服务商代码 | [optional] |
| **groupCode** | **String**| 分组代码 | [optional] |
| **showFlag** | **Boolean**| 是否显示 | [optional] [default to false] |

### Return type

[**ServiceItemListApiResponse**](ServiceItemListApiResponse.md)


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

> ApiResponse<ServiceItemListApiResponse> serviceSettingItems serviceSettingItemsWithHttpInfo(bizCode, providerCode, groupCode, showFlag)

服务配置列表

根据业务代码、服务商代码、分组代码和显示标志获取服务配置列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        String bizCode = "bizCode_example"; // String | 业务代码
        String providerCode = "providerCode_example"; // String | 服务商代码
        String groupCode = "groupCode_example"; // String | 分组代码
        Boolean showFlag = false; // Boolean | 是否显示
        try {
            ApiResponse<ServiceItemListApiResponse> response = apiInstance.serviceSettingItemsWithHttpInfo(bizCode, providerCode, groupCode, showFlag);
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
| **bizCode** | **String**| 业务代码 | [optional] |
| **providerCode** | **String**| 服务商代码 | [optional] |
| **groupCode** | **String**| 分组代码 | [optional] |
| **showFlag** | **Boolean**| 是否显示 | [optional] [default to false] |

### Return type

ApiResponse<[**ServiceItemListApiResponse**](ServiceItemListApiResponse.md)>


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

> ServiceSettingSettingPostResultApiResponse serviceSettingPost(settings)

增加配置

添加新的配置

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Settings settings = new Settings(); // Settings | 配置实体
        try {
            ServiceSettingSettingPostResultApiResponse result = apiInstance.serviceSettingPost(settings);
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
| **settings** | [**Settings**](Settings.md)| 配置实体 | [optional] |

### Return type

[**ServiceSettingSettingPostResultApiResponse**](ServiceSettingSettingPostResultApiResponse.md)


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

> ApiResponse<ServiceSettingSettingPostResultApiResponse> serviceSettingPost serviceSettingPostWithHttpInfo(settings)

增加配置

添加新的配置

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Settings settings = new Settings(); // Settings | 配置实体
        try {
            ApiResponse<ServiceSettingSettingPostResultApiResponse> response = apiInstance.serviceSettingPostWithHttpInfo(settings);
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
| **settings** | [**Settings**](Settings.md)| 配置实体 | [optional] |

### Return type

ApiResponse<[**ServiceSettingSettingPostResultApiResponse**](ServiceSettingSettingPostResultApiResponse.md)>


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

> ServiceProviderApiResponse serviceSettingProvider(id)

获取服务商详情

根据服务商ID获取服务商详情

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 服务商ID
        try {
            ServiceProviderApiResponse result = apiInstance.serviceSettingProvider(id);
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
| **id** | **Long**| 服务商ID | |

### Return type

[**ServiceProviderApiResponse**](ServiceProviderApiResponse.md)


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

> ApiResponse<ServiceProviderApiResponse> serviceSettingProvider serviceSettingProviderWithHttpInfo(id)

获取服务商详情

根据服务商ID获取服务商详情

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 服务商ID
        try {
            ApiResponse<ServiceProviderApiResponse> response = apiInstance.serviceSettingProviderWithHttpInfo(id);
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
| **id** | **Long**| 服务商ID | |

### Return type

ApiResponse<[**ServiceProviderApiResponse**](ServiceProviderApiResponse.md)>


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

> BooleanApiResponse serviceSettingProviderDelete(id)

删除服务商

根据服务商ID删除服务商

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 服务商ID
        try {
            BooleanApiResponse result = apiInstance.serviceSettingProviderDelete(id);
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
| **id** | **Long**| 服务商ID | |

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

## serviceSettingProviderDeleteWithHttpInfo

> ApiResponse<BooleanApiResponse> serviceSettingProviderDelete serviceSettingProviderDeleteWithHttpInfo(id)

删除服务商

根据服务商ID删除服务商

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 服务商ID
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.serviceSettingProviderDeleteWithHttpInfo(id);
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
| **id** | **Long**| 服务商ID | |

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


## serviceSettingProviderPost

> ServiceSettingProviderPostResultApiResponse serviceSettingProviderPost(serviceProvider)

添加服务商

添加新的服务商

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        ServiceProvider serviceProvider = new ServiceProvider(); // ServiceProvider | 服务商实体
        try {
            ServiceSettingProviderPostResultApiResponse result = apiInstance.serviceSettingProviderPost(serviceProvider);
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
| **serviceProvider** | [**ServiceProvider**](ServiceProvider.md)| 服务商实体 | [optional] |

### Return type

[**ServiceSettingProviderPostResultApiResponse**](ServiceSettingProviderPostResultApiResponse.md)


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

> ApiResponse<ServiceSettingProviderPostResultApiResponse> serviceSettingProviderPost serviceSettingProviderPostWithHttpInfo(serviceProvider)

添加服务商

添加新的服务商

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        ServiceProvider serviceProvider = new ServiceProvider(); // ServiceProvider | 服务商实体
        try {
            ApiResponse<ServiceSettingProviderPostResultApiResponse> response = apiInstance.serviceSettingProviderPostWithHttpInfo(serviceProvider);
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
| **serviceProvider** | [**ServiceProvider**](ServiceProvider.md)| 服务商实体 | [optional] |

### Return type

ApiResponse<[**ServiceSettingProviderPostResultApiResponse**](ServiceSettingProviderPostResultApiResponse.md)>


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

> BooleanApiResponse serviceSettingProviderPut(id, serviceProvider)

更新服务商

根据服务商ID更新服务商信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 服务商ID
        ServiceProvider serviceProvider = new ServiceProvider(); // ServiceProvider | 服务商实体
        try {
            BooleanApiResponse result = apiInstance.serviceSettingProviderPut(id, serviceProvider);
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
| **id** | **Long**| 服务商ID | |
| **serviceProvider** | [**ServiceProvider**](ServiceProvider.md)| 服务商实体 | [optional] |

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

## serviceSettingProviderPutWithHttpInfo

> ApiResponse<BooleanApiResponse> serviceSettingProviderPut serviceSettingProviderPutWithHttpInfo(id, serviceProvider)

更新服务商

根据服务商ID更新服务商信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 服务商ID
        ServiceProvider serviceProvider = new ServiceProvider(); // ServiceProvider | 服务商实体
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.serviceSettingProviderPutWithHttpInfo(id, serviceProvider);
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
| **id** | **Long**| 服务商ID | |
| **serviceProvider** | [**ServiceProvider**](ServiceProvider.md)| 服务商实体 | [optional] |

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


## serviceSettingProviders

> ServiceProviderListApiResponse serviceSettingProviders(bizCode, showFlag)

获取服务商列表

根据业务代码和显示标志获取服务商列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        String bizCode = "bizCode_example"; // String | 业务代码
        Boolean showFlag = false; // Boolean | 是否显示
        try {
            ServiceProviderListApiResponse result = apiInstance.serviceSettingProviders(bizCode, showFlag);
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
| **bizCode** | **String**| 业务代码 | [optional] |
| **showFlag** | **Boolean**| 是否显示 | [optional] [default to false] |

### Return type

[**ServiceProviderListApiResponse**](ServiceProviderListApiResponse.md)


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

> ApiResponse<ServiceProviderListApiResponse> serviceSettingProviders serviceSettingProvidersWithHttpInfo(bizCode, showFlag)

获取服务商列表

根据业务代码和显示标志获取服务商列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        String bizCode = "bizCode_example"; // String | 业务代码
        Boolean showFlag = false; // Boolean | 是否显示
        try {
            ApiResponse<ServiceProviderListApiResponse> response = apiInstance.serviceSettingProvidersWithHttpInfo(bizCode, showFlag);
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
| **bizCode** | **String**| 业务代码 | [optional] |
| **showFlag** | **Boolean**| 是否显示 | [optional] [default to false] |

### Return type

ApiResponse<[**ServiceProviderListApiResponse**](ServiceProviderListApiResponse.md)>


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

> BooleanApiResponse serviceSettingPut(id, settings)

更新配置

根据配置ID更新配置信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 配置ID
        Settings settings = new Settings(); // Settings | 配置实体
        try {
            BooleanApiResponse result = apiInstance.serviceSettingPut(id, settings);
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
| **id** | **Long**| 配置ID | |
| **settings** | [**Settings**](Settings.md)| 配置实体 | [optional] |

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

## serviceSettingPutWithHttpInfo

> ApiResponse<BooleanApiResponse> serviceSettingPut serviceSettingPutWithHttpInfo(id, settings)

更新配置

根据配置ID更新配置信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        Long id = 56L; // Long | 配置ID
        Settings settings = new Settings(); // Settings | 配置实体
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.serviceSettingPutWithHttpInfo(id, settings);
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
| **id** | **Long**| 配置ID | |
| **settings** | [**Settings**](Settings.md)| 配置实体 | [optional] |

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


## serviceSettings

> SettingsListApiResponse serviceSettings(bizCode, bizId, providerCode, groupCode, tag, code)

获取配置列表

根据业务代码、业务标识、服务商代码、分组代码、标签和配置项代码获取配置列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        String bizCode = "bizCode_example"; // String | 业务代码
        String bizId = "bizId_example"; // String | 业务标识
        String providerCode = "providerCode_example"; // String | 服务商代码
        String groupCode = "groupCode_example"; // String | 分组代码
        String tag = "tag_example"; // String | 标签
        String code = "code_example"; // String | 配置项代码
        try {
            SettingsListApiResponse result = apiInstance.serviceSettings(bizCode, bizId, providerCode, groupCode, tag, code);
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
| **bizCode** | **String**| 业务代码 | |
| **bizId** | **String**| 业务标识 | |
| **providerCode** | **String**| 服务商代码 | [optional] |
| **groupCode** | **String**| 分组代码 | [optional] |
| **tag** | **String**| 标签 | [optional] |
| **code** | **String**| 配置项代码 | [optional] |

### Return type

[**SettingsListApiResponse**](SettingsListApiResponse.md)


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

> ApiResponse<SettingsListApiResponse> serviceSettings serviceSettingsWithHttpInfo(bizCode, bizId, providerCode, groupCode, tag, code)

获取配置列表

根据业务代码、业务标识、服务商代码、分组代码、标签和配置项代码获取配置列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ServiceSettingApi apiInstance = new ServiceSettingApi(defaultClient);
        String bizCode = "bizCode_example"; // String | 业务代码
        String bizId = "bizId_example"; // String | 业务标识
        String providerCode = "providerCode_example"; // String | 服务商代码
        String groupCode = "groupCode_example"; // String | 分组代码
        String tag = "tag_example"; // String | 标签
        String code = "code_example"; // String | 配置项代码
        try {
            ApiResponse<SettingsListApiResponse> response = apiInstance.serviceSettingsWithHttpInfo(bizCode, bizId, providerCode, groupCode, tag, code);
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
| **bizCode** | **String**| 业务代码 | |
| **bizId** | **String**| 业务标识 | |
| **providerCode** | **String**| 服务商代码 | [optional] |
| **groupCode** | **String**| 分组代码 | [optional] |
| **tag** | **String**| 标签 | [optional] |
| **code** | **String**| 配置项代码 | [optional] |

### Return type

ApiResponse<[**SettingsListApiResponse**](SettingsListApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

