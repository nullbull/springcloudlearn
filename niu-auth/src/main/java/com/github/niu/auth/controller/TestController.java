package com.github.niu.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/6 12:21
 * @desc
 */
@RestController
public class TestController {

    @Autowired
    private TokenStore tokenStore;

    @PostMapping("/bar")
    public String bar(@RequestHeader("Authorization") String auth) {
        UserDetails userDetails = (UserDetails) tokenStore.readAuthentication(auth.split(" ")[1]).getPrincipal();
        User user = new User(userDetails.getUsername(), userDetails.getPassword(), userDetails.getAuthorities());
        return user.getUsername() + ":" + user.getPassword();

    }

}
