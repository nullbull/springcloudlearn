package com.github.niu.common.enums;

import lombok.Getter;

import java.util.Arrays;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/8 6:16
 * @desc
 */
@Getter
public enum  SiteEnum {
    ZHONGTONG(1, "南门中通快递"),
    TIANTIAN(2, "南门天天快递"),
    YUNDA(3, "浴室韵达快递"),
    SHENTONG(4, "浴室申通快递"),
    JD(5, "浴室京东快递"),
    SUNFENG(6, "浴室顺丰快递"),
    BAISHI(7, "百事快递"),
    YUANTONG(8, "大活圆通快递");
    private int code;

    private String name;
    SiteEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public static SiteEnum getByCode(int code) {
        return Arrays.stream(SiteEnum.values()).filter(e -> code == e.getCode()).findFirst().orElseGet(null);
    }

}
