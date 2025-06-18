# StorageApi

All URIs are relative to *https://api-dev.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**storageAggregate**](StorageApi.md#storageAggregate) | **GET** /Storage/{appKey}/{table}/Aggregate | 聚合查询 |
| [**storageAggregateWithHttpInfo**](StorageApi.md#storageAggregateWithHttpInfo) | **GET** /Storage/{appKey}/{table}/Aggregate | 聚合查询 |
| [**storageDelete**](StorageApi.md#storageDelete) | **DELETE** /Storage/{appKey}/{table}/{id} | 删除数据 |
| [**storageDeleteWithHttpInfo**](StorageApi.md#storageDeleteWithHttpInfo) | **DELETE** /Storage/{appKey}/{table}/{id} | 删除数据 |
| [**storageDetail**](StorageApi.md#storageDetail) | **GET** /Storage/{appKey}/{table}/{id} | 数据详情 |
| [**storageDetailWithHttpInfo**](StorageApi.md#storageDetailWithHttpInfo) | **GET** /Storage/{appKey}/{table}/{id} | 数据详情 |
| [**storageList**](StorageApi.md#storageList) | **GET** /Storage/{appKey}/{table} | 查询数据 |
| [**storageListWithHttpInfo**](StorageApi.md#storageListWithHttpInfo) | **GET** /Storage/{appKey}/{table} | 查询数据 |
| [**storagePost**](StorageApi.md#storagePost) | **POST** /Storage/{appKey}/{table} | 添加数据 |
| [**storagePostWithHttpInfo**](StorageApi.md#storagePostWithHttpInfo) | **POST** /Storage/{appKey}/{table} | 添加数据 |
| [**storagePut**](StorageApi.md#storagePut) | **PUT** /Storage/{appKey}/{table}/{id} | 更新数据 |
| [**storagePutWithHttpInfo**](StorageApi.md#storagePutWithHttpInfo) | **PUT** /Storage/{appKey}/{table}/{id} | 更新数据 |



## storageAggregate

> ObjectListApiResponse storageAggregate(table, appKey, pipeline)

聚合查询

根据聚合管道查询指定表中的数据

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.StorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        String pipeline = "pipeline_example"; // String | 构建聚合查询
        try {
            ObjectListApiResponse result = apiInstance.storageAggregate(table, appKey, pipeline);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageAggregate");
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
| **table** | **String**| 表名称 | |
| **appKey** | **String**|  | |
| **pipeline** | **String**| 构建聚合查询 | [optional] |

### Return type

[**ObjectListApiResponse**](ObjectListApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## storageAggregateWithHttpInfo

> ApiResponse<ObjectListApiResponse> storageAggregate storageAggregateWithHttpInfo(table, appKey, pipeline)

聚合查询

根据聚合管道查询指定表中的数据

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.StorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        String pipeline = "pipeline_example"; // String | 构建聚合查询
        try {
            ApiResponse<ObjectListApiResponse> response = apiInstance.storageAggregateWithHttpInfo(table, appKey, pipeline);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageAggregate");
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
| **table** | **String**| 表名称 | |
| **appKey** | **String**|  | |
| **pipeline** | **String**| 构建聚合查询 | [optional] |

### Return type

ApiResponse<[**ObjectListApiResponse**](ObjectListApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## storageDelete

> BooleanApiResponse storageDelete(table, id, appKey)

删除数据

删除指定表中指定ID的数据

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.StorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String id = "id_example"; // String | 数据ID
        String appKey = "appKey_example"; // String | 
        try {
            BooleanApiResponse result = apiInstance.storageDelete(table, id, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageDelete");
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
| **table** | **String**| 表名称 | |
| **id** | **String**| 数据ID | |
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

## storageDeleteWithHttpInfo

> ApiResponse<BooleanApiResponse> storageDelete storageDeleteWithHttpInfo(table, id, appKey)

删除数据

删除指定表中指定ID的数据

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.StorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String id = "id_example"; // String | 数据ID
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.storageDeleteWithHttpInfo(table, id, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageDelete");
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
| **table** | **String**| 表名称 | |
| **id** | **String**| 数据ID | |
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


## storageDetail

> ObjectApiResponse storageDetail(table, id, appKey, project)

数据详情

获取指定表中指定ID的数据详情

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.StorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String id = "id_example"; // String | 数据ID
        String appKey = "appKey_example"; // String | 
        String project = "project_example"; // String | json格式
        try {
            ObjectApiResponse result = apiInstance.storageDetail(table, id, appKey, project);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageDetail");
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
| **table** | **String**| 表名称 | |
| **id** | **String**| 数据ID | |
| **appKey** | **String**|  | |
| **project** | **String**| json格式 | [optional] |

### Return type

[**ObjectApiResponse**](ObjectApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## storageDetailWithHttpInfo

> ApiResponse<ObjectApiResponse> storageDetail storageDetailWithHttpInfo(table, id, appKey, project)

数据详情

获取指定表中指定ID的数据详情

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.StorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String id = "id_example"; // String | 数据ID
        String appKey = "appKey_example"; // String | 
        String project = "project_example"; // String | json格式
        try {
            ApiResponse<ObjectApiResponse> response = apiInstance.storageDetailWithHttpInfo(table, id, appKey, project);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageDetail");
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
| **table** | **String**| 表名称 | |
| **id** | **String**| 数据ID | |
| **appKey** | **String**|  | |
| **project** | **String**| json格式 | [optional] |

### Return type

ApiResponse<[**ObjectApiResponse**](ObjectApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## storageList

> StorageListResultApiResponse storageList(table, appKey, filter, project, sort, startTime, endTime, explain, take, skip)

查询数据

根据条件查询指定表中的数据

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.StorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        String filter = "filter_example"; // String | 过滤，json格式
        String project = "project_example"; // String | 字段映射，json格式
        String sort = "sort_example"; // String | 排序，json格式
        OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | 开始时间
        OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | 结束时间
        Boolean explain = false; // Boolean | 查看执行计划
        Integer take = 10; // Integer | 默认为10
        Integer skip = 0; // Integer | 默认为0
        try {
            StorageListResultApiResponse result = apiInstance.storageList(table, appKey, filter, project, sort, startTime, endTime, explain, take, skip);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageList");
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
| **table** | **String**| 表名称 | |
| **appKey** | **String**|  | |
| **filter** | **String**| 过滤，json格式 | [optional] |
| **project** | **String**| 字段映射，json格式 | [optional] |
| **sort** | **String**| 排序，json格式 | [optional] |
| **startTime** | **OffsetDateTime**| 开始时间 | [optional] |
| **endTime** | **OffsetDateTime**| 结束时间 | [optional] |
| **explain** | **Boolean**| 查看执行计划 | [optional] [default to false] |
| **take** | **Integer**| 默认为10 | [optional] [default to 10] |
| **skip** | **Integer**| 默认为0 | [optional] [default to 0] |

### Return type

[**StorageListResultApiResponse**](StorageListResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## storageListWithHttpInfo

> ApiResponse<StorageListResultApiResponse> storageList storageListWithHttpInfo(table, appKey, filter, project, sort, startTime, endTime, explain, take, skip)

查询数据

根据条件查询指定表中的数据

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.StorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        String filter = "filter_example"; // String | 过滤，json格式
        String project = "project_example"; // String | 字段映射，json格式
        String sort = "sort_example"; // String | 排序，json格式
        OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | 开始时间
        OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | 结束时间
        Boolean explain = false; // Boolean | 查看执行计划
        Integer take = 10; // Integer | 默认为10
        Integer skip = 0; // Integer | 默认为0
        try {
            ApiResponse<StorageListResultApiResponse> response = apiInstance.storageListWithHttpInfo(table, appKey, filter, project, sort, startTime, endTime, explain, take, skip);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageList");
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
| **table** | **String**| 表名称 | |
| **appKey** | **String**|  | |
| **filter** | **String**| 过滤，json格式 | [optional] |
| **project** | **String**| 字段映射，json格式 | [optional] |
| **sort** | **String**| 排序，json格式 | [optional] |
| **startTime** | **OffsetDateTime**| 开始时间 | [optional] |
| **endTime** | **OffsetDateTime**| 结束时间 | [optional] |
| **explain** | **Boolean**| 查看执行计划 | [optional] [default to false] |
| **take** | **Integer**| 默认为10 | [optional] [default to 10] |
| **skip** | **Integer**| 默认为0 | [optional] [default to 0] |

### Return type

ApiResponse<[**StorageListResultApiResponse**](StorageListResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## storagePost

> StringApiResponse storagePost(table, appKey, requestBody)

添加数据

向指定表中添加数据，可以是单个json对象或json数组

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.StorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称（小写字母加数字,1-50位）
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | json对象 / json数组
        try {
            StringApiResponse result = apiInstance.storagePost(table, appKey, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storagePost");
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
| **table** | **String**| 表名称（小写字母加数字,1-50位） | |
| **appKey** | **String**|  | |
| **requestBody** | [**List&lt;Object&gt;**](Object.md)| json对象 / json数组 | |

### Return type

[**StringApiResponse**](StringApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## storagePostWithHttpInfo

> ApiResponse<StringApiResponse> storagePost storagePostWithHttpInfo(table, appKey, requestBody)

添加数据

向指定表中添加数据，可以是单个json对象或json数组

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.StorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称（小写字母加数字,1-50位）
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | json对象 / json数组
        try {
            ApiResponse<StringApiResponse> response = apiInstance.storagePostWithHttpInfo(table, appKey, requestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storagePost");
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
| **table** | **String**| 表名称（小写字母加数字,1-50位） | |
| **appKey** | **String**|  | |
| **requestBody** | [**List&lt;Object&gt;**](Object.md)| json对象 / json数组 | |

### Return type

ApiResponse<[**StringApiResponse**](StringApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## storagePut

> BooleanApiResponse storagePut(table, id, appKey, requestBody, replace)

更新数据

更新指定表中指定ID的数据，可以选择全量更新或部分更新

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.StorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String id = "id_example"; // String | 数据ID
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | json格式
        Boolean replace = false; // Boolean | 是否为全量更新，默认为false
        try {
            BooleanApiResponse result = apiInstance.storagePut(table, id, appKey, requestBody, replace);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storagePut");
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
| **table** | **String**| 表名称 | |
| **id** | **String**| 数据ID | |
| **appKey** | **String**|  | |
| **requestBody** | [**List&lt;Object&gt;**](Object.md)| json格式 | |
| **replace** | **Boolean**| 是否为全量更新，默认为false | [optional] [default to false] |

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

## storagePutWithHttpInfo

> ApiResponse<BooleanApiResponse> storagePut storagePutWithHttpInfo(table, id, appKey, requestBody, replace)

更新数据

更新指定表中指定ID的数据，可以选择全量更新或部分更新

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.StorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String id = "id_example"; // String | 数据ID
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | json格式
        Boolean replace = false; // Boolean | 是否为全量更新，默认为false
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.storagePutWithHttpInfo(table, id, appKey, requestBody, replace);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storagePut");
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
| **table** | **String**| 表名称 | |
| **id** | **String**| 数据ID | |
| **appKey** | **String**|  | |
| **requestBody** | [**List&lt;Object&gt;**](Object.md)| json格式 | |
| **replace** | **Boolean**| 是否为全量更新，默认为false | [optional] [default to false] |

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

