

# Currency

货币实体，用于表示和管理不同类型的货币信息。

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | 货币的唯一标识符。 |  [optional] |
|**name** | **String** | 货币的名称，例如 &#39;人民币&#39;, &#39;美元&#39; 等。 |  [optional] |
|**code** | **String** | 货币的ISO标准代码，例如 &#39;CNY&#39;, &#39;USD&#39; 等。 |  [optional] |
|**symbol** | **String** | 货币的符号，例如 &#39;$&#39;, &#39;€&#39;, &#39;¥&#39; 等。 |  [optional] |
|**issuer** | **String** | 发行该货币的机构或国家名称。 |  [optional] |
|**currencyType** | **String** | 货币的类型，例如 &#39;法定货币&#39;, &#39;加密货币&#39; 等。 |  [optional] |
|**tags** | **String** | 用于分类或标记货币的标签。 |  [optional] |
|**status** | **Boolean** | 指示货币当前是否可用。 |  [optional] |
|**enableVirtualRecharge** | **Boolean** | 指示该货币是否允许进行虚拟充值。 |  [optional] |
|**enableVirtualConsume** | **Boolean** | 指示该货币是否允许进行虚拟消费。 |  [optional] |
|**description** | **String** | 货币的详细描述信息。 |  [optional] |
|**fiatExchangeRate** | **Long** | 该货币与法定货币的兑换比率。 |  [optional] |
|**fiatDailyRechargeLimit** | **Long** | 每日通过法定货币充值的最大限额。 |  [optional] |
|**totalSupply** | **Long** | 货币的总供应量，0 表示无限制。 |  [optional] |
|**createDate** | **OffsetDateTime** | 货币记录的创建日期，默认为当前时间。 |  [optional] |
|**lastUpdate** | **OffsetDateTime** | 货币记录的最后更新日期，默认为当前时间。 |  [optional] |



