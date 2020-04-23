package cn.itcase.demo03;

/**
 * @author:fjh
 * @Date: 16:40
 */
public class Bike implements Vehcile {
    @Override
    public void start() {
        System.out.println("我重写了Vehicle接口start的抽象方法，我是BIke类");
    }

    @Override
    public void stop() {
        System.out.println("我重写了Vehicle接口的STOP抽象方法，我是BIKE类");
    }
}
