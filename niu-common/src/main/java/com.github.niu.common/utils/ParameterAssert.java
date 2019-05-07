package com.github.niu.common.utils;


import com.github.niu.common.constants.Constants;
import com.github.niu.common.enums.ErrorCodeEnum;
import com.github.niu.common.exceptions.*;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;

import java.util.Collection;
import java.util.Map;

/**
 * @date 2019/3/21 15:26
 * @desc
 */
public class ParameterAssert {


    private static final String MESSAGE = "参数不合法";

    private static int INVALID_ARGS = 400;

    private static int UNKNOWN_FAIL = 500;

    public static void isExpressValid(final Object o) throws Exception {
        isExpressValid(o, "参数不能为空");
    }
    public static void isExpressValid(final Object o, final ErrorCodeEnum codeEnum) throws Exception{
        isExpressValid(o, codeEnum.getCode(), codeEnum.getMessage());
    }
    public static void isExpressValid(final Object o, String msg) throws Exception{
        isExpressValid(o, INVALID_ARGS, msg);
    }
    public static void isExpressValid(final Object o, int code, String msg) throws Exception{
        isValid(o, new ExpressException(code, msg));
    }

    public static void isAddressValid(final Object o) throws Exception {
        isAddressValid(o, "参数不能为空");
    }
    public static void isAddressValid(final Object o, final ErrorCodeEnum codeEnum) throws Exception{
        isAddressValid(o, codeEnum.getCode(), codeEnum.getMessage());
    }
    public static void isAddressValid(final Object o, String msg) throws Exception{
        isAddressValid(o, INVALID_ARGS, msg);
    }
    public static void isAddressValid(final Object o, int code, String msg) throws Exception{
        isValid(o, new AddressException(code, msg));
    }


    public static void isTicketValid(final Object o) throws Exception {
        isTicketValid(o, "参数不能为空");
    }
    public static void isTicketValid(final Object o, final ErrorCodeEnum codeEnum) throws Exception{
        isTicketValid(o, codeEnum.getCode(), codeEnum.getMessage());
    }
    public static void isTicketValid(final Object o, String msg) throws Exception{
        isTicketValid(o, INVALID_ARGS, msg);
    }
    public static void isTicketValid(final Object o, int code, String msg) throws Exception{
        isValid(o, new TicketException(code, msg));
    }


    public static void isBoatValid(final Object o) throws Exception {
        isBoatValid(o, "参数不能为空");
    }
    public static void isBoatValid(final Object o, final ErrorCodeEnum codeEnum) throws Exception{
        isBoatValid(o, codeEnum.getCode(), codeEnum.getMessage());
    }
    public static void isBoatValid(final Object o, String msg) throws Exception{
        isBoatValid(o, INVALID_ARGS, msg);
    }
    public static void isBoatValid(final Object o, int code, String msg) throws Exception{
        isValid(o, new BoatException(code, msg));
    }


    public static void isUserValid(final Object o) throws Exception {
        isUserValid(o, "参数不能为空");
    }
    public static void isUserValid(final Object o, final ErrorCodeEnum codeEnum) throws Exception{
        isUserValid(o, codeEnum.getCode(), codeEnum.getMessage());
    }
    public static void isUserValid(final Object o, String msg) throws Exception{
        isUserValid(o, INVALID_ARGS, msg);
    }
    public static void isUserValid(final Object o, int code, String msg) throws Exception{
        isValid(o, new UserException(code, msg));
    }


    public static void isDriverValid(final Object o) throws Exception {
        isDriverValid(o, "参数不能为空");
    }
    public static void isDriverValid(final Object o, final ErrorCodeEnum codeEnum) throws Exception{
        isDriverValid(o, codeEnum.getCode(), codeEnum.getMessage());
    }
    public static void isDriverValid(final Object o, String msg) throws Exception{
        isDriverValid(o, INVALID_ARGS, msg);
    }
    public static void isDriverValid(final Object o, int code, String msg) throws Exception{
        isValid(o, new DriverException(code, msg));
    }

    public static void isAddressStatusValid(Byte s) throws Exception {
        if (!Constants.ADDRESS_STATUS_LIST.contains(s)) {
            throw new AddressException("未知操作");
        }
    }

