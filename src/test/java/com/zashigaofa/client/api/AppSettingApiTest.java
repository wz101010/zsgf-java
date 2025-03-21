/*
 * 全部  API 文档
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.zashigaofa.client.api;

import com.zashigaofa.client.ApiException;
import com.zashigaofa.client.model.AppSetting;
import com.zashigaofa.client.model.JObjectApiResult;
import com.zashigaofa.client.model.ServiceGroup;
import com.zashigaofa.client.model.ServiceItem;
import com.zashigaofa.client.model.ServiceProvider;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for AppSettingApi
 */
@Disabled
public class AppSettingApiTest {

    private final AppSettingApi api = new AppSettingApi();

    
    /**
     * 服务分组详情
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appServiceSettingGroupTest() throws ApiException {
        Long id = null;
        String appKey = null;
        JObjectApiResult response = 
        api.appServiceSettingGroup(id, appKey);
        
        // TODO: test validations
    }
    
    /**
     * 删除服务分组
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appServiceSettingGroupDeleteTest() throws ApiException {
        Long id = null;
        String appKey = null;
        JObjectApiResult response = 
        api.appServiceSettingGroupDelete(id, appKey);
        
        // TODO: test validations
    }
    
    /**
     * 添加服务分组
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appServiceSettingGroupPostTest() throws ApiException {
        String appKey = null;
        ServiceGroup serviceGroup = null;
        JObjectApiResult response = 
        api.appServiceSettingGroupPost(appKey, serviceGroup);
        
        // TODO: test validations
    }
    
    /**
     * 更新服务分组
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appServiceSettingGroupPutTest() throws ApiException {
        Long id = null;
        String appKey = null;
        ServiceGroup serviceGroup = null;
        JObjectApiResult response = 
        api.appServiceSettingGroupPut(id, appKey, serviceGroup);
        
        // TODO: test validations
    }
    
    /**
     * 服务分组
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appServiceSettingGroupsTest() throws ApiException {
        String appKey = null;
        Long providerId = null;
        Boolean showFlag = null;
        JObjectApiResult response = 
        api.appServiceSettingGroups(appKey, providerId, showFlag);
        
        // TODO: test validations
    }
    
    /**
     * 服务配置项详情
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appServiceSettingItemTest() throws ApiException {
        Long id = null;
        String appKey = null;
        JObjectApiResult response = 
        api.appServiceSettingItem(id, appKey);
        
        // TODO: test validations
    }
    
    /**
     * 删除服务配置项
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appServiceSettingItemDeleteTest() throws ApiException {
        Long id = null;
        String appKey = null;
        JObjectApiResult response = 
        api.appServiceSettingItemDelete(id, appKey);
        
        // TODO: test validations
    }
    
    /**
     * 添加服务配置项
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appServiceSettingItemPostTest() throws ApiException {
        String appKey = null;
        ServiceItem serviceItem = null;
        JObjectApiResult response = 
        api.appServiceSettingItemPost(appKey, serviceItem);
        
        // TODO: test validations
    }
    
    /**
     * 更新服务配置项
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appServiceSettingItemPutTest() throws ApiException {
        Long id = null;
        String appKey = null;
        ServiceItem serviceItem = null;
        JObjectApiResult response = 
        api.appServiceSettingItemPut(id, appKey, serviceItem);
        
        // TODO: test validations
    }
    
    /**
     * 服务配置项列表
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appServiceSettingItemsTest() throws ApiException {
        String appKey = null;
        String bizCode = null;
        String providerCode = null;
        String groupCode = null;
        Boolean showFlag = null;
        JObjectApiResult response = 
        api.appServiceSettingItems(appKey, bizCode, providerCode, groupCode, showFlag);
        
        // TODO: test validations
    }
    
    /**
     * 服务商详情
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appServiceSettingProviderTest() throws ApiException {
        Long id = null;
        String appKey = null;
        JObjectApiResult response = 
        api.appServiceSettingProvider(id, appKey);
        
        // TODO: test validations
    }
    
    /**
     * 删除服务商
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appServiceSettingProviderDeleteTest() throws ApiException {
        Long id = null;
        String appKey = null;
        JObjectApiResult response = 
        api.appServiceSettingProviderDelete(id, appKey);
        
        // TODO: test validations
    }
    
    /**
     * 添加服务商
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appServiceSettingProviderPostTest() throws ApiException {
        String appKey = null;
        ServiceProvider serviceProvider = null;
        JObjectApiResult response = 
        api.appServiceSettingProviderPost(appKey, serviceProvider);
        
        // TODO: test validations
    }
    
    /**
     * 更新服务商
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appServiceSettingProviderPutTest() throws ApiException {
        Long id = null;
        String appKey = null;
        ServiceProvider serviceProvider = null;
        JObjectApiResult response = 
        api.appServiceSettingProviderPut(id, appKey, serviceProvider);
        
        // TODO: test validations
    }
    
    /**
     * 服务商列表
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appServiceSettingProvidersTest() throws ApiException {
        String appKey = null;
        String bizCode = null;
        Boolean showFlag = null;
        JObjectApiResult response = 
        api.appServiceSettingProviders(appKey, bizCode, showFlag);
        
        // TODO: test validations
    }
    
    /**
     * 配置详情
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appSettingTest() throws ApiException {
        Long id = null;
        String appKey = null;
        JObjectApiResult response = 
        api.appSetting(id, appKey);
        
        // TODO: test validations
    }
    
    /**
     * 删除配置
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appSettingDeleteTest() throws ApiException {
        Long id = null;
        String appKey = null;
        JObjectApiResult response = 
        api.appSettingDelete(id, appKey);
        
        // TODO: test validations
    }
    
    /**
     * 增加配置
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appSettingPostTest() throws ApiException {
        String appKey = null;
        AppSetting appSetting = null;
        JObjectApiResult response = 
        api.appSettingPost(appKey, appSetting);
        
        // TODO: test validations
    }
    
    /**
     * 更新配置
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appSettingPutTest() throws ApiException {
        Long id = null;
        String appKey = null;
        AppSetting appSetting = null;
        JObjectApiResult response = 
        api.appSettingPut(id, appKey, appSetting);
        
        // TODO: test validations
    }
    
    /**
     * 配置列表
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appSettingsTest() throws ApiException {
        String appKey = null;
        String providerCode = null;
        String groupCode = null;
        String tag = null;
        String code = null;
        JObjectApiResult response = 
        api.appSettings(appKey, providerCode, groupCode, tag, code);
        
        // TODO: test validations
    }
    
}
