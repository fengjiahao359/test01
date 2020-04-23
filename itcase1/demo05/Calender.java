package cn.itcase1.demo05;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author:fjh
 * @Date: 13:04
 */
public class Calender  {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar=new GregorianCalendar();
        int i = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
      gregorianCalendar.set(Calendar.YEAR,2025);
        int i1 = gregorianCalendar.get(Calendar.YEAR);
        System.out.println(i1);
        demo01();
        int [] array=new int[5];


    }


    private static void demo01() {
        Calendar instance = Calendar.getInstance();
        Date time = instance.getTime();
        System.out.println(time);
    }
}
