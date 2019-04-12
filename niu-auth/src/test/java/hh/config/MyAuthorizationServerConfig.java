//package com.github.niu.auth.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
//import org.springframework.security.oauth2.provider.token.TokenStore;
//import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;
//
//import javax.annotation.Resource;
//
///**
// * @author 牛贞昊（niuzhenhao@58.com）
// * @date 2019/4/4 17:54
// * @desc
// */
//@Configuration
//@EnableAuthorizationServer
//public class MyAuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
//
//    @Autowired
//    private AuthenticationManager manager;
//
//    @Resource(name = "myUserServiceImpl")
//    private UserDetailsService userDetailsService;
//
//    @Autowired
//    private TokenStore tokenStore;
//
//    String SECRET =  "{bcrypt}"+ new BCryptPasswordEncoder().encode("123456");
//
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//        clients.inMemory()
//                .withClient("client")//客户端ID
//                .authorities("oauth2")
//                .authorizedGrantTypes("password", "refresh_token")//设置验证方式
//                .scopes("read", "write")
//                .secret(SECRET)
//                .accessTokenValiditySeconds(10000) //token过期时间
//                .refreshTokenValiditySeconds(10000); //refresh过期时
//    }
//
//    @Override
//    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//        endpoints.tokenStore(tokenStore)
//                .authenticationManager(manager)
//                .userDetailsService(userDetailsService); //配置userService 这样每次认证的时候会去检验用户是否锁定，有效等
//    }
//    @Override
////    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
////        authenticationManagerBuilder.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder());
////    }
//    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
//        security.allowFormAuthenticationForClients();
//        security.passwordEncoder(new BCryptPasswordEncoder());
//    }
//
//    @Bean
//    public TokenStore tokenStore() {
//        //使用内存的tokenStore
//        return new InMemoryTokenStore();
//    }
//
//    @Bean
//    public PasswordEncoder bCryptPasswordEncoder() {
//        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//    }
//    //配置全局设置
//    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        //设置UserDetailsService以及密码规则
//        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
//    }
//
//
//}
