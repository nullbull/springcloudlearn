//package com.github.niu.mvc.controller;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import com.github.niu.common.constants.Constants;
//import com.github.niu.common.utils.HttpClientUtil;
//import com.github.niu.user.api.models.dto.AppUserDTO;
//import com.github.niu.user.api.service.IAppUserRemote;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.validation.Valid;
//
///**
// * @author 牛贞昊（niuzhenhao@58.com）
// * @date 2019/5/6 8:26
// * @desc
// */
//@RestController("/user")
//public class UserController {
//
//    @Value("${wx.appid}")
//    String appId;
//
//    @Value("${wx.appsecret}")
//    String appSecret;
//
//    @Autowired
//    IAppUserRemote appUserRemote;
//    @RequestMapping("/login")
//    public String  register(@Valid @RequestBody AppUserDTO dto) {
//
//    }
//
//
//    public String getOpenId(String openId) {
//        String url = String.format(Constants.WX_URL, openId);
//        JSONObject jb = JSON.parseObject(HttpClientUtil.doGet(url));
//        return jb.getString("openid");
//    }
//}
