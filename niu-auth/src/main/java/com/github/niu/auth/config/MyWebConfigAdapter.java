package com.github.niu.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/6 12:41
 * @desc
 */
@Configuration
public class MyWebConfigAdapter extends WebSecurityConfigurerAdapter {
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/css/**", "/index")
//                .permitAll()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .successForwardUrl("/login-error")
//                .permitAll();
//    }
}
