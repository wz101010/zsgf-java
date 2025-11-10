# UserFriendsApi

All URIs are relative to *https://api-dev.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userCommonInterests**](UserFriendsApi.md#userCommonInterests) | **GET** /UserFriends/{appKey}/CommonInterests | 推荐相似兴趣用户 |
| [**userCommonInterestsWithHttpInfo**](UserFriendsApi.md#userCommonInterestsWithHttpInfo) | **GET** /UserFriends/{appKey}/CommonInterests | 推荐相似兴趣用户 |
| [**userFollowUser**](UserFriendsApi.md#userFollowUser) | **POST** /UserFriends/{appKey}/Follower/{userId} | 添加关注 |
| [**userFollowUserWithHttpInfo**](UserFriendsApi.md#userFollowUserWithHttpInfo) | **POST** /UserFriends/{appKey}/Follower/{userId} | 添加关注 |
| [**userFollowerPut**](UserFriendsApi.md#userFollowerPut) | **PUT** /UserFriends/{appKey}/Follower/{id} | 刷新粉丝数据 |
| [**userFollowerPutWithHttpInfo**](UserFriendsApi.md#userFollowerPutWithHttpInfo) | **PUT** /UserFriends/{appKey}/Follower/{id} | 刷新粉丝数据 |
| [**userFollowers**](UserFriendsApi.md#userFollowers) | **GET** /UserFriends/{appKey}/Followers | 获取粉丝列表 |
| [**userFollowersWithHttpInfo**](UserFriendsApi.md#userFollowersWithHttpInfo) | **GET** /UserFriends/{appKey}/Followers | 获取粉丝列表 |
| [**userFollowing**](UserFriendsApi.md#userFollowing) | **GET** /UserFriends/{appKey}/Following | 获取关注列表 / 判断是否关注 |
| [**userFollowingWithHttpInfo**](UserFriendsApi.md#userFollowingWithHttpInfo) | **GET** /UserFriends/{appKey}/Following | 获取关注列表 / 判断是否关注 |
| [**userFriendsNearBy**](UserFriendsApi.md#userFriendsNearBy) | **GET** /UserFriends/{appKey}/NearBy | 推荐附近用户 |
| [**userFriendsNearByWithHttpInfo**](UserFriendsApi.md#userFriendsNearByWithHttpInfo) | **GET** /UserFriends/{appKey}/NearBy | 推荐附近用户 |
| [**userMutualFollowers**](UserFriendsApi.md#userMutualFollowers) | **GET** /UserFriends/{appKey}/MutualFollowers | 推荐共同粉丝用户 |
| [**userMutualFollowersWithHttpInfo**](UserFriendsApi.md#userMutualFollowersWithHttpInfo) | **GET** /UserFriends/{appKey}/MutualFollowers | 推荐共同粉丝用户 |
| [**userMutualFollowings**](UserFriendsApi.md#userMutualFollowings) | **GET** /UserFriends/{appKey}/MutualFollowings | 推荐共同关注用户 |
| [**userMutualFollowingsWithHttpInfo**](UserFriendsApi.md#userMutualFollowingsWithHttpInfo) | **GET** /UserFriends/{appKey}/MutualFollowings | 推荐共同关注用户 |
| [**userProfileById**](UserFriendsApi.md#userProfileById) | **GET** /UserFriends/{appKey}/Profile/{userId} | 获取用户资料 |
| [**userProfileByIdWithHttpInfo**](UserFriendsApi.md#userProfileByIdWithHttpInfo) | **GET** /UserFriends/{appKey}/Profile/{userId} | 获取用户资料 |
| [**userUnfollowUser**](UserFriendsApi.md#userUnfollowUser) | **DELETE** /UserFriends/{appKey}/Follower/{userId} | 取消关注 |
| [**userUnfollowUserWithHttpInfo**](UserFriendsApi.md#userUnfollowUserWithHttpInfo) | **DELETE** /UserFriends/{appKey}/Follower/{userId} | 取消关注 |



## userCommonInterests

> UserCommonInterestsResultApiResponse userCommonInterests(appKey, tag, skip, take, userId)

推荐相似兴趣用户

推荐有共同爱好的用户

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String tag = "tag_example"; // String | 兴趣标签
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        String userId = ""; // String | 
        try {
            UserCommonInterestsResultApiResponse result = apiInstance.userCommonInterests(appKey, tag, skip, take, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userCommonInterests");
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
| **userId** | **String**|  | [optional] [default to ] |

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

> ApiResponse<UserCommonInterestsResultApiResponse> userCommonInterests userCommonInterestsWithHttpInfo(appKey, tag, skip, take, userId)

推荐相似兴趣用户

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
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String tag = "tag_example"; // String | 兴趣标签
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        String userId = ""; // String | 
        try {
            ApiResponse<UserCommonInterestsResultApiResponse> response = apiInstance.userCommonInterestsWithHttpInfo(appKey, tag, skip, take, userId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userCommonInterests");
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
| **userId** | **String**|  | [optional] [default to ] |

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


## userFollowUser

> BooleanApiResponse userFollowUser(userId, appKey, fromUserId)

添加关注

关注指定用户

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        Long userId = 56L; // Long | 要关注的用户ID
        String appKey = "appKey_example"; // String | 
        String fromUserId = "fromUserId_example"; // String | 
        try {
            BooleanApiResponse result = apiInstance.userFollowUser(userId, appKey, fromUserId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userFollowUser");
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
| **fromUserId** | **String**|  | [optional] |

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

> ApiResponse<BooleanApiResponse> userFollowUser userFollowUserWithHttpInfo(userId, appKey, fromUserId)

添加关注

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
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        Long userId = 56L; // Long | 要关注的用户ID
        String appKey = "appKey_example"; // String | 
        String fromUserId = "fromUserId_example"; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userFollowUserWithHttpInfo(userId, appKey, fromUserId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userFollowUser");
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
| **fromUserId** | **String**|  | [optional] |

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

刷新粉丝数据

根据粉丝ID更新粉丝信息

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        Long id = 56L; // Long | 粉丝ID
        String appKey = "appKey_example"; // String | 
        FollowerPutModel followerPutModel = new FollowerPutModel(); // FollowerPutModel | 更新粉丝的请求参数
        try {
            BooleanApiResponse result = apiInstance.userFollowerPut(id, appKey, followerPutModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userFollowerPut");
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

刷新粉丝数据

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
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        Long id = 56L; // Long | 粉丝ID
        String appKey = "appKey_example"; // String | 
        FollowerPutModel followerPutModel = new FollowerPutModel(); // FollowerPutModel | 更新粉丝的请求参数
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userFollowerPutWithHttpInfo(id, appKey, followerPutModel);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userFollowerPut");
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

> UserFollowersResultApiResponse userFollowers(appKey, tag, status, targetUserId, skip, take, userId)

获取粉丝列表

根据条件获取我的粉丝列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String tag = "tag_example"; // String | 标签
        String status = "status_example"; // String | 状态
        Long targetUserId = 0L; // Long | 指定用户的粉丝
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        String userId = ""; // String | 
        try {
            UserFollowersResultApiResponse result = apiInstance.userFollowers(appKey, tag, status, targetUserId, skip, take, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userFollowers");
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
| **targetUserId** | **Long**| 指定用户的粉丝 | [optional] [default to 0] |
| **skip** | **Integer**| 跳过的记录数 | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 10] |
| **userId** | **String**|  | [optional] [default to ] |

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

> ApiResponse<UserFollowersResultApiResponse> userFollowers userFollowersWithHttpInfo(appKey, tag, status, targetUserId, skip, take, userId)

获取粉丝列表

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
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String tag = "tag_example"; // String | 标签
        String status = "status_example"; // String | 状态
        Long targetUserId = 0L; // Long | 指定用户的粉丝
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        String userId = ""; // String | 
        try {
            ApiResponse<UserFollowersResultApiResponse> response = apiInstance.userFollowersWithHttpInfo(appKey, tag, status, targetUserId, skip, take, userId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userFollowers");
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
| **targetUserId** | **Long**| 指定用户的粉丝 | [optional] [default to 0] |
| **skip** | **Integer**| 跳过的记录数 | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数 | [optional] [default to 10] |
| **userId** | **String**|  | [optional] [default to ] |

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

> BooleanApiResponse userFollowing(appKey, tag, status, targetUserId, skip, take, checkUserId, onlyIDs, userId)

获取关注列表 / 判断是否关注

根据条件获取我的关注列表，或判断是否关注某个用户

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String tag = "tag_example"; // String | 用于过滤关注列表的标签（可选）。
        String status = "status_example"; // String | 用于过滤关注列表的状态（可选）。
        Long targetUserId = 0L; // Long | 指定用户的关注记录，如果不提供则默认为当前用户的关注。
        Integer skip = 0; // Integer | 跳过的记录数，用于分页（默认0）。
        Integer take = 10; // Integer | 获取的记录数，用于分页（默认10）。
        Long checkUserId = 56L; // Long | 要判断是否关注的目标用户ID。如果提供此参数，方法将返回一个布尔值，表示当前用户是否关注该目标用户。
        Boolean onlyIDs = false; // Boolean | 是否只返回关注用户的ID集合，默认为false（即返回完整的关注用户信息）。
        String userId = ""; // String | 
        try {
            BooleanApiResponse result = apiInstance.userFollowing(appKey, tag, status, targetUserId, skip, take, checkUserId, onlyIDs, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userFollowing");
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
| **tag** | **String**| 用于过滤关注列表的标签（可选）。 | [optional] |
| **status** | **String**| 用于过滤关注列表的状态（可选）。 | [optional] |
| **targetUserId** | **Long**| 指定用户的关注记录，如果不提供则默认为当前用户的关注。 | [optional] [default to 0] |
| **skip** | **Integer**| 跳过的记录数，用于分页（默认0）。 | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数，用于分页（默认10）。 | [optional] [default to 10] |
| **checkUserId** | **Long**| 要判断是否关注的目标用户ID。如果提供此参数，方法将返回一个布尔值，表示当前用户是否关注该目标用户。 | [optional] |
| **onlyIDs** | **Boolean**| 是否只返回关注用户的ID集合，默认为false（即返回完整的关注用户信息）。 | [optional] [default to false] |
| **userId** | **String**|  | [optional] [default to ] |

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

## userFollowingWithHttpInfo

> ApiResponse<BooleanApiResponse> userFollowing userFollowingWithHttpInfo(appKey, tag, status, targetUserId, skip, take, checkUserId, onlyIDs, userId)

获取关注列表 / 判断是否关注

根据条件获取我的关注列表，或判断是否关注某个用户

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String tag = "tag_example"; // String | 用于过滤关注列表的标签（可选）。
        String status = "status_example"; // String | 用于过滤关注列表的状态（可选）。
        Long targetUserId = 0L; // Long | 指定用户的关注记录，如果不提供则默认为当前用户的关注。
        Integer skip = 0; // Integer | 跳过的记录数，用于分页（默认0）。
        Integer take = 10; // Integer | 获取的记录数，用于分页（默认10）。
        Long checkUserId = 56L; // Long | 要判断是否关注的目标用户ID。如果提供此参数，方法将返回一个布尔值，表示当前用户是否关注该目标用户。
        Boolean onlyIDs = false; // Boolean | 是否只返回关注用户的ID集合，默认为false（即返回完整的关注用户信息）。
        String userId = ""; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userFollowingWithHttpInfo(appKey, tag, status, targetUserId, skip, take, checkUserId, onlyIDs, userId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userFollowing");
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
| **tag** | **String**| 用于过滤关注列表的标签（可选）。 | [optional] |
| **status** | **String**| 用于过滤关注列表的状态（可选）。 | [optional] |
| **targetUserId** | **Long**| 指定用户的关注记录，如果不提供则默认为当前用户的关注。 | [optional] [default to 0] |
| **skip** | **Integer**| 跳过的记录数，用于分页（默认0）。 | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数，用于分页（默认10）。 | [optional] [default to 10] |
| **checkUserId** | **Long**| 要判断是否关注的目标用户ID。如果提供此参数，方法将返回一个布尔值，表示当前用户是否关注该目标用户。 | [optional] |
| **onlyIDs** | **Boolean**| 是否只返回关注用户的ID集合，默认为false（即返回完整的关注用户信息）。 | [optional] [default to false] |
| **userId** | **String**|  | [optional] [default to ] |

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


## userFriendsNearBy

> UserFriendsNearByResultApiResponse userFriendsNearBy(longitude, latitude, appKey, country, state, city, district, gender, ageS, ageE, tag, distance, skip, take, userId)

推荐附近用户

根据地理位置坐标和多种筛选条件，查询附近满足条件的用户列表，支持分页和按距离排序。 地理位置查询使用MySQL的ST_Distance_Sphere函数计算球面距离。 注意：longitude为经度(X轴)，latitude为纬度(Y轴)，参数顺序与常规坐标系一致

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        Double longitude = 3.4D; // Double | 当前用户经度坐标(WGS84坐标系)
        Double latitude = 3.4D; // Double | 当前用户纬度坐标(WGS84坐标系)
        String appKey = "appKey_example"; // String | 
        String country = "country_example"; // String | 国家过滤条件（精确匹配）
        String state = "state_example"; // String | 省份过滤条件（精确匹配）
        String city = "city_example"; // String | 城市过滤条件（精确匹配）
        String district = "district_example"; // String | 区县过滤条件（精确匹配）
        String gender = "gender_example"; // String | 性别过滤条件（可选值示例：Male/Female/Other）
        Integer ageS = 56; // Integer | 年龄起始范围（包含，0表示不限制）
        Integer ageE = 56; // Integer | 年龄结束范围（包含，0表示不限制）
        String tag = "tag_example"; // String | 兴趣标签过滤（支持模糊匹配，如：\"运动\"）
        Long distance = 0L; // Long | 搜索半径（单位：米，0表示不限制距离）
        Integer skip = 0; // Integer | 跳过的记录数（分页起始位置，默认0）
        Integer take = 10; // Integer | 获取的记录数（分页大小，默认10，最大100）
        String userId = ""; // String | 
        try {
            UserFriendsNearByResultApiResponse result = apiInstance.userFriendsNearBy(longitude, latitude, appKey, country, state, city, district, gender, ageS, ageE, tag, distance, skip, take, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userFriendsNearBy");
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
| **longitude** | **Double**| 当前用户经度坐标(WGS84坐标系) | |
| **latitude** | **Double**| 当前用户纬度坐标(WGS84坐标系) | |
| **appKey** | **String**|  | |
| **country** | **String**| 国家过滤条件（精确匹配） | [optional] |
| **state** | **String**| 省份过滤条件（精确匹配） | [optional] |
| **city** | **String**| 城市过滤条件（精确匹配） | [optional] |
| **district** | **String**| 区县过滤条件（精确匹配） | [optional] |
| **gender** | **String**| 性别过滤条件（可选值示例：Male/Female/Other） | [optional] |
| **ageS** | **Integer**| 年龄起始范围（包含，0表示不限制） | [optional] |
| **ageE** | **Integer**| 年龄结束范围（包含，0表示不限制） | [optional] |
| **tag** | **String**| 兴趣标签过滤（支持模糊匹配，如：\&quot;运动\&quot;） | [optional] |
| **distance** | **Long**| 搜索半径（单位：米，0表示不限制距离） | [optional] [default to 0] |
| **skip** | **Integer**| 跳过的记录数（分页起始位置，默认0） | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数（分页大小，默认10，最大100） | [optional] [default to 10] |
| **userId** | **String**|  | [optional] [default to ] |

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
| **200** | 返回推荐用户列表数据 |  -  |

## userFriendsNearByWithHttpInfo

> ApiResponse<UserFriendsNearByResultApiResponse> userFriendsNearBy userFriendsNearByWithHttpInfo(longitude, latitude, appKey, country, state, city, district, gender, ageS, ageE, tag, distance, skip, take, userId)

推荐附近用户

根据地理位置坐标和多种筛选条件，查询附近满足条件的用户列表，支持分页和按距离排序。 地理位置查询使用MySQL的ST_Distance_Sphere函数计算球面距离。 注意：longitude为经度(X轴)，latitude为纬度(Y轴)，参数顺序与常规坐标系一致

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        Double longitude = 3.4D; // Double | 当前用户经度坐标(WGS84坐标系)
        Double latitude = 3.4D; // Double | 当前用户纬度坐标(WGS84坐标系)
        String appKey = "appKey_example"; // String | 
        String country = "country_example"; // String | 国家过滤条件（精确匹配）
        String state = "state_example"; // String | 省份过滤条件（精确匹配）
        String city = "city_example"; // String | 城市过滤条件（精确匹配）
        String district = "district_example"; // String | 区县过滤条件（精确匹配）
        String gender = "gender_example"; // String | 性别过滤条件（可选值示例：Male/Female/Other）
        Integer ageS = 56; // Integer | 年龄起始范围（包含，0表示不限制）
        Integer ageE = 56; // Integer | 年龄结束范围（包含，0表示不限制）
        String tag = "tag_example"; // String | 兴趣标签过滤（支持模糊匹配，如：\"运动\"）
        Long distance = 0L; // Long | 搜索半径（单位：米，0表示不限制距离）
        Integer skip = 0; // Integer | 跳过的记录数（分页起始位置，默认0）
        Integer take = 10; // Integer | 获取的记录数（分页大小，默认10，最大100）
        String userId = ""; // String | 
        try {
            ApiResponse<UserFriendsNearByResultApiResponse> response = apiInstance.userFriendsNearByWithHttpInfo(longitude, latitude, appKey, country, state, city, district, gender, ageS, ageE, tag, distance, skip, take, userId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userFriendsNearBy");
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
| **longitude** | **Double**| 当前用户经度坐标(WGS84坐标系) | |
| **latitude** | **Double**| 当前用户纬度坐标(WGS84坐标系) | |
| **appKey** | **String**|  | |
| **country** | **String**| 国家过滤条件（精确匹配） | [optional] |
| **state** | **String**| 省份过滤条件（精确匹配） | [optional] |
| **city** | **String**| 城市过滤条件（精确匹配） | [optional] |
| **district** | **String**| 区县过滤条件（精确匹配） | [optional] |
| **gender** | **String**| 性别过滤条件（可选值示例：Male/Female/Other） | [optional] |
| **ageS** | **Integer**| 年龄起始范围（包含，0表示不限制） | [optional] |
| **ageE** | **Integer**| 年龄结束范围（包含，0表示不限制） | [optional] |
| **tag** | **String**| 兴趣标签过滤（支持模糊匹配，如：\&quot;运动\&quot;） | [optional] |
| **distance** | **Long**| 搜索半径（单位：米，0表示不限制距离） | [optional] [default to 0] |
| **skip** | **Integer**| 跳过的记录数（分页起始位置，默认0） | [optional] [default to 0] |
| **take** | **Integer**| 获取的记录数（分页大小，默认10，最大100） | [optional] [default to 10] |
| **userId** | **String**|  | [optional] [default to ] |

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
| **200** | 返回推荐用户列表数据 |  -  |


## userMutualFollowers

> UserMutualFollowersResultApiResponse userMutualFollowers(appKey, skip, take, userId)

推荐共同粉丝用户

推荐有共同粉丝的用户

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        String userId = ""; // String | 
        try {
            UserMutualFollowersResultApiResponse result = apiInstance.userMutualFollowers(appKey, skip, take, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userMutualFollowers");
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
| **userId** | **String**|  | [optional] [default to ] |

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

> ApiResponse<UserMutualFollowersResultApiResponse> userMutualFollowers userMutualFollowersWithHttpInfo(appKey, skip, take, userId)

推荐共同粉丝用户

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
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        String userId = ""; // String | 
        try {
            ApiResponse<UserMutualFollowersResultApiResponse> response = apiInstance.userMutualFollowersWithHttpInfo(appKey, skip, take, userId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userMutualFollowers");
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
| **userId** | **String**|  | [optional] [default to ] |

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

> UserMutualFollowingsResultApiResponse userMutualFollowings(appKey, skip, take, userId)

推荐共同关注用户

推荐有共同关注的用户

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        String userId = ""; // String | 
        try {
            UserMutualFollowingsResultApiResponse result = apiInstance.userMutualFollowings(appKey, skip, take, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userMutualFollowings");
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
| **userId** | **String**|  | [optional] [default to ] |

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

> ApiResponse<UserMutualFollowingsResultApiResponse> userMutualFollowings userMutualFollowingsWithHttpInfo(appKey, skip, take, userId)

推荐共同关注用户

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
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Integer skip = 0; // Integer | 跳过的记录数
        Integer take = 10; // Integer | 获取的记录数
        String userId = ""; // String | 
        try {
            ApiResponse<UserMutualFollowingsResultApiResponse> response = apiInstance.userMutualFollowingsWithHttpInfo(appKey, skip, take, userId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userMutualFollowings");
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
| **userId** | **String**|  | [optional] [default to ] |

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


## userProfileById

> GetUserProfileResultApiResponse userProfileById(userId, appKey)

获取用户资料

用于他人主页展示

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        Long userId = 56L; // Long | 用户ID
        String appKey = "appKey_example"; // String | 
        try {
            GetUserProfileResultApiResponse result = apiInstance.userProfileById(userId, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userProfileById");
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
| **userId** | **Long**| 用户ID | |
| **appKey** | **String**|  | |

### Return type

[**GetUserProfileResultApiResponse**](GetUserProfileResultApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userProfileByIdWithHttpInfo

> ApiResponse<GetUserProfileResultApiResponse> userProfileById userProfileByIdWithHttpInfo(userId, appKey)

获取用户资料

用于他人主页展示

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        Long userId = 56L; // Long | 用户ID
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<GetUserProfileResultApiResponse> response = apiInstance.userProfileByIdWithHttpInfo(userId, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userProfileById");
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
| **userId** | **Long**| 用户ID | |
| **appKey** | **String**|  | |

### Return type

ApiResponse<[**GetUserProfileResultApiResponse**](GetUserProfileResultApiResponse.md)>


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

> BooleanApiResponse userUnfollowUser(userId, appKey, fromUserId)

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
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        Long userId = 56L; // Long | 要取消关注的用户ID
        String appKey = "appKey_example"; // String | 
        String fromUserId = "fromUserId_example"; // String | 
        try {
            BooleanApiResponse result = apiInstance.userUnfollowUser(userId, appKey, fromUserId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userUnfollowUser");
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
| **fromUserId** | **String**|  | [optional] |

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

> ApiResponse<BooleanApiResponse> userUnfollowUser userUnfollowUserWithHttpInfo(userId, appKey, fromUserId)

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
import com.zashigaofa.client.api.UserFriendsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserFriendsApi apiInstance = new UserFriendsApi(defaultClient);
        Long userId = 56L; // Long | 要取消关注的用户ID
        String appKey = "appKey_example"; // String | 
        String fromUserId = "fromUserId_example"; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.userUnfollowUserWithHttpInfo(userId, appKey, fromUserId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserFriendsApi#userUnfollowUser");
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
| **fromUserId** | **String**|  | [optional] |

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

