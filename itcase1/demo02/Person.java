package cn.itcase1.demo02;

import java.util.Comparator;
import java.util.Objects;

/**
 * @author:fjh
 * @Date: 14:24
 */
public class Person  {
    private String name;
    private String age;

    public Person(String name, String  age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object o)
    {
        if(this==o){return true;}
        if(o==null||getClass()!=o.getClass()) return  false;
        Person person=(Person)o;
        return name.equals(person.name)&&
                    age.equals(person.age);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String  getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
