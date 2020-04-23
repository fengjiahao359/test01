package cn.itcase2;

/**
 * @author:fjh
 * @Date: 17:04
 */
public class IntergerClass {
    public static void main(String[] args) {

        int i=100;
        Integer integer = Integer.valueOf(100);
        System.out.println(integer);
        Integer integer1 = Integer.valueOf("123");
        System.out.println(integer1);
        int i1 = integer1.intValue();
        System.out.println(i1);
        char a='a';
        Character character = Character.valueOf(a);
        System.out.println(character);
        char c = character.charValue();
        System.out.println(c);
           Integer in=new Integer(5);
    }
}
