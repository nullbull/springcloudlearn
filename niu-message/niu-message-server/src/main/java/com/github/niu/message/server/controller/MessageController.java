package com.github.niu.message.server.controller;

import com.github.niu.message.api.models.PickMessage;
import com.github.niu.message.server.service.ISMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/25 18:24
 * @desc
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    ISMSService ismsService;

    @RequestMapping("/send")
    public boolean send(PickMessage message) throws Exception{
        return ismsService.sendPickMessage(message);
    }
}
