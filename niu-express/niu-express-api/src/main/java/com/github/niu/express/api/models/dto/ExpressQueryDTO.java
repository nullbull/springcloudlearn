package com.github.niu.express.api.models.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/22 18:32
 * @desc
 */
@Data
public class ExpressQueryDTO extends BaseQueryDTO{
    private Date beginTime;

    private Date endTime;

    private Byte expressType;

    private Byte locationId;

    private BigDecimal highPrice;

    private BigDecimal lowPrice;

    private Byte packageType;

}
