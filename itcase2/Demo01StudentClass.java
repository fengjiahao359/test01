package cn.itcase2;

import java.util.ArrayList;

/**
 * @author:fjh
 * @Date: 16:09
 */
public class Demo01StudentClass {
    public static void main(String[] args) {
        Student<String> stu=new Student<String>("°¡°¡","a ");
        System.out.println(stu);
        stu.method1(7.811);

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        ArrayList<String> arrayList1=new ArrayList<>();
               arrayList1.add("µÏÀöÈÈ°Í");
               arrayList1.add("¹ÅÁ¦ÄÈÔú");


        printArray(arrayList1);
        printArray(arrayList);

    }
    public static void printArray(ArrayList<?> arrayList)
    {
       for(Object o:arrayList)
       {
           System.out.println(o);
       }
    }
}
