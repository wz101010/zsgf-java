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
import com.zashigaofa.client.model.AuthorizePolicy;
import com.zashigaofa.client.model.AuthorizePolicyApiResponse;
import com.zashigaofa.client.model.AuthorizePolicyListApiResponse;
import com.zashigaofa.client.model.BooleanApiResponse;
import com.zashigaofa.client.model.CreatePostResultApiResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for AuthorizePolicyApi
 */
@Disabled
public class AuthorizePolicyApiTest {

    private final AuthorizePolicyApi api = new AuthorizePolicyApi();

    
    /**
     * 获取鉴权策略列表
     *
     * 根据鉴权类型和策略名称获取鉴权策略列表
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizePoliciesTest() throws ApiException {
        String appKey = null;
        String authType = null;
        String policyName = null;
        AuthorizePolicyListApiResponse response = 
        api.authorizePolicies(appKey, authType, policyName);
        
        // TODO: test validations
    }
    
    /**
     * 获取鉴权策略详情
     *
     * 根据鉴权策略ID获取鉴权策略详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizePolicyTest() throws ApiException {
        Long id = null;
        String appKey = null;
        AuthorizePolicyApiResponse response = 
        api.authorizePolicy(id, appKey);
        
        // TODO: test validations
    }
    
    /**
     * 删除鉴权策略
     *
     * 根据鉴权策略ID删除鉴权策略
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizePolicyDeleteTest() throws ApiException {
        Long id = null;
        String appKey = null;
        BooleanApiResponse response = 
        api.authorizePolicyDelete(id, appKey);
        
        // TODO: test validations
    }
    
    /**
     * 添加鉴权策略
     *
     * 添加新的鉴权策略
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizePolicyPostTest() throws ApiException {
        String appKey = null;
        AuthorizePolicy authorizePolicy = null;
        CreatePostResultApiResponse response = 
        api.authorizePolicyPost(appKey, authorizePolicy);
        
        // TODO: test validations
    }
    
    /**
     * 更新鉴权策略
     *
     * 根据鉴权策略ID更新鉴权策略
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizePolicyPutTest() throws ApiException {
        Long id = null;
        String appKey = null;
        AuthorizePolicy authorizePolicy = null;
        BooleanApiResponse response = 
        api.authorizePolicyPut(id, appKey, authorizePolicy);
        
        // TODO: test validations
    }
    
}
