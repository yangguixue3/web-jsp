package com.msr.listenter;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
 * Calendar:(日历对象)カレンダ
 * 	获取对象
 * 		static getInstance()
 * 	デフォルトのタイムゾーンおよびロケールを使用してカレンダを取得します。
 * 	常用方法
 * 		setTime(Date date):与当前的时间同步
 * 		set(int field,int value):设置
 * 		getTime():返回日历的data对象
 *
 * */
public class TimeTest01 {
    public static void main(String[] args) {
    // 获取一天之后的时间
    //  1日後の時間を取得
        //Calendar:(日历对象) 两种获取对象方法.线程不安全
        //グレゴリオ暦
        Calendar calendar = new GregorianCalendar();
        Calendar calendar1 = Calendar.getInstance();
        System.out.println(calendar1);
        calendar1.add(Calendar.DATE,1);//获取第二天 日付を取得する
        System.out.println(calendar1);


        // JDK8          LocalDate线程安全
            //获取年月日
            //日付を取得する
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate localDate = now.plusDays(1);//获取第二天
        System.out.println(localDate);
             //获取年月日 日付を取得する
        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println(nowTime);
        LocalDateTime localDateTime = nowTime.plusDays(1);//获取第二天
        System.out.println(localDateTime);


    }
}
