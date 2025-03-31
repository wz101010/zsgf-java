# zsgf-client

![Maven Central Version](https://img.shields.io/maven-central/v/com.zashigaofa/zsgf-client)

### Maven 用户

将以下依赖项添加到项目的 POM 文件中：

```xml
<dependency>
  <groupId>com.zashigaofa</groupId>
  <artifactId>zsgf-client</artifactId>
  <version>1.0.17</version>
  <scope>compile</scope>
</dependency>
```

### Gradle 用户

将以下依赖项添加到项目的构建文件中：

```groovy
compile "com.zashigaofa:zsgf-client:1.0.17"
```
## 入门指南

请按照安装说明操作，并执行以下 Java 代码：

```java

import com.zashigaofa.client.*;
import com.zashigaofa.client.model.*;
import com.zashigaofa.client.api.AccessTokenApi;

public class AccessTokenApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // 使用 defaultClient 对象配置客户端，例如
        // 覆盖主机和端口、超时时间等。
        AccessTokenApi apiInstance = new AccessTokenApi(defaultClient);
        Long id = 56L; // Long | 
        String appKey = "appKey_example"; // String | 
        try {
            JObjectApiResult result = apiInstance.accessTokenDelete(id, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokenApi#accessTokenDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## API 文档

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccessTokenApi* | [**accessTokenDelete**](docs/AccessTokenApi.md#accessTokenDelete) | **DELETE** /AccessToken/{appKey}/{id} | 删除令牌
*AccessTokenApi* | [**accessTokenDeleteWithHttpInfo**](docs/AccessTokenApi.md#accessTokenDeleteWithHttpInfo) | **DELETE** /AccessToken/{appKey}/{id} | 删除令牌
*AccessTokenApi* | [**accessTokenPost**](docs/AccessTokenApi.md#accessTokenPost) | **POST** /AccessToken/{appKey} | 创建令牌
*AccessTokenApi* | [**accessTokenPostWithHttpInfo**](docs/AccessTokenApi.md#accessTokenPostWithHttpInfo) | **POST** /AccessToken/{appKey} | 创建令牌
*AccessTokenApi* | [**accessTokenPut**](docs/AccessTokenApi.md#accessTokenPut) | **PUT** /AccessToken/{appKey}/{id} | 更新令牌
*AccessTokenApi* | [**accessTokenPutWithHttpInfo**](docs/AccessTokenApi.md#accessTokenPutWithHttpInfo) | **PUT** /AccessToken/{appKey}/{id} | 更新令牌
*AccessTokenApi* | [**accessTokens**](docs/AccessTokenApi.md#accessTokens) | **GET** /AccessToken/{appKey} | 令牌列表
*AccessTokenApi* | [**accessTokensWithHttpInfo**](docs/AccessTokenApi.md#accessTokensWithHttpInfo) | **GET** /AccessToken/{appKey} | 令牌列表
*AlipayApi* | [**alipayCreateOrder**](docs/AlipayApi.md#alipayCreateOrder) | **POST** /Alipay/{appKey}/CreateOrder | 创建订单 - 当面付
*AlipayApi* | [**alipayCreateOrderWithHttpInfo**](docs/AlipayApi.md#alipayCreateOrderWithHttpInfo) | **POST** /Alipay/{appKey}/CreateOrder | 创建订单 - 当面付
*AlipayApi* | [**alipayCreateOrderPagePay**](docs/AlipayApi.md#alipayCreateOrderPagePay) | **POST** /Alipay/{appKey}/CreateOrderPagePay | 创建订单 - PC支付
*AlipayApi* | [**alipayCreateOrderPagePayWithHttpInfo**](docs/AlipayApi.md#alipayCreateOrderPagePayWithHttpInfo) | **POST** /Alipay/{appKey}/CreateOrderPagePay | 创建订单 - PC支付
*AlipayApi* | [**alipayCreateOrderWapPay**](docs/AlipayApi.md#alipayCreateOrderWapPay) | **POST** /Alipay/{appKey}/CreateOrderWapPay | 创建订单 - WAP支付
*AlipayApi* | [**alipayCreateOrderWapPayWithHttpInfo**](docs/AlipayApi.md#alipayCreateOrderWapPayWithHttpInfo) | **POST** /Alipay/{appKey}/CreateOrderWapPay | 创建订单 - WAP支付
*AlipayApi* | [**alipayOrderDetail**](docs/AlipayApi.md#alipayOrderDetail) | **GET** /Alipay/{appKey}/OrderDetail | 订单详情
*AlipayApi* | [**alipayOrderDetailWithHttpInfo**](docs/AlipayApi.md#alipayOrderDetailWithHttpInfo) | **GET** /Alipay/{appKey}/OrderDetail | 订单详情
*AlipayApi* | [**alipayOrderRefund**](docs/AlipayApi.md#alipayOrderRefund) | **POST** /Alipay/{appKey}/OrderRefund | 订单退款
*AlipayApi* | [**alipayOrderRefundWithHttpInfo**](docs/AlipayApi.md#alipayOrderRefundWithHttpInfo) | **POST** /Alipay/{appKey}/OrderRefund | 订单退款
*AlipayApi* | [**alipayReturnPageNotify**](docs/AlipayApi.md#alipayReturnPageNotify) | **POST** /Alipay/{appKey}/ReturnPageNotify | 支付成功同步通知
*AlipayApi* | [**alipayReturnPageNotifyWithHttpInfo**](docs/AlipayApi.md#alipayReturnPageNotifyWithHttpInfo) | **POST** /Alipay/{appKey}/ReturnPageNotify | 支付成功同步通知
*AppApi* | [**app**](docs/AppApi.md#app) | **GET** /App/{appKey} | 应用详情
*AppApi* | [**appWithHttpInfo**](docs/AppApi.md#appWithHttpInfo) | **GET** /App/{appKey} | 应用详情
*AppApi* | [**app2FA**](docs/AppApi.md#app2FA) | **GET** /App/{appKey}/2FA | 双因素验证 获取
*AppApi* | [**app2FAWithHttpInfo**](docs/AppApi.md#app2FAWithHttpInfo) | **GET** /App/{appKey}/2FA | 双因素验证 获取
*AppApi* | [**app2FACheck**](docs/AppApi.md#app2FACheck) | **GET** /App/{appKey}/2FACheck | 双因素验证 验证
*AppApi* | [**app2FACheckWithHttpInfo**](docs/AppApi.md#app2FACheckWithHttpInfo) | **GET** /App/{appKey}/2FACheck | 双因素验证 验证
*AppApi* | [**appCheckVersion**](docs/AppApi.md#appCheckVersion) | **GET** /App/{appKey}/CheckVersion | 更新应用数据库
*AppApi* | [**appCheckVersionWithHttpInfo**](docs/AppApi.md#appCheckVersionWithHttpInfo) | **GET** /App/{appKey}/CheckVersion | 更新应用数据库
*AppApi* | [**appDelete**](docs/AppApi.md#appDelete) | **DELETE** /App/{appKey} | 删除应用
*AppApi* | [**appDeleteWithHttpInfo**](docs/AppApi.md#appDeleteWithHttpInfo) | **DELETE** /App/{appKey} | 删除应用
*AppApi* | [**appInfo**](docs/AppApi.md#appInfo) | **GET** /App/{appKey}/Info | 应用详情
*AppApi* | [**appInfoWithHttpInfo**](docs/AppApi.md#appInfoWithHttpInfo) | **GET** /App/{appKey}/Info | 应用详情
*AppApi* | [**appPost**](docs/AppApi.md#appPost) | **POST** /App | 创建应用
*AppApi* | [**appPostWithHttpInfo**](docs/AppApi.md#appPostWithHttpInfo) | **POST** /App | 创建应用
*AppApi* | [**appPut**](docs/AppApi.md#appPut) | **PUT** /App/{appKey} | 更新应用
*AppApi* | [**appPutWithHttpInfo**](docs/AppApi.md#appPutWithHttpInfo) | **PUT** /App/{appKey} | 更新应用
*AppApi* | [**appTransfer**](docs/AppApi.md#appTransfer) | **GET** /App/{appKey}/Transfer | 转移应用
*AppApi* | [**appTransferWithHttpInfo**](docs/AppApi.md#appTransferWithHttpInfo) | **GET** /App/{appKey}/Transfer | 转移应用
*AppApi* | [**apps**](docs/AppApi.md#apps) | **GET** /App | 应用列表
*AppApi* | [**appsWithHttpInfo**](docs/AppApi.md#appsWithHttpInfo) | **GET** /App | 应用列表
*AppSettingApi* | [**appServiceSettingGroup**](docs/AppSettingApi.md#appServiceSettingGroup) | **GET** /AppSetting/{appKey}/Groups/{id} | 获取服务分组详情
*AppSettingApi* | [**appServiceSettingGroupWithHttpInfo**](docs/AppSettingApi.md#appServiceSettingGroupWithHttpInfo) | **GET** /AppSetting/{appKey}/Groups/{id} | 获取服务分组详情
*AppSettingApi* | [**appServiceSettingGroupDelete**](docs/AppSettingApi.md#appServiceSettingGroupDelete) | **DELETE** /AppSetting/{appKey}/Groups/{id} | 删除服务分组
*AppSettingApi* | [**appServiceSettingGroupDeleteWithHttpInfo**](docs/AppSettingApi.md#appServiceSettingGroupDeleteWithHttpInfo) | **DELETE** /AppSetting/{appKey}/Groups/{id} | 删除服务分组
*AppSettingApi* | [**appServiceSettingGroupPost**](docs/AppSettingApi.md#appServiceSettingGroupPost) | **POST** /AppSetting/{appKey}/Groups | 添加服务分组
*AppSettingApi* | [**appServiceSettingGroupPostWithHttpInfo**](docs/AppSettingApi.md#appServiceSettingGroupPostWithHttpInfo) | **POST** /AppSetting/{appKey}/Groups | 添加服务分组
*AppSettingApi* | [**appServiceSettingGroupPut**](docs/AppSettingApi.md#appServiceSettingGroupPut) | **PUT** /AppSetting/{appKey}/Groups/{id} | 更新服务分组
*AppSettingApi* | [**appServiceSettingGroupPutWithHttpInfo**](docs/AppSettingApi.md#appServiceSettingGroupPutWithHttpInfo) | **PUT** /AppSetting/{appKey}/Groups/{id} | 更新服务分组
*AppSettingApi* | [**appServiceSettingGroups**](docs/AppSettingApi.md#appServiceSettingGroups) | **GET** /AppSetting/{appKey}/Groups | 获取服务分组列表
*AppSettingApi* | [**appServiceSettingGroupsWithHttpInfo**](docs/AppSettingApi.md#appServiceSettingGroupsWithHttpInfo) | **GET** /AppSetting/{appKey}/Groups | 获取服务分组列表
*AppSettingApi* | [**appServiceSettingItem**](docs/AppSettingApi.md#appServiceSettingItem) | **GET** /AppSetting/{appKey}/Items/{id} | 服务配置项详情
*AppSettingApi* | [**appServiceSettingItemWithHttpInfo**](docs/AppSettingApi.md#appServiceSettingItemWithHttpInfo) | **GET** /AppSetting/{appKey}/Items/{id} | 服务配置项详情
*AppSettingApi* | [**appServiceSettingItemDelete**](docs/AppSettingApi.md#appServiceSettingItemDelete) | **DELETE** /AppSetting/{appKey}/Items/{id} | 删除服务配置项
*AppSettingApi* | [**appServiceSettingItemDeleteWithHttpInfo**](docs/AppSettingApi.md#appServiceSettingItemDeleteWithHttpInfo) | **DELETE** /AppSetting/{appKey}/Items/{id} | 删除服务配置项
*AppSettingApi* | [**appServiceSettingItemPost**](docs/AppSettingApi.md#appServiceSettingItemPost) | **POST** /AppSetting/{appKey}/Items | 添加服务配置项
*AppSettingApi* | [**appServiceSettingItemPostWithHttpInfo**](docs/AppSettingApi.md#appServiceSettingItemPostWithHttpInfo) | **POST** /AppSetting/{appKey}/Items | 添加服务配置项
*AppSettingApi* | [**appServiceSettingItemPut**](docs/AppSettingApi.md#appServiceSettingItemPut) | **PUT** /AppSetting/{appKey}/Items/{id} | 更新服务配置项
*AppSettingApi* | [**appServiceSettingItemPutWithHttpInfo**](docs/AppSettingApi.md#appServiceSettingItemPutWithHttpInfo) | **PUT** /AppSetting/{appKey}/Items/{id} | 更新服务配置项
*AppSettingApi* | [**appServiceSettingItems**](docs/AppSettingApi.md#appServiceSettingItems) | **GET** /AppSetting/{appKey}/Items | 服务配置项列表
*AppSettingApi* | [**appServiceSettingItemsWithHttpInfo**](docs/AppSettingApi.md#appServiceSettingItemsWithHttpInfo) | **GET** /AppSetting/{appKey}/Items | 服务配置项列表
*AppSettingApi* | [**appServiceSettingProvider**](docs/AppSettingApi.md#appServiceSettingProvider) | **GET** /AppSetting/{appKey}/Providers/{id} | 获取服务商详情
*AppSettingApi* | [**appServiceSettingProviderWithHttpInfo**](docs/AppSettingApi.md#appServiceSettingProviderWithHttpInfo) | **GET** /AppSetting/{appKey}/Providers/{id} | 获取服务商详情
*AppSettingApi* | [**appServiceSettingProviderDelete**](docs/AppSettingApi.md#appServiceSettingProviderDelete) | **DELETE** /AppSetting/{appKey}/Providers/{id} | 删除服务商
*AppSettingApi* | [**appServiceSettingProviderDeleteWithHttpInfo**](docs/AppSettingApi.md#appServiceSettingProviderDeleteWithHttpInfo) | **DELETE** /AppSetting/{appKey}/Providers/{id} | 删除服务商
*AppSettingApi* | [**appServiceSettingProviderPost**](docs/AppSettingApi.md#appServiceSettingProviderPost) | **POST** /AppSetting/{appKey}/Providers | 添加服务商
*AppSettingApi* | [**appServiceSettingProviderPostWithHttpInfo**](docs/AppSettingApi.md#appServiceSettingProviderPostWithHttpInfo) | **POST** /AppSetting/{appKey}/Providers | 添加服务商
*AppSettingApi* | [**appServiceSettingProviderPut**](docs/AppSettingApi.md#appServiceSettingProviderPut) | **PUT** /AppSetting/{appKey}/Providers/{id} | 更新服务商
*AppSettingApi* | [**appServiceSettingProviderPutWithHttpInfo**](docs/AppSettingApi.md#appServiceSettingProviderPutWithHttpInfo) | **PUT** /AppSetting/{appKey}/Providers/{id} | 更新服务商
*AppSettingApi* | [**appServiceSettingProviders**](docs/AppSettingApi.md#appServiceSettingProviders) | **GET** /AppSetting/{appKey}/Providers | 获取服务商列表
*AppSettingApi* | [**appServiceSettingProvidersWithHttpInfo**](docs/AppSettingApi.md#appServiceSettingProvidersWithHttpInfo) | **GET** /AppSetting/{appKey}/Providers | 获取服务商列表
*AppSettingApi* | [**appSetting**](docs/AppSettingApi.md#appSetting) | **GET** /AppSetting/{appKey}/{id} | 配置详情
*AppSettingApi* | [**appSettingWithHttpInfo**](docs/AppSettingApi.md#appSettingWithHttpInfo) | **GET** /AppSetting/{appKey}/{id} | 配置详情
*AppSettingApi* | [**appSettingDelete**](docs/AppSettingApi.md#appSettingDelete) | **DELETE** /AppSetting/{appKey}/{id} | 删除配置
*AppSettingApi* | [**appSettingDeleteWithHttpInfo**](docs/AppSettingApi.md#appSettingDeleteWithHttpInfo) | **DELETE** /AppSetting/{appKey}/{id} | 删除配置
*AppSettingApi* | [**appSettingPost**](docs/AppSettingApi.md#appSettingPost) | **POST** /AppSetting/{appKey} | 增加配置
*AppSettingApi* | [**appSettingPostWithHttpInfo**](docs/AppSettingApi.md#appSettingPostWithHttpInfo) | **POST** /AppSetting/{appKey} | 增加配置
*AppSettingApi* | [**appSettingPut**](docs/AppSettingApi.md#appSettingPut) | **PUT** /AppSetting/{appKey}/{id} | 更新配置
*AppSettingApi* | [**appSettingPutWithHttpInfo**](docs/AppSettingApi.md#appSettingPutWithHttpInfo) | **PUT** /AppSetting/{appKey}/{id} | 更新配置
*AppSettingApi* | [**appSettings**](docs/AppSettingApi.md#appSettings) | **GET** /AppSetting/{appKey} | 配置列表
*AppSettingApi* | [**appSettingsWithHttpInfo**](docs/AppSettingApi.md#appSettingsWithHttpInfo) | **GET** /AppSetting/{appKey} | 配置列表
*AuthorizePolicyApi* | [**authorizePolicies**](docs/AuthorizePolicyApi.md#authorizePolicies) | **GET** /AuthorizePolicy/{appKey} | 获取鉴权策略列表
*AuthorizePolicyApi* | [**authorizePoliciesWithHttpInfo**](docs/AuthorizePolicyApi.md#authorizePoliciesWithHttpInfo) | **GET** /AuthorizePolicy/{appKey} | 获取鉴权策略列表
*AuthorizePolicyApi* | [**authorizePolicy**](docs/AuthorizePolicyApi.md#authorizePolicy) | **GET** /AuthorizePolicy/{appKey}/{id} | 获取鉴权策略详情
*AuthorizePolicyApi* | [**authorizePolicyWithHttpInfo**](docs/AuthorizePolicyApi.md#authorizePolicyWithHttpInfo) | **GET** /AuthorizePolicy/{appKey}/{id} | 获取鉴权策略详情
*AuthorizePolicyApi* | [**authorizePolicyDelete**](docs/AuthorizePolicyApi.md#authorizePolicyDelete) | **DELETE** /AuthorizePolicy/{appKey}/{id} | 删除鉴权策略
*AuthorizePolicyApi* | [**authorizePolicyDeleteWithHttpInfo**](docs/AuthorizePolicyApi.md#authorizePolicyDeleteWithHttpInfo) | **DELETE** /AuthorizePolicy/{appKey}/{id} | 删除鉴权策略
*AuthorizePolicyApi* | [**authorizePolicyPost**](docs/AuthorizePolicyApi.md#authorizePolicyPost) | **POST** /AuthorizePolicy/{appKey} | 添加鉴权策略
*AuthorizePolicyApi* | [**authorizePolicyPostWithHttpInfo**](docs/AuthorizePolicyApi.md#authorizePolicyPostWithHttpInfo) | **POST** /AuthorizePolicy/{appKey} | 添加鉴权策略
*AuthorizePolicyApi* | [**authorizePolicyPut**](docs/AuthorizePolicyApi.md#authorizePolicyPut) | **PUT** /AuthorizePolicy/{appKey}/{id} | 更新鉴权策略
*AuthorizePolicyApi* | [**authorizePolicyPutWithHttpInfo**](docs/AuthorizePolicyApi.md#authorizePolicyPutWithHttpInfo) | **PUT** /AuthorizePolicy/{appKey}/{id} | 更新鉴权策略
*CurrencyApi* | [**currencies**](docs/CurrencyApi.md#currencies) | **GET** /Currency/{appKey} | 获取货币列表
*CurrencyApi* | [**currenciesWithHttpInfo**](docs/CurrencyApi.md#currenciesWithHttpInfo) | **GET** /Currency/{appKey} | 获取货币列表
*CurrencyApi* | [**currency**](docs/CurrencyApi.md#currency) | **GET** /Currency/{appKey}/{id} | 获取货币详情
*CurrencyApi* | [**currencyWithHttpInfo**](docs/CurrencyApi.md#currencyWithHttpInfo) | **GET** /Currency/{appKey}/{id} | 获取货币详情
*CurrencyApi* | [**currencyDelete**](docs/CurrencyApi.md#currencyDelete) | **DELETE** /Currency/{appKey}/{id} | 删除货币
*CurrencyApi* | [**currencyDeleteWithHttpInfo**](docs/CurrencyApi.md#currencyDeleteWithHttpInfo) | **DELETE** /Currency/{appKey}/{id} | 删除货币
*CurrencyApi* | [**currencyExchangeRateDelete**](docs/CurrencyApi.md#currencyExchangeRateDelete) | **DELETE** /Currency/{appKey}/ExchangeRates/{id} | 删除汇率
*CurrencyApi* | [**currencyExchangeRateDeleteWithHttpInfo**](docs/CurrencyApi.md#currencyExchangeRateDeleteWithHttpInfo) | **DELETE** /Currency/{appKey}/ExchangeRates/{id} | 删除汇率
*CurrencyApi* | [**currencyExchangeRatePut**](docs/CurrencyApi.md#currencyExchangeRatePut) | **PUT** /Currency/{appKey}/ExchangeRates/{code} | 更新汇率
*CurrencyApi* | [**currencyExchangeRatePutWithHttpInfo**](docs/CurrencyApi.md#currencyExchangeRatePutWithHttpInfo) | **PUT** /Currency/{appKey}/ExchangeRates/{code} | 更新汇率
*CurrencyApi* | [**currencyExchangeRates**](docs/CurrencyApi.md#currencyExchangeRates) | **GET** /Currency/{appKey}/ExchangeRates/{code} | 获取汇率列表
*CurrencyApi* | [**currencyExchangeRatesWithHttpInfo**](docs/CurrencyApi.md#currencyExchangeRatesWithHttpInfo) | **GET** /Currency/{appKey}/ExchangeRates/{code} | 获取汇率列表
*CurrencyApi* | [**currencyPost**](docs/CurrencyApi.md#currencyPost) | **POST** /Currency/{appKey} | 创建新货币
*CurrencyApi* | [**currencyPostWithHttpInfo**](docs/CurrencyApi.md#currencyPostWithHttpInfo) | **POST** /Currency/{appKey} | 创建新货币
*CurrencyApi* | [**currencyPut**](docs/CurrencyApi.md#currencyPut) | **PUT** /Currency/{appKey}/{id} | 更新货币信息
*CurrencyApi* | [**currencyPutWithHttpInfo**](docs/CurrencyApi.md#currencyPutWithHttpInfo) | **PUT** /Currency/{appKey}/{id} | 更新货币信息
*CurrencyApi* | [**currencyTransactions**](docs/CurrencyApi.md#currencyTransactions) | **GET** /Currency/{appKey}/Transactions | 获取货币交易记录
*CurrencyApi* | [**currencyTransactionsWithHttpInfo**](docs/CurrencyApi.md#currencyTransactionsWithHttpInfo) | **GET** /Currency/{appKey}/Transactions | 获取货币交易记录
*DingTalkApi* | [**dingTalkUserInfo**](docs/DingTalkApi.md#dingTalkUserInfo) | **GET** /DingTalk/{appKey}/UserInfo | 获取用户资料
*DingTalkApi* | [**dingTalkUserInfoWithHttpInfo**](docs/DingTalkApi.md#dingTalkUserInfoWithHttpInfo) | **GET** /DingTalk/{appKey}/UserInfo | 获取用户资料
*FileApi* | [**fileCreateFolder**](docs/FileApi.md#fileCreateFolder) | **POST** /File/{appKey}/CreateFolder | 创建文件夹
*FileApi* | [**fileCreateFolderWithHttpInfo**](docs/FileApi.md#fileCreateFolderWithHttpInfo) | **POST** /File/{appKey}/CreateFolder | 创建文件夹
*FileApi* | [**fileDelete**](docs/FileApi.md#fileDelete) | **DELETE** /File/{appKey} | 删除文件或文件夹
*FileApi* | [**fileDeleteWithHttpInfo**](docs/FileApi.md#fileDeleteWithHttpInfo) | **DELETE** /File/{appKey} | 删除文件或文件夹
*FileApi* | [**fileRename**](docs/FileApi.md#fileRename) | **POST** /File/{appKey}/Rename | 重命名文件或文件夹
*FileApi* | [**fileRenameWithHttpInfo**](docs/FileApi.md#fileRenameWithHttpInfo) | **POST** /File/{appKey}/Rename | 重命名文件或文件夹
*FileApi* | [**fileUpload**](docs/FileApi.md#fileUpload) | **POST** /File/{appKey}/Upload | 上传文件
*FileApi* | [**fileUploadWithHttpInfo**](docs/FileApi.md#fileUploadWithHttpInfo) | **POST** /File/{appKey}/Upload | 上传文件
*FileApi* | [**files**](docs/FileApi.md#files) | **GET** /File/{appKey} | 获取文件列表
*FileApi* | [**filesWithHttpInfo**](docs/FileApi.md#filesWithHttpInfo) | **GET** /File/{appKey} | 获取文件列表
*OAuthApi* | [**oAuthAuthorize**](docs/OAuthApi.md#oAuthAuthorize) | **POST** /OAuth/{appKey}/Authorize | 获取access_token
*OAuthApi* | [**oAuthAuthorizeWithHttpInfo**](docs/OAuthApi.md#oAuthAuthorizeWithHttpInfo) | **POST** /OAuth/{appKey}/Authorize | 获取access_token
*OAuthApi* | [**oAuthConsents**](docs/OAuthApi.md#oAuthConsents) | **GET** /OAuth/{appKey}/Consents | 授权记录
*OAuthApi* | [**oAuthConsentsWithHttpInfo**](docs/OAuthApi.md#oAuthConsentsWithHttpInfo) | **GET** /OAuth/{appKey}/Consents | 授权记录
*OAuthApi* | [**oAuthDeleteConsent**](docs/OAuthApi.md#oAuthDeleteConsent) | **DELETE** /OAuth/{appKey}/Consents/{id} | 删除授权记录
*OAuthApi* | [**oAuthDeleteConsentWithHttpInfo**](docs/OAuthApi.md#oAuthDeleteConsentWithHttpInfo) | **DELETE** /OAuth/{appKey}/Consents/{id} | 删除授权记录
*OAuthApi* | [**oAuthGrantCode**](docs/OAuthApi.md#oAuthGrantCode) | **POST** /OAuth/{appKey}/GrantCode | 申请授权码
*OAuthApi* | [**oAuthGrantCodeWithHttpInfo**](docs/OAuthApi.md#oAuthGrantCodeWithHttpInfo) | **POST** /OAuth/{appKey}/GrantCode | 申请授权码
*OAuthApi* | [**oAuthProfile**](docs/OAuthApi.md#oAuthProfile) | **GET** /OAuth/{appKey}/Profile | 获取个人资料
*OAuthApi* | [**oAuthProfileWithHttpInfo**](docs/OAuthApi.md#oAuthProfileWithHttpInfo) | **GET** /OAuth/{appKey}/Profile | 获取个人资料
*OrderApi* | [**order**](docs/OrderApi.md#order) | **GET** /Order/{appKey}/{id} | 获取订单详情
*OrderApi* | [**orderWithHttpInfo**](docs/OrderApi.md#orderWithHttpInfo) | **GET** /Order/{appKey}/{id} | 获取订单详情
*OrderApi* | [**orderCreate**](docs/OrderApi.md#orderCreate) | **POST** /Order/{appKey}/Create | 创建订单
*OrderApi* | [**orderCreateWithHttpInfo**](docs/OrderApi.md#orderCreateWithHttpInfo) | **POST** /Order/{appKey}/Create | 创建订单
*OrderApi* | [**orders**](docs/OrderApi.md#orders) | **GET** /Order/{appKey} | 获取订单列表
*OrderApi* | [**ordersWithHttpInfo**](docs/OrderApi.md#ordersWithHttpInfo) | **GET** /Order/{appKey} | 获取订单列表
*ProjectApi* | [**project**](docs/ProjectApi.md#project) | **GET** /Project/{id} | 项目详情
*ProjectApi* | [**projectWithHttpInfo**](docs/ProjectApi.md#projectWithHttpInfo) | **GET** /Project/{id} | 项目详情
*ProjectApi* | [**projectDelete**](docs/ProjectApi.md#projectDelete) | **DELETE** /Project/{id} | 删除项目
*ProjectApi* | [**projectDeleteWithHttpInfo**](docs/ProjectApi.md#projectDeleteWithHttpInfo) | **DELETE** /Project/{id} | 删除项目
*ProjectApi* | [**projectPost**](docs/ProjectApi.md#projectPost) | **POST** /Project | 创建项目
*ProjectApi* | [**projectPostWithHttpInfo**](docs/ProjectApi.md#projectPostWithHttpInfo) | **POST** /Project | 创建项目
*ProjectApi* | [**projectPut**](docs/ProjectApi.md#projectPut) | **PUT** /Project/{id} | 更新项目
*ProjectApi* | [**projectPutWithHttpInfo**](docs/ProjectApi.md#projectPutWithHttpInfo) | **PUT** /Project/{id} | 更新项目
*ProjectApi* | [**projects**](docs/ProjectApi.md#projects) | **GET** /Project | 项目列表
*ProjectApi* | [**projectsWithHttpInfo**](docs/ProjectApi.md#projectsWithHttpInfo) | **GET** /Project | 项目列表
*ServiceSettingApi* | [**serviceSetting**](docs/ServiceSettingApi.md#serviceSetting) | **GET** /ServiceSetting/{id} | 获取配置详情
*ServiceSettingApi* | [**serviceSettingWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingWithHttpInfo) | **GET** /ServiceSetting/{id} | 获取配置详情
*ServiceSettingApi* | [**serviceSettingDelete**](docs/ServiceSettingApi.md#serviceSettingDelete) | **DELETE** /ServiceSetting/{id} | 删除配置
*ServiceSettingApi* | [**serviceSettingDeleteWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingDeleteWithHttpInfo) | **DELETE** /ServiceSetting/{id} | 删除配置
*ServiceSettingApi* | [**serviceSettingGroup**](docs/ServiceSettingApi.md#serviceSettingGroup) | **GET** /ServiceSetting/Groups/{id} | 获取服务分组详情
*ServiceSettingApi* | [**serviceSettingGroupWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingGroupWithHttpInfo) | **GET** /ServiceSetting/Groups/{id} | 获取服务分组详情
*ServiceSettingApi* | [**serviceSettingGroupDelete**](docs/ServiceSettingApi.md#serviceSettingGroupDelete) | **DELETE** /ServiceSetting/Groups/{id} | 删除服务分组
*ServiceSettingApi* | [**serviceSettingGroupDeleteWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingGroupDeleteWithHttpInfo) | **DELETE** /ServiceSetting/Groups/{id} | 删除服务分组
*ServiceSettingApi* | [**serviceSettingGroupPost**](docs/ServiceSettingApi.md#serviceSettingGroupPost) | **POST** /ServiceSetting/Groups | 添加服务分组
*ServiceSettingApi* | [**serviceSettingGroupPostWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingGroupPostWithHttpInfo) | **POST** /ServiceSetting/Groups | 添加服务分组
*ServiceSettingApi* | [**serviceSettingGroupPut**](docs/ServiceSettingApi.md#serviceSettingGroupPut) | **PUT** /ServiceSetting/Groups/{id} | 更新服务分组
*ServiceSettingApi* | [**serviceSettingGroupPutWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingGroupPutWithHttpInfo) | **PUT** /ServiceSetting/Groups/{id} | 更新服务分组
*ServiceSettingApi* | [**serviceSettingGroups**](docs/ServiceSettingApi.md#serviceSettingGroups) | **GET** /ServiceSetting/Groups | 获取服务分组列表
*ServiceSettingApi* | [**serviceSettingGroupsWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingGroupsWithHttpInfo) | **GET** /ServiceSetting/Groups | 获取服务分组列表
*ServiceSettingApi* | [**serviceSettingItem**](docs/ServiceSettingApi.md#serviceSettingItem) | **GET** /ServiceSetting/Items/{id} | 服务配置详情
*ServiceSettingApi* | [**serviceSettingItemWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingItemWithHttpInfo) | **GET** /ServiceSetting/Items/{id} | 服务配置详情
*ServiceSettingApi* | [**serviceSettingItemDelete**](docs/ServiceSettingApi.md#serviceSettingItemDelete) | **DELETE** /ServiceSetting/Items/{id} | 删除服务配置
*ServiceSettingApi* | [**serviceSettingItemDeleteWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingItemDeleteWithHttpInfo) | **DELETE** /ServiceSetting/Items/{id} | 删除服务配置
*ServiceSettingApi* | [**serviceSettingItemPost**](docs/ServiceSettingApi.md#serviceSettingItemPost) | **POST** /ServiceSetting/Items | 添加服务配置
*ServiceSettingApi* | [**serviceSettingItemPostWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingItemPostWithHttpInfo) | **POST** /ServiceSetting/Items | 添加服务配置
*ServiceSettingApi* | [**serviceSettingItemPut**](docs/ServiceSettingApi.md#serviceSettingItemPut) | **PUT** /ServiceSetting/Items/{id} | 更新服务配置
*ServiceSettingApi* | [**serviceSettingItemPutWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingItemPutWithHttpInfo) | **PUT** /ServiceSetting/Items/{id} | 更新服务配置
*ServiceSettingApi* | [**serviceSettingItems**](docs/ServiceSettingApi.md#serviceSettingItems) | **GET** /ServiceSetting/Items | 服务配置列表
*ServiceSettingApi* | [**serviceSettingItemsWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingItemsWithHttpInfo) | **GET** /ServiceSetting/Items | 服务配置列表
*ServiceSettingApi* | [**serviceSettingPost**](docs/ServiceSettingApi.md#serviceSettingPost) | **POST** /ServiceSetting | 增加配置
*ServiceSettingApi* | [**serviceSettingPostWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingPostWithHttpInfo) | **POST** /ServiceSetting | 增加配置
*ServiceSettingApi* | [**serviceSettingProvider**](docs/ServiceSettingApi.md#serviceSettingProvider) | **GET** /ServiceSetting/Providers/{id} | 获取服务商详情
*ServiceSettingApi* | [**serviceSettingProviderWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingProviderWithHttpInfo) | **GET** /ServiceSetting/Providers/{id} | 获取服务商详情
*ServiceSettingApi* | [**serviceSettingProviderDelete**](docs/ServiceSettingApi.md#serviceSettingProviderDelete) | **DELETE** /ServiceSetting/Providers/{id} | 删除服务商
*ServiceSettingApi* | [**serviceSettingProviderDeleteWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingProviderDeleteWithHttpInfo) | **DELETE** /ServiceSetting/Providers/{id} | 删除服务商
*ServiceSettingApi* | [**serviceSettingProviderPost**](docs/ServiceSettingApi.md#serviceSettingProviderPost) | **POST** /ServiceSetting/Providers | 添加服务商
*ServiceSettingApi* | [**serviceSettingProviderPostWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingProviderPostWithHttpInfo) | **POST** /ServiceSetting/Providers | 添加服务商
*ServiceSettingApi* | [**serviceSettingProviderPut**](docs/ServiceSettingApi.md#serviceSettingProviderPut) | **PUT** /ServiceSetting/Providers/{id} | 更新服务商
*ServiceSettingApi* | [**serviceSettingProviderPutWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingProviderPutWithHttpInfo) | **PUT** /ServiceSetting/Providers/{id} | 更新服务商
*ServiceSettingApi* | [**serviceSettingProviders**](docs/ServiceSettingApi.md#serviceSettingProviders) | **GET** /ServiceSetting/Providers | 获取服务商列表
*ServiceSettingApi* | [**serviceSettingProvidersWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingProvidersWithHttpInfo) | **GET** /ServiceSetting/Providers | 获取服务商列表
*ServiceSettingApi* | [**serviceSettingPut**](docs/ServiceSettingApi.md#serviceSettingPut) | **PUT** /ServiceSetting/{id} | 更新配置
*ServiceSettingApi* | [**serviceSettingPutWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingPutWithHttpInfo) | **PUT** /ServiceSetting/{id} | 更新配置
*ServiceSettingApi* | [**serviceSettings**](docs/ServiceSettingApi.md#serviceSettings) | **GET** /ServiceSetting | 获取配置列表
*ServiceSettingApi* | [**serviceSettingsWithHttpInfo**](docs/ServiceSettingApi.md#serviceSettingsWithHttpInfo) | **GET** /ServiceSetting | 获取配置列表
*StorageApi* | [**storageAggregate**](docs/StorageApi.md#storageAggregate) | **GET** /Storage/{appKey}/{table}/Aggregate | 聚合查询
*StorageApi* | [**storageAggregateWithHttpInfo**](docs/StorageApi.md#storageAggregateWithHttpInfo) | **GET** /Storage/{appKey}/{table}/Aggregate | 聚合查询
*StorageApi* | [**storageClear**](docs/StorageApi.md#storageClear) | **DELETE** /Storage/{appKey}/{table}/Clear | 清空表数据
*StorageApi* | [**storageClearWithHttpInfo**](docs/StorageApi.md#storageClearWithHttpInfo) | **DELETE** /Storage/{appKey}/{table}/Clear | 清空表数据
*StorageApi* | [**storageDelete**](docs/StorageApi.md#storageDelete) | **DELETE** /Storage/{appKey}/{table}/{id} | 删除数据
*StorageApi* | [**storageDeleteWithHttpInfo**](docs/StorageApi.md#storageDeleteWithHttpInfo) | **DELETE** /Storage/{appKey}/{table}/{id} | 删除数据
*StorageApi* | [**storageDeleteIndex**](docs/StorageApi.md#storageDeleteIndex) | **DELETE** /Storage/{appKey}/{table}/indexes | 删除索引
*StorageApi* | [**storageDeleteIndexWithHttpInfo**](docs/StorageApi.md#storageDeleteIndexWithHttpInfo) | **DELETE** /Storage/{appKey}/{table}/indexes | 删除索引
*StorageApi* | [**storageDetail**](docs/StorageApi.md#storageDetail) | **GET** /Storage/{appKey}/{table}/{id} | 数据详情
*StorageApi* | [**storageDetailWithHttpInfo**](docs/StorageApi.md#storageDetailWithHttpInfo) | **GET** /Storage/{appKey}/{table}/{id} | 数据详情
*StorageApi* | [**storageExecuteFunction**](docs/StorageApi.md#storageExecuteFunction) | **GET** /Storage/{appKey}/ExecuteFunction | 执行函数
*StorageApi* | [**storageExecuteFunctionWithHttpInfo**](docs/StorageApi.md#storageExecuteFunctionWithHttpInfo) | **GET** /Storage/{appKey}/ExecuteFunction | 执行函数
*StorageApi* | [**storageExport**](docs/StorageApi.md#storageExport) | **GET** /Storage/{appKey}/{table}/Export | 导出数据
*StorageApi* | [**storageExportWithHttpInfo**](docs/StorageApi.md#storageExportWithHttpInfo) | **GET** /Storage/{appKey}/{table}/Export | 导出数据
*StorageApi* | [**storageImport**](docs/StorageApi.md#storageImport) | **POST** /Storage/{appKey}/{table}/Import | 导入数据
*StorageApi* | [**storageImportWithHttpInfo**](docs/StorageApi.md#storageImportWithHttpInfo) | **POST** /Storage/{appKey}/{table}/Import | 导入数据
*StorageApi* | [**storageIndexes**](docs/StorageApi.md#storageIndexes) | **GET** /Storage/{appKey}/{table}/Indexes | 获取索引
*StorageApi* | [**storageIndexesWithHttpInfo**](docs/StorageApi.md#storageIndexesWithHttpInfo) | **GET** /Storage/{appKey}/{table}/Indexes | 获取索引
*StorageApi* | [**storageList**](docs/StorageApi.md#storageList) | **GET** /Storage/{appKey}/{table} | 查询数据
*StorageApi* | [**storageListWithHttpInfo**](docs/StorageApi.md#storageListWithHttpInfo) | **GET** /Storage/{appKey}/{table} | 查询数据
*StorageApi* | [**storagePost**](docs/StorageApi.md#storagePost) | **POST** /Storage/{appKey}/{table} | 添加数据
*StorageApi* | [**storagePostWithHttpInfo**](docs/StorageApi.md#storagePostWithHttpInfo) | **POST** /Storage/{appKey}/{table} | 添加数据
*StorageApi* | [**storagePostIndex**](docs/StorageApi.md#storagePostIndex) | **POST** /Storage/{appKey}/{table}/indexes | 添加索引
*StorageApi* | [**storagePostIndexWithHttpInfo**](docs/StorageApi.md#storagePostIndexWithHttpInfo) | **POST** /Storage/{appKey}/{table}/indexes | 添加索引
*StorageApi* | [**storagePut**](docs/StorageApi.md#storagePut) | **PUT** /Storage/{appKey}/{table}/{id} | 更新数据
*StorageApi* | [**storagePutWithHttpInfo**](docs/StorageApi.md#storagePutWithHttpInfo) | **PUT** /Storage/{appKey}/{table}/{id} | 更新数据
*StorageApi* | [**storageRemove**](docs/StorageApi.md#storageRemove) | **DELETE** /Storage/{appKey}/{table}/Remove | 删除表
*StorageApi* | [**storageRemoveWithHttpInfo**](docs/StorageApi.md#storageRemoveWithHttpInfo) | **DELETE** /Storage/{appKey}/{table}/Remove | 删除表
*StorageApi* | [**storageStats**](docs/StorageApi.md#storageStats) | **GET** /Storage/{appKey}/{table}/Stats | 数据表统计
*StorageApi* | [**storageStatsWithHttpInfo**](docs/StorageApi.md#storageStatsWithHttpInfo) | **GET** /Storage/{appKey}/{table}/Stats | 数据表统计
*StorageApi* | [**storageTables**](docs/StorageApi.md#storageTables) | **GET** /Storage/{appKey}/Tables | 获取数据表
*StorageApi* | [**storageTablesWithHttpInfo**](docs/StorageApi.md#storageTablesWithHttpInfo) | **GET** /Storage/{appKey}/Tables | 获取数据表
*SystemFileApi* | [**systemFileCreateFolder**](docs/SystemFileApi.md#systemFileCreateFolder) | **POST** /SystemFile/CreateFolder | 创建文件夹
*SystemFileApi* | [**systemFileCreateFolderWithHttpInfo**](docs/SystemFileApi.md#systemFileCreateFolderWithHttpInfo) | **POST** /SystemFile/CreateFolder | 创建文件夹
*SystemFileApi* | [**systemFileDelete**](docs/SystemFileApi.md#systemFileDelete) | **DELETE** /SystemFile | 删除文件
*SystemFileApi* | [**systemFileDeleteWithHttpInfo**](docs/SystemFileApi.md#systemFileDeleteWithHttpInfo) | **DELETE** /SystemFile | 删除文件
*SystemFileApi* | [**systemFileRename**](docs/SystemFileApi.md#systemFileRename) | **POST** /SystemFile/Rename | 重命名文件
*SystemFileApi* | [**systemFileRenameWithHttpInfo**](docs/SystemFileApi.md#systemFileRenameWithHttpInfo) | **POST** /SystemFile/Rename | 重命名文件
*SystemFileApi* | [**systemFileUpload**](docs/SystemFileApi.md#systemFileUpload) | **POST** /SystemFile | 上传文件
*SystemFileApi* | [**systemFileUploadWithHttpInfo**](docs/SystemFileApi.md#systemFileUploadWithHttpInfo) | **POST** /SystemFile | 上传文件
*SystemFileApi* | [**systemFiles**](docs/SystemFileApi.md#systemFiles) | **GET** /SystemFile | 获取文件列表
*SystemFileApi* | [**systemFilesWithHttpInfo**](docs/SystemFileApi.md#systemFilesWithHttpInfo) | **GET** /SystemFile | 获取文件列表
*TeamApi* | [**teamDelete**](docs/TeamApi.md#teamDelete) | **DELETE** /Team/{id} | 删除团队
*TeamApi* | [**teamDeleteWithHttpInfo**](docs/TeamApi.md#teamDeleteWithHttpInfo) | **DELETE** /Team/{id} | 删除团队
*TeamApi* | [**teamPost**](docs/TeamApi.md#teamPost) | **POST** /Team | 创建团队
*TeamApi* | [**teamPostWithHttpInfo**](docs/TeamApi.md#teamPostWithHttpInfo) | **POST** /Team | 创建团队
*TeamApi* | [**teamPut**](docs/TeamApi.md#teamPut) | **PUT** /Team/{id} | 更新团队信息
*TeamApi* | [**teamPutWithHttpInfo**](docs/TeamApi.md#teamPutWithHttpInfo) | **PUT** /Team/{id} | 更新团队信息
*TeamApi* | [**teams**](docs/TeamApi.md#teams) | **GET** /Team | 获取团队列表
*TeamApi* | [**teamsWithHttpInfo**](docs/TeamApi.md#teamsWithHttpInfo) | **GET** /Team | 获取团队列表
*UserApi* | [**user**](docs/UserApi.md#user) | **GET** /User/{appKey}/{id} | 获取用户详情
*UserApi* | [**userWithHttpInfo**](docs/UserApi.md#userWithHttpInfo) | **GET** /User/{appKey}/{id} | 获取用户详情
*UserApi* | [**userClear**](docs/UserApi.md#userClear) | **DELETE** /User/{appKey}/Clear | 清空用户数据
*UserApi* | [**userClearWithHttpInfo**](docs/UserApi.md#userClearWithHttpInfo) | **DELETE** /User/{appKey}/Clear | 清空用户数据
*UserApi* | [**userCommonInterests**](docs/UserApi.md#userCommonInterests) | **GET** /User/{appKey}/Friends/CommonInterests | 有共同爱好的用户推荐
*UserApi* | [**userCommonInterestsWithHttpInfo**](docs/UserApi.md#userCommonInterestsWithHttpInfo) | **GET** /User/{appKey}/Friends/CommonInterests | 有共同爱好的用户推荐
*UserApi* | [**userDelete**](docs/UserApi.md#userDelete) | **DELETE** /User/{appKey}/{id} | 删除用户
*UserApi* | [**userDeleteWithHttpInfo**](docs/UserApi.md#userDeleteWithHttpInfo) | **DELETE** /User/{appKey}/{id} | 删除用户
*UserApi* | [**userEmailSignIn**](docs/UserApi.md#userEmailSignIn) | **POST** /User/{appKey}/EmailSignIn | 邮箱登录
*UserApi* | [**userEmailSignInWithHttpInfo**](docs/UserApi.md#userEmailSignInWithHttpInfo) | **POST** /User/{appKey}/EmailSignIn | 邮箱登录
*UserApi* | [**userEmailSignUp**](docs/UserApi.md#userEmailSignUp) | **POST** /User/{appKey}/EmailSignUp | 邮箱注册
*UserApi* | [**userEmailSignUpWithHttpInfo**](docs/UserApi.md#userEmailSignUpWithHttpInfo) | **POST** /User/{appKey}/EmailSignUp | 邮箱注册
*UserApi* | [**userExport**](docs/UserApi.md#userExport) | **GET** /User/{appKey}/Export | 导出用户数据
*UserApi* | [**userExportWithHttpInfo**](docs/UserApi.md#userExportWithHttpInfo) | **GET** /User/{appKey}/Export | 导出用户数据
*UserApi* | [**userFollowUser**](docs/UserApi.md#userFollowUser) | **POST** /User/{appKey}/Follower/{userId} | 关注用户
*UserApi* | [**userFollowUserWithHttpInfo**](docs/UserApi.md#userFollowUserWithHttpInfo) | **POST** /User/{appKey}/Follower/{userId} | 关注用户
*UserApi* | [**userFollowerPut**](docs/UserApi.md#userFollowerPut) | **PUT** /User/{appKey}/Follower/{id} | 更新粉丝
*UserApi* | [**userFollowerPutWithHttpInfo**](docs/UserApi.md#userFollowerPutWithHttpInfo) | **PUT** /User/{appKey}/Follower/{id} | 更新粉丝
*UserApi* | [**userFollowers**](docs/UserApi.md#userFollowers) | **GET** /User/{appKey}/Followers | 获取我的粉丝列表
*UserApi* | [**userFollowersWithHttpInfo**](docs/UserApi.md#userFollowersWithHttpInfo) | **GET** /User/{appKey}/Followers | 获取我的粉丝列表
*UserApi* | [**userFollowing**](docs/UserApi.md#userFollowing) | **GET** /User/{appKey}/Following | 获取我的关注列表
*UserApi* | [**userFollowingWithHttpInfo**](docs/UserApi.md#userFollowingWithHttpInfo) | **GET** /User/{appKey}/Following | 获取我的关注列表
*UserApi* | [**userFriendsNearBy**](docs/UserApi.md#userFriendsNearBy) | **GET** /User/{appKey}/Friends/NearBy | 附近的用户推荐
*UserApi* | [**userFriendsNearByWithHttpInfo**](docs/UserApi.md#userFriendsNearByWithHttpInfo) | **GET** /User/{appKey}/Friends/NearBy | 附近的用户推荐
*UserApi* | [**userImport**](docs/UserApi.md#userImport) | **POST** /User/{appKey}/Import | 导入用户数据
*UserApi* | [**userImportWithHttpInfo**](docs/UserApi.md#userImportWithHttpInfo) | **POST** /User/{appKey}/Import | 导入用户数据
*UserApi* | [**userLocation**](docs/UserApi.md#userLocation) | **GET** /User/{appKey}/Location/{id} | 获取位置详情
*UserApi* | [**userLocationWithHttpInfo**](docs/UserApi.md#userLocationWithHttpInfo) | **GET** /User/{appKey}/Location/{id} | 获取位置详情
*UserApi* | [**userLocationDelete**](docs/UserApi.md#userLocationDelete) | **DELETE** /User/{appKey}/Location/{id} | 删除位置
*UserApi* | [**userLocationDeleteWithHttpInfo**](docs/UserApi.md#userLocationDeleteWithHttpInfo) | **DELETE** /User/{appKey}/Location/{id} | 删除位置
*UserApi* | [**userLocationPost**](docs/UserApi.md#userLocationPost) | **POST** /User/{appKey}/Location | 添加位置
*UserApi* | [**userLocationPostWithHttpInfo**](docs/UserApi.md#userLocationPostWithHttpInfo) | **POST** /User/{appKey}/Location | 添加位置
*UserApi* | [**userLocationPut**](docs/UserApi.md#userLocationPut) | **PUT** /User/{appKey}/Location/{id} | 更新位置
*UserApi* | [**userLocationPutWithHttpInfo**](docs/UserApi.md#userLocationPutWithHttpInfo) | **PUT** /User/{appKey}/Location/{id} | 更新位置
*UserApi* | [**userLocations**](docs/UserApi.md#userLocations) | **GET** /User/{appKey}/Locations | 获取位置列表
*UserApi* | [**userLocationsWithHttpInfo**](docs/UserApi.md#userLocationsWithHttpInfo) | **GET** /User/{appKey}/Locations | 获取位置列表
*UserApi* | [**userMutualFollowers**](docs/UserApi.md#userMutualFollowers) | **GET** /User/{appKey}/Friends/MutualFollowers | 有共同粉丝的用户推荐
*UserApi* | [**userMutualFollowersWithHttpInfo**](docs/UserApi.md#userMutualFollowersWithHttpInfo) | **GET** /User/{appKey}/Friends/MutualFollowers | 有共同粉丝的用户推荐
*UserApi* | [**userMutualFollowings**](docs/UserApi.md#userMutualFollowings) | **GET** /User/{appKey}/Friends/MutualFollowings | 有共同关注的用户推荐
*UserApi* | [**userMutualFollowingsWithHttpInfo**](docs/UserApi.md#userMutualFollowingsWithHttpInfo) | **GET** /User/{appKey}/Friends/MutualFollowings | 有共同关注的用户推荐
*UserApi* | [**userOAuthAccountBind**](docs/UserApi.md#userOAuthAccountBind) | **POST** /User/{appKey}/OAuthAccountBind | 外部账号 绑定
*UserApi* | [**userOAuthAccountBindWithHttpInfo**](docs/UserApi.md#userOAuthAccountBindWithHttpInfo) | **POST** /User/{appKey}/OAuthAccountBind | 外部账号 绑定
*UserApi* | [**userOAuthAccountSignIn**](docs/UserApi.md#userOAuthAccountSignIn) | **POST** /User/{appKey}/OAuthAccountSignIn | 外部账号 登录
*UserApi* | [**userOAuthAccountSignInWithHttpInfo**](docs/UserApi.md#userOAuthAccountSignInWithHttpInfo) | **POST** /User/{appKey}/OAuthAccountSignIn | 外部账号 登录
*UserApi* | [**userOAuthAccounts**](docs/UserApi.md#userOAuthAccounts) | **GET** /User/{appKey}/OAuthAccounts | 外部账号 绑定列表
*UserApi* | [**userOAuthAccountsWithHttpInfo**](docs/UserApi.md#userOAuthAccountsWithHttpInfo) | **GET** /User/{appKey}/OAuthAccounts | 外部账号 绑定列表
*UserApi* | [**userOAuthAccountsPutBind**](docs/UserApi.md#userOAuthAccountsPutBind) | **PUT** /User/{appKey}/OAuthAccounts/{id} | 外部账号 更新绑定
*UserApi* | [**userOAuthAccountsPutBindWithHttpInfo**](docs/UserApi.md#userOAuthAccountsPutBindWithHttpInfo) | **PUT** /User/{appKey}/OAuthAccounts/{id} | 外部账号 更新绑定
*UserApi* | [**userOAuthAccountsUnBind**](docs/UserApi.md#userOAuthAccountsUnBind) | **DELETE** /User/{appKey}/OAuthAccounts/{id} | 外部账号 删除绑定
*UserApi* | [**userOAuthAccountsUnBindWithHttpInfo**](docs/UserApi.md#userOAuthAccountsUnBindWithHttpInfo) | **DELETE** /User/{appKey}/OAuthAccounts/{id} | 外部账号 删除绑定
*UserApi* | [**userPhoneSignIn**](docs/UserApi.md#userPhoneSignIn) | **POST** /User/{appKey}/PhoneSignIn | 手机登录
*UserApi* | [**userPhoneSignInWithHttpInfo**](docs/UserApi.md#userPhoneSignInWithHttpInfo) | **POST** /User/{appKey}/PhoneSignIn | 手机登录
*UserApi* | [**userPhoneSignUp**](docs/UserApi.md#userPhoneSignUp) | **POST** /User/{appKey}/PhoneSignUp | 手机注册
*UserApi* | [**userPhoneSignUpWithHttpInfo**](docs/UserApi.md#userPhoneSignUpWithHttpInfo) | **POST** /User/{appKey}/PhoneSignUp | 手机注册
*UserApi* | [**userProfile**](docs/UserApi.md#userProfile) | **GET** /User/{appKey}/Profile | 获取个人资料
*UserApi* | [**userProfileWithHttpInfo**](docs/UserApi.md#userProfileWithHttpInfo) | **GET** /User/{appKey}/Profile | 获取个人资料
*UserApi* | [**userPut**](docs/UserApi.md#userPut) | **PUT** /User/{appKey}/{id} | 更新用户信息
*UserApi* | [**userPutWithHttpInfo**](docs/UserApi.md#userPutWithHttpInfo) | **PUT** /User/{appKey}/{id} | 更新用户信息
*UserApi* | [**userQRCodePreSignIn**](docs/UserApi.md#userQRCodePreSignIn) | **POST** /User/{appKey}/QRCodePreSignIn | 微信小程序 - 预登陆
*UserApi* | [**userQRCodePreSignInWithHttpInfo**](docs/UserApi.md#userQRCodePreSignInWithHttpInfo) | **POST** /User/{appKey}/QRCodePreSignIn | 微信小程序 - 预登陆
*UserApi* | [**userQRCodeScan**](docs/UserApi.md#userQRCodeScan) | **POST** /User/{appKey}/QRCodeScan | 微信小程序 - 扫码
*UserApi* | [**userQRCodeScanWithHttpInfo**](docs/UserApi.md#userQRCodeScanWithHttpInfo) | **POST** /User/{appKey}/QRCodeScan | 微信小程序 - 扫码
*UserApi* | [**userQRCodeSignIn**](docs/UserApi.md#userQRCodeSignIn) | **POST** /User/{appKey}/QRCodeSignIn | 微信小程序 - 网页登录
*UserApi* | [**userQRCodeSignInWithHttpInfo**](docs/UserApi.md#userQRCodeSignInWithHttpInfo) | **POST** /User/{appKey}/QRCodeSignIn | 微信小程序 - 网页登录
*UserApi* | [**userQRCodeSignUp**](docs/UserApi.md#userQRCodeSignUp) | **POST** /User/{appKey}/QRCodeSignUp | 微信小程序 - 注册
*UserApi* | [**userQRCodeSignUpWithHttpInfo**](docs/UserApi.md#userQRCodeSignUpWithHttpInfo) | **POST** /User/{appKey}/QRCodeSignUp | 微信小程序 - 注册
*UserApi* | [**userResetPwd**](docs/UserApi.md#userResetPwd) | **POST** /User/{appKey}/ResetPwd | 重置密码
*UserApi* | [**userResetPwdWithHttpInfo**](docs/UserApi.md#userResetPwdWithHttpInfo) | **POST** /User/{appKey}/ResetPwd | 重置密码
*UserApi* | [**userSendEmailCode**](docs/UserApi.md#userSendEmailCode) | **POST** /User/{appKey}/SendEmailCode | 发送邮箱验证码
*UserApi* | [**userSendEmailCodeWithHttpInfo**](docs/UserApi.md#userSendEmailCodeWithHttpInfo) | **POST** /User/{appKey}/SendEmailCode | 发送邮箱验证码
*UserApi* | [**userSendSMSCode**](docs/UserApi.md#userSendSMSCode) | **POST** /User/{appKey}/SendSMSCode | 发送手机验证码
*UserApi* | [**userSendSMSCodeWithHttpInfo**](docs/UserApi.md#userSendSMSCodeWithHttpInfo) | **POST** /User/{appKey}/SendSMSCode | 发送手机验证码
*UserApi* | [**userSignIn**](docs/UserApi.md#userSignIn) | **POST** /User/{appKey}/SignIn | 账号密码 登录
*UserApi* | [**userSignInWithHttpInfo**](docs/UserApi.md#userSignInWithHttpInfo) | **POST** /User/{appKey}/SignIn | 账号密码 登录
*UserApi* | [**userSignUp**](docs/UserApi.md#userSignUp) | **POST** /User/{appKey}/SignUp | 账号密码 注册
*UserApi* | [**userSignUpWithHttpInfo**](docs/UserApi.md#userSignUpWithHttpInfo) | **POST** /User/{appKey}/SignUp | 账号密码 注册
*UserApi* | [**userTwoFactorAuth**](docs/UserApi.md#userTwoFactorAuth) | **GET** /User/{appKey}/TwoFactorAuth | 双因素验证
*UserApi* | [**userTwoFactorAuthWithHttpInfo**](docs/UserApi.md#userTwoFactorAuthWithHttpInfo) | **GET** /User/{appKey}/TwoFactorAuth | 双因素验证
*UserApi* | [**userUnfollowUser**](docs/UserApi.md#userUnfollowUser) | **DELETE** /User/{appKey}/Follower/{userId} | 取消关注
*UserApi* | [**userUnfollowUserWithHttpInfo**](docs/UserApi.md#userUnfollowUserWithHttpInfo) | **DELETE** /User/{appKey}/Follower/{userId} | 取消关注
*UserApi* | [**userUnionIDSignIn**](docs/UserApi.md#userUnionIDSignIn) | **POST** /User/{appKey}/UnionIDSignIn | UnionID登录
*UserApi* | [**userUnionIDSignInWithHttpInfo**](docs/UserApi.md#userUnionIDSignInWithHttpInfo) | **POST** /User/{appKey}/UnionIDSignIn | UnionID登录
*UserApi* | [**userUnionIDSignUp**](docs/UserApi.md#userUnionIDSignUp) | **POST** /User/{appKey}/UnionIDSignUp | UnionID注册
*UserApi* | [**userUnionIDSignUpWithHttpInfo**](docs/UserApi.md#userUnionIDSignUpWithHttpInfo) | **POST** /User/{appKey}/UnionIDSignUp | UnionID注册
*UserApi* | [**userUpdateProfile**](docs/UserApi.md#userUpdateProfile) | **PUT** /User/{appKey}/Profile | 更新个人资料
*UserApi* | [**userUpdateProfileWithHttpInfo**](docs/UserApi.md#userUpdateProfileWithHttpInfo) | **PUT** /User/{appKey}/Profile | 更新个人资料
*UserApi* | [**users**](docs/UserApi.md#users) | **GET** /User/{appKey} | 获取用户列表
*UserApi* | [**usersWithHttpInfo**](docs/UserApi.md#usersWithHttpInfo) | **GET** /User/{appKey} | 获取用户列表
*UserCurrencyApi* | [**userCurrencies**](docs/UserCurrencyApi.md#userCurrencies) | **GET** /UserCurrency/{appKey}/{id} | 获取用户资产
*UserCurrencyApi* | [**userCurrenciesWithHttpInfo**](docs/UserCurrencyApi.md#userCurrenciesWithHttpInfo) | **GET** /UserCurrency/{appKey}/{id} | 获取用户资产
*UserCurrencyApi* | [**userCurrencyConsume**](docs/UserCurrencyApi.md#userCurrencyConsume) | **POST** /UserCurrency/{appKey}/CurrencyConsume | 消费虚拟币
*UserCurrencyApi* | [**userCurrencyConsumeWithHttpInfo**](docs/UserCurrencyApi.md#userCurrencyConsumeWithHttpInfo) | **POST** /UserCurrency/{appKey}/CurrencyConsume | 消费虚拟币
*UserCurrencyApi* | [**userCurrencyExchange**](docs/UserCurrencyApi.md#userCurrencyExchange) | **POST** /UserCurrency/{appKey}/CurrencyExchange | 兑换虚拟币
*UserCurrencyApi* | [**userCurrencyExchangeWithHttpInfo**](docs/UserCurrencyApi.md#userCurrencyExchangeWithHttpInfo) | **POST** /UserCurrency/{appKey}/CurrencyExchange | 兑换虚拟币
*UserCurrencyApi* | [**userCurrencyRecharge**](docs/UserCurrencyApi.md#userCurrencyRecharge) | **POST** /UserCurrency/{appKey}/CurrencyRecharge | 充值虚拟币
*UserCurrencyApi* | [**userCurrencyRechargeWithHttpInfo**](docs/UserCurrencyApi.md#userCurrencyRechargeWithHttpInfo) | **POST** /UserCurrency/{appKey}/CurrencyRecharge | 充值虚拟币
*UserCurrencyApi* | [**userCurrencyTransactions**](docs/UserCurrencyApi.md#userCurrencyTransactions) | **GET** /UserCurrency/{appKey}/CurrencyTransactions | 虚拟币交易记录
*UserCurrencyApi* | [**userCurrencyTransactionsWithHttpInfo**](docs/UserCurrencyApi.md#userCurrencyTransactionsWithHttpInfo) | **GET** /UserCurrency/{appKey}/CurrencyTransactions | 虚拟币交易记录
*UserSettingApi* | [**userSetting**](docs/UserSettingApi.md#userSetting) | **GET** /UserSetting/{appKey}/{id} | 获取用户配置项详情
*UserSettingApi* | [**userSettingWithHttpInfo**](docs/UserSettingApi.md#userSettingWithHttpInfo) | **GET** /UserSetting/{appKey}/{id} | 获取用户配置项详情
*UserSettingApi* | [**userSettingDelete**](docs/UserSettingApi.md#userSettingDelete) | **DELETE** /UserSetting/{appKey}/{id} | 删除用户配置项
*UserSettingApi* | [**userSettingDeleteWithHttpInfo**](docs/UserSettingApi.md#userSettingDeleteWithHttpInfo) | **DELETE** /UserSetting/{appKey}/{id} | 删除用户配置项
*UserSettingApi* | [**userSettingPost**](docs/UserSettingApi.md#userSettingPost) | **POST** /UserSetting/{appKey} | 添加用户配置项
*UserSettingApi* | [**userSettingPostWithHttpInfo**](docs/UserSettingApi.md#userSettingPostWithHttpInfo) | **POST** /UserSetting/{appKey} | 添加用户配置项
*UserSettingApi* | [**userSettingPut**](docs/UserSettingApi.md#userSettingPut) | **PUT** /UserSetting/{appKey}/{id} | 更新用户配置项
*UserSettingApi* | [**userSettingPutWithHttpInfo**](docs/UserSettingApi.md#userSettingPutWithHttpInfo) | **PUT** /UserSetting/{appKey}/{id} | 更新用户配置项
*UserSettingApi* | [**userSettings**](docs/UserSettingApi.md#userSettings) | **GET** /UserSetting/{appKey} | 获取用户配置列表
*UserSettingApi* | [**userSettingsWithHttpInfo**](docs/UserSettingApi.md#userSettingsWithHttpInfo) | **GET** /UserSetting/{appKey} | 获取用户配置列表
*WechatApi* | [**wechatDecrypt**](docs/WechatApi.md#wechatDecrypt) | **GET** /Wechat/{appKey}/Decrypt | 小程序-解密数据
*WechatApi* | [**wechatDecryptWithHttpInfo**](docs/WechatApi.md#wechatDecryptWithHttpInfo) | **GET** /Wechat/{appKey}/Decrypt | 小程序-解密数据
*WechatApi* | [**wechatGenerateScheme**](docs/WechatApi.md#wechatGenerateScheme) | **POST** /Wechat/{appKey}/GenerateScheme | 小程序-生成scheme码(该接口用于获取小程序 scheme 码，适用于短信、邮件、外部网页、微信内等拉起小程序的业务场景)
*WechatApi* | [**wechatGenerateSchemeWithHttpInfo**](docs/WechatApi.md#wechatGenerateSchemeWithHttpInfo) | **POST** /Wechat/{appKey}/GenerateScheme | 小程序-生成scheme码(该接口用于获取小程序 scheme 码，适用于短信、邮件、外部网页、微信内等拉起小程序的业务场景)
*WechatApi* | [**wechatJSCode2Session**](docs/WechatApi.md#wechatJSCode2Session) | **GET** /Wechat/{appKey}/JSCode2Session | 小程序-登录凭证校验
*WechatApi* | [**wechatJSCode2SessionWithHttpInfo**](docs/WechatApi.md#wechatJSCode2SessionWithHttpInfo) | **GET** /Wechat/{appKey}/JSCode2Session | 小程序-登录凭证校验
*WechatApi* | [**wechatJSConfig**](docs/WechatApi.md#wechatJSConfig) | **GET** /Wechat/{appKey}/JSConfig | 公众号H5-JS SDK Config
*WechatApi* | [**wechatJSConfigWithHttpInfo**](docs/WechatApi.md#wechatJSConfigWithHttpInfo) | **GET** /Wechat/{appKey}/JSConfig | 公众号H5-JS SDK Config
*WechatApi* | [**wechatSubscribeMSG**](docs/WechatApi.md#wechatSubscribeMSG) | **POST** /Wechat/{appKey}/SubscribeMSG | 公众号H5-发送一次性订阅消息
*WechatApi* | [**wechatSubscribeMSGWithHttpInfo**](docs/WechatApi.md#wechatSubscribeMSGWithHttpInfo) | **POST** /Wechat/{appKey}/SubscribeMSG | 公众号H5-发送一次性订阅消息
*WechatApi* | [**wechatSubscribeSend**](docs/WechatApi.md#wechatSubscribeSend) | **POST** /Wechat/{appKey}/SubscribeSend | 小程序-发送订阅消息
*WechatApi* | [**wechatSubscribeSendWithHttpInfo**](docs/WechatApi.md#wechatSubscribeSendWithHttpInfo) | **POST** /Wechat/{appKey}/SubscribeSend | 小程序-发送订阅消息
*WechatApi* | [**wechatUrlLinkGenerate**](docs/WechatApi.md#wechatUrlLinkGenerate) | **POST** /Wechat/{appKey}/UrlLinkGenerate | 小程序-生成网页跳转地址(获取小程序 URL Link，适用于短信、邮件、网页、微信内等拉起小程序的业务场景)
*WechatApi* | [**wechatUrlLinkGenerateWithHttpInfo**](docs/WechatApi.md#wechatUrlLinkGenerateWithHttpInfo) | **POST** /Wechat/{appKey}/UrlLinkGenerate | 小程序-生成网页跳转地址(获取小程序 URL Link，适用于短信、邮件、网页、微信内等拉起小程序的业务场景)
*WechatApi* | [**wechatUserInfo**](docs/WechatApi.md#wechatUserInfo) | **GET** /Wechat/{appKey}/UserInfo | 公众号H5-获取用户UnionID
*WechatApi* | [**wechatUserInfoWithHttpInfo**](docs/WechatApi.md#wechatUserInfoWithHttpInfo) | **GET** /Wechat/{appKey}/UserInfo | 公众号H5-获取用户UnionID
*WechatApi* | [**wechatWXACodeGet**](docs/WechatApi.md#wechatWXACodeGet) | **POST** /Wechat/{appKey}/WXACodeGet | 小程序-获取小程序码
*WechatApi* | [**wechatWXACodeGetWithHttpInfo**](docs/WechatApi.md#wechatWXACodeGetWithHttpInfo) | **POST** /Wechat/{appKey}/WXACodeGet | 小程序-获取小程序码
*WechatApi* | [**wechatWXACodeGetUnlimited**](docs/WechatApi.md#wechatWXACodeGetUnlimited) | **POST** /Wechat/{appKey}/WXACodeGetUnlimited | 小程序-获取小程序码(无限制)
*WechatApi* | [**wechatWXACodeGetUnlimitedWithHttpInfo**](docs/WechatApi.md#wechatWXACodeGetUnlimitedWithHttpInfo) | **POST** /Wechat/{appKey}/WXACodeGetUnlimited | 小程序-获取小程序码(无限制)

## 数据结构

 - [AccessTokenListResult](docs/AccessTokenListResult.md)
  - [AccessTokenListResultApiResponse](docs/AccessTokenListResultApiResponse.md)
  - [AccessTokenPostRequest](docs/AccessTokenPostRequest.md)
  - [AccessTokenPutRequest](docs/AccessTokenPutRequest.md)
  - [AlipayCreateOrderPagePayRequest](docs/AlipayCreateOrderPagePayRequest.md)
  - [AlipayCreateOrderRequest](docs/AlipayCreateOrderRequest.md)
  - [AlipayCreateOrderWapPayRequest](docs/AlipayCreateOrderWapPayRequest.md)
  - [AlipayTradeQueryResponse](docs/AlipayTradeQueryResponse.md)
  - [AlipayTradeQueryResponseApiResponse](docs/AlipayTradeQueryResponseApiResponse.md)
  - [AlipayTradeRefundResponse](docs/AlipayTradeRefundResponse.md)
  - [AlipayTradeRefundResponseApiResponse](docs/AlipayTradeRefundResponseApiResponse.md)
  - [App](docs/App.md)
  - [AppApiResponse](docs/AppApiResponse.md)
  - [AppCheckVersionResult](docs/AppCheckVersionResult.md)
  - [AppCheckVersionResultApiResponse](docs/AppCheckVersionResultApiResponse.md)
  - [AppInfoItem](docs/AppInfoItem.md)
  - [AppInfoResult](docs/AppInfoResult.md)
  - [AppInfoResultApiResponse](docs/AppInfoResultApiResponse.md)
  - [AppListResult](docs/AppListResult.md)
  - [AppListResultApiResponse](docs/AppListResultApiResponse.md)
  - [AppPostResult](docs/AppPostResult.md)
  - [AppPostResultApiResponse](docs/AppPostResultApiResponse.md)
  - [AppProperty](docs/AppProperty.md)
  - [AppSetting](docs/AppSetting.md)
  - [AppSettingApiResponse](docs/AppSettingApiResponse.md)
  - [AppSettingGroupPostResult](docs/AppSettingGroupPostResult.md)
  - [AppSettingGroupPostResultApiResponse](docs/AppSettingGroupPostResultApiResponse.md)
  - [AppSettingItemPostResult](docs/AppSettingItemPostResult.md)
  - [AppSettingItemPostResultApiResponse](docs/AppSettingItemPostResultApiResponse.md)
  - [AppSettingListApiResponse](docs/AppSettingListApiResponse.md)
  - [AppSettingProviderPostResult](docs/AppSettingProviderPostResult.md)
  - [AppSettingProviderPostResultApiResponse](docs/AppSettingProviderPostResultApiResponse.md)
  - [AppSettingSettingPostResult](docs/AppSettingSettingPostResult.md)
  - [AppSettingSettingPostResultApiResponse](docs/AppSettingSettingPostResultApiResponse.md)
  - [AppUserConsentModel](docs/AppUserConsentModel.md)
  - [AppUserConsentModelListApiResponse](docs/AppUserConsentModelListApiResponse.md)
  - [AppUserListResponse](docs/AppUserListResponse.md)
  - [AppUserResetPwdRequest](docs/AppUserResetPwdRequest.md)
  - [AuthorizePolicy](docs/AuthorizePolicy.md)
  - [AuthorizePolicyApiResponse](docs/AuthorizePolicyApiResponse.md)
  - [AuthorizePolicyListApiResponse](docs/AuthorizePolicyListApiResponse.md)
  - [AuthorizeResult](docs/AuthorizeResult.md)
  - [AuthorizeResultApiResponse](docs/AuthorizeResultApiResponse.md)
  - [BkAgentRespInfo](docs/BkAgentRespInfo.md)
  - [BooleanApiResponse](docs/BooleanApiResponse.md)
  - [ChargeInfo](docs/ChargeInfo.md)
  - [CommonFriendModel](docs/CommonFriendModel.md)
  - [ContributeDetail](docs/ContributeDetail.md)
  - [CreateOrderRequest](docs/CreateOrderRequest.md)
  - [CreateOrderResult](docs/CreateOrderResult.md)
  - [CreateOrderResultApiResponse](docs/CreateOrderResultApiResponse.md)
  - [CreatePostResult](docs/CreatePostResult.md)
  - [CreatePostResultApiResponse](docs/CreatePostResultApiResponse.md)
  - [Currency](docs/Currency.md)
  - [CurrencyApiResponse](docs/CurrencyApiResponse.md)
  - [CurrencyConsumeRequest](docs/CurrencyConsumeRequest.md)
  - [CurrencyExchangeRate](docs/CurrencyExchangeRate.md)
  - [CurrencyExchangeRateApiResponse](docs/CurrencyExchangeRateApiResponse.md)
  - [CurrencyListApiResponse](docs/CurrencyListApiResponse.md)
  - [CurrencyTransaction](docs/CurrencyTransaction.md)
  - [CurrencyTransactionListApiResponse](docs/CurrencyTransactionListApiResponse.md)
  - [DirectoryItem](docs/DirectoryItem.md)
  - [EmailSignInRequest](docs/EmailSignInRequest.md)
  - [EmailSignUpRequest](docs/EmailSignUpRequest.md)
  - [EnterprisePayInfo](docs/EnterprisePayInfo.md)
  - [ExchangeCurrencyRequest](docs/ExchangeCurrencyRequest.md)
  - [ExchangeRatePutRequest](docs/ExchangeRatePutRequest.md)
  - [ExecuteFunctionRequest](docs/ExecuteFunctionRequest.md)
  - [FileItem](docs/FileItem.md)
  - [FileListResult](docs/FileListResult.md)
  - [FileListResultApiResponse](docs/FileListResultApiResponse.md)
  - [FollowerModel](docs/FollowerModel.md)
  - [FollowerPutModel](docs/FollowerPutModel.md)
  - [FulfillmentDetail](docs/FulfillmentDetail.md)
  - [GeoLocationModel](docs/GeoLocationModel.md)
  - [GeoLocationModelApiResponse](docs/GeoLocationModelApiResponse.md)
  - [GeoLocationResponseModel](docs/GeoLocationResponseModel.md)
  - [GoodsDetail](docs/GoodsDetail.md)
  - [GrantRequest](docs/GrantRequest.md)
  - [GrantResult](docs/GrantResult.md)
  - [GrantResultApiResponse](docs/GrantResultApiResponse.md)
  - [HbFqPayInfo](docs/HbFqPayInfo.md)
  - [Int64ApiResponse](docs/Int64ApiResponse.md)
  - [IntactChargeInfo](docs/IntactChargeInfo.md)
  - [ListResponseItem](docs/ListResponseItem.md)
  - [ListResponseItemListApiResponse](docs/ListResponseItemListApiResponse.md)
  - [OAuthAccountBindRequest](docs/OAuthAccountBindRequest.md)
  - [OAuthAccountPutBindRequest](docs/OAuthAccountPutBindRequest.md)
  - [OAuthAccountSignInRequest](docs/OAuthAccountSignInRequest.md)
  - [ObjectApiResponse](docs/ObjectApiResponse.md)
  - [ObjectListApiResponse](docs/ObjectListApiResponse.md)
  - [Order](docs/Order.md)
  - [OrderApiResponse](docs/OrderApiResponse.md)
  - [OrderListResult](docs/OrderListResult.md)
  - [OrderListResultApiResponse](docs/OrderListResultApiResponse.md)
  - [PaymentInfoWithId](docs/PaymentInfoWithId.md)
  - [PhoneSignInRequest](docs/PhoneSignInRequest.md)
  - [PhoneSignUpRequest](docs/PhoneSignUpRequest.md)
  - [PostIndexRequest](docs/PostIndexRequest.md)
  - [PostResult](docs/PostResult.md)
  - [PostResultApiResponse](docs/PostResultApiResponse.md)
  - [PresetPayToolInfo](docs/PresetPayToolInfo.md)
  - [ProfileResult](docs/ProfileResult.md)
  - [ProfileResultApiResponse](docs/ProfileResultApiResponse.md)
  - [Project](docs/Project.md)
  - [ProjectApiResponse](docs/ProjectApiResponse.md)
  - [ProjectListResult](docs/ProjectListResult.md)
  - [ProjectListResultApiResponse](docs/ProjectListResultApiResponse.md)
  - [QRCodePreSignInRequest](docs/QRCodePreSignInRequest.md)
  - [QRCodeScanRequest](docs/QRCodeScanRequest.md)
  - [QRCodeSignInRequest](docs/QRCodeSignInRequest.md)
  - [QRCodeSignUpRequest](docs/QRCodeSignUpRequest.md)
  - [RechargePointRequest](docs/RechargePointRequest.md)
  - [RecommendFriend](docs/RecommendFriend.md)
  - [RefundChargeInfo](docs/RefundChargeInfo.md)
  - [RefundSubFee](docs/RefundSubFee.md)
  - [ReturnPageNotifyRequest](docs/ReturnPageNotifyRequest.md)
  - [SendEmailCodeRequest](docs/SendEmailCodeRequest.md)
  - [SendSMSCodeRequest](docs/SendSMSCodeRequest.md)
  - [ServiceGroup](docs/ServiceGroup.md)
  - [ServiceGroupApiResponse](docs/ServiceGroupApiResponse.md)
  - [ServiceGroupListApiResponse](docs/ServiceGroupListApiResponse.md)
  - [ServiceItem](docs/ServiceItem.md)
  - [ServiceItemApiResponse](docs/ServiceItemApiResponse.md)
  - [ServiceItemListApiResponse](docs/ServiceItemListApiResponse.md)
  - [ServiceProvider](docs/ServiceProvider.md)
  - [ServiceProviderApiResponse](docs/ServiceProviderApiResponse.md)
  - [ServiceProviderListApiResponse](docs/ServiceProviderListApiResponse.md)
  - [ServiceSettingGroupPostResult](docs/ServiceSettingGroupPostResult.md)
  - [ServiceSettingGroupPostResultApiResponse](docs/ServiceSettingGroupPostResultApiResponse.md)
  - [ServiceSettingItemPostResult](docs/ServiceSettingItemPostResult.md)
  - [ServiceSettingItemPostResultApiResponse](docs/ServiceSettingItemPostResultApiResponse.md)
  - [ServiceSettingProviderPostResult](docs/ServiceSettingProviderPostResult.md)
  - [ServiceSettingProviderPostResultApiResponse](docs/ServiceSettingProviderPostResultApiResponse.md)
  - [ServiceSettingSettingPostResult](docs/ServiceSettingSettingPostResult.md)
  - [ServiceSettingSettingPostResultApiResponse](docs/ServiceSettingSettingPostResultApiResponse.md)
  - [Settings](docs/Settings.md)
  - [SettingsApiResponse](docs/SettingsApiResponse.md)
  - [SettingsListApiResponse](docs/SettingsListApiResponse.md)
  - [SetupCode](docs/SetupCode.md)
  - [SetupCodeApiResponse](docs/SetupCodeApiResponse.md)
  - [SignInRequest](docs/SignInRequest.md)
  - [SignUpRequest](docs/SignUpRequest.md)
  - [StorageListResult](docs/StorageListResult.md)
  - [StorageListResultApiResponse](docs/StorageListResultApiResponse.md)
  - [StringApiResponse](docs/StringApiResponse.md)
  - [StringListApiResponse](docs/StringListApiResponse.md)
  - [SubFee](docs/SubFee.md)
  - [SystemDirectoryItem](docs/SystemDirectoryItem.md)
  - [SystemFileItem](docs/SystemFileItem.md)
  - [SystemFileListResult](docs/SystemFileListResult.md)
  - [SystemFileListResultApiResponse](docs/SystemFileListResultApiResponse.md)
  - [TapPayInfo](docs/TapPayInfo.md)
  - [Team](docs/Team.md)
  - [TokenModel](docs/TokenModel.md)
  - [TokenModelApiResponse](docs/TokenModelApiResponse.md)
  - [TradeFundBill](docs/TradeFundBill.md)
  - [TradeSettleDetail](docs/TradeSettleDetail.md)
  - [TradeSettleInfo](docs/TradeSettleInfo.md)
  - [UnionIDSignInRequest](docs/UnionIDSignInRequest.md)
  - [UnionIDSignUpRequest](docs/UnionIDSignUpRequest.md)
  - [UpdateProfileRequest](docs/UpdateProfileRequest.md)
  - [User](docs/User.md)
  - [UserAccessToken](docs/UserAccessToken.md)
  - [UserApiResponse](docs/UserApiResponse.md)
  - [UserCommonInterestsResult](docs/UserCommonInterestsResult.md)
  - [UserCommonInterestsResultApiResponse](docs/UserCommonInterestsResultApiResponse.md)
  - [UserCurrency](docs/UserCurrency.md)
  - [UserCurrencyCurrencyTransResult](docs/UserCurrencyCurrencyTransResult.md)
  - [UserCurrencyCurrencyTransResultApiResponse](docs/UserCurrencyCurrencyTransResultApiResponse.md)
  - [UserCurrencyListApiResponse](docs/UserCurrencyListApiResponse.md)
  - [UserFollowersResult](docs/UserFollowersResult.md)
  - [UserFollowersResultApiResponse](docs/UserFollowersResultApiResponse.md)
  - [UserFollowingResult](docs/UserFollowingResult.md)
  - [UserFollowingResultApiResponse](docs/UserFollowingResultApiResponse.md)
  - [UserFriendsNearByResult](docs/UserFriendsNearByResult.md)
  - [UserFriendsNearByResultApiResponse](docs/UserFriendsNearByResultApiResponse.md)
  - [UserListResult](docs/UserListResult.md)
  - [UserListResultApiResponse](docs/UserListResultApiResponse.md)
  - [UserLocationPostResult](docs/UserLocationPostResult.md)
  - [UserLocationPostResultApiResponse](docs/UserLocationPostResultApiResponse.md)
  - [UserLocationsResult](docs/UserLocationsResult.md)
  - [UserLocationsResultApiResponse](docs/UserLocationsResultApiResponse.md)
  - [UserLogins](docs/UserLogins.md)
  - [UserLoginsListApiResponse](docs/UserLoginsListApiResponse.md)
  - [UserMutualFollowersResult](docs/UserMutualFollowersResult.md)
  - [UserMutualFollowersResultApiResponse](docs/UserMutualFollowersResultApiResponse.md)
  - [UserMutualFollowingsResult](docs/UserMutualFollowingsResult.md)
  - [UserMutualFollowingsResultApiResponse](docs/UserMutualFollowingsResultApiResponse.md)
  - [UserProfileResult](docs/UserProfileResult.md)
  - [UserProfileResultApiResponse](docs/UserProfileResultApiResponse.md)
  - [UserQRCodeScanResult](docs/UserQRCodeScanResult.md)
  - [UserQRCodeScanResultApiResponse](docs/UserQRCodeScanResultApiResponse.md)
  - [UserSetting](docs/UserSetting.md)
  - [UserSettingApiResponse](docs/UserSettingApiResponse.md)
  - [UserSettingListApiResponse](docs/UserSettingListApiResponse.md)
  - [UserSettingPostResult](docs/UserSettingPostResult.md)
  - [UserSettingPostResultApiResponse](docs/UserSettingPostResultApiResponse.md)
  - [VoucherDetail](docs/VoucherDetail.md)
  - [WechatJSConfigResult](docs/WechatJSConfigResult.md)
  - [WechatJSConfigResultApiResponse](docs/WechatJSConfigResultApiResponse.md)