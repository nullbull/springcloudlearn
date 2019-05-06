package com.github.niu.user.server;

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/3 21:37
 * @desc
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.github.niu.express")
@MapperScan(basePackages = "com.github.niu.user.server.mapper")
public class UserApplication {

//
//    @Bean("sqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") @Autowired DataSource dataSource) throws Exception {
//        MybatisSqlSessionFactoryBean sessionFactoryBean = new MybatisSqlSessionFactoryBean();
//        sessionFactoryBean.setDataSource(dataSource);
//        // 配置mapper的扫描，找到所有的mapper.xml映射文件
//        String xmlPath = "classpath:com/github/niu/user/server/mapper/xml/*.xml";
//        Resource[] resources = new PathMatchingResourcePatternResolver().getResources(xmlPath);
//        sessionFactoryBean.setMapperLocations(resources);
//        sessionFactoryBean.setTypeAliasesPackage("com.niu.github.niu.user.server.models");
////        String path = Path.getCurrentPath()+"/config/mybatis-config.xml";
////        sessionFactoryBean.setConfigLocation(new FileSystemResource(path));
//        return sessionFactoryBean.getObject();
//    }
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
