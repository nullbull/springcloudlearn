package com.github.niu.server.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.niu.server.models.User;
import com.github.niu.server.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/11 13:44
 * @desc
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
    @Autowired
    IUserService userService;
    @Test
    public void test() {
        User user = userService.getOne(new QueryWrapper<User>().lambda().eq(User::getUserName, "zwt"));
        System.out.println(user);
    }

}
