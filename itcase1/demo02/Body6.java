package cn.itcase1.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:fjh
 * @Date: 23:25
 */
public class Body6 {
    public static void main(String[] args) throws ParseException {
        Pattern p=Pattern.compile("[\\w\\-]+@[a-zA-z0-9]+(\\.[a-zA-Z]+){1,2}");
        Matcher matcher=p.matcher("1164764344@qq.com");
        boolean matches = matcher.matches();
        System.out.println(matches);

        StringBuilder stringBuilder=new StringBuilder("²ËÄñ½Ì³Ì");
        stringBuilder.append(5);
        stringBuilder.append("ÄáÂêµÄ");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        Date date = new Date();
        long time = date.getTime();
           date.setTime(158718800260L);

         SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);
        System.out.println(format);


    }
}
