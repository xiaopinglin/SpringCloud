package com.cznx.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：linxiaoping
 * @description： 用户服务
 * @date ：2020/3/15 19:39
 */
@RestController
@RequestMapping(value = "/user")
@Api("用户服务")
public class UserServerController {

    @ApiOperation(value = "通过用户ID获取用户信息")
    @ApiImplicitParam(name = "userId",value = "U0000126962",dataType = "String")
    @PostMapping(value = "/getUserInfoByUserId")
    public void getUserInfoByUserId(String userId){


    }
}
