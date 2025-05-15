

# ServiceItem

服务配置项实体，用于定义和管理服务相关的配置信息。

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | 服务配置项的唯一标识符。 |  [optional] |
|**bizCode** | **String** | 服务配置项所属的业务代码，用于分类管理。 |  [optional] |
|**providerCode** | **String** | 关联的服务商代码，用于标识提供该配置项的服务商。 |  [optional] |
|**groupCode** | **String** | 服务配置项所属的功能分组代码，用于组织和管理相关配置项。 |  [optional] |
|**name** | **String** | 服务配置项的名称，用于描述其功能或用途。 |  [optional] |
|**code** | **String** | 服务配置项的唯一代码，用于系统内部标识。 |  [optional] |
|**valueType** | **String** | 服务配置项的值类型，例如 &#39;text&#39;, &#39;number&#39;, &#39;boolean&#39; 等。默认为 &#39;text&#39;。 |  [optional] |
|**icon** | **String** | 服务配置项的图标URL或路径，用于在界面上显示。 |  [optional] |
|**valueDefaults** | **String** | 服务配置项的默认值，当未设置具体值时使用。 |  [optional] |
|**description** | **String** | 服务配置项的详细描述信息，用于说明其用途和配置方法。 |  [optional] |
|**tags** | **String** | 用于分类或标记服务配置项的标签。 |  [optional] |
|**isSystem** | **Boolean** | 指示该配置项是否为系统级别的配置项，默认为 false。 |  [optional] |
|**show** | **Boolean** | 指示服务配置项是否在界面上显示，默认为 true。 |  [optional] |
|**showIndex** | **Integer** | 服务配置项在界面上的显示顺序。 |  [optional] |
|**createDate** | **OffsetDateTime** | 服务配置项的创建日期，默认为当前时间。 |  [optional] |
|**lastUpdate** | **OffsetDateTime** | 服务配置项的最后更新日期，默认为当前时间。 |  [optional] |



