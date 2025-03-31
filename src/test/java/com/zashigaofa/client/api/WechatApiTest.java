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
import java.io.File;
import com.zashigaofa.client.model.StringApiResponse;
import com.zashigaofa.client.model.WechatJSConfigResultApiResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for WechatApi
 */
@Disabled
public class WechatApiTest {

    private final WechatApi api = new WechatApi();

    
    /**
     * 小程序-解密数据
     *
     * 解密小程序加密数据
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wechatDecryptTest() throws ApiException {
        String appKey = null;
        String encryptedData = null;
        String iv = null;
        String sessionKey = null;
        StringApiResponse response = 
        api.wechatDecrypt(appKey, encryptedData, iv, sessionKey);
        
        // TODO: test validations
    }
    
    /**
     * 小程序-生成scheme码(该接口用于获取小程序 scheme 码，适用于短信、邮件、外部网页、微信内等拉起小程序的业务场景)
     *
     * 生成小程序的scheme码
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wechatGenerateSchemeTest() throws ApiException {
        String appKey = null;
        Object body = null;
        StringApiResponse response = 
        api.wechatGenerateScheme(appKey, body);
        
        // TODO: test validations
    }
    
    /**
     * 小程序-登录凭证校验
     *
     * 校验小程序登录凭证
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wechatJSCode2SessionTest() throws ApiException {
        String appKey = null;
        String jsCode = null;
        StringApiResponse response = 
        api.wechatJSCode2Session(appKey, jsCode);
        
        // TODO: test validations
    }
    
    /**
     * 公众号H5-JS SDK Config
     *
     * 获取公众号H5的JS SDK配置
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wechatJSConfigTest() throws ApiException {
        String appKey = null;
        String url = null;
        WechatJSConfigResultApiResponse response = 
        api.wechatJSConfig(appKey, url);
        
        // TODO: test validations
    }
    
    /**
     * 公众号H5-发送一次性订阅消息
     *
     * 发送公众号H5一次性订阅消息
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wechatSubscribeMSGTest() throws ApiException {
        String appKey = null;
        Object body = null;
        StringApiResponse response = 
        api.wechatSubscribeMSG(appKey, body);
        
        // TODO: test validations
    }
    
    /**
     * 小程序-发送订阅消息
     *
     * 发送小程序订阅消息
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wechatSubscribeSendTest() throws ApiException {
        String appKey = null;
        Object body = null;
        StringApiResponse response = 
        api.wechatSubscribeSend(appKey, body);
        
        // TODO: test validations
    }
    
    /**
     * 小程序-生成网页跳转地址(获取小程序 URL Link，适用于短信、邮件、网页、微信内等拉起小程序的业务场景)
     *
     * 生成小程序的网页跳转地址
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wechatUrlLinkGenerateTest() throws ApiException {
        String appKey = null;
        Object body = null;
        StringApiResponse response = 
        api.wechatUrlLinkGenerate(appKey, body);
        
        // TODO: test validations
    }
    
    /**
     * 公众号H5-获取用户UnionID
     *
     * 获取公众号H5用户的UnionID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wechatUserInfoTest() throws ApiException {
        String appKey = null;
        String openid = null;
        StringApiResponse response = 
        api.wechatUserInfo(appKey, openid);
        
        // TODO: test validations
    }
    
    /**
     * 小程序-获取小程序码
     *
     * 获取小程序码
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wechatWXACodeGetTest() throws ApiException {
        String appKey = null;
        Object body = null;
        File response = 
        api.wechatWXACodeGet(appKey, body);
        
        // TODO: test validations
    }
    
    /**
     * 小程序-获取小程序码(无限制)
     *
     * 获取无限制的小程序码
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wechatWXACodeGetUnlimitedTest() throws ApiException {
        String appKey = null;
        Object body = null;
        File response = 
        api.wechatWXACodeGetUnlimited(appKey, body);
        
        // TODO: test validations
    }
    
}
