package com.github.niu.user.server.controller;


import com.github.niu.common.constants.Constants;
import com.github.niu.user.api.models.dto.AppUserDTO;
import com.github.niu.user.server.service.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
@RestController
@RequestMapping("/appUser")
public class AppUserController {
    @Autowired
    IAppUserService appUserService;

    @RequestMapping("/add")
    public int add(@Valid @RequestBody AppUserDTO dto) throws Exception {
        return appUserService.createUser(dto);
    }

    @RequestMapping("/toDriver/{id}")
    public int changToDriver(@PathVariable("id") Long id) throws Exception {
        return appUserService.changeUserType(id, Constants.USER_TYPE_DRIVER);
    }



}

