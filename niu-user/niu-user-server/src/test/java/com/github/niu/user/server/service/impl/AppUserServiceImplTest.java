package com.github.niu.user.server.service.impl;

import com.github.niu.common.constants.Constants;
import com.github.niu.user.api.models.dto.AppUserDTO;
import com.github.niu.user.server.service.IAppUserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/5 10:25
 * @desc
 */
public class AppUserServiceImplTest extends BaseTest{

    @Autowired
    IAppUserService userService;

    @Test
    public void createUser() throws Exception {
        AppUserDTO appUserDTO  = new AppUserDTO();
        appUserDTO.setContent("hhhha");
        appUserDTO.setAvatarUrl("www.baidu.com");
        appUserDTO.setNickname("张炜婷");
        appUserDTO.setPoint(10);
        appUserDTO.setOpenid("12345568");
        appUserDTO.setPhone("17611233021");
        Assert.assertEquals(1, userService.createUser(appUserDTO));
    }

    @Test
    public void changeUserType() throws Exception {
        Assert.assertEquals(1, userService.changeUserType(1555482638465L, Constants.USER_TYPE_DRIVER));
    }
}
