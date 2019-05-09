package com.github.niu.express.api.models.dto;

import com.github.niu.common.constants.Magic;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/3 20:17
 * @desc
 */
@Data
public class TicketDTO implements Magic {

    private Long id;

    @NotNull(message = "船次不能为空")
    private Long boatId;

    @NotNull(message = "用户id不能为空")
    private Long userId;

    @NotNull(message = "价格不能为空")
    private BigDecimal price;

    @NotNull(message = "船票类型")
    private Byte packageType;

    @NotNull(message = "地址不能为空")
    private Long addressId;

    @NotNull(message = "快递类型")
    private Byte expressType;

    private String leavePhone;

    private String leaveName;

    @NotNull(message = "取货码")
    private String code;

    private String content;
}
