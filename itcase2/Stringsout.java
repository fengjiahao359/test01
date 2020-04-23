package cn.itcase2;

/**
 * @author:fjh
 * @Date: 14:01
 */
public class Stringsout {
    public static void main(String[] args) {
        int i=100;
        String str=100+"";
        System.out.println(str+100);
        String s = Integer.toString(100);
        System.out.println(s+200);
        String s1 = String.valueOf(7.8);
        System.out.println(s1+200);
        Integer integer = Integer.valueOf("2");
        System.out.println(integer+100);
    }
}
