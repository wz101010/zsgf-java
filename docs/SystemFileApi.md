# SystemFileApi

All URIs are relative to *https://api.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**systemFileCreateFolder**](SystemFileApi.md#systemFileCreateFolder) | **POST** /SystemFile/CreateFolder | 创建文件夹 |
| [**systemFileCreateFolderWithHttpInfo**](SystemFileApi.md#systemFileCreateFolderWithHttpInfo) | **POST** /SystemFile/CreateFolder | 创建文件夹 |
| [**systemFileDelete**](SystemFileApi.md#systemFileDelete) | **DELETE** /SystemFile | 删除文件 |
| [**systemFileDeleteWithHttpInfo**](SystemFileApi.md#systemFileDeleteWithHttpInfo) | **DELETE** /SystemFile | 删除文件 |
| [**systemFileRename**](SystemFileApi.md#systemFileRename) | **POST** /SystemFile/Rename | 重命名文件 |
| [**systemFileRenameWithHttpInfo**](SystemFileApi.md#systemFileRenameWithHttpInfo) | **POST** /SystemFile/Rename | 重命名文件 |
| [**systemFileUpload**](SystemFileApi.md#systemFileUpload) | **POST** /SystemFile | 上传文件 |
| [**systemFileUploadWithHttpInfo**](SystemFileApi.md#systemFileUploadWithHttpInfo) | **POST** /SystemFile | 上传文件 |
| [**systemFiles**](SystemFileApi.md#systemFiles) | **GET** /SystemFile | 获取文件列表 |
| [**systemFilesWithHttpInfo**](SystemFileApi.md#systemFilesWithHttpInfo) | **GET** /SystemFile | 获取文件列表 |



## systemFileCreateFolder

> BooleanApiResponse systemFileCreateFolder(path)

创建文件夹

根据指定路径创建文件夹

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.SystemFileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SystemFileApi apiInstance = new SystemFileApi(defaultClient);
        String path = "path_example"; // String | 文件夹路径
        try {
            BooleanApiResponse result = apiInstance.systemFileCreateFolder(path);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemFileApi#systemFileCreateFolder");
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

## systemFileCreateFolderWithHttpInfo

> ApiResponse<BooleanApiResponse> systemFileCreateFolder systemFileCreateFolderWithHttpInfo(path)

创建文件夹

根据指定路径创建文件夹

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.SystemFileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SystemFileApi apiInstance = new SystemFileApi(defaultClient);
        String path = "path_example"; // String | 文件夹路径
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.systemFileCreateFolderWithHttpInfo(path);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemFileApi#systemFileCreateFolder");
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


## systemFileDelete

> BooleanApiResponse systemFileDelete(path)

删除文件

根据指定路径删除文件

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.SystemFileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SystemFileApi apiInstance = new SystemFileApi(defaultClient);
        String path = "path_example"; // String | 文件路径
        try {
            BooleanApiResponse result = apiInstance.systemFileDelete(path);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemFileApi#systemFileDelete");
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
| **path** | **String**| 文件路径 | [optional] |

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

## systemFileDeleteWithHttpInfo

> ApiResponse<BooleanApiResponse> systemFileDelete systemFileDeleteWithHttpInfo(path)

删除文件

根据指定路径删除文件

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.SystemFileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SystemFileApi apiInstance = new SystemFileApi(defaultClient);
        String path = "path_example"; // String | 文件路径
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.systemFileDeleteWithHttpInfo(path);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemFileApi#systemFileDelete");
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
| **path** | **String**| 文件路径 | [optional] |

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


## systemFileRename

> BooleanApiResponse systemFileRename(sourceName, destName)

重命名文件

根据指定的源文件名和目标文件名重命名文件

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.SystemFileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SystemFileApi apiInstance = new SystemFileApi(defaultClient);
        String sourceName = "sourceName_example"; // String | 源文件名
        String destName = "destName_example"; // String | 目标文件名
        try {
            BooleanApiResponse result = apiInstance.systemFileRename(sourceName, destName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemFileApi#systemFileRename");
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
| **sourceName** | **String**| 源文件名 | [optional] |
| **destName** | **String**| 目标文件名 | [optional] |

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

## systemFileRenameWithHttpInfo

> ApiResponse<BooleanApiResponse> systemFileRename systemFileRenameWithHttpInfo(sourceName, destName)

重命名文件

根据指定的源文件名和目标文件名重命名文件

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.SystemFileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SystemFileApi apiInstance = new SystemFileApi(defaultClient);
        String sourceName = "sourceName_example"; // String | 源文件名
        String destName = "destName_example"; // String | 目标文件名
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.systemFileRenameWithHttpInfo(sourceName, destName);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemFileApi#systemFileRename");
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
| **sourceName** | **String**| 源文件名 | [optional] |
| **destName** | **String**| 目标文件名 | [optional] |

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


## systemFileUpload

> StringApiResponse systemFileUpload(path, _file)

上传文件

根据指定路径上传文件

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.SystemFileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SystemFileApi apiInstance = new SystemFileApi(defaultClient);
        String path = "path_example"; // String | 上传的路径
        File _file = new File("/path/to/file"); // File | 上传的文件
        try {
            StringApiResponse result = apiInstance.systemFileUpload(path, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemFileApi#systemFileUpload");
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
| **path** | **String**| 上传的路径 | [optional] |
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

## systemFileUploadWithHttpInfo

> ApiResponse<StringApiResponse> systemFileUpload systemFileUploadWithHttpInfo(path, _file)

上传文件

根据指定路径上传文件

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.SystemFileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SystemFileApi apiInstance = new SystemFileApi(defaultClient);
        String path = "path_example"; // String | 上传的路径
        File _file = new File("/path/to/file"); // File | 上传的文件
        try {
            ApiResponse<StringApiResponse> response = apiInstance.systemFileUploadWithHttpInfo(path, _file);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemFileApi#systemFileUpload");
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
| **path** | **String**| 上传的路径 | [optional] |
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


## systemFiles

> SystemFileListResultApiResponse systemFiles(path)

获取文件列表

根据指定路径获取文件列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.SystemFileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SystemFileApi apiInstance = new SystemFileApi(defaultClient);
        String path = "path_example"; // String | 文件路径
        try {
            SystemFileListResultApiResponse result = apiInstance.systemFiles(path);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemFileApi#systemFiles");
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
| **path** | **String**| 文件路径 | [optional] |

### Return type

[**SystemFileListResultApiResponse**](SystemFileListResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## systemFilesWithHttpInfo

> ApiResponse<SystemFileListResultApiResponse> systemFiles systemFilesWithHttpInfo(path)

获取文件列表

根据指定路径获取文件列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.SystemFileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SystemFileApi apiInstance = new SystemFileApi(defaultClient);
        String path = "path_example"; // String | 文件路径
        try {
            ApiResponse<SystemFileListResultApiResponse> response = apiInstance.systemFilesWithHttpInfo(path);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemFileApi#systemFiles");
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
| **path** | **String**| 文件路径 | [optional] |

### Return type

ApiResponse<[**SystemFileListResultApiResponse**](SystemFileListResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

