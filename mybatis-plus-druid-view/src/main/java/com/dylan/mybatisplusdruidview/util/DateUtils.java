package com.dylan.mybatisplusdruidview.util;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author baoxiang
 * @create 2020-06-15 13:55
 */
public class DateUtils {
    public static final DateTimeFormatter DEFAULT_DATE_FORMATER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static final DateTimeFormatter DEFAULT_TIME_FORMATER = DateTimeFormatter.ofPattern("hh:mm:ss");

    public static String currentDate() {
        LocalDate localDate = LocalDate.now();
        return localDate.format(DEFAULT_DATE_FORMATER);
    }
    public static String currentTime() {
        LocalTime localTime = LocalTime.now();
        return localTime.format(DEFAULT_TIME_FORMATER);
    }

    public static void main(String[] args) {
        System.out.println(currentDate());
        System.out.println(currentTime());
    }
}
 