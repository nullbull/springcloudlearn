package com.github.niu.consumer.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auth justinniu
 * @Date 2018/12/21
 * @Desc
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@PathVariable(value = "zz") String zz) {
        return "Controller unable to touch please try it later";
    }
}
