package com.github.niu.user.server.service.impl;

import com.github.niu.common.constants.Constants;
import com.github.niu.common.enums.ErrorCodeEnum;
import com.github.niu.common.exceptions.DriverException;
import com.github.niu.common.utils.ParameterAssert;
import com.github.niu.user.api.models.dto.DriverDTO;
import com.github.niu.user.api.models.vo.DriverVO;
import com.github.niu.user.server.models.Driver;
import com.github.niu.user.server.mapper.DriverMapper;
import com.github.niu.user.server.service.IAppUserService;
import com.github.niu.user.server.service.IDriverService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
        if (null != getById(driver.getUserId())) {
            throw new DriverException("您已注册为老司机");
        }
        driver = dto.apply(driver);
        driver.setStatus(Constants.DRIVER_STATUS_NEW);
        driver.setCreateAt(new Date());
        return baseMapper.insert(driver);
    }

    @Override
    public int certificationDriver(Long id, Byte status) throws Exception {
        Driver driver = getById(id);
        ParameterAssert.isDriverValid(driver, ErrorCodeEnum.RECORD_NOT_EXIST);
        if (Constants.DRIVER_STATUS_ALLOWED.equals(status) || Constants.DRIVER_STATUS_FORBIDDEN.equals(status)) {
            driver.setStatus(status);
            baseMapper.updateById(driver);
            return userService.changeUserType(id, status);
        }
        throw new DriverException("未知操作");
    }

    @Override
    public List<DriverVO> getAll() throws Exception {
        return baseMapper.selectList(null).stream().map(d -> {
            try {
                return d.apply(new DriverVO());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;}).collect(Collectors.toList());
    }

    @Override
    public DriverVO getByUserId(Long userId) throws Exception {
        return getById(userId).apply(new DriverVO());
    }
}
