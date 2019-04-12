package com.github.niu.server.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.niu.consumer.vo.UserVO;
import com.github.niu.server.models.User;
import com.github.niu.server.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author System
 * @since 2019-04-10
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping("/getUser")
    private UserVO getUser() throws Exception{
        User user = userService.getOne(new QueryWrapper<User>().lambda().eq(User::getUserName, "zwt"));
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userVO, user);
        log.info("zzzzzzzzzzzzzzzz");
        return userVO;
    }
}

