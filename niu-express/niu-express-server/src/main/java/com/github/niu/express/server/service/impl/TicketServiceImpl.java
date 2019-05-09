package com.github.niu.express.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.niu.common.constants.Constants;
import com.github.niu.common.enums.ErrorCodeEnum;
import com.github.niu.common.exceptions.TicketException;
import com.github.niu.common.utils.ParameterAssert;
import com.github.niu.common.utils.SnowFlowerUtils;
import com.github.niu.express.api.models.dto.TicketDTO;
import com.github.niu.express.api.models.vo.TicketVO;
import com.github.niu.express.server.models.Ticket;
import com.github.niu.express.server.mapper.TicketMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.niu.express.server.service.ITicketService;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
@Service
public class TicketServiceImpl extends ServiceImpl<TicketMapper, Ticket> implements ITicketService {

    @Override
    public int createTicket(TicketDTO dto) throws Exception {
        if (null == dto.getId()) {
            Ticket ticket = new Ticket();
            ticket = dto.apply(ticket);
            ticket.setId(SnowFlowerUtils.createId());
            ticket.setCreateAt(new Date());
            ticket.setStatus(Constants.TICKET_STATUS_NEW);
            return baseMapper.insert(ticket);
        } else {
            Ticket temp = baseMapper.selectById(dto.getId());
            ParameterAssert.isTicketValid(temp, ErrorCodeEnum.RECORD_NOT_EXIST);
            temp = dto.apply(temp);
            temp.setUpdateAt(new Date());
            return baseMapper.updateById(temp);
        }
    }

    @Override
    public List<TicketVO> getByUserId(Long userId) throws Exception {
        return baseMapper.selectByUserId(userId);
//        return baseMapper.selectList(new QueryWrapper<Ticket>().lambda().eq(Ticket::getUserId, userId)).stream().map(
//                t -> {
//                    try {
//                        return t.apply(new TicketVO());
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                    return null; }).collect(Collectors.toList());
    }

    @Override
    public int changeStatus(@NotNull(message = "船票ID不能为空") Long id, Byte status) throws Exception {
        Ticket ticket;
        ParameterAssert.isTicketValid(ticket = getById(id), ErrorCodeEnum.RECORD_NOT_EXIST);
        switch (status) {
            case 2: {
                ticket.setStatus(Constants.TICKET_STATUS_CANCEL);
                break;
            }
            case 3: {
                ticket.setStatus(Constants.TICKET_STATUS_FINISHED);
                break;
            }
            default:
                throw new TicketException("未知操作");
        }
        return baseMapper.updateById(ticket);
    }


}
