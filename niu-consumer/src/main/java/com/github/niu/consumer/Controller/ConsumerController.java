package com.github.niu.consumer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auth justinniu
 * @Date 2018/12/20
 * @Desc
 */
@RestController
public class ConsumerController {
    @Autowired
    HelloRemote helloRemote;
    @RequestMapping("/hello/{zz}")
    public String test(@PathVariable(value = "zz") String zz) {
        return helloRemote.hello(zz);
    }

    @RequestMapping("/test")
    public String hhh() {
        return "13";
    }
}
