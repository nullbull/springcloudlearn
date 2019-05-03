package com.github.niu.express.server.service;

import com.github.niu.express.api.models.dto.AddressDTO;
import com.github.niu.express.api.models.vo.AddressVO;
import com.github.niu.express.server.models.Address;
import com.baomidou.mybatisplus.extension.service.IService;

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

    int deleteAddress(@NotNull(message = "id不能为空") Long id) throws Exception;

    List<AddressVO> getByUserId(@NotNull(message = "用户ID不能为空") Long userId) throws Exception;
}
