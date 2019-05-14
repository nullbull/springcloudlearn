package com.github.niu.express.server.mapper;

import com.github.niu.express.api.models.vo.PassengerVO;
import com.github.niu.express.api.models.vo.TicketDetailVO;
import com.github.niu.express.api.models.vo.TicketVO;
import com.github.niu.express.server.models.Ticket;
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
public interface TicketMapper extends BaseMapper<Ticket> {

    List<TicketVO> selectByUserId(@Param("userId") Long userId);

    List<PassengerVO> selectByDriverId(@Param("userId") Long userId);

    List<TicketDetailVO> selectByBoatId(@Param("boatId") Long boatId);
}
