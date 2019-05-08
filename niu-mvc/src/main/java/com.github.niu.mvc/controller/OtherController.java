package com.github.niu.mvc.controller;

import com.github.niu.common.constants.Constants;
import com.github.niu.common.constants.ReturnData;
import com.github.niu.common.constants.SiteVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/8 6:33
 * @desc
 */
@RestController
@RequestMapping("/other")
public class OtherController {

    @RequestMapping("/getSite")
    public List<SiteVO> getSites() {
        return Constants.siteVOList;
    }
}
