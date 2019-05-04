package com.github.niu.user.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.niu.user.api.vo.AddressVO;
import com.github.niu.user.server.models.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
public interface AddressMapper extends BaseMapper<Address> {
    List<AddressVO> selectByUserId(@Param("userId") Long id);
}
