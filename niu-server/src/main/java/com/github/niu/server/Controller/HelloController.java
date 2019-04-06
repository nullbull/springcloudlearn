package com.github.niu.server.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@Slf4j
@RefreshScope

public class HelloController {
    @Value("${niu.test}")
    private String zwt;
    @RequestMapping("/hello/{zz}")
    public String hello(@PathVariable("zz") String zz) {
        log.info("zwt:  >>>>>>>>>>>>> {}", zwt);
        return "hello"  + zz  + "bye";
    }
}
