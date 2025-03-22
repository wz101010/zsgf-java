# StorageApi

All URIs are relative to *https://api-staging.paomo.fun*

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

> JObjectApiResult storageAggregate(table, appKey, pipeline)

聚合查询

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        String pipeline = "pipeline_example"; // String | 构建聚合查询
        try {
            JObjectApiResult result = apiInstance.storageAggregate(table, appKey, pipeline);
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

## storageAggregateWithHttpInfo

> ApiResponse<JObjectApiResult> storageAggregate storageAggregateWithHttpInfo(table, appKey, pipeline)

聚合查询

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        String pipeline = "pipeline_example"; // String | 构建聚合查询
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.storageAggregateWithHttpInfo(table, appKey, pipeline);
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


## storageClear

> JObjectApiResult storageClear(table, appKey, filter)

清空表数据

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        String filter = "filter_example"; // String | 筛选条件
        try {
            JObjectApiResult result = apiInstance.storageClear(table, appKey, filter);
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
| **filter** | **String**| 筛选条件 | [optional] |

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

## storageClearWithHttpInfo

> ApiResponse<JObjectApiResult> storageClear storageClearWithHttpInfo(table, appKey, filter)

清空表数据

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        String filter = "filter_example"; // String | 筛选条件
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.storageClearWithHttpInfo(table, appKey, filter);
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
| **filter** | **String**| 筛选条件 | [optional] |

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


## storageDelete

> JObjectApiResult storageDelete(table, id, appKey)

删除数据

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String id = "id_example"; // String | 数据ID
        String appKey = "appKey_example"; // String | 
        try {
            JObjectApiResult result = apiInstance.storageDelete(table, id, appKey);
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

## storageDeleteWithHttpInfo

> ApiResponse<JObjectApiResult> storageDelete storageDeleteWithHttpInfo(table, id, appKey)

删除数据

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String id = "id_example"; // String | 数据ID
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.storageDeleteWithHttpInfo(table, id, appKey);
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


## storageDeleteIndex

> JObjectApiResult storageDeleteIndex(table, appKey, indexName)

删除索引

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        String indexName = "indexName_example"; // String | 索引名称
        try {
            JObjectApiResult result = apiInstance.storageDeleteIndex(table, appKey, indexName);
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

## storageDeleteIndexWithHttpInfo

> ApiResponse<JObjectApiResult> storageDeleteIndex storageDeleteIndexWithHttpInfo(table, appKey, indexName)

删除索引

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        String indexName = "indexName_example"; // String | 索引名称
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.storageDeleteIndexWithHttpInfo(table, appKey, indexName);
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


## storageDetail

> JObjectApiResult storageDetail(table, id, appKey, project)

数据详情

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String id = "id_example"; // String | 数据ID
        String appKey = "appKey_example"; // String | 
        String project = "project_example"; // String | json格式
        try {
            JObjectApiResult result = apiInstance.storageDetail(table, id, appKey, project);
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

## storageDetailWithHttpInfo

> ApiResponse<JObjectApiResult> storageDetail storageDetailWithHttpInfo(table, id, appKey, project)

数据详情

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String id = "id_example"; // String | 数据ID
        String appKey = "appKey_example"; // String | 
        String project = "project_example"; // String | json格式
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.storageDetailWithHttpInfo(table, id, appKey, project);
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


## storageExecuteFunction

> JObjectApiResult storageExecuteFunction(nonce, timestamp, signature, appKey, executeFunctionRequest)

执行函数

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String nonce = "nonce_example"; // String | 
        Long timestamp = 56L; // Long | 
        String signature = "signature_example"; // String | 
        String appKey = "appKey_example"; // String | 
        ExecuteFunctionRequest executeFunctionRequest = new ExecuteFunctionRequest(); // ExecuteFunctionRequest | 
        try {
            JObjectApiResult result = apiInstance.storageExecuteFunction(nonce, timestamp, signature, appKey, executeFunctionRequest);
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
| **nonce** | **String**|  | |
| **timestamp** | **Long**|  | |
| **signature** | **String**|  | |
| **appKey** | **String**|  | |
| **executeFunctionRequest** | [**ExecuteFunctionRequest**](ExecuteFunctionRequest.md)|  | [optional] |

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

## storageExecuteFunctionWithHttpInfo

> ApiResponse<JObjectApiResult> storageExecuteFunction storageExecuteFunctionWithHttpInfo(nonce, timestamp, signature, appKey, executeFunctionRequest)

执行函数

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String nonce = "nonce_example"; // String | 
        Long timestamp = 56L; // Long | 
        String signature = "signature_example"; // String | 
        String appKey = "appKey_example"; // String | 
        ExecuteFunctionRequest executeFunctionRequest = new ExecuteFunctionRequest(); // ExecuteFunctionRequest | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.storageExecuteFunctionWithHttpInfo(nonce, timestamp, signature, appKey, executeFunctionRequest);
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
| **nonce** | **String**|  | |
| **timestamp** | **Long**|  | |
| **signature** | **String**|  | |
| **appKey** | **String**|  | |
| **executeFunctionRequest** | [**ExecuteFunctionRequest**](ExecuteFunctionRequest.md)|  | [optional] |

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


## storageExport

> File storageExport(table, appKey, filter, startTime, endTime)

导出数据

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 
        String appKey = "appKey_example"; // String | 
        String filter = "filter_example"; // String | 
        OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | 
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
| **table** | **String**|  | |
| **appKey** | **String**|  | |
| **filter** | **String**|  | [optional] |
| **startTime** | **OffsetDateTime**|  | [optional] |
| **endTime** | **OffsetDateTime**|  | [optional] |

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 
        String appKey = "appKey_example"; // String | 
        String filter = "filter_example"; // String | 
        OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | 
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
| **table** | **String**|  | |
| **appKey** | **String**|  | |
| **filter** | **String**|  | [optional] |
| **startTime** | **OffsetDateTime**|  | [optional] |
| **endTime** | **OffsetDateTime**|  | [optional] |

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

> JObjectApiResult storageImport(table, appKey, _file)

导入数据

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        File _file = new File("/path/to/file"); // File | 导入的文件
        try {
            JObjectApiResult result = apiInstance.storageImport(table, appKey, _file);
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

[**JObjectApiResult**](JObjectApiResult.md)


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

> ApiResponse<JObjectApiResult> storageImport storageImportWithHttpInfo(table, appKey, _file)

导入数据

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        File _file = new File("/path/to/file"); // File | 导入的文件
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.storageImportWithHttpInfo(table, appKey, _file);
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

ApiResponse<[**JObjectApiResult**](JObjectApiResult.md)>


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

> JObjectApiResult storageIndexes(table, appKey)

获取索引

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 
        String appKey = "appKey_example"; // String | 
        try {
            JObjectApiResult result = apiInstance.storageIndexes(table, appKey);
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
| **table** | **String**|  | |
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

## storageIndexesWithHttpInfo

> ApiResponse<JObjectApiResult> storageIndexes storageIndexesWithHttpInfo(table, appKey)

获取索引

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.storageIndexesWithHttpInfo(table, appKey);
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
| **table** | **String**|  | |
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


## storageList

> JObjectApiResult storageList(table, appKey, filter, project, sort, startTime, endTime, explain, take, skip)

查询数据

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
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
            JObjectApiResult result = apiInstance.storageList(table, appKey, filter, project, sort, startTime, endTime, explain, take, skip);
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

## storageListWithHttpInfo

> ApiResponse<JObjectApiResult> storageList storageListWithHttpInfo(table, appKey, filter, project, sort, startTime, endTime, explain, take, skip)

查询数据

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
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
            ApiResponse<JObjectApiResult> response = apiInstance.storageListWithHttpInfo(table, appKey, filter, project, sort, startTime, endTime, explain, take, skip);
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


## storagePost

> JObjectApiResult storagePost(table, appKey, requestBody)

添加数据

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称（小写字母加数字,1-50位）
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | json对象 / json数组
        try {
            JObjectApiResult result = apiInstance.storagePost(table, appKey, requestBody);
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

## storagePostWithHttpInfo

> ApiResponse<JObjectApiResult> storagePost storagePostWithHttpInfo(table, appKey, requestBody)

添加数据

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称（小写字母加数字,1-50位）
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | json对象 / json数组
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.storagePostWithHttpInfo(table, appKey, requestBody);
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


## storagePostIndex

> JObjectApiResult storagePostIndex(table, appKey, postIndexRequest)

添加索引

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称（小写字母加数字,1-50位）
        String appKey = "appKey_example"; // String | 
        PostIndexRequest postIndexRequest = new PostIndexRequest(); // PostIndexRequest | json对象 / json数组
        try {
            JObjectApiResult result = apiInstance.storagePostIndex(table, appKey, postIndexRequest);
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

## storagePostIndexWithHttpInfo

> ApiResponse<JObjectApiResult> storagePostIndex storagePostIndexWithHttpInfo(table, appKey, postIndexRequest)

添加索引

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称（小写字母加数字,1-50位）
        String appKey = "appKey_example"; // String | 
        PostIndexRequest postIndexRequest = new PostIndexRequest(); // PostIndexRequest | json对象 / json数组
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.storagePostIndexWithHttpInfo(table, appKey, postIndexRequest);
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


## storagePut

> JObjectApiResult storagePut(table, id, appKey, body, replace)

更新数据

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
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
            JObjectApiResult result = apiInstance.storagePut(table, id, appKey, body, replace);
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

## storagePutWithHttpInfo

> ApiResponse<JObjectApiResult> storagePut storagePutWithHttpInfo(table, id, appKey, body, replace)

更新数据

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
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
            ApiResponse<JObjectApiResult> response = apiInstance.storagePutWithHttpInfo(table, id, appKey, body, replace);
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


## storageRemove

> JObjectApiResult storageRemove(table, appKey)

删除表

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        try {
            JObjectApiResult result = apiInstance.storageRemove(table, appKey);
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

## storageRemoveWithHttpInfo

> ApiResponse<JObjectApiResult> storageRemove storageRemoveWithHttpInfo(table, appKey)

删除表

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.storageRemoveWithHttpInfo(table, appKey);
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


## storageStats

> JObjectApiResult storageStats(table, appKey)

数据表统计

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        try {
            JObjectApiResult result = apiInstance.storageStats(table, appKey);
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

## storageStatsWithHttpInfo

> ApiResponse<JObjectApiResult> storageStats storageStatsWithHttpInfo(table, appKey)

数据表统计

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String table = "table_example"; // String | 表名称
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.storageStatsWithHttpInfo(table, appKey);
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


## storageTables

> JObjectApiResult storageTables(appKey)

获取数据表

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            JObjectApiResult result = apiInstance.storageTables(appKey);
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

## storageTablesWithHttpInfo

> ApiResponse<JObjectApiResult> storageTables storageTablesWithHttpInfo(appKey)

获取数据表

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
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StorageApi apiInstance = new StorageApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.storageTablesWithHttpInfo(appKey);
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

