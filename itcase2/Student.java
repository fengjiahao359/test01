package cn.itcase2;

/**
 * @author:fjh
 * @Date: 16:07
 */
public class Student <E>{
    private E name;
    private E age;

    public Student() {
    }
    public <E> void method1(E e){
        System.out.println(e);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

    public Student(E name, E age) {
        this.name = name;
        this.age = age;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public E getAge() {
        return age;
    }

    public void setAge(E age) {
        this.age = age;
    }
}
