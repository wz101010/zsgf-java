# UserApi

All URIs are relative to *https://api.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**user**](UserApi.md#user) | **GET** /User/{appKey}/{id} | 获取用户详情 |
| [**userWithHttpInfo**](UserApi.md#userWithHttpInfo) | **GET** /User/{appKey}/{id} | 获取用户详情 |
| [**userClear**](UserApi.md#userClear) | **DELETE** /User/{appKey}/Clear | 清空用户数据 |
| [**userClearWithHttpInfo**](UserApi.md#userClearWithHttpInfo) | **DELETE** /User/{appKey}/Clear | 清空用户数据 |
| [**userCommonInterests**](UserApi.md#userCommonInterests) | **GET** /User/{appKey}/Friends/CommonInterests | 有共同爱好的用户推荐 |
| [**userCommonInterestsWithHttpInfo**](UserApi.md#userCommonInterestsWithHttpInfo) | **GET** /User/{appKey}/Friends/CommonInterests | 有共同爱好的用户推荐 |
| [**userDelete**](UserApi.md#userDelete) | **DELETE** /User/{appKey}/{id} | 删除用户 |
| [**userDeleteWithHttpInfo**](UserApi.md#userDeleteWithHttpInfo) | **DELETE** /User/{appKey}/{id} | 删除用户 |
| [**userEmailSignIn**](UserApi.md#userEmailSignIn) | **POST** /User/{appKey}/EmailSignIn | 邮箱登录 |
| [**userEmailSignInWithHttpInfo**](UserApi.md#userEmailSignInWithHttpInfo) | **POST** /User/{appKey}/EmailSignIn | 邮箱登录 |
| [**userEmailSignUp**](UserApi.md#userEmailSignUp) | **POST** /User/{appKey}/EmailSignUp | 邮箱注册 |
| [**userEmailSignUpWithHttpInfo**](UserApi.md#userEmailSignUpWithHttpInfo) | **POST** /User/{appKey}/EmailSignUp | 邮箱注册 |
| [**userExport**](UserApi.md#userExport) | **GET** /User/{appKey}/Export | 导出用户数据 |
| [**userExportWithHttpInfo**](UserApi.md#userExportWithHttpInfo) | **GET** /User/{appKey}/Export | 导出用户数据 |
| [**userFollowUser**](UserApi.md#userFollowUser) | **POST** /User/{appKey}/Follower/{userId} | 关注用户 |
| [**userFollowUserWithHttpInfo**](UserApi.md#userFollowUserWithHttpInfo) | **POST** /User/{appKey}/Follower/{userId} | 关注用户 |
| [**userFollowerPut**](UserApi.md#userFollowerPut) | **PUT** /User/{appKey}/Follower/{id} | 更新粉丝 |
| [**userFollowerPutWithHttpInfo**](UserApi.md#userFollowerPutWithHttpInfo) | **PUT** /User/{appKey}/Follower/{id} | 更新粉丝 |
| [**userFollowers**](UserApi.md#userFollowers) | **GET** /User/{appKey}/Followers | 获取我的粉丝列表 |
| [**userFollowersWithHttpInfo**](UserApi.md#userFollowersWithHttpInfo) | **GET** /User/{appKey}/Followers | 获取我的粉丝列表 |
| [**userFollowing**](UserApi.md#userFollowing) | **GET** /User/{appKey}/Following | 获取我的关注列表 |
| [**userFollowingWithHttpInfo**](UserApi.md#userFollowingWithHttpInfo) | **GET** /User/{appKey}/Following | 获取我的关注列表 |
| [**userFriendsNearBy**](UserApi.md#userFriendsNearBy) | **GET** /User/{appKey}/Friends/NearBy | 附近的用户推荐 |
| [**userFriendsNearByWithHttpInfo**](UserApi.md#userFriendsNearByWithHttpInfo) | **GET** /User/{appKey}/Friends/NearBy | 附近的用户推荐 |
| [**userImport**](UserApi.md#userImport) | **POST** /User/{appKey}/Import | 导入用户数据 |
| [**userImportWithHttpInfo**](UserApi.md#userImportWithHttpInfo) | **POST** /User/{appKey}/Import | 导入用户数据 |
| [**userLocation**](UserApi.md#userLocation) | **GET** /User/{appKey}/Location/{id} | 获取位置详情 |
| [**userLocationWithHttpInfo**](UserApi.md#userLocationWithHttpInfo) | **GET** /User/{appKey}/Location/{id} | 获取位置详情 |
| [**userLocationDelete**](UserApi.md#userLocationDelete) | **DELETE** /User/{appKey}/Location/{id} | 删除位置 |
| [**userLocationDeleteWithHttpInfo**](UserApi.md#userLocationDeleteWithHttpInfo) | **DELETE** /User/{appKey}/Location/{id} | 删除位置 |
| [**userLocationPost**](UserApi.md#userLocationPost) | **POST** /User/{appKey}/Location | 添加位置 |
| [**userLocationPostWithHttpInfo**](UserApi.md#userLocationPostWithHttpInfo) | **POST** /User/{appKey}/Location | 添加位置 |
| [**userLocationPut**](UserApi.md#userLocationPut) | **PUT** /User/{appKey}/Location/{id} | 更新位置 |
| [**userLocationPutWithHttpInfo**](UserApi.md#userLocationPutWithHttpInfo) | **PUT** /User/{appKey}/Location/{id} | 更新位置 |
| [**userLocations**](UserApi.md#userLocations) | **GET** /User/{appKey}/Locations | 获取位置列表 |
| [**userLocationsWithHttpInfo**](UserApi.md#userLocationsWithHttpInfo) | **GET** /User/{appKey}/Locations | 获取位置列表 |
| [**userMutualFollowers**](UserApi.md#userMutualFollowers) | **GET** /User/{appKey}/Friends/MutualFollowers | 有共同粉丝的用户推荐 |
| [**userMutualFollowersWithHttpInfo**](UserApi.md#userMutualFollowersWithHttpInfo) | **GET** /User/{appKey}/Friends/MutualFollowers | 有共同粉丝的用户推荐 |
| [**userMutualFollowings**](UserApi.md#userMutualFollowings) | **GET** /User/{appKey}/Friends/MutualFollowings | 有共同关注的用户推荐 |
| [**userMutualFollowingsWithHttpInfo**](UserApi.md#userMutualFollowingsWithHttpInfo) | **GET** /User/{appKey}/Friends/MutualFollowings | 有共同关注的用户推荐 |
| [**userOAuthAccountBind**](UserApi.md#userOAuthAccountBind) | **POST** /User/{appKey}/OAuthAccountBind | 外部账号 绑定 |
| [**userOAuthAccountBindWithHttpInfo**](UserApi.md#userOAuthAccountBindWithHttpInfo) | **POST** /User/{appKey}/OAuthAccountBind | 外部账号 绑定 |
| [**userOAuthAccountSignIn**](UserApi.md#userOAuthAccountSignIn) | **POST** /User/{appKey}/OAuthAccountSignIn | 外部账号 登录 |
| [**userOAuthAccountSignInWithHttpInfo**](UserApi.md#userOAuthAccountSignInWithHttpInfo) | **POST** /User/{appKey}/OAuthAccountSignIn | 外部账号 登录 |
| [**userOAuthAccounts**](UserApi.md#userOAuthAccounts) | **GET** /User/{appKey}/OAuthAccounts | 外部账号 绑定列表 |
| [**userOAuthAccountsWithHttpInfo**](UserApi.md#userOAuthAccountsWithHttpInfo) | **GET** /User/{appKey}/OAuthAccounts | 外部账号 绑定列表 |
| [**userOAuthAccountsPutBind**](UserApi.md#userOAuthAccountsPutBind) | **PUT** /User/{appKey}/OAuthAccounts/{id} | 外部账号 更新绑定 |
| [**userOAuthAccountsPutBindWithHttpInfo**](UserApi.md#userOAuthAccountsPutBindWithHttpInfo) | **PUT** /User/{appKey}/OAuthAccounts/{id} | 外部账号 更新绑定 |
| [**userOAuthAccountsUnBind**](UserApi.md#userOAuthAccountsUnBind) | **DELETE** /User/{appKey}/OAuthAccounts/{id} | 外部账号 删除绑定 |
| [**userOAuthAccountsUnBindWithHttpInfo**](UserApi.md#userOAuthAccountsUnBindWithHttpInfo) | **DELETE** /User/{appKey}/OAuthAccounts/{id} | 外部账号 删除绑定 |
| [**userPhoneSignIn**](UserApi.md#userPhoneSignIn) | **POST** /User/{appKey}/PhoneSignIn | 手机登录 |
| [**userPhoneSignInWithHttpInfo**](UserApi.md#userPhoneSignInWithHttpInfo) | **POST** /User/{appKey}/PhoneSignIn | 手机登录 |
| [**userPhoneSignUp**](UserApi.md#userPhoneSignUp) | **POST** /User/{appKey}/PhoneSignUp | 手机注册 |
| [**userPhoneSignUpWithHttpInfo**](UserApi.md#userPhoneSignUpWithHttpInfo) | **POST** /User/{appKey}/PhoneSignUp | 手机注册 |
| [**userProfile**](UserApi.md#userProfile) | **GET** /User/{appKey}/Profile | 获取个人资料 |
| [**userProfileWithHttpInfo**](UserApi.md#userProfileWithHttpInfo) | **GET** /User/{appKey}/Profile | 获取个人资料 |
| [**userPut**](UserApi.md#userPut) | **PUT** /User/{appKey}/{id} | 更新用户信息 |
| [**userPutWithHttpInfo**](UserApi.md#userPutWithHttpInfo) | **PUT** /User/{appKey}/{id} | 更新用户信息 |
| [**userQRCodePreSignIn**](UserApi.md#userQRCodePreSignIn) | **POST** /User/{appKey}/QRCodePreSignIn | 微信小程序 - 预登陆 |
| [**userQRCodePreSignInWithHttpInfo**](UserApi.md#userQRCodePreSignInWithHttpInfo) | **POST** /User/{appKey}/QRCodePreSignIn | 微信小程序 - 预登陆 |
| [**userQRCodeScan**](UserApi.md#userQRCodeScan) | **POST** /User/{appKey}/QRCodeScan | 微信小程序 - 扫码 |
| [**userQRCodeScanWithHttpInfo**](UserApi.md#userQRCodeScanWithHttpInfo) | **POST** /User/{appKey}/QRCodeScan | 微信小程序 - 扫码 |
| [**userQRCodeSignIn**](UserApi.md#userQRCodeSignIn) | **POST** /User/{appKey}/QRCodeSignIn | 微信小程序 - 网页登录 |
| [**userQRCodeSignInWithHttpInfo**](UserApi.md#userQRCodeSignInWithHttpInfo) | **POST** /User/{appKey}/QRCodeSignIn | 微信小程序 - 网页登录 |
| [**userQRCodeSignUp**](UserApi.md#userQRCodeSignUp) | **POST** /User/{appKey}/QRCodeSignUp | 微信小程序 - 注册 |
| [**userQRCodeSignUpWithHttpInfo**](UserApi.md#userQRCodeSignUpWithHttpInfo) | **POST** /User/{appKey}/QRCodeSignUp | 微信小程序 - 注册 |
| [**userResetPwd**](UserApi.md#userResetPwd) | **POST** /User/{appKey}/ResetPwd | 重置密码 |
| [**userResetPwdWithHttpInfo**](UserApi.md#userResetPwdWithHttpInfo) | **POST** /User/{appKey}/ResetPwd | 重置密码 |
| [**userSendEmailCode**](UserApi.md#userSendEmailCode) | **POST** /User/{appKey}/SendEmailCode | 发送邮箱验证码 |
| [**userSendEmailCodeWithHttpInfo**](UserApi.md#userSendEmailCodeWithHttpInfo) | **POST** /User/{appKey}/SendEmailCode | 发送邮箱验证码 |
| [**userSendSMSCode**](UserApi.md#userSendSMSCode) | **POST** /User/{appKey}/SendSMSCode | 发送手机验证码 |
| [**userSendSMSCodeWithHttpInfo**](UserApi.md#userSendSMSCodeWithHttpInfo) | **POST** /User/{appKey}/SendSMSCode | 发送手机验证码 |
| [**userSignIn**](UserApi.md#userSignIn) | **POST** /User/{appKey}/SignIn | 账号密码 登录 |
| [**userSignInWithHttpInfo**](UserApi.md#userSignInWithHttpInfo) | **POST** /User/{appKey}/SignIn | 账号密码 登录 |
| [**userSignUp**](UserApi.md#userSignUp) | **POST** /User/{appKey}/SignUp | 账号密码 注册 |
| [**userSignUpWithHttpInfo**](UserApi.md#userSignUpWithHttpInfo) | **POST** /User/{appKey}/SignUp | 账号密码 注册 |
| [**userTwoFactorAuth**](UserApi.md#userTwoFactorAuth) | **GET** /User/{appKey}/TwoFactorAuth | 双因素验证 |
| [**userTwoFactorAuthWithHttpInfo**](UserApi.md#userTwoFactorAuthWithHttpInfo) | **GET** /User/{appKey}/TwoFactorAuth | 双因素验证 |
| [**userUnfollowUser**](UserApi.md#userUnfollowUser) | **DELETE** /User/{appKey}/Follower/{userId} | 取消关注 |
| [**userUnfollowUserWithHttpInfo**](UserApi.md#userUnfollowUserWithHttpInfo) | **DELETE** /User/{appKey}/Follower/{userId} | 取消关注 |
| [**userUnionIDSignIn**](UserApi.md#userUnionIDSignIn) | **POST** /User/{appKey}/UnionIDSignIn | UnionID登录 |
| [**userUnionIDSignInWithHttpInfo**](UserApi.md#userUnionIDSignInWithHttpInfo) | **POST** /User/{appKey}/UnionIDSignIn | UnionID登录 |
| [**userUnionIDSignUp**](UserApi.md#userUnionIDSignUp) | **POST** /User/{appKey}/UnionIDSignUp | UnionID注册 |
| [**userUnionIDSignUpWithHttpInfo**](UserApi.md#userUnionIDSignUpWithHttpInfo) | **POST** /User/{appKey}/UnionIDSignUp | UnionID注册 |
| [**userUpdateProfile**](UserApi.md#userUpdateProfile) | **PUT** /User/{appKey}/Profile | 更新个人资料 |
| [**userUpdateProfileWithHttpInfo**](UserApi.md#userUpdateProfileWithHttpInfo) | **PUT** /User/{appKey}/Profile | 更新个人资料 |
| [**users**](UserApi.md#users) | **GET** /User/{appKey} | 获取用户列表 |
| [**usersWithHttpInfo**](UserApi.md#usersWithHttpInfo) | **GET** /User/{appKey} | 获取用户列表 |



## user

> UserApiResponse user(id, appKey)

获取用户详情

根据用户ID获取用户详情

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long id = 56L; // Long | 用户ID
        String appKey = "appKey_example"; // String | 
        try {
            UserApiResponse result = apiInstance.user(id, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#user");
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
| **id** | **Long**| 用户ID | |
| **appKey** | **String**|  | |

### Return type

[**UserApiResponse**](UserApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userWithHttpInfo

> ApiResponse<UserApiResponse> user userWithHttpInfo(id, appKey)

获取用户详情

根据用户ID获取用户详情

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long id = 56L; // Long | 用户ID
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<UserApiResponse> response = apiInstance.userWithHttpInfo(id, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#user");
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
| **id** | **Long**| 用户ID | |
| **appKey** | **String**|  | |

### Return type

ApiResponse<[**UserApiResponse**](UserApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userClear

> BooleanApiResponse userClear(appKey)

清空用户数据

清空用户数据

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            BooleanApiResponse result = apiInstance.userClear(appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userClear");
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

## userClearWithHttpInfo

> ApiResponse<BooleanApiResponse> userClear userClearWithHttpInfo(appKey)

清空用户数据

清空用户数据

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userClearWithHttpInfo(appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userClear");
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


## userCommonInterests

> UserCommonInterestsResultApiResponse userCommonInterests(appKey, tag, skip, take)

有共同爱好的用户推荐

推荐有共同爱好的用户

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String tag = "tag_example"; // String | 兴趣标签
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        try {
            UserCommonInterestsResultApiResponse result = apiInstance.userCommonInterests(appKey, tag, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userCommonInterests");
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
| **tag** | **String**| 兴趣标签 | [optional] |
| **skip** | **Integer**| 跳过的记录数 | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 10] |

### Return type

[**UserCommonInterestsResultApiResponse**](UserCommonInterestsResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userCommonInterestsWithHttpInfo

> ApiResponse<UserCommonInterestsResultApiResponse> userCommonInterests userCommonInterestsWithHttpInfo(appKey, tag, skip, take)

有共同爱好的用户推荐

推荐有共同爱好的用户

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String tag = "tag_example"; // String | 兴趣标签
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        try {
            ApiResponse<UserCommonInterestsResultApiResponse> response = apiInstance.userCommonInterestsWithHttpInfo(appKey, tag, skip, take);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userCommonInterests");
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
| **tag** | **String**| 兴趣标签 | [optional] |
| **skip** | **Integer**| 跳过的记录数 | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 10] |

### Return type

ApiResponse<[**UserCommonInterestsResultApiResponse**](UserCommonInterestsResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userDelete

> BooleanApiResponse userDelete(id, appKey)

删除用户

根据用户ID删除用户

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long id = 56L; // Long | 用户ID
        String appKey = "appKey_example"; // String | 
        try {
            BooleanApiResponse result = apiInstance.userDelete(id, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userDelete");
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
| **id** | **Long**| 用户ID | |
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

## userDeleteWithHttpInfo

> ApiResponse<BooleanApiResponse> userDelete userDeleteWithHttpInfo(id, appKey)

删除用户

根据用户ID删除用户

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long id = 56L; // Long | 用户ID
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userDeleteWithHttpInfo(id, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userDelete");
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
| **id** | **Long**| 用户ID | |
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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


## userExport

> File userExport(appKey)

导出用户数据

导出所有用户数据为Excel文件

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            File result = apiInstance.userExport(appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userExport");
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

[**File**](File.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userExportWithHttpInfo

> ApiResponse<File> userExport userExportWithHttpInfo(appKey)

导出用户数据

导出所有用户数据为Excel文件

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<File> response = apiInstance.userExportWithHttpInfo(appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userExport");
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

ApiResponse<[**File**](File.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userFollowUser

> BooleanApiResponse userFollowUser(userId, appKey)

关注用户

关注指定用户

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long userId = 56L; // Long | 要关注的用户ID
        String appKey = "appKey_example"; // String | 
        try {
            BooleanApiResponse result = apiInstance.userFollowUser(userId, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userFollowUser");
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
| **userId** | **Long**| 要关注的用户ID | |
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

## userFollowUserWithHttpInfo

> ApiResponse<BooleanApiResponse> userFollowUser userFollowUserWithHttpInfo(userId, appKey)

关注用户

关注指定用户

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long userId = 56L; // Long | 要关注的用户ID
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userFollowUserWithHttpInfo(userId, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userFollowUser");
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
| **userId** | **Long**| 要关注的用户ID | |
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


## userFollowerPut

> BooleanApiResponse userFollowerPut(id, appKey, followerPutModel)

更新粉丝

根据粉丝ID更新粉丝信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long id = 56L; // Long | 粉丝ID
        String appKey = "appKey_example"; // String | 
        FollowerPutModel followerPutModel = new FollowerPutModel(); // FollowerPutModel | 更新粉丝的请求参数
        try {
            BooleanApiResponse result = apiInstance.userFollowerPut(id, appKey, followerPutModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userFollowerPut");
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
| **id** | **Long**| 粉丝ID | |
| **appKey** | **String**|  | |
| **followerPutModel** | [**FollowerPutModel**](FollowerPutModel.md)| 更新粉丝的请求参数 | [optional] |

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

## userFollowerPutWithHttpInfo

> ApiResponse<BooleanApiResponse> userFollowerPut userFollowerPutWithHttpInfo(id, appKey, followerPutModel)

更新粉丝

根据粉丝ID更新粉丝信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long id = 56L; // Long | 粉丝ID
        String appKey = "appKey_example"; // String | 
        FollowerPutModel followerPutModel = new FollowerPutModel(); // FollowerPutModel | 更新粉丝的请求参数
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userFollowerPutWithHttpInfo(id, appKey, followerPutModel);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userFollowerPut");
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
| **id** | **Long**| 粉丝ID | |
| **appKey** | **String**|  | |
| **followerPutModel** | [**FollowerPutModel**](FollowerPutModel.md)| 更新粉丝的请求参数 | [optional] |

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


## userFollowers

> UserFollowersResultApiResponse userFollowers(appKey, tag, status, skip, take)

获取我的粉丝列表

根据条件获取我的粉丝列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String tag = "tag_example"; // String | 标签
        String status = "status_example"; // String | 状态
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        try {
            UserFollowersResultApiResponse result = apiInstance.userFollowers(appKey, tag, status, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userFollowers");
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
| **tag** | **String**| 标签 | [optional] |
| **status** | **String**| 状态 | [optional] |
| **skip** | **Integer**| 跳过的记录数 | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 10] |

### Return type

[**UserFollowersResultApiResponse**](UserFollowersResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userFollowersWithHttpInfo

> ApiResponse<UserFollowersResultApiResponse> userFollowers userFollowersWithHttpInfo(appKey, tag, status, skip, take)

获取我的粉丝列表

根据条件获取我的粉丝列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String tag = "tag_example"; // String | 标签
        String status = "status_example"; // String | 状态
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        try {
            ApiResponse<UserFollowersResultApiResponse> response = apiInstance.userFollowersWithHttpInfo(appKey, tag, status, skip, take);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userFollowers");
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
| **tag** | **String**| 标签 | [optional] |
| **status** | **String**| 状态 | [optional] |
| **skip** | **Integer**| 跳过的记录数 | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 10] |

### Return type

ApiResponse<[**UserFollowersResultApiResponse**](UserFollowersResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userFollowing

> UserFollowingResultApiResponse userFollowing(appKey, tag, status, skip, take)

获取我的关注列表

根据条件获取我的关注列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String tag = "tag_example"; // String | 标签
        String status = "status_example"; // String | 状态
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        try {
            UserFollowingResultApiResponse result = apiInstance.userFollowing(appKey, tag, status, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userFollowing");
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
| **tag** | **String**| 标签 | [optional] |
| **status** | **String**| 状态 | [optional] |
| **skip** | **Integer**| 跳过的记录数 | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 10] |

### Return type

[**UserFollowingResultApiResponse**](UserFollowingResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userFollowingWithHttpInfo

> ApiResponse<UserFollowingResultApiResponse> userFollowing userFollowingWithHttpInfo(appKey, tag, status, skip, take)

获取我的关注列表

根据条件获取我的关注列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String tag = "tag_example"; // String | 标签
        String status = "status_example"; // String | 状态
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        try {
            ApiResponse<UserFollowingResultApiResponse> response = apiInstance.userFollowingWithHttpInfo(appKey, tag, status, skip, take);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userFollowing");
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
| **tag** | **String**| 标签 | [optional] |
| **status** | **String**| 状态 | [optional] |
| **skip** | **Integer**| 跳过的记录数 | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 10] |

### Return type

ApiResponse<[**UserFollowingResultApiResponse**](UserFollowingResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userFriendsNearBy

> UserFriendsNearByResultApiResponse userFriendsNearBy(x, y, distance, appKey, gender, ageS, ageE, tag, type, skip, take)

附近的用户推荐

推荐附近的用户

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Double x = 3.4D; // Double | 纬度
        Double y = 3.4D; // Double | 经度
        Long distance = 56L; // Long | 附近距离，单位：米
        String appKey = "appKey_example"; // String | 
        String gender = "gender_example"; // String | 性别
        Integer ageS = 56; // Integer | 年龄段起始
        Integer ageE = 56; // Integer | 年龄段结束
        String tag = "tag_example"; // String | 兴趣标签
        String type = "type_example"; // String | 分类
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        try {
            UserFriendsNearByResultApiResponse result = apiInstance.userFriendsNearBy(x, y, distance, appKey, gender, ageS, ageE, tag, type, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userFriendsNearBy");
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
| **x** | **Double**| 纬度 | |
| **y** | **Double**| 经度 | |
| **distance** | **Long**| 附近距离，单位：米 | |
| **appKey** | **String**|  | |
| **gender** | **String**| 性别 | [optional] |
| **ageS** | **Integer**| 年龄段起始 | [optional] |
| **ageE** | **Integer**| 年龄段结束 | [optional] |
| **tag** | **String**| 兴趣标签 | [optional] |
| **type** | **String**| 分类 | [optional] |
| **skip** | **Integer**| 跳过的记录数 | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 10] |

### Return type

[**UserFriendsNearByResultApiResponse**](UserFriendsNearByResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userFriendsNearByWithHttpInfo

> ApiResponse<UserFriendsNearByResultApiResponse> userFriendsNearBy userFriendsNearByWithHttpInfo(x, y, distance, appKey, gender, ageS, ageE, tag, type, skip, take)

附近的用户推荐

推荐附近的用户

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Double x = 3.4D; // Double | 纬度
        Double y = 3.4D; // Double | 经度
        Long distance = 56L; // Long | 附近距离，单位：米
        String appKey = "appKey_example"; // String | 
        String gender = "gender_example"; // String | 性别
        Integer ageS = 56; // Integer | 年龄段起始
        Integer ageE = 56; // Integer | 年龄段结束
        String tag = "tag_example"; // String | 兴趣标签
        String type = "type_example"; // String | 分类
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        try {
            ApiResponse<UserFriendsNearByResultApiResponse> response = apiInstance.userFriendsNearByWithHttpInfo(x, y, distance, appKey, gender, ageS, ageE, tag, type, skip, take);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userFriendsNearBy");
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
| **x** | **Double**| 纬度 | |
| **y** | **Double**| 经度 | |
| **distance** | **Long**| 附近距离，单位：米 | |
| **appKey** | **String**|  | |
| **gender** | **String**| 性别 | [optional] |
| **ageS** | **Integer**| 年龄段起始 | [optional] |
| **ageE** | **Integer**| 年龄段结束 | [optional] |
| **tag** | **String**| 兴趣标签 | [optional] |
| **type** | **String**| 分类 | [optional] |
| **skip** | **Integer**| 跳过的记录数 | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 10] |

### Return type

ApiResponse<[**UserFriendsNearByResultApiResponse**](UserFriendsNearByResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userImport

> BooleanApiResponse userImport(appKey, check, _file)

导入用户数据

导入用户数据

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Boolean check = true; // Boolean | 是否进行检查
        File _file = new File("/path/to/file"); // File | 导入的文件
        try {
            BooleanApiResponse result = apiInstance.userImport(appKey, check, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userImport");
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
| **check** | **Boolean**| 是否进行检查 | [optional] |
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

## userImportWithHttpInfo

> ApiResponse<BooleanApiResponse> userImport userImportWithHttpInfo(appKey, check, _file)

导入用户数据

导入用户数据

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Boolean check = true; // Boolean | 是否进行检查
        File _file = new File("/path/to/file"); // File | 导入的文件
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userImportWithHttpInfo(appKey, check, _file);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userImport");
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
| **check** | **Boolean**| 是否进行检查 | [optional] |
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


## userLocation

> GeoLocationModelApiResponse userLocation(id, appKey)

获取位置详情

根据位置ID获取位置详情

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long id = 56L; // Long | 位置ID
        String appKey = "appKey_example"; // String | 
        try {
            GeoLocationModelApiResponse result = apiInstance.userLocation(id, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userLocation");
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
| **id** | **Long**| 位置ID | |
| **appKey** | **String**|  | |

### Return type

[**GeoLocationModelApiResponse**](GeoLocationModelApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userLocationWithHttpInfo

> ApiResponse<GeoLocationModelApiResponse> userLocation userLocationWithHttpInfo(id, appKey)

获取位置详情

根据位置ID获取位置详情

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long id = 56L; // Long | 位置ID
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<GeoLocationModelApiResponse> response = apiInstance.userLocationWithHttpInfo(id, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userLocation");
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
| **id** | **Long**| 位置ID | |
| **appKey** | **String**|  | |

### Return type

ApiResponse<[**GeoLocationModelApiResponse**](GeoLocationModelApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userLocationDelete

> BooleanApiResponse userLocationDelete(id, appKey)

删除位置

根据位置ID删除位置信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long id = 56L; // Long | 位置ID
        String appKey = "appKey_example"; // String | 
        try {
            BooleanApiResponse result = apiInstance.userLocationDelete(id, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userLocationDelete");
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
| **id** | **Long**| 位置ID | |
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

## userLocationDeleteWithHttpInfo

> ApiResponse<BooleanApiResponse> userLocationDelete userLocationDeleteWithHttpInfo(id, appKey)

删除位置

根据位置ID删除位置信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long id = 56L; // Long | 位置ID
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userLocationDeleteWithHttpInfo(id, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userLocationDelete");
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
| **id** | **Long**| 位置ID | |
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


## userLocationPost

> UserLocationPostResultApiResponse userLocationPost(appKey, geoLocationModel)

添加位置

添加新的位置信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        GeoLocationModel geoLocationModel = new GeoLocationModel(); // GeoLocationModel | 位置信息
        try {
            UserLocationPostResultApiResponse result = apiInstance.userLocationPost(appKey, geoLocationModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userLocationPost");
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
| **geoLocationModel** | [**GeoLocationModel**](GeoLocationModel.md)| 位置信息 | [optional] |

### Return type

[**UserLocationPostResultApiResponse**](UserLocationPostResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userLocationPostWithHttpInfo

> ApiResponse<UserLocationPostResultApiResponse> userLocationPost userLocationPostWithHttpInfo(appKey, geoLocationModel)

添加位置

添加新的位置信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        GeoLocationModel geoLocationModel = new GeoLocationModel(); // GeoLocationModel | 位置信息
        try {
            ApiResponse<UserLocationPostResultApiResponse> response = apiInstance.userLocationPostWithHttpInfo(appKey, geoLocationModel);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userLocationPost");
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
| **geoLocationModel** | [**GeoLocationModel**](GeoLocationModel.md)| 位置信息 | [optional] |

### Return type

ApiResponse<[**UserLocationPostResultApiResponse**](UserLocationPostResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userLocationPut

> BooleanApiResponse userLocationPut(id, appKey, geoLocationModel)

更新位置

根据位置ID更新位置信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long id = 56L; // Long | 位置ID
        String appKey = "appKey_example"; // String | 
        GeoLocationModel geoLocationModel = new GeoLocationModel(); // GeoLocationModel | 位置信息
        try {
            BooleanApiResponse result = apiInstance.userLocationPut(id, appKey, geoLocationModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userLocationPut");
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
| **id** | **Long**| 位置ID | |
| **appKey** | **String**|  | |
| **geoLocationModel** | [**GeoLocationModel**](GeoLocationModel.md)| 位置信息 | [optional] |

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

## userLocationPutWithHttpInfo

> ApiResponse<BooleanApiResponse> userLocationPut userLocationPutWithHttpInfo(id, appKey, geoLocationModel)

更新位置

根据位置ID更新位置信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long id = 56L; // Long | 位置ID
        String appKey = "appKey_example"; // String | 
        GeoLocationModel geoLocationModel = new GeoLocationModel(); // GeoLocationModel | 位置信息
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userLocationPutWithHttpInfo(id, appKey, geoLocationModel);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userLocationPut");
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
| **id** | **Long**| 位置ID | |
| **appKey** | **String**|  | |
| **geoLocationModel** | [**GeoLocationModel**](GeoLocationModel.md)| 位置信息 | [optional] |

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


## userLocations

> UserLocationsResultApiResponse userLocations(appKey, tag, type, x, y, sphere, skip, take)

获取位置列表

根据条件获取位置列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String tag = "tag_example"; // String | 标签
        String type = "type_example"; // String | 分类
        Double x = 3.4D; // Double | 纬度
        Double y = 3.4D; // Double | 经度
        Long sphere = 56L; // Long | 附近距离，单位：米
        Integer skip = 56; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        try {
            UserLocationsResultApiResponse result = apiInstance.userLocations(appKey, tag, type, x, y, sphere, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userLocations");
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
| **tag** | **String**| 标签 | [optional] |
| **type** | **String**| 分类 | [optional] |
| **x** | **Double**| 纬度 | [optional] |
| **y** | **Double**| 经度 | [optional] |
| **sphere** | **Long**| 附近距离，单位：米 | [optional] |
| **skip** | **Integer**| 跳过的记录数 | [optional] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 10] |

### Return type

[**UserLocationsResultApiResponse**](UserLocationsResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userLocationsWithHttpInfo

> ApiResponse<UserLocationsResultApiResponse> userLocations userLocationsWithHttpInfo(appKey, tag, type, x, y, sphere, skip, take)

获取位置列表

根据条件获取位置列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String tag = "tag_example"; // String | 标签
        String type = "type_example"; // String | 分类
        Double x = 3.4D; // Double | 纬度
        Double y = 3.4D; // Double | 经度
        Long sphere = 56L; // Long | 附近距离，单位：米
        Integer skip = 56; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        try {
            ApiResponse<UserLocationsResultApiResponse> response = apiInstance.userLocationsWithHttpInfo(appKey, tag, type, x, y, sphere, skip, take);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userLocations");
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
| **tag** | **String**| 标签 | [optional] |
| **type** | **String**| 分类 | [optional] |
| **x** | **Double**| 纬度 | [optional] |
| **y** | **Double**| 经度 | [optional] |
| **sphere** | **Long**| 附近距离，单位：米 | [optional] |
| **skip** | **Integer**| 跳过的记录数 | [optional] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 10] |

### Return type

ApiResponse<[**UserLocationsResultApiResponse**](UserLocationsResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userMutualFollowers

> UserMutualFollowersResultApiResponse userMutualFollowers(appKey, skip, take)

有共同粉丝的用户推荐

推荐有共同粉丝的用户

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        try {
            UserMutualFollowersResultApiResponse result = apiInstance.userMutualFollowers(appKey, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userMutualFollowers");
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
| **skip** | **Integer**| 跳过的记录数 | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 10] |

### Return type

[**UserMutualFollowersResultApiResponse**](UserMutualFollowersResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userMutualFollowersWithHttpInfo

> ApiResponse<UserMutualFollowersResultApiResponse> userMutualFollowers userMutualFollowersWithHttpInfo(appKey, skip, take)

有共同粉丝的用户推荐

推荐有共同粉丝的用户

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        try {
            ApiResponse<UserMutualFollowersResultApiResponse> response = apiInstance.userMutualFollowersWithHttpInfo(appKey, skip, take);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userMutualFollowers");
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
| **skip** | **Integer**| 跳过的记录数 | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 10] |

### Return type

ApiResponse<[**UserMutualFollowersResultApiResponse**](UserMutualFollowersResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userMutualFollowings

> UserMutualFollowingsResultApiResponse userMutualFollowings(appKey, skip, take)

有共同关注的用户推荐

推荐有共同关注的用户

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        try {
            UserMutualFollowingsResultApiResponse result = apiInstance.userMutualFollowings(appKey, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userMutualFollowings");
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
| **skip** | **Integer**| 跳过的记录数 | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 10] |

### Return type

[**UserMutualFollowingsResultApiResponse**](UserMutualFollowingsResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userMutualFollowingsWithHttpInfo

> ApiResponse<UserMutualFollowingsResultApiResponse> userMutualFollowings userMutualFollowingsWithHttpInfo(appKey, skip, take)

有共同关注的用户推荐

推荐有共同关注的用户

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        try {
            ApiResponse<UserMutualFollowingsResultApiResponse> response = apiInstance.userMutualFollowingsWithHttpInfo(appKey, skip, take);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userMutualFollowings");
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
| **skip** | **Integer**| 跳过的记录数 | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 10] |

### Return type

ApiResponse<[**UserMutualFollowingsResultApiResponse**](UserMutualFollowingsResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userOAuthAccountBind

> BooleanApiResponse userOAuthAccountBind(appKey, oauthAccountBindRequest)

外部账号 绑定

绑定外部账号

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        OAuthAccountBindRequest oauthAccountBindRequest = new OAuthAccountBindRequest(); // OAuthAccountBindRequest | 绑定请求参数
        try {
            BooleanApiResponse result = apiInstance.userOAuthAccountBind(appKey, oauthAccountBindRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userOAuthAccountBind");
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
| **oauthAccountBindRequest** | [**OAuthAccountBindRequest**](OAuthAccountBindRequest.md)| 绑定请求参数 | [optional] |

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

## userOAuthAccountBindWithHttpInfo

> ApiResponse<BooleanApiResponse> userOAuthAccountBind userOAuthAccountBindWithHttpInfo(appKey, oauthAccountBindRequest)

外部账号 绑定

绑定外部账号

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        OAuthAccountBindRequest oauthAccountBindRequest = new OAuthAccountBindRequest(); // OAuthAccountBindRequest | 绑定请求参数
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userOAuthAccountBindWithHttpInfo(appKey, oauthAccountBindRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userOAuthAccountBind");
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
| **oauthAccountBindRequest** | [**OAuthAccountBindRequest**](OAuthAccountBindRequest.md)| 绑定请求参数 | [optional] |

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


## userOAuthAccountSignIn

> TokenModelApiResponse userOAuthAccountSignIn(appKey, oauthAccountSignInRequest)

外部账号 登录

使用外部账号进行登录

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        OAuthAccountSignInRequest oauthAccountSignInRequest = new OAuthAccountSignInRequest(); // OAuthAccountSignInRequest | 登录请求参数
        try {
            TokenModelApiResponse result = apiInstance.userOAuthAccountSignIn(appKey, oauthAccountSignInRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userOAuthAccountSignIn");
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
| **oauthAccountSignInRequest** | [**OAuthAccountSignInRequest**](OAuthAccountSignInRequest.md)| 登录请求参数 | [optional] |

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

## userOAuthAccountSignInWithHttpInfo

> ApiResponse<TokenModelApiResponse> userOAuthAccountSignIn userOAuthAccountSignInWithHttpInfo(appKey, oauthAccountSignInRequest)

外部账号 登录

使用外部账号进行登录

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        OAuthAccountSignInRequest oauthAccountSignInRequest = new OAuthAccountSignInRequest(); // OAuthAccountSignInRequest | 登录请求参数
        try {
            ApiResponse<TokenModelApiResponse> response = apiInstance.userOAuthAccountSignInWithHttpInfo(appKey, oauthAccountSignInRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userOAuthAccountSignIn");
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
| **oauthAccountSignInRequest** | [**OAuthAccountSignInRequest**](OAuthAccountSignInRequest.md)| 登录请求参数 | [optional] |

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


## userOAuthAccounts

> UserLoginsListApiResponse userOAuthAccounts(appKey)

外部账号 绑定列表

获取外部账号绑定列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            UserLoginsListApiResponse result = apiInstance.userOAuthAccounts(appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userOAuthAccounts");
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

[**UserLoginsListApiResponse**](UserLoginsListApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userOAuthAccountsWithHttpInfo

> ApiResponse<UserLoginsListApiResponse> userOAuthAccounts userOAuthAccountsWithHttpInfo(appKey)

外部账号 绑定列表

获取外部账号绑定列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<UserLoginsListApiResponse> response = apiInstance.userOAuthAccountsWithHttpInfo(appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userOAuthAccounts");
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

ApiResponse<[**UserLoginsListApiResponse**](UserLoginsListApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userOAuthAccountsPutBind

> BooleanApiResponse userOAuthAccountsPutBind(id, appKey, oauthAccountPutBindRequest)

外部账号 更新绑定

更新外部账号绑定信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long id = 56L; // Long | 绑定ID
        String appKey = "appKey_example"; // String | 
        OAuthAccountPutBindRequest oauthAccountPutBindRequest = new OAuthAccountPutBindRequest(); // OAuthAccountPutBindRequest | 更新请求参数
        try {
            BooleanApiResponse result = apiInstance.userOAuthAccountsPutBind(id, appKey, oauthAccountPutBindRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userOAuthAccountsPutBind");
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
| **id** | **Long**| 绑定ID | |
| **appKey** | **String**|  | |
| **oauthAccountPutBindRequest** | [**OAuthAccountPutBindRequest**](OAuthAccountPutBindRequest.md)| 更新请求参数 | [optional] |

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

## userOAuthAccountsPutBindWithHttpInfo

> ApiResponse<BooleanApiResponse> userOAuthAccountsPutBind userOAuthAccountsPutBindWithHttpInfo(id, appKey, oauthAccountPutBindRequest)

外部账号 更新绑定

更新外部账号绑定信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long id = 56L; // Long | 绑定ID
        String appKey = "appKey_example"; // String | 
        OAuthAccountPutBindRequest oauthAccountPutBindRequest = new OAuthAccountPutBindRequest(); // OAuthAccountPutBindRequest | 更新请求参数
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userOAuthAccountsPutBindWithHttpInfo(id, appKey, oauthAccountPutBindRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userOAuthAccountsPutBind");
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
| **id** | **Long**| 绑定ID | |
| **appKey** | **String**|  | |
| **oauthAccountPutBindRequest** | [**OAuthAccountPutBindRequest**](OAuthAccountPutBindRequest.md)| 更新请求参数 | [optional] |

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


## userOAuthAccountsUnBind

> BooleanApiResponse userOAuthAccountsUnBind(id, appKey)

外部账号 删除绑定

删除外部账号绑定

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long id = 56L; // Long | 绑定ID
        String appKey = "appKey_example"; // String | 
        try {
            BooleanApiResponse result = apiInstance.userOAuthAccountsUnBind(id, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userOAuthAccountsUnBind");
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
| **id** | **Long**| 绑定ID | |
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

## userOAuthAccountsUnBindWithHttpInfo

> ApiResponse<BooleanApiResponse> userOAuthAccountsUnBind userOAuthAccountsUnBindWithHttpInfo(id, appKey)

外部账号 删除绑定

删除外部账号绑定

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long id = 56L; // Long | 绑定ID
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userOAuthAccountsUnBindWithHttpInfo(id, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userOAuthAccountsUnBind");
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
| **id** | **Long**| 绑定ID | |
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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


## userPut

> BooleanApiResponse userPut(id, appKey, user)

更新用户信息

根据用户ID更新用户信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long id = 56L; // Long | 用户ID
        String appKey = "appKey_example"; // String | 
        User user = new User(); // User | 用户信息
        try {
            BooleanApiResponse result = apiInstance.userPut(id, appKey, user);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userPut");
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
| **id** | **Long**| 用户ID | |
| **appKey** | **String**|  | |
| **user** | [**User**](User.md)| 用户信息 | [optional] |

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

## userPutWithHttpInfo

> ApiResponse<BooleanApiResponse> userPut userPutWithHttpInfo(id, appKey, user)

更新用户信息

根据用户ID更新用户信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long id = 56L; // Long | 用户ID
        String appKey = "appKey_example"; // String | 
        User user = new User(); // User | 用户信息
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userPutWithHttpInfo(id, appKey, user);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userPut");
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
| **id** | **Long**| 用户ID | |
| **appKey** | **String**|  | |
| **user** | [**User**](User.md)| 用户信息 | [optional] |

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


## userQRCodePreSignIn

> Int64ApiResponse userQRCodePreSignIn(appKey, qrCodePreSignInRequest)

微信小程序 - 预登陆

使用微信小程序二维码进行预登陆

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        QRCodePreSignInRequest qrCodePreSignInRequest = new QRCodePreSignInRequest(); // QRCodePreSignInRequest | 预登陆请求参数
        try {
            Int64ApiResponse result = apiInstance.userQRCodePreSignIn(appKey, qrCodePreSignInRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userQRCodePreSignIn");
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
| **qrCodePreSignInRequest** | [**QRCodePreSignInRequest**](QRCodePreSignInRequest.md)| 预登陆请求参数 | [optional] |

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

## userQRCodePreSignInWithHttpInfo

> ApiResponse<Int64ApiResponse> userQRCodePreSignIn userQRCodePreSignInWithHttpInfo(appKey, qrCodePreSignInRequest)

微信小程序 - 预登陆

使用微信小程序二维码进行预登陆

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        QRCodePreSignInRequest qrCodePreSignInRequest = new QRCodePreSignInRequest(); // QRCodePreSignInRequest | 预登陆请求参数
        try {
            ApiResponse<Int64ApiResponse> response = apiInstance.userQRCodePreSignInWithHttpInfo(appKey, qrCodePreSignInRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userQRCodePreSignIn");
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
| **qrCodePreSignInRequest** | [**QRCodePreSignInRequest**](QRCodePreSignInRequest.md)| 预登陆请求参数 | [optional] |

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


## userQRCodeScan

> UserQRCodeScanResultApiResponse userQRCodeScan(appKey, qrCodeScanRequest)

微信小程序 - 扫码

使用微信小程序二维码进行扫码

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        QRCodeScanRequest qrCodeScanRequest = new QRCodeScanRequest(); // QRCodeScanRequest | 扫码请求参数
        try {
            UserQRCodeScanResultApiResponse result = apiInstance.userQRCodeScan(appKey, qrCodeScanRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userQRCodeScan");
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
| **qrCodeScanRequest** | [**QRCodeScanRequest**](QRCodeScanRequest.md)| 扫码请求参数 | [optional] |

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

## userQRCodeScanWithHttpInfo

> ApiResponse<UserQRCodeScanResultApiResponse> userQRCodeScan userQRCodeScanWithHttpInfo(appKey, qrCodeScanRequest)

微信小程序 - 扫码

使用微信小程序二维码进行扫码

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        QRCodeScanRequest qrCodeScanRequest = new QRCodeScanRequest(); // QRCodeScanRequest | 扫码请求参数
        try {
            ApiResponse<UserQRCodeScanResultApiResponse> response = apiInstance.userQRCodeScanWithHttpInfo(appKey, qrCodeScanRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userQRCodeScan");
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
| **qrCodeScanRequest** | [**QRCodeScanRequest**](QRCodeScanRequest.md)| 扫码请求参数 | [optional] |

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


## userQRCodeSignIn

> TokenModelApiResponse userQRCodeSignIn(appKey, qrCodeSignInRequest)

微信小程序 - 网页登录

使用微信小程序二维码进行网页登录

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        QRCodeSignInRequest qrCodeSignInRequest = new QRCodeSignInRequest(); // QRCodeSignInRequest | 登录请求参数
        try {
            TokenModelApiResponse result = apiInstance.userQRCodeSignIn(appKey, qrCodeSignInRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userQRCodeSignIn");
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
| **qrCodeSignInRequest** | [**QRCodeSignInRequest**](QRCodeSignInRequest.md)| 登录请求参数 | [optional] |

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

## userQRCodeSignInWithHttpInfo

> ApiResponse<TokenModelApiResponse> userQRCodeSignIn userQRCodeSignInWithHttpInfo(appKey, qrCodeSignInRequest)

微信小程序 - 网页登录

使用微信小程序二维码进行网页登录

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        QRCodeSignInRequest qrCodeSignInRequest = new QRCodeSignInRequest(); // QRCodeSignInRequest | 登录请求参数
        try {
            ApiResponse<TokenModelApiResponse> response = apiInstance.userQRCodeSignInWithHttpInfo(appKey, qrCodeSignInRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userQRCodeSignIn");
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
| **qrCodeSignInRequest** | [**QRCodeSignInRequest**](QRCodeSignInRequest.md)| 登录请求参数 | [optional] |

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


## userQRCodeSignUp

> TokenModelApiResponse userQRCodeSignUp(appKey, qrCodeSignUpRequest)

微信小程序 - 注册

使用微信小程序二维码进行注册

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        QRCodeSignUpRequest qrCodeSignUpRequest = new QRCodeSignUpRequest(); // QRCodeSignUpRequest | 注册请求参数
        try {
            TokenModelApiResponse result = apiInstance.userQRCodeSignUp(appKey, qrCodeSignUpRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userQRCodeSignUp");
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
| **qrCodeSignUpRequest** | [**QRCodeSignUpRequest**](QRCodeSignUpRequest.md)| 注册请求参数 | [optional] |

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

## userQRCodeSignUpWithHttpInfo

> ApiResponse<TokenModelApiResponse> userQRCodeSignUp userQRCodeSignUpWithHttpInfo(appKey, qrCodeSignUpRequest)

微信小程序 - 注册

使用微信小程序二维码进行注册

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        QRCodeSignUpRequest qrCodeSignUpRequest = new QRCodeSignUpRequest(); // QRCodeSignUpRequest | 注册请求参数
        try {
            ApiResponse<TokenModelApiResponse> response = apiInstance.userQRCodeSignUpWithHttpInfo(appKey, qrCodeSignUpRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userQRCodeSignUp");
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
| **qrCodeSignUpRequest** | [**QRCodeSignUpRequest**](QRCodeSignUpRequest.md)| 注册请求参数 | [optional] |

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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

账号密码 登录

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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

账号密码 登录

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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

账号密码 注册

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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

账号密码 注册

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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

双因素验证

获取双因素验证的设置信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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

双因素验证

获取双因素验证的设置信息

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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


## userUnfollowUser

> BooleanApiResponse userUnfollowUser(userId, appKey)

取消关注

取消关注指定用户

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long userId = 56L; // Long | 要取消关注的用户ID
        String appKey = "appKey_example"; // String | 
        try {
            BooleanApiResponse result = apiInstance.userUnfollowUser(userId, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userUnfollowUser");
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
| **userId** | **Long**| 要取消关注的用户ID | |
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

## userUnfollowUserWithHttpInfo

> ApiResponse<BooleanApiResponse> userUnfollowUser userUnfollowUserWithHttpInfo(userId, appKey)

取消关注

取消关注指定用户

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        Long userId = 56L; // Long | 要取消关注的用户ID
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userUnfollowUserWithHttpInfo(userId, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#userUnfollowUser");
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
| **userId** | **Long**| 要取消关注的用户ID | |
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
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


## users

> UserListResultApiResponse users(appKey, userName, email, phone, platform, unionId, role, skip, take)

获取用户列表

根据条件获取用户列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String userName = "userName_example"; // String | 用户名
        String email = "email_example"; // String | 邮箱
        String phone = "phone_example"; // String | 电话
        String platform = "platform_example"; // String | 平台
        String unionId = "unionId_example"; // String | 联合ID
        String role = "role_example"; // String | 角色
        Integer skip = 56; // Integer | 跳过的记录数
        Integer take = 56; // Integer | 获取的记录数
        try {
            UserListResultApiResponse result = apiInstance.users(appKey, userName, email, phone, platform, unionId, role, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#users");
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
| **userName** | **String**| 用户名 | [optional] |
| **email** | **String**| 邮箱 | [optional] |
| **phone** | **String**| 电话 | [optional] |
| **platform** | **String**| 平台 | [optional] |
| **unionId** | **String**| 联合ID | [optional] |
| **role** | **String**| 角色 | [optional] |
| **skip** | **Integer**| 跳过的记录数 | [optional] |
| **take** | **Integer**| 获取的记录数 | [optional] |

### Return type

[**UserListResultApiResponse**](UserListResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## usersWithHttpInfo

> ApiResponse<UserListResultApiResponse> users usersWithHttpInfo(appKey, userName, email, phone, platform, unionId, role, skip, take)

获取用户列表

根据条件获取用户列表

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
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String userName = "userName_example"; // String | 用户名
        String email = "email_example"; // String | 邮箱
        String phone = "phone_example"; // String | 电话
        String platform = "platform_example"; // String | 平台
        String unionId = "unionId_example"; // String | 联合ID
        String role = "role_example"; // String | 角色
        Integer skip = 56; // Integer | 跳过的记录数
        Integer take = 56; // Integer | 获取的记录数
        try {
            ApiResponse<UserListResultApiResponse> response = apiInstance.usersWithHttpInfo(appKey, userName, email, phone, platform, unionId, role, skip, take);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#users");
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
| **userName** | **String**| 用户名 | [optional] |
| **email** | **String**| 邮箱 | [optional] |
| **phone** | **String**| 电话 | [optional] |
| **platform** | **String**| 平台 | [optional] |
| **unionId** | **String**| 联合ID | [optional] |
| **role** | **String**| 角色 | [optional] |
| **skip** | **Integer**| 跳过的记录数 | [optional] |
| **take** | **Integer**| 获取的记录数 | [optional] |

### Return type

ApiResponse<[**UserListResultApiResponse**](UserListResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

