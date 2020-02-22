package com.leco.yibai.controller;

import com.leco.yibai.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h1></h1>
 *
 * @author wangheng
 * @version 1.0
 * @date 2020-02-22 00:10
 */
@Slf4j
@RestController
@Api(tags = "会员接口")
public class MemberController {

    @ApiOperation(value = "用户接口测试")
    @GetMapping("/user")
    public User testUser() {
        log.info("用户接口测试!");
        return new User("leco", 12, "男");
    }
}
