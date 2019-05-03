package com.github.niu.express.server.service;

import com.github.niu.express.server.models.Ticket;
import com.github.niu.express.server.mapper.TicketMapper;
import com.github.niu.express.server.service.ITicketService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
