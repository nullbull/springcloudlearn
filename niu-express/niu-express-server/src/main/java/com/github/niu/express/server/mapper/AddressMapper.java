package com.github.niu.express.server.mapper;

import com.github.niu.express.api.models.vo.AddressVO;
import com.github.niu.express.server.models.Address;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
    List<AddressVO> selectByUserId(@Param("userId")Long id);
}
