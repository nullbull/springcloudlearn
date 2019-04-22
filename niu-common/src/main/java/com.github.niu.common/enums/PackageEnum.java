package com.github.niu.common.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/22 18:06
 * @desc
 */
@Getter
public enum PackageEnum {
    SMALL((byte)1, "小包"),
    MIDDLE((byte)2, "中包"),
    BIG((byte)3, "大包"),
    HEAVY((byte)4, "重包"),
    UNKNOWN((byte)0, "未知"),
    ;
    private Byte code;
    private String desc;
    PackageEnum(Byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    PackageEnum getByCode(Byte code) {
        Optional<PackageEnum> temp = Arrays.stream(PackageEnum.values()).filter(e -> getCode().equals(code)).findFirst();
        return temp.orElseGet(() -> PackageEnum.UNKNOWN);
    }

}
