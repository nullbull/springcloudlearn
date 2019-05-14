package com.github.niu.express.api.models.vo;

import lombok.Data;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/14 16:12
 * @desc
 */
@Data
public class TicketDetailVO extends TicketVO{
    private String addressName;

    private String addressPhone;

    private String addressLocationName;

    private String detail;
}
