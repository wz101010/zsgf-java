# UserApi

All URIs are relative to *https://api-dev.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userDeactivateHard**](UserApi.md#userDeactivateHard) | **DELETE** /User/{appKey}/DeactivateHard | 注销账号 |
| [**userDeactivateHardWithHttpInfo**](UserApi.md#userDeactivateHardWithHttpInfo) | **DELETE** /User/{appKey}/DeactivateHard | 注销账号 |
| [**userEmailSignIn**](UserApi.md#userEmailSignIn) | **POST** /User/{appKey}/EmailSignIn | 邮箱登录 |
| [**userEmailSignInWithHttpInfo**](UserApi.md#userEmailSignInWithHttpInfo) | **POST** /User/{appKey}/EmailSignIn | 邮箱登录 |
| [**userEmailSignUp**](UserApi.md#userEmailSignUp) | **POST** /User/{appKey}/EmailSignUp | 邮箱注册 |
| [**userEmailSignUpWithHttpInfo**](UserApi.md#userEmailSignUpWithHttpInfo) | **POST** /User/{appKey}/EmailSignUp | 邮箱注册 |
| [**userPhoneSignIn**](UserApi.md#userPhoneSignIn) | **POST** /User/{appKey}/PhoneSignIn | 手机登录 |
| [**userPhoneSignInWithHttpInfo**](UserApi.md#userPhoneSignInWithHttpInfo) | **POST** /User/{appKey}/PhoneSignIn | 手机登录 |
| [**userPhoneSignUp**](UserApi.md#userPhoneSignUp) | **POST** /User/{appKey}/PhoneSignUp | 手机注册 |
| [**userPhoneSignUpWithHttpInfo**](UserApi.md#userPhoneSignUpWithHttpInfo) | **POST** /User/{appKey}/PhoneSignUp | 手机注册 |
| [**userProfile**](UserApi.md#userProfile) | **GET** /User/{appKey}/Profile | 获取个人资料 |
| [**userProfileWithHttpInfo**](UserApi.md#userProfileWithHttpInfo) | **GET** /User/{appKey}/Profile | 获取个人资料 |
| [**userResetEmail**](UserApi.md#userResetEmail) | **PUT** /User/{appKey}/ResetEmail | 重置邮箱 |
| [**userResetEmailWithHttpInfo**](UserApi.md#userResetEmailWithHttpInfo) | **PUT** /User/{appKey}/ResetEmail | 重置邮箱 |
| [**userResetPhone**](UserApi.md#userResetPhone) | **PUT** /User/{appKey}/ResetPhone | 重置手机号 |
| [**userResetPhoneWithHttpInfo**](UserApi.md#userResetPhoneWithHttpInfo) | **PUT** /User/{appKey}/ResetPhone | 重置手机号 |
| [**userResetPwd**](UserApi.md#userResetPwd) | **POST** /User/{appKey}/ResetPwd | 重置密码 |
| [**userResetPwdWithHttpInfo**](UserApi.md#userResetPwdWithHttpInfo) | **POST** /User/{appKey}/ResetPwd | 重置密码 |
| [**userSendEmailCode**](UserApi.md#userSendEmailCode) | **POST** /User/{appKey}/SendEmailCode | 发送邮箱验证码 |
| [**userSendEmailCodeWithHttpInfo**](UserApi.md#userSendEmailCodeWithHttpInfo) | **POST** /User/{appKey}/SendEmailCode | 发送邮箱验证码 |
| [**userSendSMSCode**](UserApi.md#userSendSMSCode) | **POST** /User/{appKey}/SendSMSCode | 发送手机验证码 |
| [**userSendSMSCodeWithHttpInfo**](UserApi.md#userSendSMSCodeWithHttpInfo) | **POST** /User/{appKey}/SendSMSCode | 发送手机验证码 |
| [**userSignIn**](UserApi.md#userSignIn) | **POST** /User/{appKey}/SignIn | 密码登录 |
| [**userSignInWithHttpInfo**](UserApi.md#userSignInWithHttpInfo) | **POST** /User/{appKey}/SignIn | 密码登录 |
| [**userSignUp**](UserApi.md#userSignUp) | **POST** /User/{appKey}/SignUp | 账号注册 |
| [**userSignUpWithHttpInfo**](UserApi.md#userSignUpWithHttpInfo) | **POST** /User/{appKey}/SignUp | 账号注册 |
| [**userTwoFactorAuth**](UserApi.md#userTwoFactorAuth) | **GET** /User/{appKey}/TwoFactorAuth | 二次验证 |
| [**userTwoFactorAuthWithHttpInfo**](UserApi.md#userTwoFactorAuthWithHttpInfo) | **GET** /User/{appKey}/TwoFactorAuth | 二次验证 |
| [**userUnionIDSignIn**](UserApi.md#userUnionIDSignIn) | **POST** /User/{appKey}/UnionIDSignIn | UnionID登录 |
| [**userUnionIDSignInWithHttpInfo**](UserApi.md#userUnionIDSignInWithHttpInfo) | **POST** /User/{appKey}/UnionIDSignIn | UnionID登录 |
| [**userUnionIDSignUp**](UserApi.md#userUnionIDSignUp) | **POST** /User/{appKey}/UnionIDSignUp | UnionID注册 |
| [**userUnionIDSignUpWithHttpInfo**](UserApi.md#userUnionIDSignUpWithHttpInfo) | **POST** /User/{appKey}/UnionIDSignUp | UnionID注册 |
| [**userUpdateProfile**](UserApi.md#userUpdateProfile) | **PUT** /User/{appKey}/Profile | 更新个人资料 |
| [**userUpdateProfileWithHttpInfo**](UserApi.md#userUpdateProfileWithHttpInfo) | **PUT** /User/{appKey}/Profile | 更新个人资料 |



## userDeactivateHard

> BooleanApiResponse userDeactivateHard(appKey)

注销账号

清除用户所有附属数据，并注销账号

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            BooleanApiResponse result = apiInstance.userDeactivateHard(appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userDeactivateHard");
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

## userDeactivateHardWithHttpInfo

> ApiResponse<BooleanApiResponse> userDeactivateHard userDeactivateHardWithHttpInfo(appKey)

注销账号

清除用户所有附属数据，并注销账号

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userDeactivateHardWithHttpInfo(appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userDeactivateHard");
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


## userEmailSignIn

> TokenModelApiResponse userEmailSignIn(appKey, emailSignInRequest)

邮箱登录

使用邮箱进行登录

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        EmailSignInRequest emailSignInRequest = new EmailSignInRequest(); // EmailSignInRequest | 登录请求参数
        try {
            TokenModelApiResponse result = apiInstance.userEmailSignIn(appKey, emailSignInRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userEmailSignIn");
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
| **emailSignInRequest** | [**EmailSignInRequest**](EmailSignInRequest.md)| 登录请求参数 | [optional] |

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

## userEmailSignInWithHttpInfo

> ApiResponse<TokenModelApiResponse> userEmailSignIn userEmailSignInWithHttpInfo(appKey, emailSignInRequest)

邮箱登录

使用邮箱进行登录

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        EmailSignInRequest emailSignInRequest = new EmailSignInRequest(); // EmailSignInRequest | 登录请求参数
        try {
            ApiResponse<TokenModelApiResponse> response = apiInstance.userEmailSignInWithHttpInfo(appKey, emailSignInRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userEmailSignIn");
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
| **emailSignInRequest** | [**EmailSignInRequest**](EmailSignInRequest.md)| 登录请求参数 | [optional] |

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


## userEmailSignUp

> TokenModelApiResponse userEmailSignUp(appKey, emailSignUpRequest)

邮箱注册

使用邮箱进行注册

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        EmailSignUpRequest emailSignUpRequest = new EmailSignUpRequest(); // EmailSignUpRequest | 注册请求参数
        try {
            TokenModelApiResponse result = apiInstance.userEmailSignUp(appKey, emailSignUpRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userEmailSignUp");
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
| **emailSignUpRequest** | [**EmailSignUpRequest**](EmailSignUpRequest.md)| 注册请求参数 | [optional] |

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

## userEmailSignUpWithHttpInfo

> ApiResponse<TokenModelApiResponse> userEmailSignUp userEmailSignUpWithHttpInfo(appKey, emailSignUpRequest)

邮箱注册

使用邮箱进行注册

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        EmailSignUpRequest emailSignUpRequest = new EmailSignUpRequest(); // EmailSignUpRequest | 注册请求参数
        try {
            ApiResponse<TokenModelApiResponse> response = apiInstance.userEmailSignUpWithHttpInfo(appKey, emailSignUpRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userEmailSignUp");
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
| **emailSignUpRequest** | [**EmailSignUpRequest**](EmailSignUpRequest.md)| 注册请求参数 | [optional] |

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


## userPhoneSignIn

> TokenModelApiResponse userPhoneSignIn(appKey, phoneSignInRequest)

手机登录

使用手机号码进行登录

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        PhoneSignInRequest phoneSignInRequest = new PhoneSignInRequest(); // PhoneSignInRequest | 登录请求参数
        try {
            TokenModelApiResponse result = apiInstance.userPhoneSignIn(appKey, phoneSignInRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userPhoneSignIn");
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
| **phoneSignInRequest** | [**PhoneSignInRequest**](PhoneSignInRequest.md)| 登录请求参数 | [optional] |

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

## userPhoneSignInWithHttpInfo

> ApiResponse<TokenModelApiResponse> userPhoneSignIn userPhoneSignInWithHttpInfo(appKey, phoneSignInRequest)

手机登录

使用手机号码进行登录

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        PhoneSignInRequest phoneSignInRequest = new PhoneSignInRequest(); // PhoneSignInRequest | 登录请求参数
        try {
            ApiResponse<TokenModelApiResponse> response = apiInstance.userPhoneSignInWithHttpInfo(appKey, phoneSignInRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userPhoneSignIn");
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
| **phoneSignInRequest** | [**PhoneSignInRequest**](PhoneSignInRequest.md)| 登录请求参数 | [optional] |

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


## userPhoneSignUp

> TokenModelApiResponse userPhoneSignUp(appKey, phoneSignUpRequest)

手机注册

使用手机号码进行注册

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        PhoneSignUpRequest phoneSignUpRequest = new PhoneSignUpRequest(); // PhoneSignUpRequest | 注册请求参数
        try {
            TokenModelApiResponse result = apiInstance.userPhoneSignUp(appKey, phoneSignUpRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userPhoneSignUp");
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
| **phoneSignUpRequest** | [**PhoneSignUpRequest**](PhoneSignUpRequest.md)| 注册请求参数 | [optional] |

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

## userPhoneSignUpWithHttpInfo

> ApiResponse<TokenModelApiResponse> userPhoneSignUp userPhoneSignUpWithHttpInfo(appKey, phoneSignUpRequest)

手机注册

使用手机号码进行注册

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        PhoneSignUpRequest phoneSignUpRequest = new PhoneSignUpRequest(); // PhoneSignUpRequest | 注册请求参数
        try {
            ApiResponse<TokenModelApiResponse> response = apiInstance.userPhoneSignUpWithHttpInfo(appKey, phoneSignUpRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userPhoneSignUp");
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
| **phoneSignUpRequest** | [**PhoneSignUpRequest**](PhoneSignUpRequest.md)| 注册请求参数 | [optional] |

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


## userProfile

> UserProfileResultApiResponse userProfile(appKey)

获取个人资料

获取当前用户的个人资料

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            UserProfileResultApiResponse result = apiInstance.userProfile(appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userProfile");
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

[**UserProfileResultApiResponse**](UserProfileResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userProfileWithHttpInfo

> ApiResponse<UserProfileResultApiResponse> userProfile userProfileWithHttpInfo(appKey)

获取个人资料

获取当前用户的个人资料

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<UserProfileResultApiResponse> response = apiInstance.userProfileWithHttpInfo(appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userProfile");
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

ApiResponse<[**UserProfileResultApiResponse**](UserProfileResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userResetEmail

> BooleanApiResponse userResetEmail(appKey, appUserResetEmailRequest)

重置邮箱

通过邮箱验证码重置邮箱

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AppUserResetEmailRequest appUserResetEmailRequest = new AppUserResetEmailRequest(); // AppUserResetEmailRequest | 重置邮箱的请求参数
        try {
            BooleanApiResponse result = apiInstance.userResetEmail(appKey, appUserResetEmailRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userResetEmail");
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
| **appUserResetEmailRequest** | [**AppUserResetEmailRequest**](AppUserResetEmailRequest.md)| 重置邮箱的请求参数 | [optional] |

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

## userResetEmailWithHttpInfo

> ApiResponse<BooleanApiResponse> userResetEmail userResetEmailWithHttpInfo(appKey, appUserResetEmailRequest)

重置邮箱

通过邮箱验证码重置邮箱

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AppUserResetEmailRequest appUserResetEmailRequest = new AppUserResetEmailRequest(); // AppUserResetEmailRequest | 重置邮箱的请求参数
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userResetEmailWithHttpInfo(appKey, appUserResetEmailRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userResetEmail");
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
| **appUserResetEmailRequest** | [**AppUserResetEmailRequest**](AppUserResetEmailRequest.md)| 重置邮箱的请求参数 | [optional] |

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


## userResetPhone

> BooleanApiResponse userResetPhone(appKey, appUserResetPhoneRequest)

重置手机号

通过手机号验证码重置手机号

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AppUserResetPhoneRequest appUserResetPhoneRequest = new AppUserResetPhoneRequest(); // AppUserResetPhoneRequest | 重置手机号的请求参数
        try {
            BooleanApiResponse result = apiInstance.userResetPhone(appKey, appUserResetPhoneRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userResetPhone");
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
| **appUserResetPhoneRequest** | [**AppUserResetPhoneRequest**](AppUserResetPhoneRequest.md)| 重置手机号的请求参数 | [optional] |

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

## userResetPhoneWithHttpInfo

> ApiResponse<BooleanApiResponse> userResetPhone userResetPhoneWithHttpInfo(appKey, appUserResetPhoneRequest)

重置手机号

通过手机号验证码重置手机号

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AppUserResetPhoneRequest appUserResetPhoneRequest = new AppUserResetPhoneRequest(); // AppUserResetPhoneRequest | 重置手机号的请求参数
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userResetPhoneWithHttpInfo(appKey, appUserResetPhoneRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userResetPhone");
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
| **appUserResetPhoneRequest** | [**AppUserResetPhoneRequest**](AppUserResetPhoneRequest.md)| 重置手机号的请求参数 | [optional] |

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


## userResetPwd

> BooleanApiResponse userResetPwd(appKey, appUserResetPwdRequest)

重置密码

通过手机号或邮箱重置密码

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AppUserResetPwdRequest appUserResetPwdRequest = new AppUserResetPwdRequest(); // AppUserResetPwdRequest | 重置密码的请求参数
        try {
            BooleanApiResponse result = apiInstance.userResetPwd(appKey, appUserResetPwdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userResetPwd");
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
| **appUserResetPwdRequest** | [**AppUserResetPwdRequest**](AppUserResetPwdRequest.md)| 重置密码的请求参数 | [optional] |

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

## userResetPwdWithHttpInfo

> ApiResponse<BooleanApiResponse> userResetPwd userResetPwdWithHttpInfo(appKey, appUserResetPwdRequest)

重置密码

通过手机号或邮箱重置密码

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AppUserResetPwdRequest appUserResetPwdRequest = new AppUserResetPwdRequest(); // AppUserResetPwdRequest | 重置密码的请求参数
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userResetPwdWithHttpInfo(appKey, appUserResetPwdRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userResetPwd");
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
| **appUserResetPwdRequest** | [**AppUserResetPwdRequest**](AppUserResetPwdRequest.md)| 重置密码的请求参数 | [optional] |

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


## userSendEmailCode

> BooleanApiResponse userSendEmailCode(appKey, sendEmailCodeRequest)

发送邮箱验证码

发送邮箱验证码用于注册或找回密码

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        SendEmailCodeRequest sendEmailCodeRequest = new SendEmailCodeRequest(); // SendEmailCodeRequest | 发送邮箱验证码的请求参数
        try {
            BooleanApiResponse result = apiInstance.userSendEmailCode(appKey, sendEmailCodeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userSendEmailCode");
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
| **sendEmailCodeRequest** | [**SendEmailCodeRequest**](SendEmailCodeRequest.md)| 发送邮箱验证码的请求参数 | [optional] |

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

## userSendEmailCodeWithHttpInfo

> ApiResponse<BooleanApiResponse> userSendEmailCode userSendEmailCodeWithHttpInfo(appKey, sendEmailCodeRequest)

发送邮箱验证码

发送邮箱验证码用于注册或找回密码

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        SendEmailCodeRequest sendEmailCodeRequest = new SendEmailCodeRequest(); // SendEmailCodeRequest | 发送邮箱验证码的请求参数
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userSendEmailCodeWithHttpInfo(appKey, sendEmailCodeRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userSendEmailCode");
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
| **sendEmailCodeRequest** | [**SendEmailCodeRequest**](SendEmailCodeRequest.md)| 发送邮箱验证码的请求参数 | [optional] |

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


## userSendSMSCode

> BooleanApiResponse userSendSMSCode(appKey, sendSMSCodeRequest)

发送手机验证码

发送手机验证码用于注册或找回密码

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        SendSMSCodeRequest sendSMSCodeRequest = new SendSMSCodeRequest(); // SendSMSCodeRequest | 发送手机验证码的请求参数
        try {
            BooleanApiResponse result = apiInstance.userSendSMSCode(appKey, sendSMSCodeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userSendSMSCode");
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
| **sendSMSCodeRequest** | [**SendSMSCodeRequest**](SendSMSCodeRequest.md)| 发送手机验证码的请求参数 | [optional] |

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

## userSendSMSCodeWithHttpInfo

> ApiResponse<BooleanApiResponse> userSendSMSCode userSendSMSCodeWithHttpInfo(appKey, sendSMSCodeRequest)

发送手机验证码

发送手机验证码用于注册或找回密码

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        SendSMSCodeRequest sendSMSCodeRequest = new SendSMSCodeRequest(); // SendSMSCodeRequest | 发送手机验证码的请求参数
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userSendSMSCodeWithHttpInfo(appKey, sendSMSCodeRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userSendSMSCode");
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
| **sendSMSCodeRequest** | [**SendSMSCodeRequest**](SendSMSCodeRequest.md)| 发送手机验证码的请求参数 | [optional] |

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


## userSignIn

> TokenModelApiResponse userSignIn(appKey, signInRequest)

密码登录

使用账号密码进行登录

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        SignInRequest signInRequest = new SignInRequest(); // SignInRequest | 登录请求参数
        try {
            TokenModelApiResponse result = apiInstance.userSignIn(appKey, signInRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userSignIn");
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
| **signInRequest** | [**SignInRequest**](SignInRequest.md)| 登录请求参数 | [optional] |

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

## userSignInWithHttpInfo

> ApiResponse<TokenModelApiResponse> userSignIn userSignInWithHttpInfo(appKey, signInRequest)

密码登录

使用账号密码进行登录

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        SignInRequest signInRequest = new SignInRequest(); // SignInRequest | 登录请求参数
        try {
            ApiResponse<TokenModelApiResponse> response = apiInstance.userSignInWithHttpInfo(appKey, signInRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userSignIn");
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
| **signInRequest** | [**SignInRequest**](SignInRequest.md)| 登录请求参数 | [optional] |

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


## userSignUp

> TokenModelApiResponse userSignUp(appKey, signUpRequest)

账号注册

使用账号密码进行注册

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        SignUpRequest signUpRequest = new SignUpRequest(); // SignUpRequest | 注册请求参数
        try {
            TokenModelApiResponse result = apiInstance.userSignUp(appKey, signUpRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userSignUp");
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
| **signUpRequest** | [**SignUpRequest**](SignUpRequest.md)| 注册请求参数 | [optional] |

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

## userSignUpWithHttpInfo

> ApiResponse<TokenModelApiResponse> userSignUp userSignUpWithHttpInfo(appKey, signUpRequest)

账号注册

使用账号密码进行注册

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        SignUpRequest signUpRequest = new SignUpRequest(); // SignUpRequest | 注册请求参数
        try {
            ApiResponse<TokenModelApiResponse> response = apiInstance.userSignUpWithHttpInfo(appKey, signUpRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userSignUp");
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
| **signUpRequest** | [**SignUpRequest**](SignUpRequest.md)| 注册请求参数 | [optional] |

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


## userTwoFactorAuth

> SetupCodeApiResponse userTwoFactorAuth(appKey)

二次验证

获取当前用户在指定应用下启用二次验证（2FA）所需的设置信息，主要包括二维码链接和手动密钥，用户可以将其录入在 Google Authenticator 等 TOTP 应用中，用于后续动态验证码验证。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            SetupCodeApiResponse result = apiInstance.userTwoFactorAuth(appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userTwoFactorAuth");
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

[**SetupCodeApiResponse**](SetupCodeApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userTwoFactorAuthWithHttpInfo

> ApiResponse<SetupCodeApiResponse> userTwoFactorAuth userTwoFactorAuthWithHttpInfo(appKey)

二次验证

获取当前用户在指定应用下启用二次验证（2FA）所需的设置信息，主要包括二维码链接和手动密钥，用户可以将其录入在 Google Authenticator 等 TOTP 应用中，用于后续动态验证码验证。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<SetupCodeApiResponse> response = apiInstance.userTwoFactorAuthWithHttpInfo(appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userTwoFactorAuth");
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

ApiResponse<[**SetupCodeApiResponse**](SetupCodeApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userUnionIDSignIn

> TokenModelApiResponse userUnionIDSignIn(appKey, unionIDSignInRequest)

UnionID登录

使用UnionID进行登录

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        UnionIDSignInRequest unionIDSignInRequest = new UnionIDSignInRequest(); // UnionIDSignInRequest | 登录请求参数
        try {
            TokenModelApiResponse result = apiInstance.userUnionIDSignIn(appKey, unionIDSignInRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userUnionIDSignIn");
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
| **unionIDSignInRequest** | [**UnionIDSignInRequest**](UnionIDSignInRequest.md)| 登录请求参数 | [optional] |

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

## userUnionIDSignInWithHttpInfo

> ApiResponse<TokenModelApiResponse> userUnionIDSignIn userUnionIDSignInWithHttpInfo(appKey, unionIDSignInRequest)

UnionID登录

使用UnionID进行登录

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        UnionIDSignInRequest unionIDSignInRequest = new UnionIDSignInRequest(); // UnionIDSignInRequest | 登录请求参数
        try {
            ApiResponse<TokenModelApiResponse> response = apiInstance.userUnionIDSignInWithHttpInfo(appKey, unionIDSignInRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userUnionIDSignIn");
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
| **unionIDSignInRequest** | [**UnionIDSignInRequest**](UnionIDSignInRequest.md)| 登录请求参数 | [optional] |

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


## userUnionIDSignUp

> TokenModelApiResponse userUnionIDSignUp(appKey, unionIDSignUpRequest)

UnionID注册

使用UnionID进行注册

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        UnionIDSignUpRequest unionIDSignUpRequest = new UnionIDSignUpRequest(); // UnionIDSignUpRequest | 注册请求参数
        try {
            TokenModelApiResponse result = apiInstance.userUnionIDSignUp(appKey, unionIDSignUpRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userUnionIDSignUp");
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
| **unionIDSignUpRequest** | [**UnionIDSignUpRequest**](UnionIDSignUpRequest.md)| 注册请求参数 | [optional] |

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

## userUnionIDSignUpWithHttpInfo

> ApiResponse<TokenModelApiResponse> userUnionIDSignUp userUnionIDSignUpWithHttpInfo(appKey, unionIDSignUpRequest)

UnionID注册

使用UnionID进行注册

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        UnionIDSignUpRequest unionIDSignUpRequest = new UnionIDSignUpRequest(); // UnionIDSignUpRequest | 注册请求参数
        try {
            ApiResponse<TokenModelApiResponse> response = apiInstance.userUnionIDSignUpWithHttpInfo(appKey, unionIDSignUpRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userUnionIDSignUp");
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
| **unionIDSignUpRequest** | [**UnionIDSignUpRequest**](UnionIDSignUpRequest.md)| 注册请求参数 | [optional] |

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


## userUpdateProfile

> BooleanApiResponse userUpdateProfile(appKey, updateProfileRequest)

更新个人资料

更新当前用户的个人资料

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        UpdateProfileRequest updateProfileRequest = new UpdateProfileRequest(); // UpdateProfileRequest | 更新个人资料的请求参数
        try {
            BooleanApiResponse result = apiInstance.userUpdateProfile(appKey, updateProfileRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userUpdateProfile");
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
| **updateProfileRequest** | [**UpdateProfileRequest**](UpdateProfileRequest.md)| 更新个人资料的请求参数 | [optional] |

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

## userUpdateProfileWithHttpInfo

> ApiResponse<BooleanApiResponse> userUpdateProfile userUpdateProfileWithHttpInfo(appKey, updateProfileRequest)

更新个人资料

更新当前用户的个人资料

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        UpdateProfileRequest updateProfileRequest = new UpdateProfileRequest(); // UpdateProfileRequest | 更新个人资料的请求参数
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userUpdateProfileWithHttpInfo(appKey, updateProfileRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userUpdateProfile");
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
| **updateProfileRequest** | [**UpdateProfileRequest**](UpdateProfileRequest.md)| 更新个人资料的请求参数 | [optional] |

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

