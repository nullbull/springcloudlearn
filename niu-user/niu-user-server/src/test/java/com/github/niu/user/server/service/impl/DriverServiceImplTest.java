package com.github.niu.user.server.service.impl;

import com.github.niu.common.constants.Constants;
import com.github.niu.user.api.dto.DriverDTO;
import com.github.niu.user.server.models.Driver;
import com.github.niu.user.server.service.IDriverService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/5 11:16
 * @desc
 */
public class DriverServiceImplTest extends BaseTest {

    @Autowired
    IDriverService iDriverService;

    @Test
    public void createDriver() throws Exception {
        DriverDTO driverDTO = new DriverDTO();
        driverDTO.setIdNumber("37152419961230021X");
        driverDTO.setPicture("hhhh");
        driverDTO.setUserId(1555482638465L);
        driverDTO.setPicture("www.baidu.com");
        driverDTO.setLocationMessage("B12-133");
        driverDTO.setSchoolId("201501060814");
        driverDTO.setRealname("张炜婷");
        Assert.assertEquals(1, iDriverService.createDriver(driverDTO));
    }

    @Test
    public void certificationDriver() throws Exception {
        Assert.assertEquals(1, iDriverService.certificationDriver(1555482638465L, Constants.DRIVER_STATUS_ALLOWED));
    }
}
