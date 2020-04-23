package cn.itcase.demo05;

/**
 * @author:fjh
 * @Date: 17:34
 */
public class Employee extends Role{

    @Override
    public void play() {
      super.say();
        System.out.println("我已经覆盖重写了ROle父类的方法，我是Emplyee类");


    }
     final int ID ;
     public static String company;
     private int salary;

    public Employee() {
        super();
        ID=20;

    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Employee.company = company;
    }

    public Employee(String name, int age, String sex, int salary, int ID) {
        super(name, age, sex);
        this.ID=ID;
        System.out.println("我的名字是"+name+"，我年龄是"+age+"我的性别是"+sex+"我的薪水是"+salary+"ID是"+ID+"公司是"+company);

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
