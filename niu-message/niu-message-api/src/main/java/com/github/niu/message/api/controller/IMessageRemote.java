package com.github.niu.message.api.controller;

import com.github.niu.message.api.models.PickMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/25 18:32
 * @desc
 */
@FeignClient(name = "niu-message", fallback = MessageRemoteHystrix.class)
public interface IMessageRemote {
    @RequestMapping("/message/send")
    boolean send(PickMessage message) throws Exception;
}
