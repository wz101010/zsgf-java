# AlipayApi

All URIs are relative to *https://api-staging.paomo.fun*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**alipayCreateOrder**](AlipayApi.md#alipayCreateOrder) | **POST** /Alipay/{appKey}/CreateOrder | 创建订单 - 当面付 |
| [**alipayCreateOrderWithHttpInfo**](AlipayApi.md#alipayCreateOrderWithHttpInfo) | **POST** /Alipay/{appKey}/CreateOrder | 创建订单 - 当面付 |
| [**alipayCreateOrderPagePay**](AlipayApi.md#alipayCreateOrderPagePay) | **POST** /Alipay/{appKey}/CreateOrderPagePay | 创建订单 - PC支付 |
| [**alipayCreateOrderPagePayWithHttpInfo**](AlipayApi.md#alipayCreateOrderPagePayWithHttpInfo) | **POST** /Alipay/{appKey}/CreateOrderPagePay | 创建订单 - PC支付 |
| [**alipayCreateOrderWapPay**](AlipayApi.md#alipayCreateOrderWapPay) | **POST** /Alipay/{appKey}/CreateOrderWapPay | 创建订单 - WAP支付 |
| [**alipayCreateOrderWapPayWithHttpInfo**](AlipayApi.md#alipayCreateOrderWapPayWithHttpInfo) | **POST** /Alipay/{appKey}/CreateOrderWapPay | 创建订单 - WAP支付 |
| [**alipayOrderDetail**](AlipayApi.md#alipayOrderDetail) | **GET** /Alipay/{appKey}/OrderDetail | 订单详情 |
| [**alipayOrderDetailWithHttpInfo**](AlipayApi.md#alipayOrderDetailWithHttpInfo) | **GET** /Alipay/{appKey}/OrderDetail | 订单详情 |
| [**alipayOrderRefund**](AlipayApi.md#alipayOrderRefund) | **POST** /Alipay/{appKey}/OrderRefund | 订单退款 |
| [**alipayOrderRefundWithHttpInfo**](AlipayApi.md#alipayOrderRefundWithHttpInfo) | **POST** /Alipay/{appKey}/OrderRefund | 订单退款 |
| [**alipayReturnPageNotify**](AlipayApi.md#alipayReturnPageNotify) | **POST** /Alipay/{appKey}/ReturnPageNotify | 支付成功同步通知 |
| [**alipayReturnPageNotifyWithHttpInfo**](AlipayApi.md#alipayReturnPageNotifyWithHttpInfo) | **POST** /Alipay/{appKey}/ReturnPageNotify | 支付成功同步通知 |



## alipayCreateOrder

> JObjectApiResult alipayCreateOrder(appKey, alipayCreateOrderRequest)

创建订单 - 当面付

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AlipayApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AlipayCreateOrderRequest alipayCreateOrderRequest = new AlipayCreateOrderRequest(); // AlipayCreateOrderRequest | 
        try {
            JObjectApiResult result = apiInstance.alipayCreateOrder(appKey, alipayCreateOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlipayApi#alipayCreateOrder");
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
| **alipayCreateOrderRequest** | [**AlipayCreateOrderRequest**](AlipayCreateOrderRequest.md)|  | [optional] |

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

## alipayCreateOrderWithHttpInfo

> ApiResponse<JObjectApiResult> alipayCreateOrder alipayCreateOrderWithHttpInfo(appKey, alipayCreateOrderRequest)

创建订单 - 当面付

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AlipayApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AlipayCreateOrderRequest alipayCreateOrderRequest = new AlipayCreateOrderRequest(); // AlipayCreateOrderRequest | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.alipayCreateOrderWithHttpInfo(appKey, alipayCreateOrderRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlipayApi#alipayCreateOrder");
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
| **alipayCreateOrderRequest** | [**AlipayCreateOrderRequest**](AlipayCreateOrderRequest.md)|  | [optional] |

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


## alipayCreateOrderPagePay

> JObjectApiResult alipayCreateOrderPagePay(appKey, alipayCreateOrderPagePayRequest)

创建订单 - PC支付

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AlipayApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AlipayCreateOrderPagePayRequest alipayCreateOrderPagePayRequest = new AlipayCreateOrderPagePayRequest(); // AlipayCreateOrderPagePayRequest | 
        try {
            JObjectApiResult result = apiInstance.alipayCreateOrderPagePay(appKey, alipayCreateOrderPagePayRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlipayApi#alipayCreateOrderPagePay");
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
| **alipayCreateOrderPagePayRequest** | [**AlipayCreateOrderPagePayRequest**](AlipayCreateOrderPagePayRequest.md)|  | [optional] |

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

## alipayCreateOrderPagePayWithHttpInfo

> ApiResponse<JObjectApiResult> alipayCreateOrderPagePay alipayCreateOrderPagePayWithHttpInfo(appKey, alipayCreateOrderPagePayRequest)

创建订单 - PC支付

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AlipayApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AlipayCreateOrderPagePayRequest alipayCreateOrderPagePayRequest = new AlipayCreateOrderPagePayRequest(); // AlipayCreateOrderPagePayRequest | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.alipayCreateOrderPagePayWithHttpInfo(appKey, alipayCreateOrderPagePayRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlipayApi#alipayCreateOrderPagePay");
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
| **alipayCreateOrderPagePayRequest** | [**AlipayCreateOrderPagePayRequest**](AlipayCreateOrderPagePayRequest.md)|  | [optional] |

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


## alipayCreateOrderWapPay

> JObjectApiResult alipayCreateOrderWapPay(appKey, alipayCreateOrderWapPayRequest)

创建订单 - WAP支付

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AlipayApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AlipayCreateOrderWapPayRequest alipayCreateOrderWapPayRequest = new AlipayCreateOrderWapPayRequest(); // AlipayCreateOrderWapPayRequest | 
        try {
            JObjectApiResult result = apiInstance.alipayCreateOrderWapPay(appKey, alipayCreateOrderWapPayRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlipayApi#alipayCreateOrderWapPay");
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
| **alipayCreateOrderWapPayRequest** | [**AlipayCreateOrderWapPayRequest**](AlipayCreateOrderWapPayRequest.md)|  | [optional] |

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

## alipayCreateOrderWapPayWithHttpInfo

> ApiResponse<JObjectApiResult> alipayCreateOrderWapPay alipayCreateOrderWapPayWithHttpInfo(appKey, alipayCreateOrderWapPayRequest)

创建订单 - WAP支付

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AlipayApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AlipayCreateOrderWapPayRequest alipayCreateOrderWapPayRequest = new AlipayCreateOrderWapPayRequest(); // AlipayCreateOrderWapPayRequest | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.alipayCreateOrderWapPayWithHttpInfo(appKey, alipayCreateOrderWapPayRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlipayApi#alipayCreateOrderWapPay");
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
| **alipayCreateOrderWapPayRequest** | [**AlipayCreateOrderWapPayRequest**](AlipayCreateOrderWapPayRequest.md)|  | [optional] |

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


## alipayOrderDetail

> JObjectApiResult alipayOrderDetail(appKey, orderNo)

订单详情

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AlipayApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String orderNo = "orderNo_example"; // String | 订单号
        try {
            JObjectApiResult result = apiInstance.alipayOrderDetail(appKey, orderNo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlipayApi#alipayOrderDetail");
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
| **orderNo** | **String**| 订单号 | [optional] |

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

## alipayOrderDetailWithHttpInfo

> ApiResponse<JObjectApiResult> alipayOrderDetail alipayOrderDetailWithHttpInfo(appKey, orderNo)

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
import com.zashigaofa.client.api.AlipayApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String orderNo = "orderNo_example"; // String | 订单号
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.alipayOrderDetailWithHttpInfo(appKey, orderNo);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlipayApi#alipayOrderDetail");
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
| **orderNo** | **String**| 订单号 | [optional] |

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


## alipayOrderRefund

> JObjectApiResult alipayOrderRefund(appKey, amount, orderNo)

订单退款

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AlipayApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String amount = "amount_example"; // String | 退款金额
        String orderNo = "orderNo_example"; // String | 订单号
        try {
            JObjectApiResult result = apiInstance.alipayOrderRefund(appKey, amount, orderNo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlipayApi#alipayOrderRefund");
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
| **amount** | **String**| 退款金额 | [optional] |
| **orderNo** | **String**| 订单号 | [optional] |

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

## alipayOrderRefundWithHttpInfo

> ApiResponse<JObjectApiResult> alipayOrderRefund alipayOrderRefundWithHttpInfo(appKey, amount, orderNo)

订单退款

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AlipayApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String amount = "amount_example"; // String | 退款金额
        String orderNo = "orderNo_example"; // String | 订单号
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.alipayOrderRefundWithHttpInfo(appKey, amount, orderNo);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlipayApi#alipayOrderRefund");
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
| **amount** | **String**| 退款金额 | [optional] |
| **orderNo** | **String**| 订单号 | [optional] |

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


## alipayReturnPageNotify

> JObjectApiResult alipayReturnPageNotify(appKey, returnPageNotifyRequest)

支付成功同步通知

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AlipayApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        ReturnPageNotifyRequest returnPageNotifyRequest = new ReturnPageNotifyRequest(); // ReturnPageNotifyRequest | 
        try {
            JObjectApiResult result = apiInstance.alipayReturnPageNotify(appKey, returnPageNotifyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlipayApi#alipayReturnPageNotify");
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
| **returnPageNotifyRequest** | [**ReturnPageNotifyRequest**](ReturnPageNotifyRequest.md)|  | [optional] |

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

## alipayReturnPageNotifyWithHttpInfo

> ApiResponse<JObjectApiResult> alipayReturnPageNotify alipayReturnPageNotifyWithHttpInfo(appKey, returnPageNotifyRequest)

支付成功同步通知

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.AlipayApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        ReturnPageNotifyRequest returnPageNotifyRequest = new ReturnPageNotifyRequest(); // ReturnPageNotifyRequest | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.alipayReturnPageNotifyWithHttpInfo(appKey, returnPageNotifyRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlipayApi#alipayReturnPageNotify");
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
| **returnPageNotifyRequest** | [**ReturnPageNotifyRequest**](ReturnPageNotifyRequest.md)|  | [optional] |

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

