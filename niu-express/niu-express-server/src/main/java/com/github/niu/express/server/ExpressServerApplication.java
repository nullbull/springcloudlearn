package com.github.niu.express.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/13 14:36
 * @desc
 */
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
@MapperScan(basePackages = "com.github.niu.express.server.mapper")
public class ExpressServerApplication {
}
