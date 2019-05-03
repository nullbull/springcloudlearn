package com.github.niu.express.server.mapper;

import com.github.niu.express.api.models.dto.BoatQueryDTO;
import com.github.niu.express.api.models.vo.BoatVO;
import com.github.niu.express.server.models.Boat;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
public interface BoatMapper extends BaseMapper<Boat> {

    List<BoatVO> selectByQueryDTO(BoatQueryDTO dto);

    int selectTotalByQueryDTO(BoatQueryDTO dto);
}
