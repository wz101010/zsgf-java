# FileApi

All URIs are relative to *https://api-dev.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fileCreateFolder**](FileApi.md#fileCreateFolder) | **POST** /File/{appKey}/CreateFolder | 创建文件夹 |
| [**fileCreateFolderWithHttpInfo**](FileApi.md#fileCreateFolderWithHttpInfo) | **POST** /File/{appKey}/CreateFolder | 创建文件夹 |
| [**fileDelete**](FileApi.md#fileDelete) | **DELETE** /File/{appKey} | 删除文件 / 文件夹 |
| [**fileDeleteWithHttpInfo**](FileApi.md#fileDeleteWithHttpInfo) | **DELETE** /File/{appKey} | 删除文件 / 文件夹 |
| [**fileRename**](FileApi.md#fileRename) | **POST** /File/{appKey}/Rename | 重命名文件 / 文件夹 |
| [**fileRenameWithHttpInfo**](FileApi.md#fileRenameWithHttpInfo) | **POST** /File/{appKey}/Rename | 重命名文件 / 文件夹 |
| [**fileUpload**](FileApi.md#fileUpload) | **POST** /File/{appKey}/Upload | 上传文件 |
| [**fileUploadWithHttpInfo**](FileApi.md#fileUploadWithHttpInfo) | **POST** /File/{appKey}/Upload | 上传文件 |
| [**files**](FileApi.md#files) | **GET** /File/{appKey} | 获取文件列表 |
| [**filesWithHttpInfo**](FileApi.md#filesWithHttpInfo) | **GET** /File/{appKey} | 获取文件列表 |



## fileCreateFolder

> BooleanApiResponse fileCreateFolder(appKey, path)

创建文件夹

在指定路径创建文件夹

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.FileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        FileApi apiInstance = new FileApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String path = "path_example"; // String | 文件夹路径
        try {
            BooleanApiResponse result = apiInstance.fileCreateFolder(appKey, path);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileApi#fileCreateFolder");
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
| **path** | **String**| 文件夹路径 | [optional] |

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

## fileCreateFolderWithHttpInfo

> ApiResponse<BooleanApiResponse> fileCreateFolder fileCreateFolderWithHttpInfo(appKey, path)

创建文件夹

在指定路径创建文件夹

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.FileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        FileApi apiInstance = new FileApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String path = "path_example"; // String | 文件夹路径
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.fileCreateFolderWithHttpInfo(appKey, path);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FileApi#fileCreateFolder");
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
| **path** | **String**| 文件夹路径 | [optional] |

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


## fileDelete

> BooleanApiResponse fileDelete(appKey, path)

删除文件 / 文件夹

根据指定路径删除文件或文件夹

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.FileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        FileApi apiInstance = new FileApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String path = "path_example"; // String | 文件 / 文件夹路径
        try {
            BooleanApiResponse result = apiInstance.fileDelete(appKey, path);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileApi#fileDelete");
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
| **path** | **String**| 文件 / 文件夹路径 | [optional] |

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

## fileDeleteWithHttpInfo

> ApiResponse<BooleanApiResponse> fileDelete fileDeleteWithHttpInfo(appKey, path)

删除文件 / 文件夹

根据指定路径删除文件或文件夹

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.FileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        FileApi apiInstance = new FileApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String path = "path_example"; // String | 文件 / 文件夹路径
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.fileDeleteWithHttpInfo(appKey, path);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FileApi#fileDelete");
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
| **path** | **String**| 文件 / 文件夹路径 | [optional] |

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


## fileRename

> BooleanApiResponse fileRename(appKey, sourceName, destName)

重命名文件 / 文件夹

将指定的文件或文件夹重命名

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.FileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        FileApi apiInstance = new FileApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String sourceName = "sourceName_example"; // String | 原文件 / 文件夹名称
        String destName = "destName_example"; // String | 新文件 / 文件夹名称
        try {
            BooleanApiResponse result = apiInstance.fileRename(appKey, sourceName, destName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileApi#fileRename");
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
| **sourceName** | **String**| 原文件 / 文件夹名称 | [optional] |
| **destName** | **String**| 新文件 / 文件夹名称 | [optional] |

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

## fileRenameWithHttpInfo

> ApiResponse<BooleanApiResponse> fileRename fileRenameWithHttpInfo(appKey, sourceName, destName)

重命名文件 / 文件夹

将指定的文件或文件夹重命名

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.FileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        FileApi apiInstance = new FileApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String sourceName = "sourceName_example"; // String | 原文件 / 文件夹名称
        String destName = "destName_example"; // String | 新文件 / 文件夹名称
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.fileRenameWithHttpInfo(appKey, sourceName, destName);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FileApi#fileRename");
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
| **sourceName** | **String**| 原文件 / 文件夹名称 | [optional] |
| **destName** | **String**| 新文件 / 文件夹名称 | [optional] |

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


## fileUpload

> StringApiResponse fileUpload(appKey, path, _file)

上传文件

将文件上传到指定路径

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.FileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        FileApi apiInstance = new FileApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String path = "path_example"; // String | 文件夹路径
        File _file = new File("/path/to/file"); // File | 上传的文件
        try {
            StringApiResponse result = apiInstance.fileUpload(appKey, path, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileApi#fileUpload");
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
| **path** | **String**| 文件夹路径 | [optional] |
| **_file** | **File**| 上传的文件 | [optional] |

### Return type

[**StringApiResponse**](StringApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## fileUploadWithHttpInfo

> ApiResponse<StringApiResponse> fileUpload fileUploadWithHttpInfo(appKey, path, _file)

上传文件

将文件上传到指定路径

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.FileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        FileApi apiInstance = new FileApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String path = "path_example"; // String | 文件夹路径
        File _file = new File("/path/to/file"); // File | 上传的文件
        try {
            ApiResponse<StringApiResponse> response = apiInstance.fileUploadWithHttpInfo(appKey, path, _file);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FileApi#fileUpload");
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
| **path** | **String**| 文件夹路径 | [optional] |
| **_file** | **File**| 上传的文件 | [optional] |

### Return type

ApiResponse<[**StringApiResponse**](StringApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## files

> FileListResultApiResponse files(appKey, path, skip, take)

获取文件列表

根据指定路径获取文件和文件夹列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.FileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        FileApi apiInstance = new FileApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String path = "path_example"; // String | 文件路径
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 100; // Integer | 获取的记录数
        try {
            FileListResultApiResponse result = apiInstance.files(appKey, path, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileApi#files");
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
| **path** | **String**| 文件路径 | [optional] |
| **skip** | **Integer**| 跳过的记录数 | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 100] |

### Return type

[**FileListResultApiResponse**](FileListResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## filesWithHttpInfo

> ApiResponse<FileListResultApiResponse> files filesWithHttpInfo(appKey, path, skip, take)

获取文件列表

根据指定路径获取文件和文件夹列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.FileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        FileApi apiInstance = new FileApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String path = "path_example"; // String | 文件路径
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 100; // Integer | 获取的记录数
        try {
            ApiResponse<FileListResultApiResponse> response = apiInstance.filesWithHttpInfo(appKey, path, skip, take);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FileApi#files");
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
| **path** | **String**| 文件路径 | [optional] |
| **skip** | **Integer**| 跳过的记录数 | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 100] |

### Return type

ApiResponse<[**FileListResultApiResponse**](FileListResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

