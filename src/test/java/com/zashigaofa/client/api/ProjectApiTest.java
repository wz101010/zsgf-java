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
import com.zashigaofa.client.model.JObjectApiResult;
import com.zashigaofa.client.model.Project;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for ProjectApi
 */
@Disabled
public class ProjectApiTest {

    private final ProjectApi api = new ProjectApi();

    
    /**
     * 项目详情
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectTest() throws ApiException {
        Long id = null;
        JObjectApiResult response = 
        api.project(id);
        
        // TODO: test validations
    }
    
    /**
     * 删除项目
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectDeleteTest() throws ApiException {
        Long id = null;
        JObjectApiResult response = 
        api.projectDelete(id);
        
        // TODO: test validations
    }
    
    /**
     * 创建项目
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectPostTest() throws ApiException {
        Project project = null;
        JObjectApiResult response = 
        api.projectPost(project);
        
        // TODO: test validations
    }
    
    /**
     * 更新项目
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectPutTest() throws ApiException {
        String id = null;
        Project project = null;
        JObjectApiResult response = 
        api.projectPut(id, project);
        
        // TODO: test validations
    }
    
    /**
     * 项目列表
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectsTest() throws ApiException {
        Integer skip = null;
        Integer take = null;
        JObjectApiResult response = 
        api.projects(skip, take);
        
        // TODO: test validations
    }
    
}
