package com.github.niu.express.api.models.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/14 11:12
 * @desc
 */
@Data
public class PassengerVO {
    private Long id;

    private String companyName;

    private String destinationName;

    private Date beginAt;

    private Date endAt;

    private String leaveName;

    private String code;

    private String leavePhone;
}
