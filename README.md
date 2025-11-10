# zsgf-client

![Maven Central Version](https://img.shields.io/maven-central/v/com.zashigaofa/zsgf-client)

### Maven 用户

将以下依赖项添加到项目的 POM 文件中：

```xml
<dependency>
  <groupId>com.zashigaofa</groupId>
  <artifactId>zsgf-client</artifactId>
  <version>2.1.4</version>
  <scope>compile</scope>
</dependency>
```

### Gradle 用户

将以下依赖项添加到项目的构建文件中：

```groovy
compile "com.zashigaofa:zsgf-client:2.1.4"
```
# ZSGF Java SDK 使用指南

欢迎使用ZSGF Java SDK！本SDK为您提供了一套完整的API调用解决方案，支持用户管理、支付、文件存储、社交功能等多个业务场景。

## 📋 目录

- [快速开始](#快速开始)
- [安装与配置](#安装与配置)
- [核心功能](#核心功能)
- [API使用示例](#api使用示例)
- [错误处理](#错误处理)
- [常见问题](#常见问题)
- [完整API参考](#完整api参考)

## 🚀 快速开始

### 系统要求

- Java 8 或更高版本
- Maven 3.6+ 或 Gradle 6.0+

### 第一步：添加依赖

**Maven**
```xml
<dependency>
    <groupId>com.zashigaofa</groupId>
    <artifactId>client</artifactId>
    <version>最新版本</version>
</dependency>
```

**Gradle**
```gradle
implementation 'com.zashigaofa:client:最新版本'
```

### 第二步：初始化客户端

```java
import com.zashigaofa.client.*;
import com.zashigaofa.client.model.*;
import com.zashigaofa.client.api.*;

public class QuickStartExample {
    private static final String APP_KEY = "your_app_key_here";
    
    public static void main(String[] args) {
        // 初始化API客户端
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // 可选：配置服务器地址
        // defaultClient.setBasePath("https://your-api-server.com");
        
        // 可选：配置超时时间
        defaultClient.setConnectTimeout(30000); // 30秒
        defaultClient.setReadTimeout(30000);    // 30秒
        
        // 创建API实例并测试
        AccessTokenApi apiInstance = new AccessTokenApi(defaultClient);
        
        try {
            // 示例：删除一个访问令牌
            Long id = 56L;
            JObjectApiResult result = apiInstance.accessTokenDelete(id, APP_KEY);
            System.out.println("操作成功: " + result);
        } catch (ApiException e) {
            System.err.println("API调用失败");
            System.err.println("状态码: " + e.getCode());
            System.err.println("错误信息: " + e.getResponseBody());
        }
    }
}
```

## ⚙️ 安装与配置

### 基础配置

```java
public class SDKConfig {
    private static final String APP_KEY = "your_app_key_here";
    
    public static ApiClient createClient() {
        ApiClient client = Configuration.getDefaultApiClient();
        
        // 设置API服务器地址（如有需要）
        client.setBasePath("https://api.zashigaofa.com");
        
        // 设置认证信息（如有需要）
        client.addDefaultHeader("Authorization", "Bearer your_token");
        
        // 配置超时时间
        client.setConnectTimeout(30000); // 连接超时30秒
        client.setReadTimeout(60000);    // 读取超时60秒
        
        // 开启调试模式（开发环境）
        client.setDebugging(true);
        
        return client;
    }
}
```

## 🔧 核心功能模块

### 1. 🔐 认证与授权
- **AccessTokenApi**: 访问令牌管理
- **OAuthApi**: OAuth授权流程
- **ExternalAccountApi**: 外部账号绑定

### 2. 👤 用户管理
- **UserApi**: 注册、登录、资料管理
- **UserFriendsApi**: 社交关系管理
- **UserLocationApi**: 位置服务

### 3. 💰 支付与交易
- **AlipayApi**: 支付宝支付集成
- **OrderApi**: 订单管理
- **UserCurrencyApi**: 虚拟币系统

### 4. 📁 文件与存储
- **FileApi**: 文件上传下载
- **StorageApi**: 数据存储服务

### 5. 📱 微信生态
- **WechatApi**: 微信小程序、公众号集成
- **DingTalkApi**: 钉钉集成

### 6. ℹ️ 应用信息
- **AppApi**: 应用配置信息

## 💡 实用示例

### 用户注册与登录

```java
import com.zashigaofa.client.api.UserApi;
import com.zashigaofa.client.model.*;

public class UserAuthExample {
    private static final String APP_KEY = "your_app_key";
    
    // 用户注册
    public void registerUser(String username, String email, String password) {
        try {
            UserApi userApi = new UserApi(SDKConfig.createClient());
            
            // 创建注册请求对象
            SignUpRequest request = new SignUpRequest();
            request.setUsername(username);
            request.setEmail(email);
            request.setPassword(password);
            
            // 发起注册
            var result = userApi.userSignUp(APP_KEY, request);
            System.out.println("注册成功，用户ID: " + result);
            
        } catch (ApiException e) {
            handleError("用户注册", e);
        }
    }
    
    // 用户登录
    public String loginUser(String username, String password) {
        try {
            UserApi userApi = new UserApi(SDKConfig.createClient());
            
            SignInRequest request = new SignInRequest();
            request.setUsername(username);
            request.setPassword(password);
            
            var result = userApi.userSignIn(APP_KEY, request);
            System.out.println("登录成功！");
            return result.toString(); // 返回访问令牌
            
        } catch (ApiException e) {
            handleError("用户登录", e);
            return null;
        }
    }
}
```

### 文件上传管理

```java
import com.zashigaofa.client.api.FileApi;
import java.io.File;

public class FileManagementExample {
    private static final String APP_KEY = "your_app_key";
    
    // 上传文件
    public void uploadFile(String filePath, String targetFolder) {
        try {
            FileApi fileApi = new FileApi(SDKConfig.createClient());
            
            File file = new File(filePath);
            if (!file.exists()) {
                System.err.println("文件不存在: " + filePath);
                return;
            }
            
            var result = fileApi.fileUpload(APP_KEY, file, targetFolder);
            System.out.println("文件上传成功: " + result);
            
        } catch (ApiException e) {
            handleError("文件上传", e);
        }
    }
    
    // 获取文件列表
    public void listFiles(String folder) {
        try {
            FileApi fileApi = new FileApi(SDKConfig.createClient());
            
            var result = fileApi.files(APP_KEY, folder, null, null);
            System.out.println("文件列表: " + result);
            
        } catch (ApiException e) {
            handleError("获取文件列表", e);
        }
    }
    
    // 创建文件夹
    public void createFolder(String folderName, String parentPath) {
        try {
            FileApi fileApi = new FileApi(SDKConfig.createClient());
            
            // 这里需要根据实际API创建请求对象
            var result = fileApi.fileCreateFolder(APP_KEY, folderName, parentPath);
            System.out.println("文件夹创建成功: " + result);
            
        } catch (ApiException e) {
            handleError("创建文件夹", e);
        }
    }
}
```

### 支付宝支付集成

```java
import com.zashigaofa.client.api.AlipayApi;
import com.zashigaofa.client.model.*;

public class PaymentExample {
    private static final String APP_KEY = "your_app_key";
    
    // 创建支付订单
    public void createPaymentOrder(String orderNo, String amount, String subject) {
        try {
            AlipayApi alipayApi = new AlipayApi(SDKConfig.createClient());
            
            AlipayCreateOrderRequest request = new AlipayCreateOrderRequest();
            request.setOutTradeNo(orderNo);
            request.setTotalAmount(amount);
            request.setSubject(subject);
            request.setBody("商品详细描述");
            
            var result = alipayApi.alipayCreateOrder(APP_KEY, request);
            System.out.println("支付订单创建成功: " + result);
            
        } catch (ApiException e) {
            handleError("创建支付订单", e);
        }
    }
    
    // 查询订单状态
    public void queryOrderStatus(String outTradeNo) {
        try {
            AlipayApi alipayApi = new AlipayApi(SDKConfig.createClient());
            
            var result = alipayApi.alipayOrderDetail(APP_KEY, outTradeNo);
            System.out.println("订单状态: " + result);
            
        } catch (ApiException e) {
            handleError("查询订单状态", e);
        }
    }
}
```

### 数据存储操作

```java
import com.zashigaofa.client.api.StorageApi;
import java.util.HashMap;
import java.util.Map;

public class DataStorageExample {
    private static final String APP_KEY = "your_app_key";
    
    // 保存数据
    public void saveData(String tableName, Map<String, Object> data) {
        try {
            StorageApi storageApi = new StorageApi(SDKConfig.createClient());
            
            var result = storageApi.storagePost(APP_KEY, tableName, data);
            System.out.println("数据保存成功: " + result);
            
        } catch (ApiException e) {
            handleError("保存数据", e);
        }
    }
    
    // 查询数据列表
    public void queryDataList(String tableName) {
        try {
            StorageApi storageApi = new StorageApi(SDKConfig.createClient());
            
            var result = storageApi.storageList(APP_KEY, tableName, 
                null, null, null, null, null, null);
            System.out.println("数据列表: " + result);
            
        } catch (ApiException e) {
            handleError("查询数据", e);
        }
    }
    
    // 更新数据
    public void updateData(String tableName, String id, Map<String, Object> data) {
        try {
            StorageApi storageApi = new StorageApi(SDKConfig.createClient());
            
            var result = storageApi.storagePut(APP_KEY, tableName, id, data);
            System.out.println("数据更新成功: " + result);
            
        } catch (ApiException e) {
            handleError("更新数据", e);
        }
    }
}
```

## 🔍 错误处理

```java
public class ErrorHandler {
    
    public static void handleError(String operation, ApiException e) {
        System.err.println("❌ 操作失败: " + operation);
        System.err.println("HTTP状态码: " + e.getCode());
        System.err.println("错误详情: " + e.getResponseBody());
        System.err.println("响应头: " + e.getResponseHeaders());
        
        // 根据状态码进行不同处理
        switch (e.getCode()) {
            case 400:
                System.err.println("💡 请求参数错误，请检查输入数据");
                break;
            case 401:
                System.err.println("💡 认证失败，请检查APP_KEY或访问令牌");
                break;
            case 403:
                System.err.println("💡 权限不足，请联系管理员");
                break;
            case 404:
                System.err.println("💡 请求的资源不存在");
                break;
            case 429:
                System.err.println("💡 请求太频繁，请稍后重试");
                break;
            case 500:
                System.err.println("💡 服务器内部错误，请稍后重试或联系技术支持");
                break;
            default:
                System.err.println("💡 未知错误，请检查网络连接");
        }
    }
    
    // 带重试机制的请求执行
    public static <T> T executeWithRetry(Callable<T> operation, int maxRetries) {
        int attempts = 0;
        while (attempts < maxRetries) {
            try {
                return operation.call();
            } catch (ApiException e) {
                attempts++;
                if (attempts >= maxRetries) {
                    throw e;
                }
                
                System.out.println("⏳ 重试第 " + attempts + " 次...");
                try {
                    Thread.sleep(1000 * attempts); // 递增延迟
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException(ie);
                }
            }
        }
        return null;
    }
}
```

## ❓ 常见问题

### Q: 如何获取APP_KEY？
**A:** 登录开发者控制台，在应用管理页面可以查看和管理您的APP_KEY。

### Q: 支持哪些Java版本？
**A:** 支持Java 8及以上版本，推荐使用Java 11或更高版本。

### Q: 如何处理网络超时？
**A:** 可以通过ApiClient配置超时时间：
```java
client.setConnectTimeout(30000); // 连接超时
client.setReadTimeout(60000);    // 读取超时
```

### Q: 是否支持异步调用？
**A:** 每个API方法都有对应的异步版本，方法名以`...WithHttpInfo`结尾。

### Q: 如何在生产环境中使用？
**A:** 建议：
- 关闭调试模式：`client.setDebugging(false)`
- 配置合理的超时时间
- 实现完善的错误处理和重试机制
- 使用连接池复用连接

## 📚 完整API参考

### 🔐 认证与授权

| API类 | 主要方法 | 功能说明 |
|-------|----------|----------|
| **AccessTokenApi** | `accessTokenPost` | 创建访问令牌 |
| | `accessTokenDelete` | 删除访问令牌 |
| | `accessTokens` | 获取令牌列表 |
| | `accessTokenPut` | 更新令牌 |
| **OAuthApi** | `oAuthAuthorize` | 获取访问令牌 |
| | `oAuthGrantCode` | 获取授权码 |
| | `oAuthProfile` | 获取用户资料 |
| | `oAuthConsents` | 获取授权记录 |

### 👤 用户管理

| API类 | 主要方法 | 功能说明 |
|-------|----------|----------|
| **UserApi** | `userSignUp` | 用户注册 |
| | `userSignIn` | 密码登录 |
| | `userEmailSignIn` | 邮箱登录 |
| | `userPhoneSignIn` | 手机登录 |
| | `userProfile` | 获取个人资料 |
| | `userUpdateProfile` | 更新个人资料 |
| | `userResetPwd` | 重置密码 |
| | `userSendSMSCode` | 发送短信验证码 |
| | `userSendEmailCode` | 发送邮箱验证码 |

### 👥 社交功能

| API类 | 主要方法 | 功能说明 |
|-------|----------|----------|
| **UserFriendsApi** | `userFollowUser` | 关注用户 |
| | `userUnfollowUser` | 取消关注 |
| | `userFollowers` | 获取粉丝列表 |
| | `userFollowing` | 获取关注列表 |
| | `userFriendsNearBy` | 推荐附近用户 |
| | `userCommonInterests` | 推荐相似兴趣用户 |

### 💰 支付与订单

| API类 | 主要方法 | 功能说明 |
|-------|----------|----------|
| **AlipayApi** | `alipayCreateOrder` | 创建当面付订单 |
| | `alipayCreateOrderPagePay` | 创建PC支付订单 |
| | `alipayCreateOrderWapPay` | 创建手机网站支付 |
| | `alipayOrderDetail` | 获取订单详情 |
| | `alipayOrderRefund` | 发起订单退款 |
| **OrderApi** | `orderCreate` | 创建订单 |
| | `orders` | 获取订单列表 |
| | `order` | 获取订单详情 |

### 📁 文件管理

| API类 | 主要方法 | 功能说明 |
|-------|----------|----------|
| **FileApi** | `fileUpload` | 上传文件 |
| | `files` | 获取文件列表 |
| | `fileCreateFolder` | 创建文件夹 |
| | `fileRename` | 重命名文件/文件夹 |
| | `fileDelete` | 删除文件/文件夹 |

### 🗄️ 数据存储

| API类 | 主要方法 | 功能说明 |
|-------|----------|----------|
| **StorageApi** | `storagePost` | 添加数据 |
| | `storageList` | 查询数据 |
| | `storageDetail` | 数据详情 |
| | `storagePut` | 更新数据 |
| | `storageDelete` | 删除数据 |
| | `storageAggregate` | 聚合查询 |

### 📱 微信生态

| API类 | 主要方法 | 功能说明 |
|-------|----------|----------|
| **WechatApi** | `wechatJSCode2Session` | 校验小程序登录 |
| | `wechatUserInfo` | 获取公众号用户信息 |
| | `wechatWXACodeGet` | 获取小程序码 |
| | `wechatSubscribeSend` | 发送订阅消息 |
| | `wechatGenerateScheme` | 生成小程序Scheme码 |

### 💎 虚拟币系统

| API类 | 主要方法 | 功能说明 |
|-------|----------|----------|
| **UserCurrencyApi** | `userCurrencies` | 获取用户资产 |
| | `userCurrencyRecharge` | 充值虚拟币 |
| | `userCurrencyConsume` | 消费虚拟币 |
| | `userCurrencyExchange` | 兑换虚拟币 |
| | `userCurrencyTransactions` | 交易记录 |

### 📍 位置服务

| API类 | 主要方法 | 功能说明 |
|-------|----------|----------|
| **UserLocationApi** | `userLocationPost` | 添加位置 |
| | `userLocations` | 获取位置列表 |
| | `userLocation` | 获取位置详情 |
| | `userLocationPut` | 更新位置 |
| | `userLocationDelete` | 删除位置 |

### 🔗 外部账号

| API类 | 主要方法 | 功能说明 |
|-------|----------|----------|
| **ExternalAccountApi** | `userExternalAccountBind` | 绑定外部账号 |
| | `externalAccountSignIn` | 外部账号登录 |
| | `userOAuthAccounts` | 外部账号列表 |
| | `userOAuthAccountsUnBind` | 解除绑定 |

### ℹ️ 应用信息

| API类 | 主要方法 | 功能说明 |
|-------|----------|----------|
| **AppApi** | `appInfo` | 获取应用详情 |
| **DingTalkApi** | `dingTalkUserInfo` | 获取钉钉用户资料 |

---

## 📞 技术支持

遇到问题？我们来帮您解决！

- 📖 **在线文档**: https://doc.zashigaofa.com
- 🐛 **问题反馈**: https://github.com/wz101010/zsgf-java

---

**感谢选择ZSGFSDK！** 🎉

如果这个文档对您有帮助，请给我们一个⭐️！