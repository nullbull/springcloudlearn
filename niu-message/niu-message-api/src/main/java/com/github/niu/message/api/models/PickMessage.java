package com.github.niu.message.api.models;

import javax.validation.constraints.NotNull;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/25 17:48
 * @desc
 */
public class PickMessage extends BaseMessage {

    @NotNull(message = "订单id 不能为空")
    private Long orderId;

    @NotNull(message = "发件人昵称不能为空")
    private String needNickname;

    @NotNull(message = "跑腿者id不能为空")
    private String provideNickname;

    @NotNull(message = "跑腿者学号不能为空")
    private Long providerSchoolId;

}
