/*
 * 用户全部 API 文档
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
import com.zashigaofa.client.model.BooleanApiResponse;
import com.zashigaofa.client.model.GeoLocationModel;
import com.zashigaofa.client.model.GeoLocationModelApiResponse;
import com.zashigaofa.client.model.UserLocationPostResultApiResponse;
import com.zashigaofa.client.model.UserLocationsResultApiResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for UserLocationApi
 */
@Disabled
public class UserLocationApiTest {

    private final UserLocationApi api = new UserLocationApi();

    
    /**
     * 获取位置详情
     *
     * 根据位置ID获取位置详情
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userLocationTest() throws ApiException {
        Long id = null;
        String appKey = null;
        GeoLocationModelApiResponse response = 
        api.userLocation(id, appKey);
        
        // TODO: test validations
    }
    
    /**
     * 删除位置
     *
     * 根据位置ID删除位置信息
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userLocationDeleteTest() throws ApiException {
        Long id = null;
        String appKey = null;
        BooleanApiResponse response = 
        api.userLocationDelete(id, appKey);
        
        // TODO: test validations
    }
    
    /**
     * 添加位置
     *
     * 添加新的位置信息
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userLocationPostTest() throws ApiException {
        String appKey = null;
        GeoLocationModel geoLocationModel = null;
        UserLocationPostResultApiResponse response = 
        api.userLocationPost(appKey, geoLocationModel);
        
        // TODO: test validations
    }
    
    /**
     * 更新位置
     *
     * 此方法用于更新指定位置ID的位置信息。如果位置不存在，则创建一个新的位置。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userLocationPutTest() throws ApiException {
        Long id = null;
        String appKey = null;
        GeoLocationModel geoLocationModel = null;
        BooleanApiResponse response = 
        api.userLocationPut(id, appKey, geoLocationModel);
        
        // TODO: test validations
    }
    
    /**
     * 获取位置列表
     *
     * 根据条件获取位置列表
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userLocationsTest() throws ApiException {
        String appKey = null;
        String tag = null;
        String type = null;
        Double x = null;
        Double y = null;
        Long sphere = null;
        Integer skip = null;
        Integer take = null;
        UserLocationsResultApiResponse response = 
        api.userLocations(appKey, tag, type, x, y, sphere, skip, take);
        
        // TODO: test validations
    }
    
}
