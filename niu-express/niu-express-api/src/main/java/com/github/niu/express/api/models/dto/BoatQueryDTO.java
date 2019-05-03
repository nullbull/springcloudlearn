package com.github.niu.express.api.models.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/3 16:37
 * @desc
 */
@Data
public class BoatQueryDTO extends BaseQueryDTO {
    private Byte companyId;

    private Date beginAt;

    private Date endAt;
}
