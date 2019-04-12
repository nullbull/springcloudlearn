package com.github.niu.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/4 17:53
 * @desc
 */
@EnableFeignClients("com.github.niu")
@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.github.niu")
public class OatuhApplication {
    public static void main(String[] args) {
        SpringApplication.run(OatuhApplication.class, args);
    }
}
