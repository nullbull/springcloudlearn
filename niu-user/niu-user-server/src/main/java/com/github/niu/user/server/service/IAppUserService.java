package com.github.niu.user.server.service;

import com.github.niu.user.api.dto.AppUserDTO;
import com.github.niu.user.api.vo.AppUserVO;
import com.github.niu.user.server.models.AppUser;
import com.baomidou.mybatisplus.extension.service.IService;

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
    int createUser(AppUserDTO dto) throws Exception;

    int changeUserType(Long id, Byte status) throws Exception;

    List<AppUserVO> getAll() throws Exception;
}
