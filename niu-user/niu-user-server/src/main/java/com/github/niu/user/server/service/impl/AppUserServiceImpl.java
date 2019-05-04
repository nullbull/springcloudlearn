package com.github.niu.user.server.service.impl;

import com.github.niu.common.enums.ErrorCodeEnum;
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
            return baseMapper.insert(appUser);
        } else {
            AppUser temp = baseMapper.selectById(dto.getId());
            ParameterAssert.isUserValid(temp, ErrorCodeEnum.RECORD_NOT_EXIST);
            temp = dto.apply(temp);
            return baseMapper.updateById(temp);
        }
    }
}
