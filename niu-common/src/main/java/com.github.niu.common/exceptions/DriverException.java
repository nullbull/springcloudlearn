package com.github.niu.common.exceptions;

import com.github.niu.common.enums.ErrorCodeEnum;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/4 11:04
 * @desc
 */
public class DriverException extends ExpressException {
    public DriverException(String message, Throwable cause) {
        super(message, cause);
    }

    public DriverException(String message) {
        super(message);
    }

    public DriverException(int code, String message) {
        super(code, message);
    }

    public DriverException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }
}
