package com.github.niu.common.enums;


/**
 * @date 2019/3/26 16:13
 * 	int RECORD_NOT_EXIST = 501;
 *
 * 	int NAV_NAME_EXIST = 502;
 *
 * 	int INVALID_ARGS = 400;
 *
 * 	int UNKNOWN_FAIL = 500;
 */
public enum ErrorCodeEnum {

    RECORD_NOT_EXIST(501, "查询记录不存在"),
    NAV_NAME_EXIST(502, "导航菜单名已存在"),
    USER_EXIST(502, "该用户已存在"),
    INVALID_ARGS(500, "参数不正确"),
    UNKNOWN_ERROR(400, "系统未知异常"),
    OPERATOR_FAIL(400, "数据库操作失败"),
    SYSTEM_ERROR(400, "服务器开小差了，请稍后重试");

    int code;
    String message;
    ErrorCodeEnum(int code, String msg) {
        this.code = code;
        this.message = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
