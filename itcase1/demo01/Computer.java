package cn.itcase1.demo01;

/**
 * @author:fjh
 * @Date: 20:32
 */
public class Computer {
      public void open(){
          System.out.println("笔记本电脑开机");
      }
      public void close(){
          System.out.println("笔记本电脑关机");
      }
      public void usbDevice(Usb usb){
            usb.open();
            usb.close();
          if (usb instanceof Usb)
          {
              Mouse mouse1=(Mouse)usb;
              mouse1.cilck();
          }
          else if(usb instanceof Usb){
               Keymand keymand=(Keymand)usb;
               keymand.input();
          }
      }
}

