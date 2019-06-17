package com.study.common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期转换 通用 工具类
 */
public class DateUtils {
    /**
     * 创建静态方法，方便被调用
     * 把时间转换成 字符串
     */
    public static String dateToStr(Date date, String string) {
        //创建 时间 转换的SimpleDateFormat对象，字符串为参数 表示要转换成 字符串
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string);
        //传入 日期 对象 进行转换
        String format = simpleDateFormat.format(date);
        //返回 转换后的结果对象 方便 其他人使用
        return format;
    }
}
