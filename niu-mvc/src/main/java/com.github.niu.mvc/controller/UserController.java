package com.github.niu.mvc.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.niu.common.constants.Constants;
import com.github.niu.common.utils.HttpClientUtil;
import com.github.niu.mvc.config.RedisUtil;
import com.github.niu.user.api.models.dto.AppUserDTO;
import com.github.niu.user.api.service.IAppUserRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/6 8:26
 * @desc
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${wx.appid}")
    String appId;

    @Value("${wx.appsecret}")
    String appSecret;

    @Autowired
    RedisUtil redisUtil;

    @Autowired
    IAppUserRemote appUserRemote;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public int login(@Valid AppUserDTO dto) throws Exception {
        dto.setOpenid(getOpenId(dto.getCode()));
        return appUserRemote.add(dto);
    }


    private String getOpenId(String code) {
        String openId = (String) redisUtil.get(Constants.WX_CODE_KEY + code);
        if (null != openId) {
            return openId;
        }
        String url = String.format(Constants.WX_URL, code);
        JSONObject jb = JSON.parseObject(HttpClientUtil.doGet(url));
        redisUtil.set(Constants.WX_CODE_KEY + code,  openId = jb.getString("openid"), 5 * 60 * 1000);
        return openId;
    }
}
