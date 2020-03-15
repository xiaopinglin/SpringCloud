package com.cznx.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：linxiaoping
 * @description：账户服务
 * @date ：2020/3/15 19:40
 */
@RestController
@RequestMapping(value = "/account")
@Api(value = "账户服务")
public class AccountServerController {


    @ApiOperation(value = "通过用户ID获取账户信息")
    @ApiImplicitParam(name = "userId",value = "U0000126962",dataType = "String")
    @PostMapping(value = "/getAccountInfoByUserId")
    public void getAccountInfoByUserId(String userId){

    }
}
