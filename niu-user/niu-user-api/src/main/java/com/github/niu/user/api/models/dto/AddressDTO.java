package com.github.niu.user.api.models.dto;

import com.github.niu.common.constants.Magic;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/3 14:46
 * @desc
 */
@Data
public class AddressDTO implements Magic {

    private Long id;

    @NotNull(message = "用户ID不能为空")
    private Long userId;

    @NotNull(message = "收件人不能为空")
    private String leaveName;

    @NotNull(message = "手机号不能为空")
    private String leavePhone;

    @NotNull(message = "宿舍区域不能为空")
    private Byte locationId;

    @NotNull(message = "状态不能为空")
    private Byte status;

    private String detail;
}
