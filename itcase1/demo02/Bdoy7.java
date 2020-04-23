package cn.itcase1.demo02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author:fjh
 * @Date: 11:40
 */
public class Bdoy7 {
    public static void main(String[] args) {
            ArrayList<Integer> arrayList=new ArrayList<>();
            arrayList.add(3);
            arrayList.add(2);
            arrayList.add(10);
            arrayList.add(12);
            arrayList.add(5);
            arrayList.add(3);
            arrayList.add(7);

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext())
        {


            if(iterator.next().equals(12))
            {
                iterator.remove();
            }

        }
        System.out.println(arrayList);


    }
}
