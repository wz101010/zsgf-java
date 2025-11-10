

# UserAccessToken

用户令牌实体，用于管理用户的访问令牌及其相关信息。

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | 用户令牌的唯一标识符。 |  [optional] |
|**userID** | **Long** | 与令牌关联的用户ID。 |  [optional] |
|**enable** | **Boolean** | 指示令牌是否处于启用状态。 |  [optional] |
|**permissions** | **String** | 令牌拥有的权限列表，多个权限以逗号分隔。 |  [optional] |
|**title** | **String** | 令牌的标题或名称，用于标识令牌。 |  [optional] |
|**accessToken** | **String** | 访问令牌的具体值，用于身份验证。 |  [optional] |
|**tags** | **String** | 用于分类或标记令牌的标签。 |  [optional] |
|**description** | **String** | 令牌的详细描述信息。 |  [optional] |
|**expireTime** | **OffsetDateTime** | 令牌的过期时间，超过该时间令牌将失效。 |  [optional] |
|**createDate** | **OffsetDateTime** | 令牌的创建日期，默认为当前时间。 |  [optional] |
|**lastUpdate** | **OffsetDateTime** | 令牌的最后更新日期，默认为当前时间。 |  [optional] |



