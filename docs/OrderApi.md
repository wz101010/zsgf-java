# OrderApi

All URIs are relative to *https://api-dev.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**order**](OrderApi.md#order) | **GET** /Order/{appKey}/{id} | 获取订单详情 |
| [**orderWithHttpInfo**](OrderApi.md#orderWithHttpInfo) | **GET** /Order/{appKey}/{id} | 获取订单详情 |
| [**orderCreate**](OrderApi.md#orderCreate) | **POST** /Order/{appKey}/Create | 创建订单 |
| [**orderCreateWithHttpInfo**](OrderApi.md#orderCreateWithHttpInfo) | **POST** /Order/{appKey}/Create | 创建订单 |
| [**orders**](OrderApi.md#orders) | **GET** /Order/{appKey} | 获取订单列表 |
| [**ordersWithHttpInfo**](OrderApi.md#ordersWithHttpInfo) | **GET** /Order/{appKey} | 获取订单列表 |



## order

> OrderApiResponse order(id, appKey)

获取订单详情

根据订单ID获取订单详情

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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OrderApi apiInstance = new OrderApi(defaultClient);
        Long id = 56L; // Long | 订单ID
        String appKey = "appKey_example"; // String | 
        try {
            OrderApiResponse result = apiInstance.order(id, appKey);
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

[**OrderApiResponse**](OrderApiResponse.md)


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

> ApiResponse<OrderApiResponse> order orderWithHttpInfo(id, appKey)

获取订单详情

根据订单ID获取订单详情

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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OrderApi apiInstance = new OrderApi(defaultClient);
        Long id = 56L; // Long | 订单ID
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<OrderApiResponse> response = apiInstance.orderWithHttpInfo(id, appKey);
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

ApiResponse<[**OrderApiResponse**](OrderApiResponse.md)>


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

> CreateOrderResultApiResponse orderCreate(appKey, createOrderRequest)

创建订单

根据请求参数创建订单

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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OrderApi apiInstance = new OrderApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        CreateOrderRequest createOrderRequest = new CreateOrderRequest(); // CreateOrderRequest | 订单创建请求
        try {
            CreateOrderResultApiResponse result = apiInstance.orderCreate(appKey, createOrderRequest);
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
| **createOrderRequest** | [**CreateOrderRequest**](CreateOrderRequest.md)| 订单创建请求 | [optional] |

### Return type

[**CreateOrderResultApiResponse**](CreateOrderResultApiResponse.md)


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

> ApiResponse<CreateOrderResultApiResponse> orderCreate orderCreateWithHttpInfo(appKey, createOrderRequest)

创建订单

根据请求参数创建订单

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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        OrderApi apiInstance = new OrderApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        CreateOrderRequest createOrderRequest = new CreateOrderRequest(); // CreateOrderRequest | 订单创建请求
        try {
            ApiResponse<CreateOrderResultApiResponse> response = apiInstance.orderCreateWithHttpInfo(appKey, createOrderRequest);
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
| **createOrderRequest** | [**CreateOrderRequest**](CreateOrderRequest.md)| 订单创建请求 | [optional] |

### Return type

ApiResponse<[**CreateOrderResultApiResponse**](CreateOrderResultApiResponse.md)>


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

> OrderListResultApiResponse orders(appKey, status, orderNo, tradeNo, userId, pctType, pctId, pctName, skip, take)

获取订单列表

根据查询条件获取订单列表

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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
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
        Integer skip = 56; // Integer | 跳过的条数
        Integer take = 56; // Integer | 拉取的条数
        try {
            OrderListResultApiResponse result = apiInstance.orders(appKey, status, orderNo, tradeNo, userId, pctType, pctId, pctName, skip, take);
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
| **skip** | **Integer**| 跳过的条数 | [optional] |
| **take** | **Integer**| 拉取的条数 | [optional] |

### Return type

[**OrderListResultApiResponse**](OrderListResultApiResponse.md)


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

> ApiResponse<OrderListResultApiResponse> orders ordersWithHttpInfo(appKey, status, orderNo, tradeNo, userId, pctType, pctId, pctName, skip, take)

获取订单列表

根据查询条件获取订单列表

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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
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
        Integer skip = 56; // Integer | 跳过的条数
        Integer take = 56; // Integer | 拉取的条数
        try {
            ApiResponse<OrderListResultApiResponse> response = apiInstance.ordersWithHttpInfo(appKey, status, orderNo, tradeNo, userId, pctType, pctId, pctName, skip, take);
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
| **skip** | **Integer**| 跳过的条数 | [optional] |
| **take** | **Integer**| 拉取的条数 | [optional] |

### Return type

ApiResponse<[**OrderListResultApiResponse**](OrderListResultApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

