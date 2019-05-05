package com.github.niu.user.api.vo;

import com.github.niu.common.constants.Magic;
import lombok.Data;

import java.util.Date;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/5 10:17
 * @desc
 */
@Data
public class AppUserVO implements Magic {
    private Long id;

    private String nickname;

    private Byte sex;

    private String iconUrl;

    private String phone;

    private String desc;

    private Integer point;

    private String openid;

    private Date lastLogin;

    private String loginIp;

    private Date createAt;

    private Date updateAt;

    private Byte type;
}
