package com.github.niu.user.api.service;

import com.github.niu.user.api.models.dto.AddressDTO;
import com.github.niu.user.api.models.vo.AddressVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/5 17:22
 * @desc
 */
@RequestMapping("/address")
@FeignClient("niu-user")
public interface IAddressRemote {

    @RequestMapping("/add")
    int add(@RequestBody AddressDTO dto) throws Exception;

    @RequestMapping("/setDefault/{id}")
    int setDefault(@PathVariable("id") Long id) throws Exception;

    @RequestMapping("/setNormal/{id}")
    int setNormal(@Valid @PathVariable("id") Long id) throws Exception;

    @RequestMapping("/delete/{id}")
    int delete(@Valid @PathVariable("id") Long id) throws Exception;

    @RequestMapping("/list/{id}")
    List<AddressVO> getUserId(@PathVariable("id") @Valid Long id)  throws Exception;
}
