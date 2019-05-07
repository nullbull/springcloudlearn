package com.github.niu.user.api.service;

import com.github.niu.common.constants.Constants;
import com.github.niu.user.api.models.dto.AppUserDTO;
import com.github.niu.user.api.models.vo.AppUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/5 21:00
 * @desc
 */
@RequestMapping("/appUser")
@FeignClient("niu-user")
public interface IAppUserRemote {

    @RequestMapping("/add")
    AppUserVO add(@Valid @RequestBody AppUserDTO dto) throws Exception;

    @RequestMapping("/toDriver/{id}")
    int changToDriver(@PathVariable("id") Long id) throws Exception;

    @RequestMapping("/getByOpenId/{id}")
    AppUserVO getByOpenId(@PathVariable("id") String id) throws Exception;
}
