# StorageApi

All URIs are relative to *https://api.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**storageAggregate**](StorageApi.md#storageAggregate) | **GET** /Storage/{appKey}/{table}/Aggregate | 聚合查询 |
| [**storageAggregateWithHttpInfo**](StorageApi.md#storageAggregateWithHttpInfo) | **GET** /Storage/{appKey}/{table}/Aggregate | 聚合查询 |
| [**storageClear**](StorageApi.md#storageClear) | **DELETE** /Storage/{appKey}/{table}/Clear | 清空表数据 |
| [**storageClearWithHttpInfo**](StorageApi.md#storageClearWithHttpInfo) | **DELETE** /Storage/{appKey}/{table}/Clear | 清空表数据 |
| [**storageDelete**](StorageApi.md#storageDelete) | **DELETE** /Storage/{appKey}/{table}/{id} | 删除数据 |
| [**storageDeleteWithHttpInfo**](StorageApi.md#storageDeleteWithHttpInfo) | **DELETE** /Storage/{appKey}/{table}/{id} | 删除数据 |
| [**storageDeleteIndex**](StorageApi.md#storageDeleteIndex) | **DELETE** /Storage/{appKey}/{table}/indexes | 删除索引 |
| [**storageDeleteIndexWithHttpInfo**](StorageApi.md#storageDeleteIndexWithHttpInfo) | **DELETE** /Storage/{appKey}/{table}/indexes | 删除索引 |
| [**storageDetail**](StorageApi.md#storageDetail) | **GET** /Storage/{appKey}/{table}/{id} | 数据详情 |
| [**storageDetailWithHttpInfo**](StorageApi.md#storageDetailWithHttpInfo) | **GET** /Storage/{appKey}/{table}/{id} | 数据详情 |
| [**storageExecuteFunction**](StorageApi.md#storageExecuteFunction) | **GET** /Storage/{appKey}/ExecuteFunction | 执行函数 |
| [**storageExecuteFunctionWithHttpInfo**](StorageApi.md#storageExecuteFunctionWithHttpInfo) | **GET** /Storage/{appKey}/ExecuteFunction | 执行函数 |
| [**storageExport**](StorageApi.md#storageExport) | **GET** /Storage/{appKey}/{table}/Export | 导出数据 |
| [**storageExportWithHttpInfo**](StorageApi.md#storageExportWithHttpInfo) | **GET** /Storage/{appKey}/{table}/Export | 导出数据 |
| [**storageImport**](StorageApi.md#storageImport) | **POST** /Storage/{appKey}/{table}/Import | 导入数据 |
| [**storageImportWithHttpInfo**](StorageApi.md#storageImportWithHttpInfo) | **POST** /Storage/{appKey}/{table}/Import | 导入数据 |
| [**storageIndexes**](StorageApi.md#storageIndexes) | **GET** /Storage/{appKey}/{table}/Indexes | 获取索引 |
| [**storageIndexesWithHttpInfo**](StorageApi.md#storageIndexesWithHttpInfo) | **GET** /Storage/{appKey}/{table}/Indexes | 获取索引 |
| [**storageList**](StorageApi.md#storageList) | **GET** /Storage/{appKey}/{table} | 查询数据 |
| [**storageListWithHttpInfo**](StorageApi.md#storageListWithHttpInfo) | **GET** /Storage/{appKey}/{table} | 查询数据 |
| [**storagePost**](StorageApi.md#storagePost) | **POST** /Storage/{appKey}/{table} | 添加数据 |
| [**storagePostWithHttpInfo**](StorageApi.md#storagePostWithHttpInfo) | **POST** /Storage/{appKey}/{table} | 添加数据 |
| [**storagePostIndex**](StorageApi.md#storagePostIndex) | **POST** /Storage/{appKey}/{table}/indexes | 添加索引 |
| [**storagePostIndexWithHttpInfo**](StorageApi.md#storagePostIndexWithHttpInfo) | **POST** /Storage/{appKey}/{table}/indexes | 添加索引 |
| [**storagePut**](StorageApi.md#storagePut) | **PUT** /Storage/{appKey}/{table}/{id} | 更新数据 |
| [**storagePutWithHttpInfo**](StorageApi.md#storagePutWithHttpInfo) | **PUT** /Storage/{appKey}/{table}/{id} | 更新数据 |
| [**storageRemove**](StorageApi.md#storageRemove) | **DELETE** /Storage/{appKey}/{table}/Remove | 删除表 |
| [**storageRemoveWithHttpInfo**](StorageApi.md#storageRemoveWithHttpInfo) | **DELETE** /Storage/{appKey}/{table}/Remove | 删除表 |
| [**storageStats**](StorageApi.md#storageStats) | **GET** /Storage/{appKey}/{table}/Stats | 数据表统计 |
| [**storageStatsWithHttpInfo**](StorageApi.md#storageStatsWithHttpInfo) | **GET** /Storage/{appKey}/{table}/Stats | 数据表统计 |
| [**storageTables**](StorageApi.md#storageTables) | **GET** /Storage/{appKey}/Tables | 获取数据表 |
| [**storageTablesWithHttpInfo**](StorageApi.md#storageTablesWithHttpInfo) | **GET** /Storage/{appKey}/Tables | 获取数据表 |



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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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


## storageClear

> Int64ApiResponse storageClear(table, appKey, filter)

清空表数据

根据筛选条件清空指定表中的数据

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        String filter = "filter_example"; // String | 筛选条件，json格式
        try {
            Int64ApiResponse result = apiInstance.storageClear(table, appKey, filter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageClear");
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
| **filter** | **String**| 筛选条件，json格式 | [optional] |

### Return type

[**Int64ApiResponse**](Int64ApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## storageClearWithHttpInfo

> ApiResponse<Int64ApiResponse> storageClear storageClearWithHttpInfo(table, appKey, filter)

清空表数据

根据筛选条件清空指定表中的数据

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        String filter = "filter_example"; // String | 筛选条件，json格式
        try {
            ApiResponse<Int64ApiResponse> response = apiInstance.storageClearWithHttpInfo(table, appKey, filter);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageClear");
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
| **filter** | **String**| 筛选条件，json格式 | [optional] |

### Return type

ApiResponse<[**Int64ApiResponse**](Int64ApiResponse.md)>


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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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


## storageDeleteIndex

> BooleanApiResponse storageDeleteIndex(table, appKey, indexName)

删除索引

删除指定表的指定索引

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        String indexName = "indexName_example"; // String | 索引名称
        try {
            BooleanApiResponse result = apiInstance.storageDeleteIndex(table, appKey, indexName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageDeleteIndex");
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
| **indexName** | **String**| 索引名称 | [optional] |

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

## storageDeleteIndexWithHttpInfo

> ApiResponse<BooleanApiResponse> storageDeleteIndex storageDeleteIndexWithHttpInfo(table, appKey, indexName)

删除索引

删除指定表的指定索引

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        String indexName = "indexName_example"; // String | 索引名称
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.storageDeleteIndexWithHttpInfo(table, appKey, indexName);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageDeleteIndex");
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
| **indexName** | **String**| 索引名称 | [optional] |

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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


## storageExecuteFunction

> ObjectApiResponse storageExecuteFunction(nonce, timestamp, signature, appKey, executeFunctionRequest)

执行函数

执行指定的函数

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String nonce = "nonce_example"; // String | 随机字符串
        Long timestamp = 56L; // Long | 时间戳
        String signature = "signature_example"; // String | 签名
        String appKey = "appKey_example"; // String | 
        ExecuteFunctionRequest executeFunctionRequest = new ExecuteFunctionRequest(); // ExecuteFunctionRequest | 函数请求参数
        try {
            ObjectApiResponse result = apiInstance.storageExecuteFunction(nonce, timestamp, signature, appKey, executeFunctionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageExecuteFunction");
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
| **nonce** | **String**| 随机字符串 | |
| **timestamp** | **Long**| 时间戳 | |
| **signature** | **String**| 签名 | |
| **appKey** | **String**|  | |
| **executeFunctionRequest** | [**ExecuteFunctionRequest**](ExecuteFunctionRequest.md)| 函数请求参数 | [optional] |

### Return type

[**ObjectApiResponse**](ObjectApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## storageExecuteFunctionWithHttpInfo

> ApiResponse<ObjectApiResponse> storageExecuteFunction storageExecuteFunctionWithHttpInfo(nonce, timestamp, signature, appKey, executeFunctionRequest)

执行函数

执行指定的函数

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String nonce = "nonce_example"; // String | 随机字符串
        Long timestamp = 56L; // Long | 时间戳
        String signature = "signature_example"; // String | 签名
        String appKey = "appKey_example"; // String | 
        ExecuteFunctionRequest executeFunctionRequest = new ExecuteFunctionRequest(); // ExecuteFunctionRequest | 函数请求参数
        try {
            ApiResponse<ObjectApiResponse> response = apiInstance.storageExecuteFunctionWithHttpInfo(nonce, timestamp, signature, appKey, executeFunctionRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageExecuteFunction");
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
| **nonce** | **String**| 随机字符串 | |
| **timestamp** | **Long**| 时间戳 | |
| **signature** | **String**| 签名 | |
| **appKey** | **String**|  | |
| **executeFunctionRequest** | [**ExecuteFunctionRequest**](ExecuteFunctionRequest.md)| 函数请求参数 | [optional] |

### Return type

ApiResponse<[**ObjectApiResponse**](ObjectApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## storageExport

> File storageExport(table, appKey, filter, startTime, endTime)

导出数据

根据筛选条件导出指定表中的数据

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        String filter = "filter_example"; // String | 筛选条件，json格式
        OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | 开始时间
        OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | 结束时间
        try {
            File result = apiInstance.storageExport(table, appKey, filter, startTime, endTime);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageExport");
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
| **filter** | **String**| 筛选条件，json格式 | [optional] |
| **startTime** | **OffsetDateTime**| 开始时间 | [optional] |
| **endTime** | **OffsetDateTime**| 结束时间 | [optional] |

### Return type

[**File**](File.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## storageExportWithHttpInfo

> ApiResponse<File> storageExport storageExportWithHttpInfo(table, appKey, filter, startTime, endTime)

导出数据

根据筛选条件导出指定表中的数据

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        String filter = "filter_example"; // String | 筛选条件，json格式
        OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | 开始时间
        OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | 结束时间
        try {
            ApiResponse<File> response = apiInstance.storageExportWithHttpInfo(table, appKey, filter, startTime, endTime);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageExport");
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
| **filter** | **String**| 筛选条件，json格式 | [optional] |
| **startTime** | **OffsetDateTime**| 开始时间 | [optional] |
| **endTime** | **OffsetDateTime**| 结束时间 | [optional] |

### Return type

ApiResponse<[**File**](File.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## storageImport

> BooleanApiResponse storageImport(table, appKey, _file)

导入数据

从文件导入数据到指定表中

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        File _file = new File("/path/to/file"); // File | 导入的文件
        try {
            BooleanApiResponse result = apiInstance.storageImport(table, appKey, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageImport");
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
| **_file** | **File**| 导入的文件 | [optional] |

### Return type

[**BooleanApiResponse**](BooleanApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## storageImportWithHttpInfo

> ApiResponse<BooleanApiResponse> storageImport storageImportWithHttpInfo(table, appKey, _file)

导入数据

从文件导入数据到指定表中

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        File _file = new File("/path/to/file"); // File | 导入的文件
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.storageImportWithHttpInfo(table, appKey, _file);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageImport");
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
| **_file** | **File**| 导入的文件 | [optional] |

### Return type

ApiResponse<[**BooleanApiResponse**](BooleanApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## storageIndexes

> ObjectListApiResponse storageIndexes(table, appKey)

获取索引

获取指定表的索引列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        try {
            ObjectListApiResponse result = apiInstance.storageIndexes(table, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageIndexes");
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

## storageIndexesWithHttpInfo

> ApiResponse<ObjectListApiResponse> storageIndexes storageIndexesWithHttpInfo(table, appKey)

获取索引

获取指定表的索引列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<ObjectListApiResponse> response = apiInstance.storageIndexesWithHttpInfo(table, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageIndexes");
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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


## storagePostIndex

> StringApiResponse storagePostIndex(table, appKey, postIndexRequest)

添加索引

为指定表添加索引

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称（小写字母加数字,1-50位）
        String appKey = "appKey_example"; // String | 
        PostIndexRequest postIndexRequest = new PostIndexRequest(); // PostIndexRequest | json对象 / json数组
        try {
            StringApiResponse result = apiInstance.storagePostIndex(table, appKey, postIndexRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storagePostIndex");
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
| **postIndexRequest** | [**PostIndexRequest**](PostIndexRequest.md)| json对象 / json数组 | [optional] |

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

## storagePostIndexWithHttpInfo

> ApiResponse<StringApiResponse> storagePostIndex storagePostIndexWithHttpInfo(table, appKey, postIndexRequest)

添加索引

为指定表添加索引

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称（小写字母加数字,1-50位）
        String appKey = "appKey_example"; // String | 
        PostIndexRequest postIndexRequest = new PostIndexRequest(); // PostIndexRequest | json对象 / json数组
        try {
            ApiResponse<StringApiResponse> response = apiInstance.storagePostIndexWithHttpInfo(table, appKey, postIndexRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storagePostIndex");
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
| **postIndexRequest** | [**PostIndexRequest**](PostIndexRequest.md)| json对象 / json数组 | [optional] |

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

> BooleanApiResponse storagePut(table, id, appKey, body, replace)

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String id = "id_example"; // String | 数据ID
        String appKey = "appKey_example"; // String | 
        Object body = null; // Object | json格式
        Boolean replace = false; // Boolean | 是否为全量更新，默认为false
        try {
            BooleanApiResponse result = apiInstance.storagePut(table, id, appKey, body, replace);
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
| **body** | **Object**| json格式 | |
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

> ApiResponse<BooleanApiResponse> storagePut storagePutWithHttpInfo(table, id, appKey, body, replace)

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String id = "id_example"; // String | 数据ID
        String appKey = "appKey_example"; // String | 
        Object body = null; // Object | json格式
        Boolean replace = false; // Boolean | 是否为全量更新，默认为false
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.storagePutWithHttpInfo(table, id, appKey, body, replace);
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
| **body** | **Object**| json格式 | |
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


## storageRemove

> BooleanApiResponse storageRemove(table, appKey)

删除表

删除指定表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        try {
            BooleanApiResponse result = apiInstance.storageRemove(table, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageRemove");
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

## storageRemoveWithHttpInfo

> ApiResponse<BooleanApiResponse> storageRemove storageRemoveWithHttpInfo(table, appKey)

删除表

删除指定表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.storageRemoveWithHttpInfo(table, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageRemove");
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


## storageStats

> ObjectApiResponse storageStats(table, appKey)

数据表统计

获取指定表的数据统计信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        try {
            ObjectApiResponse result = apiInstance.storageStats(table, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageStats");
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

## storageStatsWithHttpInfo

> ApiResponse<ObjectApiResponse> storageStats storageStatsWithHttpInfo(table, appKey)

数据表统计

获取指定表的数据统计信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<ObjectApiResponse> response = apiInstance.storageStatsWithHttpInfo(table, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageStats");
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


## storageTables

> StringListApiResponse storageTables(appKey)

获取数据表

获取当前应用的所有数据表名称

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            StringListApiResponse result = apiInstance.storageTables(appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageTables");
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

[**StringListApiResponse**](StringListApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## storageTablesWithHttpInfo

> ApiResponse<StringListApiResponse> storageTables storageTablesWithHttpInfo(appKey)

获取数据表

获取当前应用的所有数据表名称

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<StringListApiResponse> response = apiInstance.storageTablesWithHttpInfo(appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi#storageTables");
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

ApiResponse<[**StringListApiResponse**](StringListApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

