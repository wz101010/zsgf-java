# AlipayApi

All URIs are relative to *https://api-dev.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**alipayCreateOrder**](AlipayApi.md#alipayCreateOrder) | **POST** /Alipay/{appKey}/CreateOrder | 创建当面付订单 |
| [**alipayCreateOrderWithHttpInfo**](AlipayApi.md#alipayCreateOrderWithHttpInfo) | **POST** /Alipay/{appKey}/CreateOrder | 创建当面付订单 |
| [**alipayCreateOrderPagePay**](AlipayApi.md#alipayCreateOrderPagePay) | **POST** /Alipay/{appKey}/CreateOrderPagePay | 创建PC支付订单 |
| [**alipayCreateOrderPagePayWithHttpInfo**](AlipayApi.md#alipayCreateOrderPagePayWithHttpInfo) | **POST** /Alipay/{appKey}/CreateOrderPagePay | 创建PC支付订单 |
| [**alipayCreateOrderWapPay**](AlipayApi.md#alipayCreateOrderWapPay) | **POST** /Alipay/{appKey}/CreateOrderWapPay | 创建WAP支付订单 |
| [**alipayCreateOrderWapPayWithHttpInfo**](AlipayApi.md#alipayCreateOrderWapPayWithHttpInfo) | **POST** /Alipay/{appKey}/CreateOrderWapPay | 创建WAP支付订单 |
| [**alipayOrderDetail**](AlipayApi.md#alipayOrderDetail) | **GET** /Alipay/{appKey}/OrderDetail | 获取订单详情 |
| [**alipayOrderDetailWithHttpInfo**](AlipayApi.md#alipayOrderDetailWithHttpInfo) | **GET** /Alipay/{appKey}/OrderDetail | 获取订单详情 |
| [**alipayOrderRefund**](AlipayApi.md#alipayOrderRefund) | **POST** /Alipay/{appKey}/OrderRefund | 发起订单退款 |
| [**alipayOrderRefundWithHttpInfo**](AlipayApi.md#alipayOrderRefundWithHttpInfo) | **POST** /Alipay/{appKey}/OrderRefund | 发起订单退款 |
| [**alipayReturnPageNotify**](AlipayApi.md#alipayReturnPageNotify) | **POST** /Alipay/{appKey}/ReturnPageNotify | 支付成功回调通知 |
| [**alipayReturnPageNotifyWithHttpInfo**](AlipayApi.md#alipayReturnPageNotifyWithHttpInfo) | **POST** /Alipay/{appKey}/ReturnPageNotify | 支付成功回调通知 |



## alipayCreateOrder

> StringApiResponse alipayCreateOrder(appKey, alipayCreateOrderRequest)

创建当面付订单

创建一个当面付订单，并返回支付二维码。

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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AlipayCreateOrderRequest alipayCreateOrderRequest = new AlipayCreateOrderRequest(); // AlipayCreateOrderRequest | 
        try {
            StringApiResponse result = apiInstance.alipayCreateOrder(appKey, alipayCreateOrderRequest);
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

## alipayCreateOrderWithHttpInfo

> ApiResponse<StringApiResponse> alipayCreateOrder alipayCreateOrderWithHttpInfo(appKey, alipayCreateOrderRequest)

创建当面付订单

创建一个当面付订单，并返回支付二维码。

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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AlipayCreateOrderRequest alipayCreateOrderRequest = new AlipayCreateOrderRequest(); // AlipayCreateOrderRequest | 
        try {
            ApiResponse<StringApiResponse> response = apiInstance.alipayCreateOrderWithHttpInfo(appKey, alipayCreateOrderRequest);
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


## alipayCreateOrderPagePay

> StringApiResponse alipayCreateOrderPagePay(appKey, alipayCreateOrderPagePayRequest)

创建PC支付订单

创建一个PC支付订单，并返回支付页面。

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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AlipayCreateOrderPagePayRequest alipayCreateOrderPagePayRequest = new AlipayCreateOrderPagePayRequest(); // AlipayCreateOrderPagePayRequest | 
        try {
            StringApiResponse result = apiInstance.alipayCreateOrderPagePay(appKey, alipayCreateOrderPagePayRequest);
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

## alipayCreateOrderPagePayWithHttpInfo

> ApiResponse<StringApiResponse> alipayCreateOrderPagePay alipayCreateOrderPagePayWithHttpInfo(appKey, alipayCreateOrderPagePayRequest)

创建PC支付订单

创建一个PC支付订单，并返回支付页面。

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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AlipayCreateOrderPagePayRequest alipayCreateOrderPagePayRequest = new AlipayCreateOrderPagePayRequest(); // AlipayCreateOrderPagePayRequest | 
        try {
            ApiResponse<StringApiResponse> response = apiInstance.alipayCreateOrderPagePayWithHttpInfo(appKey, alipayCreateOrderPagePayRequest);
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


## alipayCreateOrderWapPay

> StringApiResponse alipayCreateOrderWapPay(appKey, alipayCreateOrderWapPayRequest)

创建WAP支付订单

创建一个WAP支付订单，并返回支付页面。

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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AlipayCreateOrderWapPayRequest alipayCreateOrderWapPayRequest = new AlipayCreateOrderWapPayRequest(); // AlipayCreateOrderWapPayRequest | 
        try {
            StringApiResponse result = apiInstance.alipayCreateOrderWapPay(appKey, alipayCreateOrderWapPayRequest);
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

## alipayCreateOrderWapPayWithHttpInfo

> ApiResponse<StringApiResponse> alipayCreateOrderWapPay alipayCreateOrderWapPayWithHttpInfo(appKey, alipayCreateOrderWapPayRequest)

创建WAP支付订单

创建一个WAP支付订单，并返回支付页面。

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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        AlipayCreateOrderWapPayRequest alipayCreateOrderWapPayRequest = new AlipayCreateOrderWapPayRequest(); // AlipayCreateOrderWapPayRequest | 
        try {
            ApiResponse<StringApiResponse> response = apiInstance.alipayCreateOrderWapPayWithHttpInfo(appKey, alipayCreateOrderWapPayRequest);
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


## alipayOrderDetail

> AlipayTradeQueryResponseApiResponse alipayOrderDetail(appKey, orderNo)

获取订单详情

查询订单详情，包括订单状态和支付信息。

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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String orderNo = "orderNo_example"; // String | 订单号
        try {
            AlipayTradeQueryResponseApiResponse result = apiInstance.alipayOrderDetail(appKey, orderNo);
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

[**AlipayTradeQueryResponseApiResponse**](AlipayTradeQueryResponseApiResponse.md)


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

> ApiResponse<AlipayTradeQueryResponseApiResponse> alipayOrderDetail alipayOrderDetailWithHttpInfo(appKey, orderNo)

获取订单详情

查询订单详情，包括订单状态和支付信息。

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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String orderNo = "orderNo_example"; // String | 订单号
        try {
            ApiResponse<AlipayTradeQueryResponseApiResponse> response = apiInstance.alipayOrderDetailWithHttpInfo(appKey, orderNo);
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

ApiResponse<[**AlipayTradeQueryResponseApiResponse**](AlipayTradeQueryResponseApiResponse.md)>


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

> AlipayTradeRefundResponseApiResponse alipayOrderRefund(appKey, amount, orderNo)

发起订单退款

对指定订单进行退款操作。

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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String amount = "amount_example"; // String | 退款金额
        String orderNo = "orderNo_example"; // String | 订单号
        try {
            AlipayTradeRefundResponseApiResponse result = apiInstance.alipayOrderRefund(appKey, amount, orderNo);
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

[**AlipayTradeRefundResponseApiResponse**](AlipayTradeRefundResponseApiResponse.md)


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

> ApiResponse<AlipayTradeRefundResponseApiResponse> alipayOrderRefund alipayOrderRefundWithHttpInfo(appKey, amount, orderNo)

发起订单退款

对指定订单进行退款操作。

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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String amount = "amount_example"; // String | 退款金额
        String orderNo = "orderNo_example"; // String | 订单号
        try {
            ApiResponse<AlipayTradeRefundResponseApiResponse> response = apiInstance.alipayOrderRefundWithHttpInfo(appKey, amount, orderNo);
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

ApiResponse<[**AlipayTradeRefundResponseApiResponse**](AlipayTradeRefundResponseApiResponse.md)>


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

> BooleanApiResponse alipayReturnPageNotify(appKey, returnPageNotifyRequest)

支付成功回调通知

处理支付宝支付成功的同步通知。

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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        ReturnPageNotifyRequest returnPageNotifyRequest = new ReturnPageNotifyRequest(); // ReturnPageNotifyRequest | 
        try {
            BooleanApiResponse result = apiInstance.alipayReturnPageNotify(appKey, returnPageNotifyRequest);
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

## alipayReturnPageNotifyWithHttpInfo

> ApiResponse<BooleanApiResponse> alipayReturnPageNotify alipayReturnPageNotifyWithHttpInfo(appKey, returnPageNotifyRequest)

支付成功回调通知

处理支付宝支付成功的同步通知。

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
        defaultClient.setBasePath("https://api-dev.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AlipayApi apiInstance = new AlipayApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        ReturnPageNotifyRequest returnPageNotifyRequest = new ReturnPageNotifyRequest(); // ReturnPageNotifyRequest | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.alipayReturnPageNotifyWithHttpInfo(appKey, returnPageNotifyRequest);
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

