package com.github.niu.user.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/3 21:37
 * @desc
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.github.niu")
@MapperScan("com.github.niu")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
