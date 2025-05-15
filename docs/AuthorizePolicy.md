

# AuthorizePolicy

鉴权策略实体，用于定义和管理系统的鉴权规则。

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | 鉴权策略的唯一标识符。 |  [optional] |
|**policyName** | **String** | 鉴权策略的名称。根据鉴权类型填写不同的名称：角色类型填写角色名称，用户类型填写用户ID，访问令牌类型填写令牌ID。 |  [optional] |
|**authorizeType** | **String** | 鉴权策略的类型，可选值为 &#39;access_token&#39;, &#39;user&#39;, 或 &#39;role&#39;。 |  [optional] |
|**policyValue** | **String** | 与鉴权策略关联的权限集合，多个权限可以用逗号分隔。 |  [optional] |
|**createDate** | **OffsetDateTime** | 鉴权策略的创建日期，默认为当前时间。 |  [optional] |
|**lastUpdate** | **OffsetDateTime** | 鉴权策略的最后更新日期，默认为当前时间。 |  [optional] |



