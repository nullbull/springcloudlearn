package com.github.niu.user.api.models.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/3 15:12
 * @desc
 */
@Data
public class AddressVO implements Serializable {

    private Long id;

    private Long userId;

    private String leaveName;

    private String leavePhone;

    private Byte locationId;

    private String locationName;

    private Byte status;
}
