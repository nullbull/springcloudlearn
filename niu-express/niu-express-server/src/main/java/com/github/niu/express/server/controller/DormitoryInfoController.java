package com.github.niu.express.server.controller;


import com.github.niu.common.utils.ParameterAssert;
import com.github.niu.express.server.service.IDormitoryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author System
 * @since 2019-04-13
 */
@RestController
@RequestMapping("/dormitoryInfo")
public class DormitoryInfoController {
    @Autowired
    IDormitoryInfoService dormitoryInfoService;

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable("id") Byte id) throws Exception {
        String name = dormitoryInfoService.getByInfoID(id).getName();
        return name;
    }

}

