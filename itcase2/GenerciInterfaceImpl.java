package cn.itcase2;

/**
 * @author:fjh
 * @Date: 16:24
 */
public class GenerciInterfaceImpl implements GenerciInterface<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
