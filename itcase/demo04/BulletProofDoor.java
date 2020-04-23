package cn.itcase.demo04;

/**
 * @author:fjh
 * @Date: 16:51
 */
public class BulletProofDoor extends Door implements FireSafe {
    @Override
    public void fireProof() {
        System.out.println("我重写并且实现了防弹的接口");
    }

    @Override
    public void open() {
        System.out.println("我给防弹门继承了门类的开门，同时也implement一个防弹门接口");
    }

    @Override
    public void close() {
        System.out.println("我给防弹门继承了门类的关门，同时也implement一个防弹门接口");
    }
}
