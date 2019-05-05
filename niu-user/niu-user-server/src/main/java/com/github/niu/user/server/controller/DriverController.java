package com.github.niu.user.server.controller;


import com.github.niu.common.constants.Constants;
import com.github.niu.user.api.models.dto.DriverDTO;
import com.github.niu.user.server.service.IDriverService;
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
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    IDriverService driverService;

    @RequestMapping("/add")
    public int add(@Valid @RequestBody DriverDTO driverDTO) throws Exception {
        return driverService.createDriver(driverDTO);
    }

    @RequestMapping("/auth/{id}")
    public int auth(@PathVariable("id") Long id) throws Exception {
        return driverService.certificationDriver(id, Constants.DRIVER_STATUS_ALLOWED);
    }

    @RequestMapping("/cancel/{id}")
    public int cancel(@PathVariable("id") Long id) throws Exception {
        return driverService.certificationDriver(id, Constants.DRIVER_STATUS_FORBIDDEN);
    }
}

