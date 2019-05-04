package com.github.niu.express.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/4 10:20
 * @desc
 */
@FeignClient(name = "niu-express")
public interface IDormitoryInfoRemote {
    @RequestMapping(value = "/dormitoryInfo/get/{id}", method = RequestMethod.GET)
    String getNameById(@PathVariable("id")Byte id) throws Exception;
}
