package com.github.niu.express.server.service;

import com.github.niu.express.api.models.dto.TicketDTO;
import com.github.niu.express.api.models.vo.PassengerVO;
import com.github.niu.express.api.models.vo.TicketDetailVO;
import com.github.niu.express.api.models.vo.TicketVO;
import com.github.niu.express.server.models.Ticket;
import com.baomidou.mybatisplus.extension.service.IService;
import org.aspectj.weaver.ast.Not;

import javax.validation.Valid;
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
public interface ITicketService extends IService<Ticket> {

    int createTicket(@NotNull(message = "dto不能为空") TicketDTO dto) throws Exception;

    List<TicketVO> getByUserId(@NotNull(message = "用户id 不能为空") Long userId) throws Exception;

    int changeStatus(@NotNull(message = "船票ID不能为空") Long id, @NotNull(message = "status不能为空") Byte status) throws Exception;

    List<PassengerVO> getPassenger(@NotNull Long id) throws Exception;

    List<TicketDetailVO> getTicketByBoatId(@Valid @NotNull Long id);

}
