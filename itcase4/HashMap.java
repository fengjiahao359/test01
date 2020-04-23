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
        map.put(1, "С��");
        map.put(2, "С��");
        map.put(3, "С��");
        map.put(4, "С����");
        map.put(5, "С��");
        System.out.println(map.size());
        System.out.println(map);
        String str=map.get(2);
        System.out.println(str);
        boolean b = map.containsValue("С��");
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
