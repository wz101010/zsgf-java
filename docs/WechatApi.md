# WechatApi

All URIs are relative to *https://api-dev.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**confirmQRCodeLogin**](WechatApi.md#confirmQRCodeLogin) | **POST** /Wechat/{appKey}/QR-Auth/Confirm-Login | 确认二维码登录请求 |
| [**confirmQRCodeLoginWithHttpInfo**](WechatApi.md#confirmQRCodeLoginWithHttpInfo) | **POST** /Wechat/{appKey}/QR-Auth/Confirm-Login | 确认二维码登录请求 |
| [**confirmQRCodeRegistration**](WechatApi.md#confirmQRCodeRegistration) | **POST** /Wechat/{appKey}/QR-Auth/Confirm-Register | 确认二维码注册请求 |
| [**confirmQRCodeRegistrationWithHttpInfo**](WechatApi.md#confirmQRCodeRegistrationWithHttpInfo) | **POST** /Wechat/{appKey}/QR-Auth/Confirm-Register | 确认二维码注册请求 |
| [**initiateQRAuthSession**](WechatApi.md#initiateQRAuthSession) | **POST** /Wechat/{appKey}/QR-Auth/Initiate | 初始化二维码认证会话 |
| [**initiateQRAuthSessionWithHttpInfo**](WechatApi.md#initiateQRAuthSessionWithHttpInfo) | **POST** /Wechat/{appKey}/QR-Auth/Initiate | 初始化二维码认证会话 |
| [**scanQRCodeForAuth**](WechatApi.md#scanQRCodeForAuth) | **POST** /Wechat/{appKey}/QR-Auth/Scan | 验证二维码扫描结果 |
| [**scanQRCodeForAuthWithHttpInfo**](WechatApi.md#scanQRCodeForAuthWithHttpInfo) | **POST** /Wechat/{appKey}/QR-Auth/Scan | 验证二维码扫描结果 |
| [**wechatDecrypt**](WechatApi.md#wechatDecrypt) | **GET** /Wechat/{appKey}/Decrypt | 解密小程序用户数据 |
| [**wechatDecryptWithHttpInfo**](WechatApi.md#wechatDecryptWithHttpInfo) | **GET** /Wechat/{appKey}/Decrypt | 解密小程序用户数据 |
| [**wechatGenerateScheme**](WechatApi.md#wechatGenerateScheme) | **POST** /Wechat/{appKey}/GenerateScheme | 生成小程序Scheme码 |
| [**wechatGenerateSchemeWithHttpInfo**](WechatApi.md#wechatGenerateSchemeWithHttpInfo) | **POST** /Wechat/{appKey}/GenerateScheme | 生成小程序Scheme码 |
| [**wechatJSCode2Session**](WechatApi.md#wechatJSCode2Session) | **GET** /Wechat/{appKey}/JSCode2Session | 校验小程序登录状态 |
| [**wechatJSCode2SessionWithHttpInfo**](WechatApi.md#wechatJSCode2SessionWithHttpInfo) | **GET** /Wechat/{appKey}/JSCode2Session | 校验小程序登录状态 |
| [**wechatJSConfig**](WechatApi.md#wechatJSConfig) | **GET** /Wechat/{appKey}/JSConfig | 配置公众号JS SDK |
| [**wechatJSConfigWithHttpInfo**](WechatApi.md#wechatJSConfigWithHttpInfo) | **GET** /Wechat/{appKey}/JSConfig | 配置公众号JS SDK |
| [**wechatMsgSecCheck**](WechatApi.md#wechatMsgSecCheck) | **POST** /Wechat/{appKey}/MsgSecCheck | 小程序内容安全检测 |
| [**wechatMsgSecCheckWithHttpInfo**](WechatApi.md#wechatMsgSecCheckWithHttpInfo) | **POST** /Wechat/{appKey}/MsgSecCheck | 小程序内容安全检测 |
| [**wechatSubscribeMSG**](WechatApi.md#wechatSubscribeMSG) | **POST** /Wechat/{appKey}/SubscribeMSG | 发送公众号一次性订阅消息 |
| [**wechatSubscribeMSGWithHttpInfo**](WechatApi.md#wechatSubscribeMSGWithHttpInfo) | **POST** /Wechat/{appKey}/SubscribeMSG | 发送公众号一次性订阅消息 |
| [**wechatSubscribeSend**](WechatApi.md#wechatSubscribeSend) | **POST** /Wechat/{appKey}/SubscribeSend | 发送小程序订阅消息 |
| [**wechatSubscribeSendWithHttpInfo**](WechatApi.md#wechatSubscribeSendWithHttpInfo) | **POST** /Wechat/{appKey}/SubscribeSend | 发送小程序订阅消息 |
| [**wechatUrlLinkGenerate**](WechatApi.md#wechatUrlLinkGenerate) | **POST** /Wechat/{appKey}/UrlLinkGenerate | 生成小程序URL跳转链接 |
| [**wechatUrlLinkGenerateWithHttpInfo**](WechatApi.md#wechatUrlLinkGenerateWithHttpInfo) | **POST** /Wechat/{appKey}/UrlLinkGenerate | 生成小程序URL跳转链接 |
| [**wechatUserInfo**](WechatApi.md#wechatUserInfo) | **GET** /Wechat/{appKey}/UserInfo | 获取公众号H5 UnionID |
| [**wechatUserInfoWithHttpInfo**](WechatApi.md#wechatUserInfoWithHttpInfo) | **GET** /Wechat/{appKey}/UserInfo | 获取公众号H5 UnionID |
| [**wechatWXACodeGet**](WechatApi.md#wechatWXACodeGet) | **POST** /Wechat/{appKey}/WXACodeGet | 获取小程序码（普通） |
| [**wechatWXACodeGetWithHttpInfo**](WechatApi.md#wechatWXACodeGetWithHttpInfo) | **POST** /Wechat/{appKey}/WXACodeGet | 获取小程序码（普通） |
| [**wechatWXACodeGetUnlimited**](WechatApi.md#wechatWXACodeGetUnlimited) | **POST** /Wechat/{appKey}/WXACodeGetUnlimited | 获取小程序码（无限制） |
| [**wechatWXACodeGetUnlimitedWithHttpInfo**](WechatApi.md#wechatWXACodeGetUnlimitedWithHttpInfo) | **POST** /Wechat/{appKey}/WXACodeGetUnlimited | 获取小程序码（无限制） |



## confirmQRCodeLogin

> TokenModelApiResponse confirmQRCodeLogin(appKey, qrCodeSignInRequest)

确认二维码登录请求

微信小程序用户确认二维码登录并获取访问令牌

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        QRCodeSignInRequest qrCodeSignInRequest = new QRCodeSignInRequest(); // QRCodeSignInRequest | 登录确认请求参数
        try {
            TokenModelApiResponse result = apiInstance.confirmQRCodeLogin(appKey, qrCodeSignInRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#confirmQRCodeLogin");
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
| **qrCodeSignInRequest** | [**QRCodeSignInRequest**](QRCodeSignInRequest.md)| 登录确认请求参数 | [optional] |

### Return type

[**TokenModelApiResponse**](TokenModelApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## confirmQRCodeLoginWithHttpInfo

> ApiResponse<TokenModelApiResponse> confirmQRCodeLogin confirmQRCodeLoginWithHttpInfo(appKey, qrCodeSignInRequest)

确认二维码登录请求

微信小程序用户确认二维码登录并获取访问令牌

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        QRCodeSignInRequest qrCodeSignInRequest = new QRCodeSignInRequest(); // QRCodeSignInRequest | 登录确认请求参数
        try {
            ApiResponse<TokenModelApiResponse> response = apiInstance.confirmQRCodeLoginWithHttpInfo(appKey, qrCodeSignInRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#confirmQRCodeLogin");
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
| **qrCodeSignInRequest** | [**QRCodeSignInRequest**](QRCodeSignInRequest.md)| 登录确认请求参数 | [optional] |

### Return type

ApiResponse<[**TokenModelApiResponse**](TokenModelApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## confirmQRCodeRegistration

> TokenModelApiResponse confirmQRCodeRegistration(appKey, qrCodeSignUpRequest)

确认二维码注册请求

微信小程序用户通过二维码完成注册并获取访问令牌

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        QRCodeSignUpRequest qrCodeSignUpRequest = new QRCodeSignUpRequest(); // QRCodeSignUpRequest | 注册确认请求参数
        try {
            TokenModelApiResponse result = apiInstance.confirmQRCodeRegistration(appKey, qrCodeSignUpRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#confirmQRCodeRegistration");
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
| **qrCodeSignUpRequest** | [**QRCodeSignUpRequest**](QRCodeSignUpRequest.md)| 注册确认请求参数 | [optional] |

### Return type

[**TokenModelApiResponse**](TokenModelApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## confirmQRCodeRegistrationWithHttpInfo

> ApiResponse<TokenModelApiResponse> confirmQRCodeRegistration confirmQRCodeRegistrationWithHttpInfo(appKey, qrCodeSignUpRequest)

确认二维码注册请求

微信小程序用户通过二维码完成注册并获取访问令牌

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        QRCodeSignUpRequest qrCodeSignUpRequest = new QRCodeSignUpRequest(); // QRCodeSignUpRequest | 注册确认请求参数
        try {
            ApiResponse<TokenModelApiResponse> response = apiInstance.confirmQRCodeRegistrationWithHttpInfo(appKey, qrCodeSignUpRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#confirmQRCodeRegistration");
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
| **qrCodeSignUpRequest** | [**QRCodeSignUpRequest**](QRCodeSignUpRequest.md)| 注册确认请求参数 | [optional] |

### Return type

ApiResponse<[**TokenModelApiResponse**](TokenModelApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## initiateQRAuthSession

> Int64ApiResponse initiateQRAuthSession(appKey, qrCodePreSignInRequest)

初始化二维码认证会话

创建用于微信小程序扫码登录/注册的认证会话

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        QRCodePreSignInRequest qrCodePreSignInRequest = new QRCodePreSignInRequest(); // QRCodePreSignInRequest | 认证会话初始化请求参数
        try {
            Int64ApiResponse result = apiInstance.initiateQRAuthSession(appKey, qrCodePreSignInRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#initiateQRAuthSession");
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
| **qrCodePreSignInRequest** | [**QRCodePreSignInRequest**](QRCodePreSignInRequest.md)| 认证会话初始化请求参数 | [optional] |

### Return type

[**Int64ApiResponse**](Int64ApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## initiateQRAuthSessionWithHttpInfo

> ApiResponse<Int64ApiResponse> initiateQRAuthSession initiateQRAuthSessionWithHttpInfo(appKey, qrCodePreSignInRequest)

初始化二维码认证会话

创建用于微信小程序扫码登录/注册的认证会话

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        QRCodePreSignInRequest qrCodePreSignInRequest = new QRCodePreSignInRequest(); // QRCodePreSignInRequest | 认证会话初始化请求参数
        try {
            ApiResponse<Int64ApiResponse> response = apiInstance.initiateQRAuthSessionWithHttpInfo(appKey, qrCodePreSignInRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#initiateQRAuthSession");
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
| **qrCodePreSignInRequest** | [**QRCodePreSignInRequest**](QRCodePreSignInRequest.md)| 认证会话初始化请求参数 | [optional] |

### Return type

ApiResponse<[**Int64ApiResponse**](Int64ApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## scanQRCodeForAuth

> UserQRCodeScanResultApiResponse scanQRCodeForAuth(appKey, qrCodeScanRequest)

验证二维码扫描结果

微信小程序扫描二维码并获取应用授权信息

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        QRCodeScanRequest qrCodeScanRequest = new QRCodeScanRequest(); // QRCodeScanRequest | 二维码扫描请求参数
        try {
            UserQRCodeScanResultApiResponse result = apiInstance.scanQRCodeForAuth(appKey, qrCodeScanRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#scanQRCodeForAuth");
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
| **qrCodeScanRequest** | [**QRCodeScanRequest**](QRCodeScanRequest.md)| 二维码扫描请求参数 | [optional] |

### Return type

[**UserQRCodeScanResultApiResponse**](UserQRCodeScanResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## scanQRCodeForAuthWithHttpInfo

> ApiResponse<UserQRCodeScanResultApiResponse> scanQRCodeForAuth scanQRCodeForAuthWithHttpInfo(appKey, qrCodeScanRequest)

验证二维码扫描结果

微信小程序扫描二维码并获取应用授权信息

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        QRCodeScanRequest qrCodeScanRequest = new QRCodeScanRequest(); // QRCodeScanRequest | 二维码扫描请求参数
        try {
            ApiResponse<UserQRCodeScanResultApiResponse> response = apiInstance.scanQRCodeForAuthWithHttpInfo(appKey, qrCodeScanRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#scanQRCodeForAuth");
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
| **qrCodeScanRequest** | [**QRCodeScanRequest**](QRCodeScanRequest.md)| 二维码扫描请求参数 | [optional] |

### Return type

ApiResponse<[**UserQRCodeScanResultApiResponse**](UserQRCodeScanResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## wechatDecrypt

> StringApiResponse wechatDecrypt(appKey, encryptedData, iv, sessionKey)

解密小程序用户数据

解密小程序加密数据

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String encryptedData = "encryptedData_example"; // String | 加密的数据
        String iv = "iv_example"; // String | 加密算法的初始向量
        String sessionKey = "sessionKey_example"; // String | 会话密钥
        try {
            StringApiResponse result = apiInstance.wechatDecrypt(appKey, encryptedData, iv, sessionKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatDecrypt");
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
| **encryptedData** | **String**| 加密的数据 | [optional] |
| **iv** | **String**| 加密算法的初始向量 | [optional] |
| **sessionKey** | **String**| 会话密钥 | [optional] |

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

## wechatDecryptWithHttpInfo

> ApiResponse<StringApiResponse> wechatDecrypt wechatDecryptWithHttpInfo(appKey, encryptedData, iv, sessionKey)

解密小程序用户数据

解密小程序加密数据

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String encryptedData = "encryptedData_example"; // String | 加密的数据
        String iv = "iv_example"; // String | 加密算法的初始向量
        String sessionKey = "sessionKey_example"; // String | 会话密钥
        try {
            ApiResponse<StringApiResponse> response = apiInstance.wechatDecryptWithHttpInfo(appKey, encryptedData, iv, sessionKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatDecrypt");
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
| **encryptedData** | **String**| 加密的数据 | [optional] |
| **iv** | **String**| 加密算法的初始向量 | [optional] |
| **sessionKey** | **String**| 会话密钥 | [optional] |

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


## wechatGenerateScheme

> StringApiResponse wechatGenerateScheme(appKey, requestBody)

生成小程序Scheme码

生成小程序的scheme码

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | scheme码数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/OpenApiDoc/qrcode-link/url-scheme/generateScheme.html
        try {
            StringApiResponse result = apiInstance.wechatGenerateScheme(appKey, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatGenerateScheme");
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
| **requestBody** | [**List&lt;Object&gt;**](Object.md)| scheme码数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/OpenApiDoc/qrcode-link/url-scheme/generateScheme.html | [optional] |

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

## wechatGenerateSchemeWithHttpInfo

> ApiResponse<StringApiResponse> wechatGenerateScheme wechatGenerateSchemeWithHttpInfo(appKey, requestBody)

生成小程序Scheme码

生成小程序的scheme码

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | scheme码数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/OpenApiDoc/qrcode-link/url-scheme/generateScheme.html
        try {
            ApiResponse<StringApiResponse> response = apiInstance.wechatGenerateSchemeWithHttpInfo(appKey, requestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatGenerateScheme");
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
| **requestBody** | [**List&lt;Object&gt;**](Object.md)| scheme码数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/OpenApiDoc/qrcode-link/url-scheme/generateScheme.html | [optional] |

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


## wechatJSCode2Session

> StringApiResponse wechatJSCode2Session(appKey, jsCode)

校验小程序登录状态

校验小程序登录凭证

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String jsCode = "jsCode_example"; // String | 登录凭证，开发参考：https://dwz.cn/icNajFh7
        try {
            StringApiResponse result = apiInstance.wechatJSCode2Session(appKey, jsCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatJSCode2Session");
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
| **jsCode** | **String**| 登录凭证，开发参考：https://dwz.cn/icNajFh7 | [optional] |

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

## wechatJSCode2SessionWithHttpInfo

> ApiResponse<StringApiResponse> wechatJSCode2Session wechatJSCode2SessionWithHttpInfo(appKey, jsCode)

校验小程序登录状态

校验小程序登录凭证

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String jsCode = "jsCode_example"; // String | 登录凭证，开发参考：https://dwz.cn/icNajFh7
        try {
            ApiResponse<StringApiResponse> response = apiInstance.wechatJSCode2SessionWithHttpInfo(appKey, jsCode);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatJSCode2Session");
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
| **jsCode** | **String**| 登录凭证，开发参考：https://dwz.cn/icNajFh7 | [optional] |

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


## wechatJSConfig

> WechatJSConfigResultApiResponse wechatJSConfig(appKey, url)

配置公众号JS SDK

获取公众号H5的JS SDK配置

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String url = "url_example"; // String | 当前网页的URL
        try {
            WechatJSConfigResultApiResponse result = apiInstance.wechatJSConfig(appKey, url);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatJSConfig");
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
| **url** | **String**| 当前网页的URL | [optional] |

### Return type

[**WechatJSConfigResultApiResponse**](WechatJSConfigResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## wechatJSConfigWithHttpInfo

> ApiResponse<WechatJSConfigResultApiResponse> wechatJSConfig wechatJSConfigWithHttpInfo(appKey, url)

配置公众号JS SDK

获取公众号H5的JS SDK配置

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String url = "url_example"; // String | 当前网页的URL
        try {
            ApiResponse<WechatJSConfigResultApiResponse> response = apiInstance.wechatJSConfigWithHttpInfo(appKey, url);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatJSConfig");
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
| **url** | **String**| 当前网页的URL | [optional] |

### Return type

ApiResponse<[**WechatJSConfigResultApiResponse**](WechatJSConfigResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## wechatMsgSecCheck

> Object wechatMsgSecCheck(appKey, requestBody)

小程序内容安全检测

检测消息内容是否含有违法违规信息

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | 消息内容数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/OpenApiDoc/sec-center/sec-check/msgSecCheck.html
        try {
            Object result = apiInstance.wechatMsgSecCheck(appKey, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatMsgSecCheck");
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
| **requestBody** | [**List&lt;Object&gt;**](Object.md)| 消息内容数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/OpenApiDoc/sec-center/sec-check/msgSecCheck.html | [optional] |

### Return type

**Object**


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

## wechatMsgSecCheckWithHttpInfo

> ApiResponse<Object> wechatMsgSecCheck wechatMsgSecCheckWithHttpInfo(appKey, requestBody)

小程序内容安全检测

检测消息内容是否含有违法违规信息

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | 消息内容数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/OpenApiDoc/sec-center/sec-check/msgSecCheck.html
        try {
            ApiResponse<Object> response = apiInstance.wechatMsgSecCheckWithHttpInfo(appKey, requestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatMsgSecCheck");
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
| **requestBody** | [**List&lt;Object&gt;**](Object.md)| 消息内容数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/OpenApiDoc/sec-center/sec-check/msgSecCheck.html | [optional] |

### Return type

ApiResponse<**Object**>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |


## wechatSubscribeMSG

> StringApiResponse wechatSubscribeMSG(appKey, requestBody)

发送公众号一次性订阅消息

发送公众号H5一次性订阅消息

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | 订阅消息数据，开发参考：https://dwz.cn/IXptek5n
        try {
            StringApiResponse result = apiInstance.wechatSubscribeMSG(appKey, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatSubscribeMSG");
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
| **requestBody** | [**List&lt;Object&gt;**](Object.md)| 订阅消息数据，开发参考：https://dwz.cn/IXptek5n | [optional] |

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

## wechatSubscribeMSGWithHttpInfo

> ApiResponse<StringApiResponse> wechatSubscribeMSG wechatSubscribeMSGWithHttpInfo(appKey, requestBody)

发送公众号一次性订阅消息

发送公众号H5一次性订阅消息

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | 订阅消息数据，开发参考：https://dwz.cn/IXptek5n
        try {
            ApiResponse<StringApiResponse> response = apiInstance.wechatSubscribeMSGWithHttpInfo(appKey, requestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatSubscribeMSG");
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
| **requestBody** | [**List&lt;Object&gt;**](Object.md)| 订阅消息数据，开发参考：https://dwz.cn/IXptek5n | [optional] |

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


## wechatSubscribeSend

> StringApiResponse wechatSubscribeSend(appKey, requestBody)

发送小程序订阅消息

发送小程序订阅消息

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | 订阅消息数据，开发参考：https://dwz.cn/bohXaCnp
        try {
            StringApiResponse result = apiInstance.wechatSubscribeSend(appKey, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatSubscribeSend");
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
| **requestBody** | [**List&lt;Object&gt;**](Object.md)| 订阅消息数据，开发参考：https://dwz.cn/bohXaCnp | [optional] |

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

## wechatSubscribeSendWithHttpInfo

> ApiResponse<StringApiResponse> wechatSubscribeSend wechatSubscribeSendWithHttpInfo(appKey, requestBody)

发送小程序订阅消息

发送小程序订阅消息

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | 订阅消息数据，开发参考：https://dwz.cn/bohXaCnp
        try {
            ApiResponse<StringApiResponse> response = apiInstance.wechatSubscribeSendWithHttpInfo(appKey, requestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatSubscribeSend");
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
| **requestBody** | [**List&lt;Object&gt;**](Object.md)| 订阅消息数据，开发参考：https://dwz.cn/bohXaCnp | [optional] |

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


## wechatUrlLinkGenerate

> StringApiResponse wechatUrlLinkGenerate(appKey, requestBody)

生成小程序URL跳转链接

生成小程序的网页跳转地址

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | 跳转地址数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/url-link/urllink.generate.html
        try {
            StringApiResponse result = apiInstance.wechatUrlLinkGenerate(appKey, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatUrlLinkGenerate");
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
| **requestBody** | [**List&lt;Object&gt;**](Object.md)| 跳转地址数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/url-link/urllink.generate.html | [optional] |

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

## wechatUrlLinkGenerateWithHttpInfo

> ApiResponse<StringApiResponse> wechatUrlLinkGenerate wechatUrlLinkGenerateWithHttpInfo(appKey, requestBody)

生成小程序URL跳转链接

生成小程序的网页跳转地址

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | 跳转地址数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/url-link/urllink.generate.html
        try {
            ApiResponse<StringApiResponse> response = apiInstance.wechatUrlLinkGenerateWithHttpInfo(appKey, requestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatUrlLinkGenerate");
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
| **requestBody** | [**List&lt;Object&gt;**](Object.md)| 跳转地址数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/url-link/urllink.generate.html | [optional] |

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


## wechatUserInfo

> StringApiResponse wechatUserInfo(appKey, openid)

获取公众号H5 UnionID

获取公众号H5用户的UnionID

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String openid = "openid_example"; // String | 用户的OpenID
        try {
            StringApiResponse result = apiInstance.wechatUserInfo(appKey, openid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatUserInfo");
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
| **openid** | **String**| 用户的OpenID | [optional] |

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

## wechatUserInfoWithHttpInfo

> ApiResponse<StringApiResponse> wechatUserInfo wechatUserInfoWithHttpInfo(appKey, openid)

获取公众号H5 UnionID

获取公众号H5用户的UnionID

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String openid = "openid_example"; // String | 用户的OpenID
        try {
            ApiResponse<StringApiResponse> response = apiInstance.wechatUserInfoWithHttpInfo(appKey, openid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatUserInfo");
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
| **openid** | **String**| 用户的OpenID | [optional] |

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


## wechatWXACodeGet

> File wechatWXACodeGet(appKey, requestBody)

获取小程序码（普通）

获取小程序码

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | 小程序码数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/qr-code/wxacode.get.html
        try {
            File result = apiInstance.wechatWXACodeGet(appKey, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatWXACodeGet");
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
| **requestBody** | [**List&lt;Object&gt;**](Object.md)| 小程序码数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/qr-code/wxacode.get.html | [optional] |

### Return type

[**File**](File.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: image/jpeg

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

## wechatWXACodeGetWithHttpInfo

> ApiResponse<File> wechatWXACodeGet wechatWXACodeGetWithHttpInfo(appKey, requestBody)

获取小程序码（普通）

获取小程序码

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | 小程序码数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/qr-code/wxacode.get.html
        try {
            ApiResponse<File> response = apiInstance.wechatWXACodeGetWithHttpInfo(appKey, requestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatWXACodeGet");
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
| **requestBody** | [**List&lt;Object&gt;**](Object.md)| 小程序码数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/qr-code/wxacode.get.html | [optional] |

### Return type

ApiResponse<[**File**](File.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: image/jpeg

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |


## wechatWXACodeGetUnlimited

> File wechatWXACodeGetUnlimited(appKey, requestBody)

获取小程序码（无限制）

获取无限制的小程序码

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | 小程序码数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/qr-code/wxacode.getUnlimited.html
        try {
            File result = apiInstance.wechatWXACodeGetUnlimited(appKey, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatWXACodeGetUnlimited");
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
| **requestBody** | [**List&lt;Object&gt;**](Object.md)| 小程序码数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/qr-code/wxacode.getUnlimited.html | [optional] |

### Return type

[**File**](File.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: image/jpeg

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

## wechatWXACodeGetUnlimitedWithHttpInfo

> ApiResponse<File> wechatWXACodeGetUnlimited wechatWXACodeGetUnlimitedWithHttpInfo(appKey, requestBody)

获取小程序码（无限制）

获取无限制的小程序码

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.WechatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        WechatApi apiInstance = new WechatApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        List<Object> requestBody = null; // List<Object> | 小程序码数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/qr-code/wxacode.getUnlimited.html
        try {
            ApiResponse<File> response = apiInstance.wechatWXACodeGetUnlimitedWithHttpInfo(appKey, requestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WechatApi#wechatWXACodeGetUnlimited");
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
| **requestBody** | [**List&lt;Object&gt;**](Object.md)| 小程序码数据，开发参考：https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/qr-code/wxacode.getUnlimited.html | [optional] |

### Return type

ApiResponse<[**File**](File.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: image/jpeg

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

