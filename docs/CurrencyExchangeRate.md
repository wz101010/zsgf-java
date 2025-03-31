

# CurrencyExchangeRate

货币兑换比率实体，用于表示不同货币之间的兑换关系。

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | 货币兑换比率的唯一标识符。 |  [optional] |
|**fromCurrencyCode** | **String** | 兑换的源货币代码，例如 &#39;USD&#39;。 |  [optional] |
|**toCurrencyCode** | **String** | 兑换的目标货币代码，例如 &#39;CNY&#39;。 |  [optional] |
|**exchangeRate** | **Long** | 从源货币到目标货币的兑换比率。例如，1 USD &#x3D; 6.5 CNY。 |  [optional] |
|**description** | **String** | 兑换比率的详细描述信息。 |  [optional] |
|**createDate** | **OffsetDateTime** | 货币兑换比率的创建日期，默认为当前时间。 |  [optional] |
|**lastUpdate** | **OffsetDateTime** | 货币兑换比率的最后更新日期，默认为当前时间。 |  [optional] |



