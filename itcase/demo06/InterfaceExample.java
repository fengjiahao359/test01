package cn.itcase.demo06;

/**
 * @author:fjh
 * @Date: 18:14
 */
public class InterfaceExample {
    public static void main(String[] args) {
        Cricle cricle=new Cricle(3);
        cricle.area();
        cricle.grith();
        Rectangle rectangle=new Rectangle(3, 4);
        rectangle.area();
        rectangle.grith();
    }
}
