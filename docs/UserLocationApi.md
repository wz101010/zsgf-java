# UserLocationApi

All URIs are relative to *https://api-dev.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userLocation**](UserLocationApi.md#userLocation) | **GET** /UserLocation/{appKey}/{id} | 获取位置详情 |
| [**userLocationWithHttpInfo**](UserLocationApi.md#userLocationWithHttpInfo) | **GET** /UserLocation/{appKey}/{id} | 获取位置详情 |
| [**userLocationDelete**](UserLocationApi.md#userLocationDelete) | **DELETE** /UserLocation/{appKey}/{id} | 删除位置 |
| [**userLocationDeleteWithHttpInfo**](UserLocationApi.md#userLocationDeleteWithHttpInfo) | **DELETE** /UserLocation/{appKey}/{id} | 删除位置 |
| [**userLocationPost**](UserLocationApi.md#userLocationPost) | **POST** /UserLocation/{appKey} | 添加位置 |
| [**userLocationPostWithHttpInfo**](UserLocationApi.md#userLocationPostWithHttpInfo) | **POST** /UserLocation/{appKey} | 添加位置 |
| [**userLocationPut**](UserLocationApi.md#userLocationPut) | **PUT** /UserLocation/{appKey}/{id} | 更新位置 |
| [**userLocationPutWithHttpInfo**](UserLocationApi.md#userLocationPutWithHttpInfo) | **PUT** /UserLocation/{appKey}/{id} | 更新位置 |
| [**userLocations**](UserLocationApi.md#userLocations) | **GET** /UserLocation/{appKey} | 获取位置列表 |
| [**userLocationsWithHttpInfo**](UserLocationApi.md#userLocationsWithHttpInfo) | **GET** /UserLocation/{appKey} | 获取位置列表 |



## userLocation

> GeoLocationModelApiResponse userLocation(id, appKey, userId)

获取位置详情

根据位置ID获取位置详情

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserLocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserLocationApi apiInstance = new UserLocationApi(defaultClient);
        Long id = 56L; // Long | 位置ID
        String appKey = "appKey_example"; // String | 
        String userId = ""; // String | 
        try {
            GeoLocationModelApiResponse result = apiInstance.userLocation(id, appKey, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserLocationApi#userLocation");
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
| **id** | **Long**| 位置ID | |
| **appKey** | **String**|  | |
| **userId** | **String**|  | [optional] [default to ] |

### Return type

[**GeoLocationModelApiResponse**](GeoLocationModelApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userLocationWithHttpInfo

> ApiResponse<GeoLocationModelApiResponse> userLocation userLocationWithHttpInfo(id, appKey, userId)

获取位置详情

根据位置ID获取位置详情

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserLocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserLocationApi apiInstance = new UserLocationApi(defaultClient);
        Long id = 56L; // Long | 位置ID
        String appKey = "appKey_example"; // String | 
        String userId = ""; // String | 
        try {
            ApiResponse<GeoLocationModelApiResponse> response = apiInstance.userLocationWithHttpInfo(id, appKey, userId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserLocationApi#userLocation");
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
| **id** | **Long**| 位置ID | |
| **appKey** | **String**|  | |
| **userId** | **String**|  | [optional] [default to ] |

### Return type

ApiResponse<[**GeoLocationModelApiResponse**](GeoLocationModelApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userLocationDelete

> BooleanApiResponse userLocationDelete(id, appKey, userId)

删除位置

根据位置ID删除位置信息

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserLocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserLocationApi apiInstance = new UserLocationApi(defaultClient);
        Long id = 56L; // Long | 位置ID
        String appKey = "appKey_example"; // String | 
        String userId = ""; // String | 
        try {
            BooleanApiResponse result = apiInstance.userLocationDelete(id, appKey, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserLocationApi#userLocationDelete");
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
| **id** | **Long**| 位置ID | |
| **appKey** | **String**|  | |
| **userId** | **String**|  | [optional] [default to ] |

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

## userLocationDeleteWithHttpInfo

> ApiResponse<BooleanApiResponse> userLocationDelete userLocationDeleteWithHttpInfo(id, appKey, userId)

删除位置

根据位置ID删除位置信息

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserLocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserLocationApi apiInstance = new UserLocationApi(defaultClient);
        Long id = 56L; // Long | 位置ID
        String appKey = "appKey_example"; // String | 
        String userId = ""; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userLocationDeleteWithHttpInfo(id, appKey, userId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserLocationApi#userLocationDelete");
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
| **id** | **Long**| 位置ID | |
| **appKey** | **String**|  | |
| **userId** | **String**|  | [optional] [default to ] |

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


## userLocationPost

> UserLocationPostResultApiResponse userLocationPost(appKey, userId, geoLocationModel)

添加位置

添加新的位置信息

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserLocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserLocationApi apiInstance = new UserLocationApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String userId = ""; // String | 
        GeoLocationModel geoLocationModel = new GeoLocationModel(); // GeoLocationModel | 位置信息
        try {
            UserLocationPostResultApiResponse result = apiInstance.userLocationPost(appKey, userId, geoLocationModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserLocationApi#userLocationPost");
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
| **userId** | **String**|  | [optional] [default to ] |
| **geoLocationModel** | [**GeoLocationModel**](GeoLocationModel.md)| 位置信息 | [optional] |

### Return type

[**UserLocationPostResultApiResponse**](UserLocationPostResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userLocationPostWithHttpInfo

> ApiResponse<UserLocationPostResultApiResponse> userLocationPost userLocationPostWithHttpInfo(appKey, userId, geoLocationModel)

添加位置

添加新的位置信息

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserLocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserLocationApi apiInstance = new UserLocationApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String userId = ""; // String | 
        GeoLocationModel geoLocationModel = new GeoLocationModel(); // GeoLocationModel | 位置信息
        try {
            ApiResponse<UserLocationPostResultApiResponse> response = apiInstance.userLocationPostWithHttpInfo(appKey, userId, geoLocationModel);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserLocationApi#userLocationPost");
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
| **userId** | **String**|  | [optional] [default to ] |
| **geoLocationModel** | [**GeoLocationModel**](GeoLocationModel.md)| 位置信息 | [optional] |

### Return type

ApiResponse<[**UserLocationPostResultApiResponse**](UserLocationPostResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userLocationPut

> BooleanApiResponse userLocationPut(id, appKey, userId, geoLocationModel)

更新位置

此方法用于更新指定位置ID的位置信息。如果位置不存在，则创建一个新的位置。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserLocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserLocationApi apiInstance = new UserLocationApi(defaultClient);
        Long id = 56L; // Long | 位置ID
        String appKey = "appKey_example"; // String | 
        String userId = ""; // String | 
        GeoLocationModel geoLocationModel = new GeoLocationModel(); // GeoLocationModel | 位置信息
        try {
            BooleanApiResponse result = apiInstance.userLocationPut(id, appKey, userId, geoLocationModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserLocationApi#userLocationPut");
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
| **id** | **Long**| 位置ID | |
| **appKey** | **String**|  | |
| **userId** | **String**|  | [optional] [default to ] |
| **geoLocationModel** | [**GeoLocationModel**](GeoLocationModel.md)| 位置信息 | [optional] |

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

## userLocationPutWithHttpInfo

> ApiResponse<BooleanApiResponse> userLocationPut userLocationPutWithHttpInfo(id, appKey, userId, geoLocationModel)

更新位置

此方法用于更新指定位置ID的位置信息。如果位置不存在，则创建一个新的位置。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserLocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserLocationApi apiInstance = new UserLocationApi(defaultClient);
        Long id = 56L; // Long | 位置ID
        String appKey = "appKey_example"; // String | 
        String userId = ""; // String | 
        GeoLocationModel geoLocationModel = new GeoLocationModel(); // GeoLocationModel | 位置信息
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userLocationPutWithHttpInfo(id, appKey, userId, geoLocationModel);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserLocationApi#userLocationPut");
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
| **id** | **Long**| 位置ID | |
| **appKey** | **String**|  | |
| **userId** | **String**|  | [optional] [default to ] |
| **geoLocationModel** | [**GeoLocationModel**](GeoLocationModel.md)| 位置信息 | [optional] |

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


## userLocations

> UserLocationsResultApiResponse userLocations(appKey, tag, type, x, y, sphere, skip, take, userId)

获取位置列表

根据条件获取位置列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserLocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserLocationApi apiInstance = new UserLocationApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String tag = "tag_example"; // String | 标签
        String type = "type_example"; // String | 分类
        Double x = 3.4D; // Double | 纬度
        Double y = 3.4D; // Double | 经度
        Long sphere = 56L; // Long | 附近距离，单位：米
        Integer skip = 56; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        String userId = ""; // String | 
        try {
            UserLocationsResultApiResponse result = apiInstance.userLocations(appKey, tag, type, x, y, sphere, skip, take, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserLocationApi#userLocations");
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
| **tag** | **String**| 标签 | [optional] |
| **type** | **String**| 分类 | [optional] |
| **x** | **Double**| 纬度 | [optional] |
| **y** | **Double**| 经度 | [optional] |
| **sphere** | **Long**| 附近距离，单位：米 | [optional] |
| **skip** | **Integer**| 跳过的记录数 | [optional] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 10] |
| **userId** | **String**|  | [optional] [default to ] |

### Return type

[**UserLocationsResultApiResponse**](UserLocationsResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userLocationsWithHttpInfo

> ApiResponse<UserLocationsResultApiResponse> userLocations userLocationsWithHttpInfo(appKey, tag, type, x, y, sphere, skip, take, userId)

获取位置列表

根据条件获取位置列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserLocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserLocationApi apiInstance = new UserLocationApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String tag = "tag_example"; // String | 标签
        String type = "type_example"; // String | 分类
        Double x = 3.4D; // Double | 纬度
        Double y = 3.4D; // Double | 经度
        Long sphere = 56L; // Long | 附近距离，单位：米
        Integer skip = 56; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        String userId = ""; // String | 
        try {
            ApiResponse<UserLocationsResultApiResponse> response = apiInstance.userLocationsWithHttpInfo(appKey, tag, type, x, y, sphere, skip, take, userId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserLocationApi#userLocations");
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
| **tag** | **String**| 标签 | [optional] |
| **type** | **String**| 分类 | [optional] |
| **x** | **Double**| 纬度 | [optional] |
| **y** | **Double**| 经度 | [optional] |
| **sphere** | **Long**| 附近距离，单位：米 | [optional] |
| **skip** | **Integer**| 跳过的记录数 | [optional] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 10] |
| **userId** | **String**|  | [optional] [default to ] |

### Return type

ApiResponse<[**UserLocationsResultApiResponse**](UserLocationsResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

