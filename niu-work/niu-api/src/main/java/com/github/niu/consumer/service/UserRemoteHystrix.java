package com.github.niu.consumer.service;

import com.github.niu.consumer.vo.UserVO;
import org.springframework.stereotype.Component;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/10 15:00
 * @desc
 */
@Component
public class UserRemoteHystrix implements UserRemote {

    @Override
    public UserVO getUser() throws Exception {
        return new UserVO();
    }
}
