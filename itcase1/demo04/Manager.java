package cn.itcase1.demo04;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:fjh
 * @Date: 17:11
 */
public class Manager extends User{

    public Manager() {
        super();
    }

    public Manager(String name, int money) {
        super(name,money);

    }

       public ArrayList<Integer> send(int totalMoney,int count){
       ArrayList<Integer> arrayList=new ArrayList<>();
       if(totalMoney>super.getMoney())
       {
           System.out.println("对不起，余额不足");
           return arrayList;
       }

           for (int i = 0; i < count-1; i++) {
                arrayList.add(totalMoney / count);
           }
           arrayList.add(totalMoney%count+totalMoney / count);

           int i = super.getMoney()-totalMoney;
          super.setMoney(i);
       return arrayList;

     }
}
