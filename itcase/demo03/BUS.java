package cn.itcase.demo03;

/**
 * @author:fjh
 * @Date: 16:42
 */
public class BUS implements Vehcile{

    @Override
    public void start() {
        System.out.println("我重写了Vehicle接口start的抽象方法，我是BUS类");
    }

    @Override
    public void stop() {
        System.out.println("我重写了Vehicle接口stop的抽象方法，我是BUS类");
    }
}
