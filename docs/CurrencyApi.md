# CurrencyApi

All URIs are relative to *https://api.zashigaofa.cn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**currencies**](CurrencyApi.md#currencies) | **GET** /Currency/{appKey} | 获取货币列表 |
| [**currenciesWithHttpInfo**](CurrencyApi.md#currenciesWithHttpInfo) | **GET** /Currency/{appKey} | 获取货币列表 |
| [**currency**](CurrencyApi.md#currency) | **GET** /Currency/{appKey}/{id} | 获取货币详情 |
| [**currencyWithHttpInfo**](CurrencyApi.md#currencyWithHttpInfo) | **GET** /Currency/{appKey}/{id} | 获取货币详情 |
| [**currencyDelete**](CurrencyApi.md#currencyDelete) | **DELETE** /Currency/{appKey}/{id} | 删除货币 |
| [**currencyDeleteWithHttpInfo**](CurrencyApi.md#currencyDeleteWithHttpInfo) | **DELETE** /Currency/{appKey}/{id} | 删除货币 |
| [**currencyExchangeRateDelete**](CurrencyApi.md#currencyExchangeRateDelete) | **DELETE** /Currency/{appKey}/ExchangeRates/{id} | 删除汇率 |
| [**currencyExchangeRateDeleteWithHttpInfo**](CurrencyApi.md#currencyExchangeRateDeleteWithHttpInfo) | **DELETE** /Currency/{appKey}/ExchangeRates/{id} | 删除汇率 |
| [**currencyExchangeRatePut**](CurrencyApi.md#currencyExchangeRatePut) | **PUT** /Currency/{appKey}/ExchangeRates/{code} | 更新汇率 |
| [**currencyExchangeRatePutWithHttpInfo**](CurrencyApi.md#currencyExchangeRatePutWithHttpInfo) | **PUT** /Currency/{appKey}/ExchangeRates/{code} | 更新汇率 |
| [**currencyExchangeRates**](CurrencyApi.md#currencyExchangeRates) | **GET** /Currency/{appKey}/ExchangeRates/{code} | 获取汇率列表 |
| [**currencyExchangeRatesWithHttpInfo**](CurrencyApi.md#currencyExchangeRatesWithHttpInfo) | **GET** /Currency/{appKey}/ExchangeRates/{code} | 获取汇率列表 |
| [**currencyPost**](CurrencyApi.md#currencyPost) | **POST** /Currency/{appKey} | 创建新货币 |
| [**currencyPostWithHttpInfo**](CurrencyApi.md#currencyPostWithHttpInfo) | **POST** /Currency/{appKey} | 创建新货币 |
| [**currencyPut**](CurrencyApi.md#currencyPut) | **PUT** /Currency/{appKey}/{id} | 更新货币信息 |
| [**currencyPutWithHttpInfo**](CurrencyApi.md#currencyPutWithHttpInfo) | **PUT** /Currency/{appKey}/{id} | 更新货币信息 |
| [**currencyTransactions**](CurrencyApi.md#currencyTransactions) | **GET** /Currency/{appKey}/Transactions | 获取货币交易记录 |
| [**currencyTransactionsWithHttpInfo**](CurrencyApi.md#currencyTransactionsWithHttpInfo) | **GET** /Currency/{appKey}/Transactions | 获取货币交易记录 |



## currencies

> CurrencyListApiResponse currencies(appKey)

获取货币列表

获取所有货币的列表，按ID降序排列。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.CurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        CurrencyApi apiInstance = new CurrencyApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            CurrencyListApiResponse result = apiInstance.currencies(appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyApi#currencies");
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

[**CurrencyListApiResponse**](CurrencyListApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## currenciesWithHttpInfo

> ApiResponse<CurrencyListApiResponse> currencies currenciesWithHttpInfo(appKey)

获取货币列表

获取所有货币的列表，按ID降序排列。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.CurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        CurrencyApi apiInstance = new CurrencyApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<CurrencyListApiResponse> response = apiInstance.currenciesWithHttpInfo(appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyApi#currencies");
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

ApiResponse<[**CurrencyListApiResponse**](CurrencyListApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## currency

> CurrencyApiResponse currency(id, appKey)

获取货币详情

根据货币ID获取货币的详细信息。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.CurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        CurrencyApi apiInstance = new CurrencyApi(defaultClient);
        Long id = 56L; // Long | 货币ID
        String appKey = "appKey_example"; // String | 
        try {
            CurrencyApiResponse result = apiInstance.currency(id, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyApi#currency");
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
| **id** | **Long**| 货币ID | |
| **appKey** | **String**|  | |

### Return type

[**CurrencyApiResponse**](CurrencyApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## currencyWithHttpInfo

> ApiResponse<CurrencyApiResponse> currency currencyWithHttpInfo(id, appKey)

获取货币详情

根据货币ID获取货币的详细信息。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.CurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        CurrencyApi apiInstance = new CurrencyApi(defaultClient);
        Long id = 56L; // Long | 货币ID
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<CurrencyApiResponse> response = apiInstance.currencyWithHttpInfo(id, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyApi#currency");
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
| **id** | **Long**| 货币ID | |
| **appKey** | **String**|  | |

### Return type

ApiResponse<[**CurrencyApiResponse**](CurrencyApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## currencyDelete

> BooleanApiResponse currencyDelete(id, appKey)

删除货币

根据货币ID删除货币。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.CurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        CurrencyApi apiInstance = new CurrencyApi(defaultClient);
        Long id = 56L; // Long | 货币ID
        String appKey = "appKey_example"; // String | 
        try {
            BooleanApiResponse result = apiInstance.currencyDelete(id, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyApi#currencyDelete");
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
| **id** | **Long**| 货币ID | |
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

## currencyDeleteWithHttpInfo

> ApiResponse<BooleanApiResponse> currencyDelete currencyDeleteWithHttpInfo(id, appKey)

删除货币

根据货币ID删除货币。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.CurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        CurrencyApi apiInstance = new CurrencyApi(defaultClient);
        Long id = 56L; // Long | 货币ID
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.currencyDeleteWithHttpInfo(id, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyApi#currencyDelete");
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
| **id** | **Long**| 货币ID | |
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


## currencyExchangeRateDelete

> BooleanApiResponse currencyExchangeRateDelete(id, appKey)

删除汇率

根据汇率ID删除汇率。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.CurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        CurrencyApi apiInstance = new CurrencyApi(defaultClient);
        Long id = 56L; // Long | 汇率ID
        String appKey = "appKey_example"; // String | 
        try {
            BooleanApiResponse result = apiInstance.currencyExchangeRateDelete(id, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyApi#currencyExchangeRateDelete");
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
| **id** | **Long**| 汇率ID | |
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

## currencyExchangeRateDeleteWithHttpInfo

> ApiResponse<BooleanApiResponse> currencyExchangeRateDelete currencyExchangeRateDeleteWithHttpInfo(id, appKey)

删除汇率

根据汇率ID删除汇率。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.CurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        CurrencyApi apiInstance = new CurrencyApi(defaultClient);
        Long id = 56L; // Long | 汇率ID
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.currencyExchangeRateDeleteWithHttpInfo(id, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyApi#currencyExchangeRateDelete");
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
| **id** | **Long**| 汇率ID | |
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


## currencyExchangeRatePut

> Int64ApiResponse currencyExchangeRatePut(code, appKey, exchangeRatePutRequest)

更新汇率

根据货币代码更新汇率信息。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.CurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        CurrencyApi apiInstance = new CurrencyApi(defaultClient);
        String code = "code_example"; // String | 货币代码
        String appKey = "appKey_example"; // String | 
        ExchangeRatePutRequest exchangeRatePutRequest = new ExchangeRatePutRequest(); // ExchangeRatePutRequest | 汇率信息
        try {
            Int64ApiResponse result = apiInstance.currencyExchangeRatePut(code, appKey, exchangeRatePutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyApi#currencyExchangeRatePut");
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
| **code** | **String**| 货币代码 | |
| **appKey** | **String**|  | |
| **exchangeRatePutRequest** | [**ExchangeRatePutRequest**](ExchangeRatePutRequest.md)| 汇率信息 | [optional] |

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

## currencyExchangeRatePutWithHttpInfo

> ApiResponse<Int64ApiResponse> currencyExchangeRatePut currencyExchangeRatePutWithHttpInfo(code, appKey, exchangeRatePutRequest)

更新汇率

根据货币代码更新汇率信息。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.CurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        CurrencyApi apiInstance = new CurrencyApi(defaultClient);
        String code = "code_example"; // String | 货币代码
        String appKey = "appKey_example"; // String | 
        ExchangeRatePutRequest exchangeRatePutRequest = new ExchangeRatePutRequest(); // ExchangeRatePutRequest | 汇率信息
        try {
            ApiResponse<Int64ApiResponse> response = apiInstance.currencyExchangeRatePutWithHttpInfo(code, appKey, exchangeRatePutRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyApi#currencyExchangeRatePut");
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
| **code** | **String**| 货币代码 | |
| **appKey** | **String**|  | |
| **exchangeRatePutRequest** | [**ExchangeRatePutRequest**](ExchangeRatePutRequest.md)| 汇率信息 | [optional] |

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


## currencyExchangeRates

> CurrencyExchangeRateApiResponse currencyExchangeRates(code, appKey)

获取汇率列表

根据货币代码获取该货币的汇率列表。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.CurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        CurrencyApi apiInstance = new CurrencyApi(defaultClient);
        String code = "code_example"; // String | 货币代码
        String appKey = "appKey_example"; // String | 
        try {
            CurrencyExchangeRateApiResponse result = apiInstance.currencyExchangeRates(code, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyApi#currencyExchangeRates");
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
| **code** | **String**| 货币代码 | |
| **appKey** | **String**|  | |

### Return type

[**CurrencyExchangeRateApiResponse**](CurrencyExchangeRateApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## currencyExchangeRatesWithHttpInfo

> ApiResponse<CurrencyExchangeRateApiResponse> currencyExchangeRates currencyExchangeRatesWithHttpInfo(code, appKey)

获取汇率列表

根据货币代码获取该货币的汇率列表。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.CurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        CurrencyApi apiInstance = new CurrencyApi(defaultClient);
        String code = "code_example"; // String | 货币代码
        String appKey = "appKey_example"; // String | 
        try {
            ApiResponse<CurrencyExchangeRateApiResponse> response = apiInstance.currencyExchangeRatesWithHttpInfo(code, appKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyApi#currencyExchangeRates");
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
| **code** | **String**| 货币代码 | |
| **appKey** | **String**|  | |

### Return type

ApiResponse<[**CurrencyExchangeRateApiResponse**](CurrencyExchangeRateApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## currencyPost

> Int64ApiResponse currencyPost(appKey, currency)

创建新货币

创建一个新的货币并返回其ID。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.CurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        CurrencyApi apiInstance = new CurrencyApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Currency currency = new Currency(); // Currency | 货币信息
        try {
            Int64ApiResponse result = apiInstance.currencyPost(appKey, currency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyApi#currencyPost");
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
| **currency** | [**Currency**](Currency.md)| 货币信息 | [optional] |

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

## currencyPostWithHttpInfo

> ApiResponse<Int64ApiResponse> currencyPost currencyPostWithHttpInfo(appKey, currency)

创建新货币

创建一个新的货币并返回其ID。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.CurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        CurrencyApi apiInstance = new CurrencyApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Currency currency = new Currency(); // Currency | 货币信息
        try {
            ApiResponse<Int64ApiResponse> response = apiInstance.currencyPostWithHttpInfo(appKey, currency);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyApi#currencyPost");
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
| **currency** | [**Currency**](Currency.md)| 货币信息 | [optional] |

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


## currencyPut

> BooleanApiResponse currencyPut(id, appKey, currency)

更新货币信息

根据货币ID更新货币的详细信息。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.CurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        CurrencyApi apiInstance = new CurrencyApi(defaultClient);
        Long id = 56L; // Long | 货币ID
        String appKey = "appKey_example"; // String | 
        Currency currency = new Currency(); // Currency | 货币信息
        try {
            BooleanApiResponse result = apiInstance.currencyPut(id, appKey, currency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyApi#currencyPut");
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
| **id** | **Long**| 货币ID | |
| **appKey** | **String**|  | |
| **currency** | [**Currency**](Currency.md)| 货币信息 | [optional] |

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

## currencyPutWithHttpInfo

> ApiResponse<BooleanApiResponse> currencyPut currencyPutWithHttpInfo(id, appKey, currency)

更新货币信息

根据货币ID更新货币的详细信息。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.CurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        CurrencyApi apiInstance = new CurrencyApi(defaultClient);
        Long id = 56L; // Long | 货币ID
        String appKey = "appKey_example"; // String | 
        Currency currency = new Currency(); // Currency | 货币信息
        try {
            ApiResponse<BooleanApiResponse> response = apiInstance.currencyPutWithHttpInfo(id, appKey, currency);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyApi#currencyPut");
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
| **id** | **Long**| 货币ID | |
| **appKey** | **String**|  | |
| **currency** | [**Currency**](Currency.md)| 货币信息 | [optional] |

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


## currencyTransactions

> CurrencyTransactionListApiResponse currencyTransactions(appKey, userId, transType, curCode, startTime, endTime, skip, take)

获取货币交易记录

根据用户ID、交易类型、货币代码、时间范围等条件获取货币交易记录。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.CurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        CurrencyApi apiInstance = new CurrencyApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Long userId = 56L; // Long | 用户ID
        String transType = "transType_example"; // String | 交易类型
        String curCode = "curCode_example"; // String | 货币代码
        OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | 开始时间
        OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | 结束时间
        Integer skip = 56; // Integer | 跳过的条数
        Integer take = 56; // Integer | 拉取的条数
        try {
            CurrencyTransactionListApiResponse result = apiInstance.currencyTransactions(appKey, userId, transType, curCode, startTime, endTime, skip, take);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyApi#currencyTransactions");
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
| **userId** | **Long**| 用户ID | [optional] |
| **transType** | **String**| 交易类型 | [optional] |
| **curCode** | **String**| 货币代码 | [optional] |
| **startTime** | **OffsetDateTime**| 开始时间 | [optional] |
| **endTime** | **OffsetDateTime**| 结束时间 | [optional] |
| **skip** | **Integer**| 跳过的条数 | [optional] |
| **take** | **Integer**| 拉取的条数 | [optional] |

### Return type

[**CurrencyTransactionListApiResponse**](CurrencyTransactionListApiResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## currencyTransactionsWithHttpInfo

> ApiResponse<CurrencyTransactionListApiResponse> currencyTransactions currencyTransactionsWithHttpInfo(appKey, userId, transType, curCode, startTime, endTime, skip, take)

获取货币交易记录

根据用户ID、交易类型、货币代码、时间范围等条件获取货币交易记录。

### Example

```java
// Import classes:
import com.zashigaofa.client.ApiClient;
import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.ApiResponse;
import com.zashigaofa.client.Configuration;
import com.zashigaofa.client.auth.*;
import com.zashigaofa.client.models.*;
import com.zashigaofa.client.api.CurrencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zashigaofa.cn");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        CurrencyApi apiInstance = new CurrencyApi(defaultClient);
        String appKey = "appKey_example"; // String | 
        Long userId = 56L; // Long | 用户ID
        String transType = "transType_example"; // String | 交易类型
        String curCode = "curCode_example"; // String | 货币代码
        OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | 开始时间
        OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | 结束时间
        Integer skip = 56; // Integer | 跳过的条数
        Integer take = 56; // Integer | 拉取的条数
        try {
            ApiResponse<CurrencyTransactionListApiResponse> response = apiInstance.currencyTransactionsWithHttpInfo(appKey, userId, transType, curCode, startTime, endTime, skip, take);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyApi#currencyTransactions");
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
| **userId** | **Long**| 用户ID | [optional] |
| **transType** | **String**| 交易类型 | [optional] |
| **curCode** | **String**| 货币代码 | [optional] |
| **startTime** | **OffsetDateTime**| 开始时间 | [optional] |
| **endTime** | **OffsetDateTime**| 结束时间 | [optional] |
| **skip** | **Integer**| 跳过的条数 | [optional] |
| **take** | **Integer**| 拉取的条数 | [optional] |

### Return type

ApiResponse<[**CurrencyTransactionListApiResponse**](CurrencyTransactionListApiResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

