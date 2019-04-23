package com.github.niu.express.api.models.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
public class ExpressOrderDTO implements Serializable{

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

    private Byte epxressType;

    private Byte packageType;

    private String getPhone;

    private Date finishedAt;
}
