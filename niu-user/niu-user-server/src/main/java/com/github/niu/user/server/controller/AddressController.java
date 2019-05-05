package com.github.niu.user.server.controller;


import com.github.niu.common.constants.Constants;
import com.github.niu.user.api.models.dto.AddressDTO;
import com.github.niu.user.api.models.vo.AddressVO;
import com.github.niu.user.server.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author System
 * @since 2019-05-05
 */
@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    IAddressService addressService;

    @RequestMapping("/add")
    public int add(@Valid @RequestBody AddressDTO dto) throws Exception {
        return addressService.createAddress(dto);
    }

    @RequestMapping("/setDefault/{id}")
    public int setDefault(@PathVariable("id") Long id) throws Exception {
        return addressService.changeStatus(id, Constants.ADDRESS_STATUS_DEFAULT);
    }

    @RequestMapping("/setNormal/{id}")
    public int setNormal(@Valid @PathVariable("id") Long id) throws Exception {
        return addressService.changeStatus(id, Constants.ADDRESS_STATUS_SECOND);
    }

    @RequestMapping("/delete/{id}")
    public int delete(@Valid @PathVariable("id") Long id) throws Exception {
        return addressService.changeStatus(id, Constants.ADDRESS_STATUS_DELETE);
    }

    @RequestMapping("/list/{id}")
    public List<AddressVO> getUserId(@PathVariable("id") @Valid Long id)  throws Exception{
        return addressService.getByUserId(id);
    }


}

