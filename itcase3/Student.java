package cn.itcase3;

import java.util.Objects;

/**
 * @author:fjh
 * @Date: 12:17
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;
      int size=0;
      Node header=null;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
    public void add(){
         size++;
    }


    @Override
    public int compareTo(Student o) {
        if(this.getAge()<o.getAge())
        {
            return 1;
        }
        else if(this.getAge()==o.getAge())
        {
            int i = this.name.charAt(0) - o.getName().charAt(0);
            return i;
        }
        else return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                size == student.size &&
                Objects.equals(name, student.name) &&
                Objects.equals(header, student.header);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, size, header);
    }
}
