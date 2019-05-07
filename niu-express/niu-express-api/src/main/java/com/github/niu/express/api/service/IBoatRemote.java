package com.github.niu.express.api.service;

import com.github.niu.express.api.models.dto.BoatDTO;
import com.github.niu.express.api.models.dto.BoatQueryDTO;
import com.github.niu.express.api.models.dto.Page;
import com.github.niu.express.api.models.vo.BoatVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/4 19:43
 * @desc
 */
@FeignClient(name = "niu-express")
@RequestMapping("/boat")
public interface IBoatRemote {
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    int add(@RequestBody BoatDTO dto)throws Exception;

    @RequestMapping("/list")
    Page<BoatVO> list(@RequestBody BoatQueryDTO dto) throws Exception;

    @RequestMapping("/get/{id}")
    List<BoatVO> getByUserId(@PathVariable("id") Long id) throws Exception;
}
