package cn.itcase1.demo04;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author:fjh
 * @Date: 17:30
 */
public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }


    public void gimeMe(ArrayList<Integer> arrayList){
         int index=new Random().nextInt(arrayList.size());



            Integer integer = arrayList.get(index);
            Integer remove = arrayList.remove(index);
            int money = super.getMoney();
            super.setMoney(money+integer);





    }

}
