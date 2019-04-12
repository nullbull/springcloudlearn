package com.github.niu.auth.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/12 14:37
 * @desc
 */
public class test {
    public static void main(String[] args) {
        BCryptPasswordEncoder bc = new BCryptPasswordEncoder();
//        String password = bc.encode("123456");
        System.out.println(bc.matches("123456", "$2a$10$DtnDFqC4PsZhmwqvpe58o.wcOyMHQta285snvOL75G8A7Nyj3e9fa"));
    }
}
