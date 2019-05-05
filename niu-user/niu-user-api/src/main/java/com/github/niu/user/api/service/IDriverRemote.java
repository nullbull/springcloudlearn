package com.github.niu.user.api.service;

import com.github.niu.common.constants.Constants;
import com.github.niu.user.api.models.dto.DriverDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/5 21:11
 * @desc
 */
@RequestMapping("/driver")
public interface IDriverRemote {
    @RequestMapping("/add")
    int add(@Valid @RequestBody DriverDTO driverDTO) throws Exception;

    @RequestMapping("/auth/{id}")
    int auth(@PathVariable("id") Long id) throws Exception;

    @RequestMapping("/cancel/{id}")
    int cancel(@PathVariable("id") Long id) throws Exception;
}
