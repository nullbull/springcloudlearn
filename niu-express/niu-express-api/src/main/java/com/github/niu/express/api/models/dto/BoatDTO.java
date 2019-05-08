package com.github.niu.express.api.models.dto;

import com.github.niu.common.constants.Magic;
import com.github.niu.common.utils.CommonUtil;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/3 15:24
 * @desc
 */
@Data
public class BoatDTO implements Magic {

    private Long id;

    @NotNull(message = "小件数量不能为空")
    private Byte smallCount;

    @NotNull(message = "中件数量不能为空")
    private Byte normalCount;

    @NotNull(message = "大件数量不能为空")
    private Byte largeCount;

    @NotNull(message = "小件价格不能为空")
    private BigDecimal smallPrice;

    @NotNull(message = "中间价格不能为空")
    private BigDecimal normalPrice;

    @NotNull(message = "大件价格不能为空")
    private BigDecimal largePrice;

    @NotNull(message = "摆渡人ID")
    private Long driverId;

    @NotNull(message = "摆渡人昵称")
    private String driverNickname;

    private String content;

    private Date beginAt;

    private Date endAt;

    private String destinationName;

    private String companyName;

    private Byte companyId;

    private String beginTime;

    private String endTime;

    public BoatDTO init() {
        if (!CommonUtil.validString(beginTime) && !CommonUtil.validString(endTime)) {
            this.beginAt = CommonUtil.getTodayTime(this.beginTime);
            this.endAt = CommonUtil.getTodayTime(this.endTime);
        }
        return this;
    }
}
