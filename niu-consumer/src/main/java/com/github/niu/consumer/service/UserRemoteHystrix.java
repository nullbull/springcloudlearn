package com.github.niu.consumer.service;

import com.github.niu.consumer.vo.UserVO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/10 15:00
 * @desc
 */
@Component
public class UserRemoteHystrix implements UserRemote {
    @Override
    public UserVO getUser(@PathVariable("userName")String userName) {
        return null;
    }
}
