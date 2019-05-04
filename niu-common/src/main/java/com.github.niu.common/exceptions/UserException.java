package com.github.niu.common.exceptions;

import com.github.niu.common.enums.ErrorCodeEnum;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/4 11:03
 * @desc
 */
public class UserException extends ExpressException{
    public UserException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserException(String message) {
        super(message);
    }

    public UserException(int code, String message) {
        super(code, message);
    }

    public UserException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }
}
