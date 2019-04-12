package com.github.niu.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auth justinniu
 * @Date 2018/12/20
 * @Desc
 */
@FeignClient(name = "niu-server", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping("/hello/{zz}")
    String hello(@PathVariable(value = "zz") String zz);
}
