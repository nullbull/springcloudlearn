package com.github.niu.auth;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.jdbc.metadata.HikariDataSourcePoolMetadata;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

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

    @Value("${spring.datasource.driver-class-name}")
    private String driverName;

    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.url}")
    private String url;
}
