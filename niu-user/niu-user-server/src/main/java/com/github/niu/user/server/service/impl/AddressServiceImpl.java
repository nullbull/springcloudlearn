package com.github.niu.user.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.niu.common.constants.Constants;
import com.github.niu.common.enums.ErrorCodeEnum;
import com.github.niu.common.utils.ParameterAssert;
import com.github.niu.common.utils.SnowFlowerUtils;
import com.github.niu.express.api.service.IDormitoryInfoRemote;
import com.github.niu.user.api.models.dto.AddressDTO;
import com.github.niu.user.api.models.vo.AddressVO;
import com.github.niu.user.server.mapper.AddressMapper;
import com.github.niu.user.server.models.Address;
import com.github.niu.user.server.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    IDormitoryInfoRemote dormitoryInfoRemote;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createAddress(@NotNull AddressDTO dto) throws Exception {

        if (null == dto.getId()) {
            String locationName = dormitoryInfoRemote.getNameById(dto.getLocationId());
            Address address = new Address();
            address.setLocationName(locationName);
            address = dto.apply(address);
            address.setId(SnowFlowerUtils.createId());
            //将之前的默认地址设为非默认
            if (Constants.ADDRESS_STATUS_DEFAULT.equals(dto.getStatus())) {
                change(dto.getUserId());
            }
            return baseMapper.insert(address);
        } else  {
            Address temp = getById(dto.getId());
            ParameterAssert.isAddressValid(temp, ErrorCodeEnum.RECORD_NOT_EXIST);
            return baseMapper.updateById(dto.apply(temp));
        }
    }

//    @Override
//    public int deleteAddress(Long id) throws Exception {
//        Address address = getById(id);
//        ParameterAssert.isAddressValid(address, ErrorCodeEnum.RECORD_NOT_EXIST);
//        address.setStatus(Constants.ADDRESS_STATUS_DELETE);
//        return baseMapper.updateById(address);
//    }

    @Override
    public List<AddressVO> getByUserId(@NotNull(message = "用户ID不能为空") Long userId) throws Exception {
        return baseMapper.selectByUserId(userId);
    }

    @Override
    public int changeStatus(@NotNull Long id, @NotNull Byte status) throws Exception {
        Address address = getById(id);
        ParameterAssert.isAddressValid(id, ErrorCodeEnum.RECORD_NOT_EXIST);
        ParameterAssert.isAddressStatusValid(status);
        if (status.equals(Constants.ADDRESS_STATUS_DEFAULT)) {
            change(address.getUserId());
        }
        address.setStatus(status);
        return baseMapper.updateById(address);
    }

    private void change(Long userId) {
        Address temp = baseMapper.selectOne(new QueryWrapper<Address>().lambda()
                .eq(Address::getUserId, userId)
                .eq(Address::getStatus, Constants.ADDRESS_STATUS_DEFAULT));
        if (null != temp) {
            temp.setStatus(Constants.ADDRESS_STATUS_SECOND);
            baseMapper.updateById(temp);
        }
    }


}
