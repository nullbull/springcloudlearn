package com.github.niu.common.utils;

import org.apache.commons.lang.StringUtils;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/23 15:01
 * @desc
 */
public class CommonUtil {

    /**
     * @param id
     * @return 不合格 true 合格 false
     */
    public static boolean validLong(Long id) {
        return  (null == id || id <= 0) ;
    }

    public static boolean validInteger(Integer id) {
        return  (null == id || id <= 0) ;
    }
    public static boolean validByte(Byte id) {
        return (null == id || id <= 0);
    }
    /**
     * @param s
     * @return 不合格 true 合格 false
     */
    public static boolean validString(String s) {
        return (null == s || StringUtils.isBlank(s) || StringUtils.isEmpty(s));
    }
}
