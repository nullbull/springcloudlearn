package com.github.niu.express.api.models.vo;

import com.github.niu.common.constants.Magic;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/7 12:04
 * @desc
 */
@Data
public class TicketVO implements Serializable{
    private Long id;

    private Long boatId;

    private Long userId;

    private BigDecimal price;

    private Byte packageType;

    private Long addressId;

    private Byte expressType;

    private String leavePhone;

    private String leaveName;

    private String code;

    private Byte status;

    private String driverNickname;

    private Date beginAt;

    private Date endAt;

    private Byte boatStatus;

    private String destinationName;

    private String companyName;

    private Byte companyId;

    private String content;

}
