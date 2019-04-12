package com.github.niu.auth.common;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/10 15:52
 * @desc
 */
public class CommonUtil {
    public static BCryptPasswordEncoder bc = new BCryptPasswordEncoder();

    public static String bcrEncode(String password) {
        return bc.encode(password);
    }
}
