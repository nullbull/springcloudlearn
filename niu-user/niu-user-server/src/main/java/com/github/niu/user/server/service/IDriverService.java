package com.github.niu.user.server.service;

import com.github.niu.user.api.dto.DriverDTO;
import com.github.niu.user.server.models.Driver;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.validation.constraints.NotNull;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
public interface IDriverService extends IService<Driver> {
    int createDriver(@NotNull DriverDTO dto) throws Exception;

    int certificationDriver(@NotNull Long id, @NotNull Byte status) throws Exception;
}
