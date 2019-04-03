package com.bootdo.image_check.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shenli - XD02551
 * @email
 * @createDate 2019/4/3 10:16
 */
public class TimeDifference {

    /**
     * 计算两个时间差
     *
     * @param strTime1
     * @param strTime2
     */
    private void getTimeDifference(String strTime1, String strTime2) {
        //格式日期格式，在此我用的是"2018-01-24 19:49:50"这种格式
        //可以更改为自己使用的格式，例如：yyyy/MM/dd HH:mm:ss
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{
            Date now = df.parse(strTime1);
            Date date=df.parse(strTime2);
            long l=now.getTime()-date.getTime();       //获取时间差
            long day=l/(24*60*60*1000);
            long hour=(l/(60*60*1000)-day*24);
            long min=((l/(60*1000))-day*24*60-hour*60);
            long s=(l/1000-day*24*60*60-hour*60*60-min*60);
            System.out.println(""+day+"天"+hour+"小时"+min+"分"+s+"秒");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 测试一下
     *
     * @param args
     */
    public static void main(String[] args) {
        TimeDifference td = new TimeDifference();
        String strTime1 = "2018-01-24 19:49:50";
        String strTime2 = "2017-09-17 10:58:40";
        td.getTimeDifference(strTime1, strTime2);
    }
}