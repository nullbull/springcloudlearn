package com.github.niu.common.exceptions;

import com.github.niu.common.enums.ErrorCodeEnum;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/23 14:07
 * @desc
 */
public class ExpressException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    private int code = 400;

    public ExpressException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExpressException(String message) {
        super(message);
    }

    public ExpressException(int code, String message) {
        super(message);
        this.code = code;
    }

    public ExpressException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMessage());
        this.code = errorCodeEnum.getCode();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append(super.toString())
                .append(", code:")
                .append(code);
        return sb.toString();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
