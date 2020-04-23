package cn.itcase1.demo01;

/**
 * @author:fjh
 * @Date: 20:37
 */
public class Keymand implements Usb{
    @Override
    public void open() {
        System.out.println("打开键盘");
    }
   public  void input(){
       System.out.println("输入键盘");
   }
    @Override
    public void close() {
        System.out.println("关闭键盘");
    }
}
