package com.github.niu.consumer.Controller;

import org.springframework.cloud.netflix.feign.FeignClient;
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
    public String hello(@PathVariable(value = "zz") String zz);
}
