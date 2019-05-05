package com.github.niu.user.api.dto;

import com.github.niu.common.constants.Magic;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/4 10:40
 * @desc
 */
@Data
public class AppUserDTO implements Magic {

    private Long id;

    @NotNull(message = "微信昵称不能为空")
    private String nickname;

    @NotNull(message = "性别不能为空")
    private Byte sex;

    @NotNull(message = "头像地址不能为空")
    private String iconUrl;
    @NotNull(message = "手机号不能为空")
    private String phone;

    private String content;

    private Integer point;
    @NotNull(message = "微信id不能为空")
    private String openid;

    private Date lastLogin;

    private String loginIp;

}
