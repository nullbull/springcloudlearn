package com.github.niu.auth.service;

import com.github.niu.auth.common.CommonUtil;
import com.github.niu.consumer.vo.UserVO;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/10 15:11
 * @desc
 */
@Data
public class MyUserDetails implements UserDetails {
    private UserVO user;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.createAuthorityList("USER");
    }

    public MyUserDetails(UserVO user) {
        this.user = user;
    }

    @Override
    public String getPassword() {
        return "{bcrypt}" + user.getPassWord();
    }

    @Override
    public String getUsername() {
        return user.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
