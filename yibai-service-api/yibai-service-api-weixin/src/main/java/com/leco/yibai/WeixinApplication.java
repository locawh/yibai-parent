package com.leco.yibai;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <h1>微信服务</h1>
 *
 * @author wangheng
 * @version 1.0
 * @date 2020-02-21 23:26
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2Doc
public class WeixinApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeixinApplication.class, args);
    }

}
