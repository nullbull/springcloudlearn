package com.github.niu.common.utils;

import com.github.niu.common.exceptions.ExpressException;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.*;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpRequest;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;

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
    static {
        ConvertUtils.register(new LongConverter(null), Long.class);
        ConvertUtils.register(new ShortConverter(null), Short.class);
        ConvertUtils.register(new IntegerConverter(null), Integer.class);
        ConvertUtils.register(new DoubleConverter(null), Double.class);
        ConvertUtils.register(new BigDecimalConverter(null), BigDecimal.class);
        ConvertUtils.register(new DateConverter(null), Date.class);
    }
    public static <T> T apply(T t, Object o) throws Exception{
        BeanUtils.copyProperties(Optional.of(t).orElseThrow(() -> new ExpressException("参数不能为空")), o);
        return t;
    }



}
