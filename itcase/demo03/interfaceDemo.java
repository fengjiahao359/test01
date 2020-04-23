package cn.itcase.demo03;

/**
 * @author:fjh
 * @Date: 16:44
 */
public class interfaceDemo {
    public static void main(String[] args) {
        Vehcile bike = new Bike();
        bike.start();
        bike.stop();
        Vehcile bus=new BUS();
        bus.stop();
        bus.start();
    }
}
