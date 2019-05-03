package com.github.niu.common.exceptions;

import com.github.niu.common.enums.ErrorCodeEnum;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/3 15:44
 * @desc
 */
public class TicketException extends ExpressException{
    public TicketException(String message, Throwable cause) {
        super(message, cause);
    }

    public TicketException(String message) {
        super(message);
    }

    public TicketException(int code, String message) {
        super(code, message);
    }

    public TicketException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }
}
