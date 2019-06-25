package com.github.niu.mvc.controller;

import com.github.niu.common.constants.ReturnData;
import com.github.niu.express.api.models.dto.TicketDTO;
import com.github.niu.express.api.models.vo.PassengerVO;
import com.github.niu.express.api.models.vo.TicketDetailVO;
import com.github.niu.express.api.models.vo.TicketVO;
import com.github.niu.express.api.service.ITicketRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

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
    public List<TicketVO> getTicket(@PathVariable("id") Long userId) throws Exception {
        return ticketRemote.getByUserId(userId);
    }
    @RequestMapping("/end/{id}")
    public int finished(@PathVariable("id") Long id) throws Exception {
        return ticketRemote.finished(id);
    }
    @RequestMapping("/passenger/{id}")
    public List<PassengerVO> getByDriverId(@PathVariable("id") Long id) throws Exception {
        return ticketRemote.getByDriverId(id);
    }


    @RequestMapping("/boatDetail/{id}")
    public List<TicketDetailVO> getByBoatId(@PathVariable("id") Long id) throws Exception {
        return ticketRemote.getByBoatId(id);
    }
}
