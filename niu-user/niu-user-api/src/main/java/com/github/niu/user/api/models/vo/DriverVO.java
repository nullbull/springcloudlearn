package com.github.niu.user.api.models.vo;

import com.github.niu.common.constants.Magic;

import java.util.Date;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/5 12:27
 * @desc
 */
public class DriverVO implements Magic {

    private Long userId;

    private String realname;

    private String idNumber;

    private String schoolId;

    private String locationMessage;

    private String picture;

    private Byte status;

    private Date createAt;
}
