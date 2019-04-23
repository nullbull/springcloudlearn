package com.github.niu.common.constants;

import com.github.niu.common.exceptions.ExpressException;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/23 14:00
 * @desc
 */
public interface Magic {

    default<T> T apply(T o) throws Exception {
        BeanUtils.copyProperties(Optional.of(o).orElseThrow(() -> new ExpressException("参数不能为空")), this);
        return o;
    }
}
