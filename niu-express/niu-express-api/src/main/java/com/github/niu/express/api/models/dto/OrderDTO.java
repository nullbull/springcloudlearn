package com.github.niu.express.api.models.dto;

import com.github.niu.common.constants.Magic;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/23 14:55
 * @desc
 */
@Data
public class OrderDTO implements Magic {

    @NotNull(message = "订单id 不能为空")
    private Long id;

    @NotNull(message = "跑腿 昵称不能为空")
    private String providerNickname;

    @NotNull(message = "跑腿 id不能为空")
    private Long providerId;

}
