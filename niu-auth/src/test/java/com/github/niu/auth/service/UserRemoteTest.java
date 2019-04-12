package com.github.niu.auth.service;

import com.github.niu.consumer.service.UserRemote;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/11 15:00
 * @desc
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRemoteTest {
    @Autowired
    UserRemote userRemote;


    @Test
    public void hhh() throws Exception {
        System.out.println(userRemote.getUser());
    }

}
