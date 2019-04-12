package com.github.niu.consumer.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/11 15:24
 * @desc
 */@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloRemoteTest {
    @Autowired
    UserRemote userRemote;
@Test
    public void test() throws Exception {
     System.out.println(userRemote.getUser("zwt"));
    }
}
