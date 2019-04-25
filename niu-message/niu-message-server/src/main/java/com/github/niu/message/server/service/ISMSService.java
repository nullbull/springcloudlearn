package com.github.niu.message.server.service;

import com.github.niu.message.api.models.PickMessage;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/24 10:51
 * @desc
 */
public interface ISMSService {

    boolean sendPickMessage(PickMessage message) throws Exception;
}
