package hh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.bind.annotation.*;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/6 12:21
 * @desc
 */
@RestController
public class TestController {

    @Autowired
    private TokenStore tokenStore;

//    @RequestMapping("/bar")
//    public String bar(@RequestHeader("Authorization") String auth) {
//        UserDetails userDetails = (UserDetails) tokenStore.readAuthentication(auth.split(" ")[1]).getPrincipal();
//        User user = new User(userDetails.getUsername(), userDetails.getPassword(), userDetails.getAuthorities());
//        return user.getUsername() + ":" + user.getPassword();
//    }
    @RequestMapping("/bar/{id}")
    public String bar(@PathVariable("id")int id) {
        return id + "";
    }

}
