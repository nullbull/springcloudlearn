package com.github.niu.express.server.service.impl;

import com.github.niu.common.constants.Constants;
import com.github.niu.common.enums.ErrorCodeEnum;
import com.github.niu.common.utils.ParameterAssert;
import com.github.niu.common.utils.SnowFlowerUtils;
import com.github.niu.express.api.models.dto.AddressDTO;
import com.github.niu.express.api.models.vo.AddressVO;
import com.github.niu.express.server.models.Address;
import com.github.niu.express.server.mapper.AddressMapper;
import com.github.niu.express.server.service.IAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.niu.express.server.service.IDormitoryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
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
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {

    @Autowired
    IDormitoryInfoService dormitoryInfoService;
    @Override
    public int createAddress(@NotNull AddressDTO dto) throws Exception {
        String locationName = dormitoryInfoService.getById(dto.getLocationId()).getName();
        Address address = new Address();
        address.setLocationName(locationName);
        address = dto.apply(address);
        if (null == dto.getId()) {
            address.setId(SnowFlowerUtils.createId());
            return baseMapper.insert(address);
        }
        ParameterAssert.isAddressValid(getById(dto.getId()), ErrorCodeEnum.RECORD_NOT_EXIST);
        return baseMapper.updateById(address);
    }

    @Override
    public int deleteAddress(Long id) throws Exception {
        Address address = getById(id);
        ParameterAssert.isAddressValid(address, ErrorCodeEnum.RECORD_NOT_EXIST);
        address.setStatus(Constants.ADDRESS_STATUS_DELETE);
        return baseMapper.updateById(address);
    }

    @Override
    public List<AddressVO> getByUserId(@NotNull(message = "用户ID不能为空") Long userId) throws Exception {
        return baseMapper.selectByUserId(userId);
    }


}
