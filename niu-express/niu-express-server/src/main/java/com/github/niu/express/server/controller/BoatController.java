package com.github.niu.express.server.controller;


import com.github.niu.express.api.models.dto.BoatDTO;
import com.github.niu.express.api.models.dto.BoatQueryDTO;
import com.github.niu.express.api.models.dto.Page;
import com.github.niu.express.api.models.vo.BoatVO;
import com.github.niu.express.server.models.Boat;
import com.github.niu.express.server.service.IBoatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.validation.Valid;
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
@RequestMapping("/boat")
public class BoatController {
    @Autowired
    private IBoatService iBoatService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public int add(@Valid @RequestBody BoatDTO dto)throws Exception {
        return iBoatService.createBoat(dto);
    }

    @RequestMapping("/list")
    public List<BoatVO> list(@RequestBody BoatQueryDTO dto) throws Exception {
        return iBoatService.getByQueryDTO(dto);
    }

    @RequestMapping("/get/{id}")
    public List<BoatVO> getByUserId(@PathVariable("id") Long id) throws Exception {
        return iBoatService.getByUserId(id);
    }

    @RequestMapping("/createOrder")
    public int createOrder(@RequestParam("boatId")Long boatId, @RequestParam("type") Byte type) throws Exception {
        return iBoatService.makeDeal(boatId, type);
    }
}

