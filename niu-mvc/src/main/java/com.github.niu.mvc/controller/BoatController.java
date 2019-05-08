package com.github.niu.mvc.controller;

import com.github.niu.common.utils.CommonUtil;
import com.github.niu.common.utils.DateUtil;
import com.github.niu.express.api.models.dto.BoatDTO;
import com.github.niu.express.api.models.dto.BoatQueryDTO;
import com.github.niu.express.api.models.dto.Page;
import com.github.niu.express.api.models.vo.BoatVO;
import com.github.niu.express.api.service.IBoatRemote;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/6 16:53
 * @desc
 */
@RequestMapping("/boat")
@RestController
public class BoatController {

    @Autowired
    IBoatRemote boatRemote;

    @RequestMapping("/create")
    @ResponseBody
    public int create(@Valid BoatDTO boatDTO) throws Exception {
        return boatRemote.add(boatDTO.init());
    }

    @RequestMapping("/query")
    public List<BoatVO> query(HttpServletRequest request) throws Exception {
        BoatQueryDTO dto = new BoatQueryDTO();
        dto.setCompanyId(getByteParameter(request, "companyId"));
        dto.setBeginAt(getDateParam(request, "beginAt"));
        dto.setEndAt(getDateParam(request, "endAt"));
        return boatRemote.list(dto);
    }

//    @RequestMapping("/finished/{id}")
//    public int finished(@PathVariable("id") Long id) throws Exception {
//        return boatRemote.
//
//    }

    @RequestMapping("/getByDriverId/{id}")
    public List<BoatVO> getByDriverId(@PathVariable("id") Long id) throws Exception {
        return boatRemote.getByUserId(id);
    }


    private Byte getByteParameter(HttpServletRequest request, String name) throws Exception {
        String value = request.getParameter(name);
        if (!CommonUtil.validString(value)) {
            return Byte.valueOf(name);
        }
        return null;
    }

    private Date getDateParam(HttpServletRequest request, String key) {
        String date = request.getParameter(key);
        if (StringUtils.isEmpty(date) || StringUtils.isBlank(date)) {
            return null;
        }
        return DateUtil.parseDateTime(date);
    }
}
