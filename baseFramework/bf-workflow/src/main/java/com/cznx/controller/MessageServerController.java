package com.cznx.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：linxiaoping
 * @description： 消息服务
 * @date ：2020/3/15 19:43
 */
@RestController
@RequestMapping(value = "/message")
@Api("消息服务")
public class MessageServerController {

    @ApiOperation(value = "发送消息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId",value = "U0000126962",dataType = "String"),
            @ApiImplicitParam(name = "content",value = "消息内容",dataType = "String")
    })
    @PostMapping(value = "/sendMessage")
    public void sendMessage(String userId,String content){

    }
}
