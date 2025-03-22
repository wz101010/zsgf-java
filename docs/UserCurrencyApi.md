# UserCurrencyApi

All URIs are relative to *https://api-staging.paomo.fun*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userCurrencies**](UserCurrencyApi.md#userCurrencies) | **GET** /UserCurrency/{appKey}/{id} | 资产 |
| [**userCurrenciesWithHttpInfo**](UserCurrencyApi.md#userCurrenciesWithHttpInfo) | **GET** /UserCurrency/{appKey}/{id} | 资产 |
| [**userCurrencyConsume**](UserCurrencyApi.md#userCurrencyConsume) | **POST** /UserCurrency/{appKey}/CurrencyConsume | 消费虚拟币 |
| [**userCurrencyConsumeWithHttpInfo**](UserCurrencyApi.md#userCurrencyConsumeWithHttpInfo) | **POST** /UserCurrency/{appKey}/CurrencyConsume | 消费虚拟币 |
| [**userCurrencyExchange**](UserCurrencyApi.md#userCurrencyExchange) | **POST** /UserCurrency/{appKey}/CurrencyExchange | 兑换虚拟币 |
| [**userCurrencyExchangeWithHttpInfo**](UserCurrencyApi.md#userCurrencyExchangeWithHttpInfo) | **POST** /UserCurrency/{appKey}/CurrencyExchange | 兑换虚拟币 |
| [**userCurrencyRecharge**](UserCurrencyApi.md#userCurrencyRecharge) | **POST** /UserCurrency/{appKey}/CurrencyRecharge | 充值虚拟币 |
| [**userCurrencyRechargeWithHttpInfo**](UserCurrencyApi.md#userCurrencyRechargeWithHttpInfo) | **POST** /UserCurrency/{appKey}/CurrencyRecharge | 充值虚拟币 |
| [**userCurrencyTransactions**](UserCurrencyApi.md#userCurrencyTransactions) | **GET** /UserCurrency/{appKey}/CurrencyTransactions | 虚拟币交易记录 |
| [**userCurrencyTransactionsWithHttpInfo**](UserCurrencyApi.md#userCurrencyTransactionsWithHttpInfo) | **GET** /UserCurrency/{appKey}/CurrencyTransactions | 虚拟币交易记录 |



## userCurrencies

> JObjectApiResult userCurrencies(id, appKey)

资产

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserCurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserCurrencyApi apiInstance = new UserCurrencyApi(defaultClient);
        Long id = 56L; // Long | 
        String appKey = "appKey_example"; // String | 
        try {
            JObjectApiResult result = apiInstance.userCurrencies(id, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCurrencyApi#userCurrencies");
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

## userCurrenciesWithHttpInfo

> ApiResponse<JObjectApiResult> userCurrencies userCurrenciesWithHttpInfo(id, appKey)

资产

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserCurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserCurrencyApi apiInstance = new UserCurrencyApi(defaultClient);
        Long id = 56L; // Long | 
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.userCurrenciesWithHttpInfo(id, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCurrencyApi#userCurrencies");
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


## userCurrencyConsume

> JObjectApiResult userCurrencyConsume(nonce, timestamp, signature, appKey, currencyConsumeRequest)

消费虚拟币

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserCurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserCurrencyApi apiInstance = new UserCurrencyApi(defaultClient);
        String nonce = "nonce_example"; // String | 随机数
        Long timestamp = 56L; // Long | 时间戳（允许与服务器时间误差在1分钟内）
        String signature = "signature_example"; // String | 签名
        String appKey = "appKey_example"; // String | 
        CurrencyConsumeRequest currencyConsumeRequest = new CurrencyConsumeRequest(); // CurrencyConsumeRequest | 
        try {
            JObjectApiResult result = apiInstance.userCurrencyConsume(nonce, timestamp, signature, appKey, currencyConsumeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCurrencyApi#userCurrencyConsume");
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
| **nonce** | **String**| 随机数 | |
| **timestamp** | **Long**| 时间戳（允许与服务器时间误差在1分钟内） | |
| **signature** | **String**| 签名 | |
| **appKey** | **String**|  | |
| **currencyConsumeRequest** | [**CurrencyConsumeRequest**](CurrencyConsumeRequest.md)|  | [optional] |

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

## userCurrencyConsumeWithHttpInfo

> ApiResponse<JObjectApiResult> userCurrencyConsume userCurrencyConsumeWithHttpInfo(nonce, timestamp, signature, appKey, currencyConsumeRequest)

消费虚拟币

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserCurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserCurrencyApi apiInstance = new UserCurrencyApi(defaultClient);
        String nonce = "nonce_example"; // String | 随机数
        Long timestamp = 56L; // Long | 时间戳（允许与服务器时间误差在1分钟内）
        String signature = "signature_example"; // String | 签名
        String appKey = "appKey_example"; // String | 
        CurrencyConsumeRequest currencyConsumeRequest = new CurrencyConsumeRequest(); // CurrencyConsumeRequest | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.userCurrencyConsumeWithHttpInfo(nonce, timestamp, signature, appKey, currencyConsumeRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCurrencyApi#userCurrencyConsume");
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
| **nonce** | **String**| 随机数 | |
| **timestamp** | **Long**| 时间戳（允许与服务器时间误差在1分钟内） | |
| **signature** | **String**| 签名 | |
| **appKey** | **String**|  | |
| **currencyConsumeRequest** | [**CurrencyConsumeRequest**](CurrencyConsumeRequest.md)|  | [optional] |

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


## userCurrencyExchange

> JObjectApiResult userCurrencyExchange(nonce, timestamp, signature, appKey, exchangeCurrencyRequest)

兑换虚拟币

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserCurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserCurrencyApi apiInstance = new UserCurrencyApi(defaultClient);
        String nonce = "nonce_example"; // String | 随机数
        Long timestamp = 56L; // Long | 时间戳（允许与服务器时间误差在1分钟内）
        String signature = "signature_example"; // String | 签名
        String appKey = "appKey_example"; // String | 
        ExchangeCurrencyRequest exchangeCurrencyRequest = new ExchangeCurrencyRequest(); // ExchangeCurrencyRequest | 
        try {
            JObjectApiResult result = apiInstance.userCurrencyExchange(nonce, timestamp, signature, appKey, exchangeCurrencyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCurrencyApi#userCurrencyExchange");
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
| **nonce** | **String**| 随机数 | |
| **timestamp** | **Long**| 时间戳（允许与服务器时间误差在1分钟内） | |
| **signature** | **String**| 签名 | |
| **appKey** | **String**|  | |
| **exchangeCurrencyRequest** | [**ExchangeCurrencyRequest**](ExchangeCurrencyRequest.md)|  | [optional] |

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

## userCurrencyExchangeWithHttpInfo

> ApiResponse<JObjectApiResult> userCurrencyExchange userCurrencyExchangeWithHttpInfo(nonce, timestamp, signature, appKey, exchangeCurrencyRequest)

兑换虚拟币

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserCurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserCurrencyApi apiInstance = new UserCurrencyApi(defaultClient);
        String nonce = "nonce_example"; // String | 随机数
        Long timestamp = 56L; // Long | 时间戳（允许与服务器时间误差在1分钟内）
        String signature = "signature_example"; // String | 签名
        String appKey = "appKey_example"; // String | 
        ExchangeCurrencyRequest exchangeCurrencyRequest = new ExchangeCurrencyRequest(); // ExchangeCurrencyRequest | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.userCurrencyExchangeWithHttpInfo(nonce, timestamp, signature, appKey, exchangeCurrencyRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCurrencyApi#userCurrencyExchange");
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
| **nonce** | **String**| 随机数 | |
| **timestamp** | **Long**| 时间戳（允许与服务器时间误差在1分钟内） | |
| **signature** | **String**| 签名 | |
| **appKey** | **String**|  | |
| **exchangeCurrencyRequest** | [**ExchangeCurrencyRequest**](ExchangeCurrencyRequest.md)|  | [optional] |

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


## userCurrencyRecharge

> JObjectApiResult userCurrencyRecharge(nonce, timestamp, signature, appKey, rechargePointRequest)

充值虚拟币

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserCurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserCurrencyApi apiInstance = new UserCurrencyApi(defaultClient);
        String nonce = "nonce_example"; // String | 随机数
        Long timestamp = 56L; // Long | 时间戳（允许与服务器时间误差在1分钟内）
        String signature = "signature_example"; // String | 签名
        String appKey = "appKey_example"; // String | 
        RechargePointRequest rechargePointRequest = new RechargePointRequest(); // RechargePointRequest | 
        try {
            JObjectApiResult result = apiInstance.userCurrencyRecharge(nonce, timestamp, signature, appKey, rechargePointRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCurrencyApi#userCurrencyRecharge");
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
| **nonce** | **String**| 随机数 | |
| **timestamp** | **Long**| 时间戳（允许与服务器时间误差在1分钟内） | |
| **signature** | **String**| 签名 | |
| **appKey** | **String**|  | |
| **rechargePointRequest** | [**RechargePointRequest**](RechargePointRequest.md)|  | [optional] |

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

## userCurrencyRechargeWithHttpInfo

> ApiResponse<JObjectApiResult> userCurrencyRecharge userCurrencyRechargeWithHttpInfo(nonce, timestamp, signature, appKey, rechargePointRequest)

充值虚拟币

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserCurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserCurrencyApi apiInstance = new UserCurrencyApi(defaultClient);
        String nonce = "nonce_example"; // String | 随机数
        Long timestamp = 56L; // Long | 时间戳（允许与服务器时间误差在1分钟内）
        String signature = "signature_example"; // String | 签名
        String appKey = "appKey_example"; // String | 
        RechargePointRequest rechargePointRequest = new RechargePointRequest(); // RechargePointRequest | 
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.userCurrencyRechargeWithHttpInfo(nonce, timestamp, signature, appKey, rechargePointRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCurrencyApi#userCurrencyRecharge");
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
| **nonce** | **String**| 随机数 | |
| **timestamp** | **Long**| 时间戳（允许与服务器时间误差在1分钟内） | |
| **signature** | **String**| 签名 | |
| **appKey** | **String**|  | |
| **rechargePointRequest** | [**RechargePointRequest**](RechargePointRequest.md)|  | [optional] |

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


## userCurrencyTransactions

> JObjectApiResult userCurrencyTransactions(appKey, transType, curCode, startTime, endTime, skip, take)

虚拟币交易记录

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserCurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserCurrencyApi apiInstance = new UserCurrencyApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String transType = "transType_example"; // String | 交易类型
        String curCode = "curCode_example"; // String | 货币代码
        OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | 开始时间
        OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | 结束时间
        Integer skip = 56; // Integer | 跳过的条数
        Integer take = 56; // Integer | 拉取的条数
        try {
            JObjectApiResult result = apiInstance.userCurrencyTransactions(appKey, transType, curCode, startTime, endTime, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCurrencyApi#userCurrencyTransactions");
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
| **transType** | **String**| 交易类型 | [optional] |
| **curCode** | **String**| 货币代码 | [optional] |
| **startTime** | **OffsetDateTime**| 开始时间 | [optional] |
| **endTime** | **OffsetDateTime**| 结束时间 | [optional] |
| **skip** | **Integer**| 跳过的条数 | [optional] |
| **take** | **Integer**| 拉取的条数 | [optional] |

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

## userCurrencyTransactionsWithHttpInfo

> ApiResponse<JObjectApiResult> userCurrencyTransactions userCurrencyTransactionsWithHttpInfo(appKey, transType, curCode, startTime, endTime, skip, take)

虚拟币交易记录

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.UserCurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-staging.paomo.fun");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        UserCurrencyApi apiInstance = new UserCurrencyApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        String transType = "transType_example"; // String | 交易类型
        String curCode = "curCode_example"; // String | 货币代码
        OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | 开始时间
        OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | 结束时间
        Integer skip = 56; // Integer | 跳过的条数
        Integer take = 56; // Integer | 拉取的条数
        try {
            ApiResponse<JObjectApiResult> response = apiInstance.userCurrencyTransactionsWithHttpInfo(appKey, transType, curCode, startTime, endTime, skip, take);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCurrencyApi#userCurrencyTransactions");
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
| **transType** | **String**| 交易类型 | [optional] |
| **curCode** | **String**| 货币代码 | [optional] |
| **startTime** | **OffsetDateTime**| 开始时间 | [optional] |
| **endTime** | **OffsetDateTime**| 结束时间 | [optional] |
| **skip** | **Integer**| 跳过的条数 | [optional] |
| **take** | **Integer**| 拉取的条数 | [optional] |

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

