package com.github.niu.consumer.service;

import com.github.niu.consumer.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/10 14:57
 * @desc
 */

@FeignClient(name = "niu-server", fallback = UserRemoteHystrix.class)
@Primary
public interface UserRemote {
    @RequestMapping("/user/getUser")
    UserVO getUser() throws Exception;
}
