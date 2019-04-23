package com.github.niu.express.server.models;

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
 * @since 2019-04-22
 */
@Data
public class ExpressOrder implements Serializable, Magic {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long neederId;

    private String neederNickname;

    private String providerNickname;

    private Long providerId;

    private BigDecimal price;

    private Byte locationId;

    private Byte score;

    private Byte status;

    private Date createdAt;

    private Date updatedAt;

    private String getCode;

    private String getNickname;

    private Byte expressType;

    private Byte packageType;

    private String getPhone;

    private Date finishedAt;

    private Date beginAt;
}
