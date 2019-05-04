package com.github.niu.express.server.controller;


import com.github.niu.common.utils.ParameterAssert;
import com.github.niu.express.server.service.IDormitoryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author System
 * @since 2019-04-13
 */
@Controller
@RequestMapping("/dormitoryInfo")
public class DormitoryInfoController {
    @Autowired
    IDormitoryInfoService dormitoryInfoService;

    @RequestMapping("/get/{id}")
    public String getById(@PathVariable("id") Byte id) throws Exception {
        ParameterAssert.isAddressValid(id);
        return dormitoryInfoService.getById(id).getName();
    }

}

