package cn.itcase4;

import java.util.*;
import java.util.HashMap;

/**
 * @author:fjh
 * @Date: 22:45
 */
public class Test05 {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "username");
        m.put(2, "dudud");
        m.put(3, "password");

      for(Integer key :m.keySet())
      { System.out.println(key+m.get(key));}

        Set<Map.Entry<Integer, String>> set = m.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
        while (iterator.hasNext())
        {
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println(next.getKey()+next.getValue());
        }
        for(Map.Entry<Integer,String> map:m.entrySet())
        {
            System.out.println(map.getKey()+map.getValue());
        }
        Set<String> strings=new HashSet<>();
         ArrayList<String> strings1=new ArrayList<>(strings);




        List<Map<String, String>> list = new ArrayList<Map<String, String>>();



        System.out.println(list);
        try {
            int i=5/0;
        }
        catch (ArithmeticException a){

        }


        System.out.println("ฮาทþมห");

    }
}
