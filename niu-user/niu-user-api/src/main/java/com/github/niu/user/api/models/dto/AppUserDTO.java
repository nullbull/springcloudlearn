package com.github.niu.user.api.models.dto;

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
    private Byte gender;

    @NotNull(message = "头像地址不能为空")
    private String avatarUrl;

    private String phone;

    private String content;

    private Integer point;

    private String openid;

    @NotNull(message = "code 不能为空")
    private String code;

}
