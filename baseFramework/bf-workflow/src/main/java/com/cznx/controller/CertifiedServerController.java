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
 * @description： 验证服务
 * @date ：2020/3/15 19:41
 */
@RestController
@RequestMapping(value = "/ceitified")
@Api(value = "验证服务")
public class CertifiedServerController {


    @ApiOperation(value = "验证用户支付密码")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "userId",value = "U0000126962",dataType = "String"),
        @ApiImplicitParam(name = "payPassword",value = "123456",dataType = "String")
    })
    @PostMapping(value = "/checkUserPayPassword")
    public void checkUserPayPassword(String userId,String payPassword){

    }
}
