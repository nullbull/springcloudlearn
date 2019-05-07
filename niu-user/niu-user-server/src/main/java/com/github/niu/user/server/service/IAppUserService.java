package com.github.niu.user.server.service;

import com.github.niu.user.api.models.dto.AppUserDTO;
import com.github.niu.user.api.models.vo.AppUserVO;
import com.github.niu.user.server.models.AppUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sun.istack.internal.NotNull;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
public interface IAppUserService extends IService<AppUser> {
    AppUserVO createUser(AppUserDTO dto) throws Exception;

    int changeUserType(Long id, Byte status) throws Exception;

    List<AppUserVO> getAll() throws Exception;

    AppUserVO getByOpenId(@Valid @NotNull String openId) throws Exception;
}
