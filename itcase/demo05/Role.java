package cn.itcase.demo05;

import sun.java2d.pipe.SpanIterator;

/**
 * @author:fjh
 * @Date: 17:02
 */
public abstract class Role {
    private String name;
    private int age;
    private String sex;

    public Role() {
        System.out.println("我是父类构造方法");
    }

    public Role(String name, int age, String sex) {

        this.name = name;
        this.age = age;
        this.sex = sex;

    }
   public abstract void play();
     public void say(){
         System.out.println("我是抽象类里面普通方法的SAY方法在ROLE抽象类里面");
     }
    public final void sing(){
        System.out.println("我给你提供这个final sing方法在ROLE抽象类里面");
     }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
