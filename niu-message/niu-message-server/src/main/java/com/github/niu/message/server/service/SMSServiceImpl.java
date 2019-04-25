package com.github.niu.message.server.service;

import com.alibaba.fastjson.JSON;
import com.github.niu.common.utils.ParameterAssert;
import com.github.niu.message.api.models.PickMessage;
import com.github.niu.message.server.properties.RabbitMqProperties;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/25 17:56
 * @desc
 */
@Service
public class SMSServiceImpl implements ISMSService{

    @Autowired
    protected AmqpTemplate amqpTemplate;

    @Autowired
    private RabbitMqProperties rabbitProperties;
    @Override
    public boolean sendPickMessage(PickMessage message) throws Exception {
        ParameterAssert.isExpressValid(message, "消息不能为空");
        amqpTemplate.convertAndSend(rabbitProperties.getSmsExchange(), rabbitProperties.getSmsQueue(), JSON.toJSONString(message));
        return true;
    }
}
