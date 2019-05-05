package com.github.niu.user.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.niu.user.api.models.vo.AddressVO;
import com.github.niu.user.api.models.dto.AddressDTO;
import com.github.niu.user.server.models.Address;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
public interface IAddressService extends IService<Address> {
    int createAddress(AddressDTO dto) throws Exception;

//    int deleteAddress(@NotNull(message = "id不能为空") Long id) throws Exception;

    List<AddressVO> getByUserId(@NotNull(message = "用户ID不能为空") Long userId) throws Exception;

    int changeStatus(@NotNull Long id, @NotNull Byte status) throws Exception;
}
