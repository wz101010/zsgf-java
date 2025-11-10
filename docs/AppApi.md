# AppApi

All URIs are relative to *https://api-dev.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appInfo**](AppApi.md#appInfo) | **GET** /App/{appKey}/Info | 应用详情 |
| [**appInfoWithHttpInfo**](AppApi.md#appInfoWithHttpInfo) | **GET** /App/{appKey}/Info | 应用详情 |



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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
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

