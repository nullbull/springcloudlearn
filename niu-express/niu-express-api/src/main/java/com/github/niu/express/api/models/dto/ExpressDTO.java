package com.github.niu.express.api.models.dto;

import com.github.niu.common.constants.Magic;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Data
@Builder
public class ExpressDTO implements Serializable, Magic {

    private Long id;
    @NotNull(message = "发布者Id不能为空")
    private Long neederId;
    @NotNull(message = "发布者昵称不能为空")
    private String neederNickname;

    @NotNull(message = "价格不能为空")
    private BigDecimal price;

    @NotNull(message = "宿舍区不能为空")
    private Byte locationId;

    private String getCode;

    @NotNull(message = "快递信息昵称不能为空")
    private String getNickname;

    @NotNull(message = "快递类型不能为空")
    private Byte expressType;
    @NotNull(message = "包裹类型不能为空")
    private Byte packageType;

    @NotNull(message = "快递信息之手机尾号不能为空")
    private String getPhone;
}
