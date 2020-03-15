package com.cznx.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author ：linxiaoping
 * @description： 支付服务
 * @date ：2020/3/15 19:42
 */
@RestController
@RequestMapping(value = "/pay")
@Api("支付服务")
public class PayServerController {

    @ApiOperation(value = "发送消息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId",value = "U0000126962",dataType = "String"),
            @ApiImplicitParam(name = "payAmount",value = "100",dataType = "BigDecimal")
    })
    @PostMapping(value = "/payAmountByUserId")
    public void payAmountByUserId(String userId, BigDecimal payAmount){

    }
}
