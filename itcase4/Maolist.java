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
        map.put(1, "张三");
        map.put(2, "张三hjg");
        map.put(3, "张三ghf");
        map.put(4, "张三hj");
        map.put(5, "张三gg");
        map.put(6, "张三dsa");
        map.put(7, "张三dsa");
      Set<Map.Entry<Integer,String>> set=map.entrySet();
        for (Map.Entry<Integer, String> integerStringEntry : set) {
            System.out.println(integerStringEntry.getKey()+integerStringEntry.getValue());
        }
    }
}
