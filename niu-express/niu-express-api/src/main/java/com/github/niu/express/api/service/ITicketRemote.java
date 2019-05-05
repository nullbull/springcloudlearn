package com.github.niu.express.api.service;

import com.github.niu.express.api.models.dto.TicketDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/5 21:15
 * @desc
 */
@RequestMapping("/ticket")
@FeignClient("niu-express")
public interface ITicketRemote {

    @RequestMapping("/add")
    int create(@RequestBody TicketDTO dto) throws Exception;

    @RequestMapping("/finished/{id}")
    int finished(@PathVariable("id") Long id) throws Exception;

    @RequestMapping("/cancel/{id}")
    int cancel(@PathVariable("id") Long id) throws Exception;
}
