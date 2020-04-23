package cn.itcase4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author:fjh
 * @Date: 20:50
 */
public class HashMap {
    public static void main(String[] args) {
        Map<Integer,String > map=new java.util.HashMap<>();
        map.put(1, "小明");
        map.put(2, "小明");
        map.put(3, "小明");
        map.put(4, "小儿子");
        map.put(5, "小花");
        System.out.println(map.size());
        System.out.println(map);
        String str=map.get(2);
        System.out.println(str);
        boolean b = map.containsValue("小明");
        System.out.println(b);
        Set<Integer> integers = map.keySet();
        System.out.println(integers);
        Collection<String> values = map.values();
        System.out.println(values);
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries);
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext())
        {
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println(next);
        }
    }
}
