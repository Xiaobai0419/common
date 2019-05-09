package com.sunfield.microframe.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    public final static String DEFAULT_FORMAT = "YYYY-MM-dd HH:mm:ss";

    public final static String DEFAULT_TIME_ZONE = "GMT+8";

    public final static String DATE_FORMAT="YYYYMMddHHmmss";

    /**
     * 获取N天后的时间
     * @param date 时间
     * @param days 天数
     * @return
     */
    public static Date getDateAfterDays(Date date, int days){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, days);
        return calendar.getTime();
    }

    /**
     * 获取N月后的时间
     * @param date 时间
     * @param month 月数
     * @return
     */
    public static Date getDateAfterMonth(Date date, int month){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, month);
        return calendar.getTime();
    }

    /**
     * 获取当前时间的字符串格式
     * @return
     */
    public static String getDateTimeFormat(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat(DATE_FORMAT);
        return sdf.format(date);
    }

    public static Long getCurrentTimeInMillis(long millisecond){
        Long l=System.currentTimeMillis();
        return l+millisecond;
    }
}
