package cn.itcase3;

import java.util.HashSet;
import java.util.Properties;

/**
 * @author:fjh
 * @Date: 23:11
 */
public class TestPerson {
    public static void main(String[] args) {
         Person person=new Person("小明",18);
         Person person1=new Person("小明",18);
        boolean equals = person.equals(person1);
        System.out.println(equals);
         HashSet<Person> hashSet=new HashSet<>();
           hashSet.add(person);
           hashSet.add(person1);
        System.out.println(hashSet);
        Properties properties=new Properties();
        properties.put("username", "1223456");
        properties.put("username", "1223456");
        properties.put("username", "1223456");

        String username = properties.getProperty("username");
        System.out.println(username);


    }
}
