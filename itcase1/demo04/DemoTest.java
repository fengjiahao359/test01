package cn.itcase1.demo04;

import java.awt.*;
import java.util.ArrayList;

/**
 * @author:fjh
 * @Date: 18:15
 */
public class DemoTest {
    public static void main(String[] args) {
        Manager manager=new Manager("冯加豪",100);
        manager.show();
        ArrayList<Integer> send = manager.send(120, 3);

        Member member1=new Member("张三",0);
        Member member2=new Member("张四",0);
        Member member3=new Member("张五",0);
        member1.show();
        member2.show();
        member3.show();


        ;
         member1.gimeMe(send);
         member2.gimeMe(send);
         member3.gimeMe(send);
         member1.show();
         member2.show();
         member3.show();





    }
}
