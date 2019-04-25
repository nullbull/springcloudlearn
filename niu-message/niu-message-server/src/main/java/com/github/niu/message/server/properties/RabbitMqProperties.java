package com.github.niu.message.server.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author niuzhenhao@58.com
 */
@Data
@Component
@ConfigurationProperties(prefix = "rabbit-mq")
public class RabbitMqProperties {
    private String emailExchange;

    private String emailQueue;

    private String exchange;

    private String queue1;

    private String queue2;

    private String smsExchange;

    private String smsQueue;
}
