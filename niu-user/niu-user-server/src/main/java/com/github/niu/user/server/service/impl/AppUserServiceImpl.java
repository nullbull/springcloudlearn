package com.github.niu.user.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.niu.common.constants.Constants;
import com.github.niu.common.enums.ErrorCodeEnum;
import com.github.niu.common.exceptions.UserException;
import com.github.niu.common.utils.ParameterAssert;
import com.github.niu.common.utils.SnowFlowerUtils;
import com.github.niu.user.api.models.dto.AppUserDTO;
import com.github.niu.user.api.models.vo.AppUserVO;
import com.github.niu.user.server.models.AppUser;
import com.github.niu.user.server.mapper.AppUserMapper;
import com.github.niu.user.server.service.IAppUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

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


    @Autowired
    AppUserMapper appUserMapper;
    @Override
    public AppUserVO createUser(AppUserDTO dto) throws Exception {
        if (null == dto.getId()) {
            AppUser appUser = new AppUser();
            AppUser temp = baseMapper.selectOne(new QueryWrapper<AppUser>().lambda().eq(AppUser::getOpenid, dto.getOpenid()));
            if (null != temp) {
                throw new UserException("已注册");
            }
            appUser = dto.apply(appUser);
            appUser.setId(SnowFlowerUtils.createId());
            appUser.setCreateAt(new Date());
            appUser.setType(Constants.USER_TYPE_NORMAL);
            ParameterAssert.isSuccess(baseMapper.insert(appUser));
            return appUser.apply(new AppUserVO());
        } else {
            AppUser temp = baseMapper.selectById(dto.getId());
            ParameterAssert.isUserValid(temp, ErrorCodeEnum.RECORD_NOT_EXIST);
            temp = dto.apply(temp);
            ParameterAssert.isSuccess(baseMapper.updateById(temp));
            return temp.apply(new AppUserVO());
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

    @Override
    public List<AppUserVO> getAll() throws Exception {
        return null;
    }

    @Override
    public AppUserVO getByOpenId(@NotNull String openId) throws Exception {
        AppUser appUser =  appUserMapper.selectOne(new QueryWrapper<AppUser>().eq("openid", openId));
        if (null != appUser) {
            return appUser.apply(new AppUserVO());
        }
        return null;
    }
}
