package cn.itcase.demo02;

/**
 * @author:fjh
 * @Date: 16:30
 */
public class Test {
    public static void main(String[] args) {
        Vehicle car=new Car();
        car.run();
        car.wheelsNum();
        Vehicle motorbike=new Motorbike();


        motorbike.run();
        motorbike.wheelsNum();
    }
}
