package com.github.niu.common.exceptions;

import com.github.niu.common.enums.ErrorCodeEnum;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/3 15:06
 * @desc
 */
public class AddressException extends ExpressException{
    public AddressException(String message, Throwable cause) {
        super(message, cause);
    }

    public AddressException(String message) {
        super(message);
    }

    public AddressException(int code, String message) {
        super(code, message);
    }

    public AddressException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }
}
