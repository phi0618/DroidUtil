package com.phi.xutils.utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class DateUtils {

    private DateUtils() {

    }

    private static SimpleDateFormat sdfDef
            = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);

    public static void setDefFormat(String format) {
        sdfDef = new SimpleDateFormat(format, Locale.CHINA);
    }

    public static Date calendar2Date(Calendar calendar) {
        return calendar.getTime();
    }

    public static String calendar2String(Calendar calendar, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.CHINA);
        return sdf.format(calendar2Date(calendar));
    }

    public static Calendar date2Calendar(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    /**
     * 日期转String
     *
     * @param date
     * @param format
     * @return
     */
    public static String date2String(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.CHINA);
        return sdf.format(date);
    }


    /**
     * String 转日历
     *
     * @param str
     * @param format
     * @return
     */
    public static Calendar string2Calendar(String str, String format) {
        return date2Calendar(string2Date(str, format));
    }

    public static Date string2Date(String str, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.CHINA);
        try {
            return sdf.parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Can't parse " + str + " using " + format);
        }
    }

    public static Date string2Date(String str, SimpleDateFormat format) {
        try {
            return format.parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Can't parse " + str + " using " + format);
        }
    }

    public static String date2String(Date date) {
        return sdfDef.format(date);
    }


    public static String calendar2String(Calendar calendar) {
        return sdfDef.format(calendar.getTime());
    }


}
