package cn.itcase4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author:fjh
 * @Date: 23:13
 */
public class Maolist {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1, "����");
        map.put(2, "����hjg");
        map.put(3, "����ghf");
        map.put(4, "����hj");
        map.put(5, "����gg");
        map.put(6, "����dsa");
        map.put(7, "����dsa");
      Set<Map.Entry<Integer,String>> set=map.entrySet();
        for (Map.Entry<Integer, String> integerStringEntry : set) {
            System.out.println(integerStringEntry.getKey()+integerStringEntry.getValue());
        }
    }
}
