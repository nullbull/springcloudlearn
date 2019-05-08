package com.github.niu.mvc.controller;

import com.github.niu.common.constants.ReturnData;
import com.github.niu.express.api.models.dto.TicketDTO;
import com.github.niu.express.api.service.ITicketRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/6 16:51
 * @desc
 */
@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    ITicketRemote ticketRemote;

    @RequestMapping("/create")
    public int create(@Valid TicketDTO dto) throws Exception {
        return ticketRemote.create(dto);
    }

    @RequestMapping("/getTicket/{id}")
    public ReturnData getTicket(@PathVariable("id") Long userId) throws Exception {
        return ReturnData.SUCCESS(ticketRemote.getByUserId(userId));
    }
//    @RequestMapping("/finished/{id}")
//    public int finished(@PathVariable("id") Long id) throws Exception {
//
//    }
}
