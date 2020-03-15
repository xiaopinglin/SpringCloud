package com.cznx.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：linxiaoping
 * @description： BPMN 服务
 * @date ：2020/3/15 20:22
 */
@RestController
@RequestMapping(value = "/bpmn")
@Api("BPMN 服务")
public class BpmnController {


    @Autowired
    private RuntimeService runtimeService;

    @ApiOperation(value = "开启工作流")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "processId",value = "",dataType = "String"),
    })
    @RequestMapping(value = "/start")
    public void startWorkflow(String processId,Object params){

        // object == > Map
        Map<String,Object> vars = new HashMap<>();

        ProcessInstance instance = runtimeService.startProcessInstanceByKey(processId,vars);
        if(instance != null){
            // 发起成功
        }else{
            // 发起失败
        }

    }
}
