# DingTalkApi

All URIs are relative to *https://api-dev.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dingTalkUserInfo**](DingTalkApi.md#dingTalkUserInfo) | **GET** /DingTalk/{appKey}/UserInfo | 获取用户资料 |
| [**dingTalkUserInfoWithHttpInfo**](DingTalkApi.md#dingTalkUserInfoWithHttpInfo) | **GET** /DingTalk/{appKey}/UserInfo | 获取用户资料 |



## dingTalkUserInfo

> StringApiResponse dingTalkUserInfo(appKey, code)

获取用户资料

根据钉钉用户授权码获取用户的详细资料。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.DingTalkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        DingTalkApi apiInstance = new DingTalkApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String code = "code_example"; // String | 钉钉用户授权码
        try {
            StringApiResponse result = apiInstance.dingTalkUserInfo(appKey, code);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DingTalkApi#dingTalkUserInfo");
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
| **code** | **String**| 钉钉用户授权码 | [optional] |

### Return type

[**StringApiResponse**](StringApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## dingTalkUserInfoWithHttpInfo

> ApiResponse<StringApiResponse> dingTalkUserInfo dingTalkUserInfoWithHttpInfo(appKey, code)

获取用户资料

根据钉钉用户授权码获取用户的详细资料。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.DingTalkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        DingTalkApi apiInstance = new DingTalkApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String code = "code_example"; // String | 钉钉用户授权码
        try {
            ApiResponse<StringApiResponse> response = apiInstance.dingTalkUserInfoWithHttpInfo(appKey, code);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DingTalkApi#dingTalkUserInfo");
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
| **code** | **String**| 钉钉用户授权码 | [optional] |

### Return type

ApiResponse<[**StringApiResponse**](StringApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

