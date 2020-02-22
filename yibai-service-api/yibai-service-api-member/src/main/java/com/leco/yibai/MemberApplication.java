package com.leco.yibai;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <h1>会员服务</h1>
 *
 * @author wangheng
 * @version 1.0
 * @date 2020-02-22 00:14
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2Doc
public class MemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }
}
