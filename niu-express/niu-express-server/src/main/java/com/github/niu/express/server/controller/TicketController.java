package com.github.niu.express.server.controller;


import com.alibaba.fastjson.JSON;
import com.github.niu.common.constants.Constants;
import com.github.niu.express.api.models.dto.TicketDTO;
import com.github.niu.express.api.models.vo.PassengerVO;
import com.github.niu.express.api.models.vo.TicketDetailVO;
import com.github.niu.express.api.models.vo.TicketVO;
import com.github.niu.express.server.service.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    ITicketService ticketService;

    @RequestMapping("/add")
    public int create(@RequestBody TicketDTO dto) throws Exception {
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

    @RequestMapping("/getByUserId/{id}")
    public List<TicketVO> getByUserId(@PathVariable("id") Long id) throws Exception {
        return ticketService.getByUserId(id);
    }


    @RequestMapping("/getPassenger/{id}")
    public List<PassengerVO> getByDriverId(@PathVariable("id") Long id) throws Exception {
        return ticketService.getPassenger(id);
    }

    @RequestMapping("/getTicketDetail/{id}")
    public List<TicketDetailVO> getByBoatId(@PathVariable("id") Long id) throws Exception {
        return ticketService.getTicketByBoatId(id);
    }
}

