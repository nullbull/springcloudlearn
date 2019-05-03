package com.github.niu.common.exceptions;

import com.github.niu.common.enums.ErrorCodeEnum;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/3 15:42
 * @desc
 */
public class BoatException extends ExpressException {
    public BoatException(String message, Throwable cause) {
        super(message, cause);
    }

    public BoatException(String message) {
        super(message);
    }

    public BoatException(int code, String message) {
        super(code, message);
    }

    public BoatException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }
}
