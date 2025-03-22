# OrderApi

All URIs are relative to *https://api-staging.paomo.fun*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**order**](OrderApi.md#order) | **GET** /Order/{appKey}/{id} | 订单详情 |
| [**orderWithHttpInfo**](OrderApi.md#orderWithHttpInfo) | **GET** /Order/{appKey}/{id} | 订单详情 |
| [**orderCreate**](OrderApi.md#orderCreate) | **POST** /Order/{appKey}/Create | 创建订单 |
| [**orderCreateWithHttpInfo**](OrderApi.md#orderCreateWithHttpInfo) | **POST** /Order/{appKey}/Create | 创建订单 |
| [**orders**](OrderApi.md#orders) | **GET** /Order/{appKey} | 订单列表 |
| [**ordersWithHttpInfo**](OrderApi.md#ordersWithHttpInfo) | **GET** /Order/{appKey} | 订单列表 |



## order

> JObjectApiResult order(id, appKey)

订单详情

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.OrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OrderApi apiInstance = new OrderApi(defaultClient);
        Long id = 56L; // Long | 订单ID
        String appKey = "appKey_example"; // String | 
        try {
            JObjectApiResult result = apiInstance.order(id, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#order");
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
| **id** | **Long**| 订单ID | |
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

## orderWithHttpInfo

> ApiResponse<JObjectApiResult> order orderWithHttpInfo(id, appKey)

订单详情

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.OrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OrderApi apiInstance = new OrderApi(defaultClient);
        Long id = 56L; // Long | 订单ID
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.orderWithHttpInfo(id, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#order");
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
| **id** | **Long**| 订单ID | |
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


## orderCreate

> JObjectApiResult orderCreate(appKey, createOrderRequest)

创建订单

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.OrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OrderApi apiInstance = new OrderApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        CreateOrderRequest createOrderRequest = new CreateOrderRequest(); // CreateOrderRequest | 
        try {
            JObjectApiResult result = apiInstance.orderCreate(appKey, createOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#orderCreate");
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
| **createOrderRequest** | [**CreateOrderRequest**](CreateOrderRequest.md)|  | [optional] |

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

## orderCreateWithHttpInfo

> ApiResponse<JObjectApiResult> orderCreate orderCreateWithHttpInfo(appKey, createOrderRequest)

创建订单

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.OrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OrderApi apiInstance = new OrderApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        CreateOrderRequest createOrderRequest = new CreateOrderRequest(); // CreateOrderRequest | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.orderCreateWithHttpInfo(appKey, createOrderRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#orderCreate");
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
| **createOrderRequest** | [**CreateOrderRequest**](CreateOrderRequest.md)|  | [optional] |

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


## orders

> JObjectApiResult orders(appKey, status, orderNo, tradeNo, userId, pctType, pctId, pctName, skip, take)

订单列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.OrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OrderApi apiInstance = new OrderApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String status = "status_example"; // String | 订单状态
        String orderNo = "orderNo_example"; // String | 系统订单号
        String tradeNo = "tradeNo_example"; // String | 支付平台单号
        Long userId = 56L; // Long | 用户ID
        String pctType = "pctType_example"; // String | 商品类型
        String pctId = "pctId_example"; // String | 商品ID
        String pctName = "pctName_example"; // String | 商品名称
        Integer skip = 56; // Integer | 拉取的条数
        Integer take = 56; // Integer | 跳过的条数
        try {
            JObjectApiResult result = apiInstance.orders(appKey, status, orderNo, tradeNo, userId, pctType, pctId, pctName, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#orders");
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
| **status** | **String**| 订单状态 | [optional] |
| **orderNo** | **String**| 系统订单号 | [optional] |
| **tradeNo** | **String**| 支付平台单号 | [optional] |
| **userId** | **Long**| 用户ID | [optional] |
| **pctType** | **String**| 商品类型 | [optional] |
| **pctId** | **String**| 商品ID | [optional] |
| **pctName** | **String**| 商品名称 | [optional] |
| **skip** | **Integer**| 拉取的条数 | [optional] |
| **take** | **Integer**| 跳过的条数 | [optional] |

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

## ordersWithHttpInfo

> ApiResponse<JObjectApiResult> orders ordersWithHttpInfo(appKey, status, orderNo, tradeNo, userId, pctType, pctId, pctName, skip, take)

订单列表

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.OrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OrderApi apiInstance = new OrderApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String status = "status_example"; // String | 订单状态
        String orderNo = "orderNo_example"; // String | 系统订单号
        String tradeNo = "tradeNo_example"; // String | 支付平台单号
        Long userId = 56L; // Long | 用户ID
        String pctType = "pctType_example"; // String | 商品类型
        String pctId = "pctId_example"; // String | 商品ID
        String pctName = "pctName_example"; // String | 商品名称
        Integer skip = 56; // Integer | 拉取的条数
        Integer take = 56; // Integer | 跳过的条数
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.ordersWithHttpInfo(appKey, status, orderNo, tradeNo, userId, pctType, pctId, pctName, skip, take);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#orders");
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
| **status** | **String**| 订单状态 | [optional] |
| **orderNo** | **String**| 系统订单号 | [optional] |
| **tradeNo** | **String**| 支付平台单号 | [optional] |
| **userId** | **Long**| 用户ID | [optional] |
| **pctType** | **String**| 商品类型 | [optional] |
| **pctId** | **String**| 商品ID | [optional] |
| **pctName** | **String**| 商品名称 | [optional] |
| **skip** | **Integer**| 拉取的条数 | [optional] |
| **take** | **Integer**| 跳过的条数 | [optional] |

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

