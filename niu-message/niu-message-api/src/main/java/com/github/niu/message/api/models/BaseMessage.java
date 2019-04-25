package com.github.niu.message.api.models;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/25 17:47
 * @desc
 */
@Data
public class BaseMessage {
    @NotNull(message = "内容不能为空")
    String message;

    @NotNull(message = "时间不能为空")
    String date;
}
