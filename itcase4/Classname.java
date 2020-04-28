package cn.itcase4;

/**
 * @author:fjh
 * @Date: 18:11
 */
public class Classname {

    public static void main(String[] args) {
        Class c1=null;
        Class c2=null;
        Class c3=null;
        Class c5=null;
        try {
             c1=Class.forName("java.lang.String");
             c2=Class.forName("java.lang.Integer");
            c3=Class.forName("java.lang.String");
            Class c4=Class.forName("java.lang.System");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(c1==c3);
        String s="abc";
        Class aClass = s.getClass();
        System.out.println(aClass==c1);
              Integer a=10;
        Class<? extends Integer> aClass1 = a.getClass();
        System.out.println(aClass1==c2);

        Class<String> stringClass = String.class;
        Class<Integer> integerClass = int.class;
        Class<Double> doubleClass = double.class;

        System.out.println(aClass==stringClass);
    }
}
