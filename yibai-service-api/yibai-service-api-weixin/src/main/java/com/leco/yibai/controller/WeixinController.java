package com.leco.yibai.controller;

import com.leco.yibai.service.IWeixinService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h1>微信接口</h1>
 *
 * @author wangheng
 * @version 1.0
 * @date 2020-02-21 23:36
 */
@Slf4j
@RestController
@Api(tags = "微信接口")
public class WeixinController {

    @Autowired
    private IWeixinService weixinService;

    @ApiOperation(value ="测试接口")
    @GetMapping("/test")
    public String test() {
        log.info("日志输出");
        return weixinService.test();
    }
}
