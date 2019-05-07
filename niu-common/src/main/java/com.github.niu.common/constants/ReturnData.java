package com.github.niu.common.constants;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/6 20:05
 * @desc
 */
@Data
public class ReturnData<T> implements Serializable {
    private int SUCCESS = 200;

    private int statusCode;

    private String msg;

    private T data;

    public static ReturnData SUCCESS(Object o) {
        ReturnData rd = new ReturnData<>();
        rd.setData(o);
        rd.setStatusCode(200);
        return rd;
    }
    public static ReturnData FAIL() {
        ReturnData rd = new ReturnData();
        rd.setStatusCode(404);
        return rd;
    }

}
