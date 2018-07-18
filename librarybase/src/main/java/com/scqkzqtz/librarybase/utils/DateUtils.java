package com.scqkzqtz.librarybase.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by zsx on 2018/3/7.
 */

public class DateUtils {

    /**
     * 将时间格式转换
     *
     * @param dateDate yyyy-MM-dd HH:mm:ss
     * @param patten
     * @return
     */
    public static String DateToString(Date dateDate, String patten) {
        String strsub = "";
        if (dateDate != null) {
            SimpleDateFormat formatter = new SimpleDateFormat(patten);
            formatter.setTimeZone(TimeZone.getTimeZone("GMT+8"));
            strsub = formatter.format(dateDate);
        } else {
            strsub = "";
        }

        return strsub;
    }

    /**
     * String转换Date
     *
     * @param dateStr
     * @param patten  yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static Date StringToDate(String dateStr, String patten) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
            new Date();
        }
        return date;
    }

    /**
     * 将时间戳转换为时间
     *
     * @param lt
     * @param pattern yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String stampToDate(long lt, String pattern) {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }

    /**
     * 星期判断
     *
     * @return
     */
    public static String getWeek(Date date) {

        String Week = "";
        String pTime = "";
        SimpleDateFormat formatter = null;
        formatter = new SimpleDateFormat("yyyy-MM-dd");
        pTime = formatter.format(date);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(format.parse(pTime));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (c.get(Calendar.DAY_OF_WEEK) == 1) {
            Week += "天";
        }
        if (c.get(Calendar.DAY_OF_WEEK) == 2) {
            Week += "一";
        }
        if (c.get(Calendar.DAY_OF_WEEK) == 3) {
            Week += "二";
        }
        if (c.get(Calendar.DAY_OF_WEEK) == 4) {
            Week += "三";
        }
        if (c.get(Calendar.DAY_OF_WEEK) == 5) {
            Week += "四";
        }
        if (c.get(Calendar.DAY_OF_WEEK) == 6) {
            Week += "五";
        }
        if (c.get(Calendar.DAY_OF_WEEK) == 7) {
            Week += "六";
        }

        return Week;
    }
}
