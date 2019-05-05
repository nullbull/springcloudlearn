package com.github.niu.common.constants;

import com.github.niu.common.exceptions.ExpressException;
import com.github.niu.common.utils.CommonUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.*;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/23 14:00
 * @desc
 */
public interface Magic {
    default<T> T apply(T o) throws Exception {
        return CommonUtil.apply(o, this);
    }
}
