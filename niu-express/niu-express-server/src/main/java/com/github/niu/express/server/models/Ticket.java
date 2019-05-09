package com.github.niu.express.server.models;

import com.baomidou.mybatisplus.annotation.TableId;
import com.github.niu.common.constants.Magic;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
@Data
public class Ticket implements Serializable, Magic {

    private static final long serialVersionUID = 1L;

    @TableId
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

    private Date createAt;

    private Date updateAt;

    private String content;
}
