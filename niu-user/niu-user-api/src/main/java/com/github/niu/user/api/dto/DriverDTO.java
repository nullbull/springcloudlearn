package com.github.niu.user.api.dto;

import com.github.niu.common.constants.Magic;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/4 11:14
 * @desc
 */
@Data
public class DriverDTO implements Magic {
    @NotNull(message = "用户id 不能为空")
    private Long userId;

    @NotNull(message = "真实姓名不能为空")
    private String realname;

    @NotNull(message = "身份证号不能为空")
    private String idNumber;

    @NotNull(message = "学号不能为空")
    private String schoolId;

    @NotNull(message = "宿舍信息不能为空")
    private String locationMessage;

    @NotNull(message = "身份证照片不能为空")
    private String picture;

}
