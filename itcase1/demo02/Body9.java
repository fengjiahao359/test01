package cn.itcase1.demo02;

/**
 * @author:fjh
 * @Date: 14:22
 */
public class Body9 {



    public static void main(String[] args) {
        String str=new String("hello");
        String str1="hello";
        System.out.println(str==str1);//此处比较的是地址
        System.out.println(str.equals(str1));//此处比较的是字符串数值

        Person p1=new Person("xiaowang", "12");
        Person p2=new Person("xiaowang", "12");
        boolean equals = p1.equals(p2);
        System.out.println(equals);

    }
}
