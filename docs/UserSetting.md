

# UserSetting

用户配置实体，用于存储用户的个性化设置。

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | 用户的唯一标识符。 |  [optional] |
|**userID** | **Long** | 关联的用户ID，表示该配置属于哪个用户。 |  |
|**providerCode** | **String** | 提供商的唯一代码，用于标识服务提供者。 |  [optional] |
|**groupCode** | **String** | 组的唯一代码，用于分类设置项。 |  [optional] |
|**code** | **String** | 设置项的唯一代码或键名，用于标识具体的配置项。 |  |
|**value** | **String** | 设置项的具体值或选项。 |  |
|**tags** | **String** | 用于对设置项进行分类或标记的标签。 |  [optional] |
|**description** | **String** | 设置项的详细描述，说明其作用或用途。 |  [optional] |
|**frontendUsable** | **Boolean** | 指示该设置项是否在前端界面中可用。 |  [optional] |
|**createDate** | **OffsetDateTime** | 设置项的创建时间。 |  [optional] |
|**lastUpdate** | **OffsetDateTime** | 设置项的最后更新时间。 |  [optional] |



