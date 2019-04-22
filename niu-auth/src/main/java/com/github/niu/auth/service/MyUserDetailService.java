package com.github.niu.auth.service;

import com.github.niu.consumer.service.UserRemote;
import com.github.niu.consumer.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/10 15:03
 * @desc
 */
@Service
@Primary
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private UserRemote userRemote;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException{
        UserVO user = null;
        try {
            user = userRemote.getUser();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (null != user) {
            MyUserDetails userDetails = new MyUserDetails(user);
            return userDetails;
        }
        return null;
    }
}
