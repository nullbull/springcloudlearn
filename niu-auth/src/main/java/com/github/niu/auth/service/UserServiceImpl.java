package com.github.niu.auth.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/4 18:36
 * @desc
 */
@Service("myUserServiceImpl")
public class UserServiceImpl implements UserDetailsService {
    private final static Set<User> userList = new HashSet<>();
    static {
        userList.add(new User("test", "$2a$10$jxHbVz96AK41jtyIzBzHSuC5HmnGv0D5qU6olXRHQu61KuOUxQtBe", Collections.emptySet()));
    }
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> user = userList.stream().filter(u -> u.getUsername().equals(s)).findFirst();
        if (!user.isPresent()) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        else {
            return user.get();
        }
    }
}
