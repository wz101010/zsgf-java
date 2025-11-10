# OAuthApi

All URIs are relative to *https://api-dev.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**oAuthAuthorize**](OAuthApi.md#oAuthAuthorize) | **POST** /OAuth/{appKey}/Authorize | 获取访问令牌 |
| [**oAuthAuthorizeWithHttpInfo**](OAuthApi.md#oAuthAuthorizeWithHttpInfo) | **POST** /OAuth/{appKey}/Authorize | 获取访问令牌 |
| [**oAuthConsents**](OAuthApi.md#oAuthConsents) | **GET** /OAuth/{appKey}/Consents | 获取授权记录 |
| [**oAuthConsentsWithHttpInfo**](OAuthApi.md#oAuthConsentsWithHttpInfo) | **GET** /OAuth/{appKey}/Consents | 获取授权记录 |
| [**oAuthDeleteConsent**](OAuthApi.md#oAuthDeleteConsent) | **DELETE** /OAuth/{appKey}/Consents/{id} | 删除授权记录 |
| [**oAuthDeleteConsentWithHttpInfo**](OAuthApi.md#oAuthDeleteConsentWithHttpInfo) | **DELETE** /OAuth/{appKey}/Consents/{id} | 删除授权记录 |
| [**oAuthGrantCode**](OAuthApi.md#oAuthGrantCode) | **POST** /OAuth/{appKey}/GrantCode | 获取授权码 |
| [**oAuthGrantCodeWithHttpInfo**](OAuthApi.md#oAuthGrantCodeWithHttpInfo) | **POST** /OAuth/{appKey}/GrantCode | 获取授权码 |
| [**oAuthProfile**](OAuthApi.md#oAuthProfile) | **GET** /OAuth/{appKey}/Profile | 获取用户资料 |
| [**oAuthProfileWithHttpInfo**](OAuthApi.md#oAuthProfileWithHttpInfo) | **GET** /OAuth/{appKey}/Profile | 获取用户资料 |



## oAuthAuthorize

> AuthorizeResultApiResponse oAuthAuthorize(appKey, scheme, code)

获取访问令牌

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.OAuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OAuthApi apiInstance = new OAuthApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String scheme = "scheme_example"; // String | 身份源
        String code = "code_example"; // String | 授权码
        try {
            AuthorizeResultApiResponse result = apiInstance.oAuthAuthorize(appKey, scheme, code);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OAuthApi#oAuthAuthorize");
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
| **scheme** | **String**| 身份源 | [optional] |
| **code** | **String**| 授权码 | [optional] |

### Return type

[**AuthorizeResultApiResponse**](AuthorizeResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## oAuthAuthorizeWithHttpInfo

> ApiResponse<AuthorizeResultApiResponse> oAuthAuthorize oAuthAuthorizeWithHttpInfo(appKey, scheme, code)

获取访问令牌

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.OAuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OAuthApi apiInstance = new OAuthApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String scheme = "scheme_example"; // String | 身份源
        String code = "code_example"; // String | 授权码
        try {
            ApiResponse<AuthorizeResultApiResponse> response = apiInstance.oAuthAuthorizeWithHttpInfo(appKey, scheme, code);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OAuthApi#oAuthAuthorize");
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
| **scheme** | **String**| 身份源 | [optional] |
| **code** | **String**| 授权码 | [optional] |

### Return type

ApiResponse<[**AuthorizeResultApiResponse**](AuthorizeResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## oAuthConsents

> AppUserConsentModelListApiResponse oAuthConsents(appKey)

获取授权记录

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.OAuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OAuthApi apiInstance = new OAuthApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            AppUserConsentModelListApiResponse result = apiInstance.oAuthConsents(appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OAuthApi#oAuthConsents");
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

[**AppUserConsentModelListApiResponse**](AppUserConsentModelListApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## oAuthConsentsWithHttpInfo

> ApiResponse<AppUserConsentModelListApiResponse> oAuthConsents oAuthConsentsWithHttpInfo(appKey)

获取授权记录

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.OAuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OAuthApi apiInstance = new OAuthApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<AppUserConsentModelListApiResponse> response = apiInstance.oAuthConsentsWithHttpInfo(appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OAuthApi#oAuthConsents");
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

ApiResponse<[**AppUserConsentModelListApiResponse**](AppUserConsentModelListApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## oAuthDeleteConsent

> BooleanApiResponse oAuthDeleteConsent(id, appKey)

删除授权记录

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.OAuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OAuthApi apiInstance = new OAuthApi(defaultClient);
        Long id = 56L; // Long | 
        String appKey = "appKey_example"; // String | 
        try {
            BooleanApiResponse result = apiInstance.oAuthDeleteConsent(id, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OAuthApi#oAuthDeleteConsent");
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

## oAuthDeleteConsentWithHttpInfo

> ApiResponse<BooleanApiResponse> oAuthDeleteConsent oAuthDeleteConsentWithHttpInfo(id, appKey)

删除授权记录

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.OAuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OAuthApi apiInstance = new OAuthApi(defaultClient);
        Long id = 56L; // Long | 
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.oAuthDeleteConsentWithHttpInfo(id, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OAuthApi#oAuthDeleteConsent");
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


## oAuthGrantCode

> GrantResultApiResponse oAuthGrantCode(appKey, scheme, grantRequest)

获取授权码

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.OAuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OAuthApi apiInstance = new OAuthApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String scheme = "scheme_example"; // String | 身份源，固定填：app
        GrantRequest grantRequest = new GrantRequest(); // GrantRequest | 授权详情
        try {
            GrantResultApiResponse result = apiInstance.oAuthGrantCode(appKey, scheme, grantRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OAuthApi#oAuthGrantCode");
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
| **scheme** | **String**| 身份源，固定填：app | [optional] |
| **grantRequest** | [**GrantRequest**](GrantRequest.md)| 授权详情 | [optional] |

### Return type

[**GrantResultApiResponse**](GrantResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## oAuthGrantCodeWithHttpInfo

> ApiResponse<GrantResultApiResponse> oAuthGrantCode oAuthGrantCodeWithHttpInfo(appKey, scheme, grantRequest)

获取授权码

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.OAuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OAuthApi apiInstance = new OAuthApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String scheme = "scheme_example"; // String | 身份源，固定填：app
        GrantRequest grantRequest = new GrantRequest(); // GrantRequest | 授权详情
        try {
            ApiResponse<GrantResultApiResponse> response = apiInstance.oAuthGrantCodeWithHttpInfo(appKey, scheme, grantRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OAuthApi#oAuthGrantCode");
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
| **scheme** | **String**| 身份源，固定填：app | [optional] |
| **grantRequest** | [**GrantRequest**](GrantRequest.md)| 授权详情 | [optional] |

### Return type

ApiResponse<[**GrantResultApiResponse**](GrantResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## oAuthProfile

> ProfileResultApiResponse oAuthProfile(appKey)

获取用户资料

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.OAuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OAuthApi apiInstance = new OAuthApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            ProfileResultApiResponse result = apiInstance.oAuthProfile(appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OAuthApi#oAuthProfile");
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

[**ProfileResultApiResponse**](ProfileResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## oAuthProfileWithHttpInfo

> ApiResponse<ProfileResultApiResponse> oAuthProfile oAuthProfileWithHttpInfo(appKey)

获取用户资料

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.OAuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OAuthApi apiInstance = new OAuthApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<ProfileResultApiResponse> response = apiInstance.oAuthProfileWithHttpInfo(appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OAuthApi#oAuthProfile");
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

ApiResponse<[**ProfileResultApiResponse**](ProfileResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

