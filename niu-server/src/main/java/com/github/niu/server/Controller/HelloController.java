package com.github.niu.server.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auth justinniu
 * @Date 2018/12/20
 * @Desc
 */
@RestController
public class HelloController {
    @RequestMapping("/hello/{zz}")
    public String hello(@PathVariable("zz") String zz) {
        return "hello"  + zz  + "bye";
    }
}
