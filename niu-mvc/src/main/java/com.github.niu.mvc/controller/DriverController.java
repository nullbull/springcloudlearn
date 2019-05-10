package com.github.niu.mvc.controller;

import com.github.niu.user.api.models.dto.DriverDTO;
import com.github.niu.user.api.models.vo.DriverVO;
import com.github.niu.user.api.service.IDriverRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/6 16:48
 * @desc
 */
@RestController
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    private IDriverRemote driverRemote;

    @RequestMapping("/register")
    public int register(@Valid DriverDTO driverDTO) throws Exception {
        return driverRemote.add(driverDTO);
    }

    @RequestMapping("/get/{id}")
    public DriverVO get(@PathVariable("id") Long userId) throws Exception {
        return driverRemote.getById(userId);
    }





}
