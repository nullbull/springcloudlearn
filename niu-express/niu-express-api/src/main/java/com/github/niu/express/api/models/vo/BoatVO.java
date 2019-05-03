package com.github.niu.express.api.models.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/3 16:32
 * @desc
 */
@Data
public class BoatVO {
    private Long id;

    private Byte smallCount;

    private Byte normalCount;

    private Byte largeCount;

    private BigDecimal smallPrice;

    private BigDecimal normalPrice;

    private BigDecimal largePrice;

    private Date createAt;

    private Date updateAt;

    private Long driverId;

    private String driverNickname;

    private String desc;

    private Date beginAt;

    private Date endAt;

    private Byte status;

    private String destinationName;

    private String companyName;

    private Byte companyId;

}
