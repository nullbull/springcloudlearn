package com.github.niu.express.server.controller;


import com.github.niu.common.constants.Constants;
import com.github.niu.express.api.models.dto.TicketDTO;
import com.github.niu.express.server.service.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
@Controller
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    ITicketService ticketService;

    @RequestMapping("/add")
    public int create(@RequestParam TicketDTO dto) throws Exception {
        return ticketService.createTicket(dto);
    }
    @RequestMapping("/finished/{id}")
    public int finished(@PathVariable("id") Long id) throws Exception {
        return ticketService.changeStatus(id, Constants.TICKET_STATUS_FINISHED);
    }

    @RequestMapping("/cancel/{id}")
    public int cancel(@PathVariable("id") Long id) throws Exception {
        return ticketService.changeStatus(id, Constants.TICKET_STATUS_CANCEL);
    }
}

