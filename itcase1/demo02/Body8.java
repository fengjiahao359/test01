package cn.itcase1.demo02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author:fjh
 * @Date: 14:16
 */
public class Body8 {
    public static void main(String[] args) {
        Double aDouble = new Double(5.321);
        String s = aDouble.toString();
        System.out.println(s);
        Integer integer=new Integer(150);
        String s1 = integer.toString();
        System.out.println(s1);
        String str="²ËÄñ½Ì³Ì";

        System.out.println(str.toString());
        StringBuffer stringBuffer=new StringBuffer("12345dsadfas546");
        String s2 = stringBuffer.toString();
        System.out.println(s2);



    }
}
