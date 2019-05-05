package com.github.niu.user.server.service.impl;

import com.github.niu.common.constants.Constants;
import com.github.niu.user.api.models.dto.AddressDTO;
import com.github.niu.user.server.mapper.AddressMapper;
import com.github.niu.user.server.service.IAddressService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/5 13:16
 * @desc
 */
public class AddressServiceImplTest extends BaseTest{

    @Autowired
    IAddressService addressService;

    @Autowired
    AddressMapper mapper;
    @Test
    public void createAddress() throws Exception {
        AddressDTO dto = new AddressDTO();
        dto.setLeaveName("牛贞昊");
        dto.setLocationId((byte)18);
        dto.setLeavePhone("7788");
        dto.setStatus(Constants.ADDRESS_STATUS_DEFAULT);
        dto.setUserId(123L);
        Assert.assertEquals(1, addressService.createAddress(dto));
    }

    @Test
    public void getByUserId() throws Exception {
        Assert.assertNotNull(addressService.getByUserId(123L));
    }

    @Test
    public void changeStatus() throws Exception {
        Assert.assertEquals(1, addressService.changeStatus(1555495055684L, Constants.ADDRESS_STATUS_SECOND));
    }
    @Test
    public void test() {
//        mapper.selectByUserId(123L);
//        mapper.hhh();
    }
}
