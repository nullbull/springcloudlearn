package com.github.niu.express.server.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/8 21:38
 * @desc
 */
public class test {
    public static void main(String[] args) throws ParseException {
        String date = "12:30";
        String[] real = date.split(":");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(real[0]));
        calendar.set(Calendar.MINUTE, Integer.parseInt(real[1]));
        calendar.set(Calendar.SECOND, 0);
        System.out.println(        calendar.getTime());
        System.out.println(new Date());
    }
}
