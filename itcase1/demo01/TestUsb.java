package cn.itcase1.demo01;

/**
 * @author:fjh
 * @Date: 20:38
 */
public class TestUsb {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.open();
        Mouse usb=new Mouse();
         computer.usbDevice(usb);


        computer.close();
    }

}
