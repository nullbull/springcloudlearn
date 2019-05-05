package com.github.niu.user.server.service.impl;

import com.github.niu.common.constants.Constants;
import com.github.niu.common.exceptions.DriverException;
import com.github.niu.common.utils.ParameterAssert;
import com.github.niu.user.api.dto.DriverDTO;
import com.github.niu.user.server.mapper.AppUserMapper;
import com.github.niu.user.server.models.Driver;
import com.github.niu.user.server.mapper.DriverMapper;
import com.github.niu.user.server.service.IAppUserService;
import com.github.niu.user.server.service.IDriverService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
@Service
public class DriverServiceImpl extends ServiceImpl<DriverMapper, Driver> implements IDriverService {

    @Autowired
    IAppUserService userService;
    @Override
    public int createDriver(DriverDTO dto) throws Exception {
        Driver driver = new Driver();
        driver = dto.apply(driver);
        driver.setStatus(Constants.DRIVER_STATUS_NEW);
        driver.setCreateAt(new Date());
        return baseMapper.insert(driver);
    }

    @Override
    public int certificationDriver(Long id, Byte status) throws Exception {
        Driver driver = getById(id);
        ParameterAssert.isDriverValid(driver);
        if (Constants.DRIVER_STATUS_ALLOWED.equals(status) || Constants.DRIVER_STATUS_FORBIDDEN.equals(status)) {
            driver.setStatus(status);
            baseMapper.updateById(driver);
            return userService.changeUserType(id, status);
        }
        throw new DriverException("未知操作");
    }
}