    public static void isSuccess(int ans) throws Exception {
        if (ans != 1) {
            throw new ExpressException(ErrorCodeEnum.OPERATOR_FAIL);
        }
    }

//
//
//    public static void isStudyValid(final Object o) throws Exception {
//        isCommentValid(o, "参数不能为空");
//    }
//    public static void isStudyValid(final Object o, final ErrorCodeEnum codeEnum) throws Exception{
//        isCommentValid(o, codeEnum.getCode(), codeEnum.getMessage());
//    }
//    public static void isStudyValid(final Object o, String msg) throws Exception{
//        isCommentValid(o, INVALID_ARGS, msg);
//    }
//    public static void isStudyValid(final Object o, int code, String msg) throws Exception{
//        isValid(o, new StudyException(code, msg));
//    }
//
//    public static void isUserValid(final Object o) throws Exception {
//        isCommentValid(o, "参数不能为空");
//    }
//    public static void isUserValid(final Object o, final ErrorCodeEnum codeEnum) throws Exception{
//        isCommentValid(o, codeEnum.getCode(), codeEnum.getMessage());
//    }
//    public static void isUserValid(final Object o, String msg) throws Exception{
//        isCommentValid(o, INVALID_ARGS, msg);
//    }
//    public static void isUserValid(final Object o, int code, String msg) throws Exception{
//        isValid(o, new UserException(code, msg));
//    }
//
//
//    public static void isNavigationValid(final Object o, final ErrorCodeEnum codeEnum) throws Exception{
//        isNavigationValid(o, codeEnum.getCode(), codeEnum.getMessage());
//    }
//    public static void isNavigationValid(final Object o, final String msg) throws Exception {
//        isNavigationValid(o, INVALID_ARGS, msg);
//    }
//    public static void isNavigationValid(final Object o, final int code, final String msg) throws Exception {
//        isValid(o, new NavigationException(code, msg));
//    }
//    public static void isValid(final Object o, final ErrorCodeEnum errorCodeEnum) throws Exception {
//        isValid(o, errorCodeEnum.getCode(), errorCodeEnum.getMessage());
//    }
//    public static void isValid(final Object o, final int code, final String msg) throws Exception{
//        isValid(o , new WuBaCollegeException(code, msg));
//    }
//    public static void isValid(final Object o, final String msg) throws Exception {
//        isValid(o, new WuBaCollegeException(UNKNOWN_FAIL, msg));
//    }
//
//    public static void isChannelValid(final Byte channel) throws Exception {
//        if (CommonUtil.validByte(channel)) {
//            throw new WuBaCollegeException(Constants.INVALID_ARGS, "渠道不能为空");
//        }
//        if (!Constants.CHANNEL_LIST.contains(channel)) {
//            throw new WuBaCollegeException(Constants.INVALID_ARGS, "未知渠道");
//        }
//    }
//    public static void isTargetTypeValid(final Byte type) throws Exception {
//        if (CommonUtil.validByte(type)) {
//            throw new WuBaCollegeException(Constants.INVALID_ARGS, "渠道不能为空");
//        }
//        if (!Constants.TARGET_LIST.contains(type)) {
//            throw new WuBaCollegeException(Constants.INVALID_ARGS, "未知渠道");
//        }
//    }
//    public static void isReturnSuccess(final int result, String msg) throws Exception {
//        if (Constants.RETURN_FAIL == result) {
//            throw new WuBaCollegeException(UNKNOWN_FAIL, msg);
//        }
//    }

    /**
     *  String 不能为空 && 不能空白
     *  Long 不能为空 && 大于零
     *  Integer 不能为空 && 大于零
     *  Map 不能为空 不为 null
     *  Collection 不能为空 不能为 null
     * @param o 对象
     * @param e 抛出的异常
     * @throws Exception
     */
    public static void isValid(final Object o, ExpressException e) throws Exception{
        boolean isInvalid = false;
        if (o instanceof String) {
            isInvalid = CommonUtil.validString((String) o);
        } else if (o instanceof Long) {
            isInvalid = CommonUtil.validLong((Long) o);
        }
        else if (o instanceof Integer) {
            isInvalid = CommonUtil.validInteger((Integer) o);
        }
        else if (o instanceof Byte) {
            isInvalid = CommonUtil.validByte((Byte) o);
        }
        else if (o instanceof Collection) {
            isInvalid = null == o || CollectionUtils.isEmpty((Collection) o);
        }
        else if (o instanceof Map) {
            isInvalid = null == o || MapUtils.isEmpty((Map) o);
        }
        else {
            isInvalid = null == o;
        }
        if (isInvalid) {
            throw e;
        }
    }

}
