package com.github.niu.user.server.service.impl;

import com.github.niu.common.constants.Constants;
import com.github.niu.common.enums.ErrorCodeEnum;
import com.github.niu.common.exceptions.UserException;
import com.github.niu.common.utils.ParameterAssert;
import com.github.niu.common.utils.SnowFlowerUtils;
import com.github.niu.user.api.dto.AppUserDTO;
import com.github.niu.user.server.models.AppUser;
import com.github.niu.user.server.mapper.AppUserMapper;
import com.github.niu.user.server.service.IAppUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class AppUserServiceImpl extends ServiceImpl<AppUserMapper, AppUser> implements IAppUserService {

    @Override
    public int createUser(AppUserDTO dto) throws Exception {
        if (null == dto.getId()) {
            AppUser appUser = new AppUser();
            appUser = dto.apply(appUser);
            appUser.setId(SnowFlowerUtils.createId());
            appUser.setCreateAt(new Date());
            appUser.setType(Constants.USER_TYPE_NORMAL);
            return baseMapper.insert(appUser);
        } else {
            AppUser temp = baseMapper.selectById(dto.getId());
            ParameterAssert.isUserValid(temp, ErrorCodeEnum.RECORD_NOT_EXIST);
            temp = dto.apply(temp);
            return baseMapper.updateById(temp);
        }
    }

    @Override
    public int changeUserType(Long id, Byte status) throws Exception {
        AppUser appUser = getById(id);
        ParameterAssert.isUserValid(appUser);
        if (status.equals(Constants.USER_TYPE_NORMAL) || status.equals(Constants.USER_TYPE_DRIVER)) {
            appUser.setType(status);
            return baseMapper.updateById(appUser);
        }
        throw new UserException("未知操作");
    }
}
