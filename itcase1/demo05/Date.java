package cn.itcase1.demo05;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author:fjh
 * @Date: 12:44
 */
public class Date {
    public static void main(String[] args) throws ParseException {

        java.util.Date date=new java.util.Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        SimpleDateFormat simpleDateFormat1=new  SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
            String str="2020年04月18 12:52:03";
        java.util.Date parse = simpleDateFormat1.parse(str);
        System.out.println(parse);
    }



}
