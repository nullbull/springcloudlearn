# niu-heo
同学帮快递代送平台，基于SpringCloud开发，前端使用微信小程序https://github.com/nullbull/niu-heo-app-public

项目启动需要配置rabbitmq与redis，当然也要数据库了

项目的启动顺序
1.niu-eureka
2.niu-config
3.niu-express
4.niu-user
5.niu-mvc

### 可能会踩的坑

在bootstrap.yml的配置中，rabbitmq需要配置virtual-host，本地可以采用如下配置

```
 rabbitmq:
    username: root
    password: root
    virtual-host: /zwt
    host: localhost
    port: 5672 
```

如果一点Spring Cloud都不了解，可以在http://www.ityouknow.com/spring-cloud.html学习

至于微信小程序端，自己可以慢慢了解