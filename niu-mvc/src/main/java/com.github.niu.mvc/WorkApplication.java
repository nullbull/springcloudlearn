package com.github.niu.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/4 19:49
 * @desc
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.github.niu")
public class WorkApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorkApplication.class, args);
    }
}
