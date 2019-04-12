package hh.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/6 13:06
 * @desc
 */
public class test {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("test"));
    }
}
