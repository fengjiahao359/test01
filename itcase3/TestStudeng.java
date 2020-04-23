package cn.itcase3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;



/**
 * @author:fjh
 * @Date: 12:09
 */
public class TestStudeng {
    public static void main(String[] args) {

       Student stu=new Student("小明",18);
       Student stu1=new Student("小张",20);
       Student stu2=new Student("b小红",15);
       Student stu3=new Student("a小黄",15);
        ArrayList<Student> arrayList=new ArrayList<>();
         arrayList.add(stu);
         arrayList.add(stu1);
         arrayList.add(stu2);
         arrayList.add(stu3);

        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        TreeSet<Integer> treeSet=new TreeSet<>();
         treeSet.add(1);
         treeSet.add(5);
         treeSet.add(2);
         treeSet.add(1);
        System.out.println(treeSet);
        HashSet<Integer> hashSet=new HashSet<>();

        int [] arrays={5,1,2,79,10,0,11};

        for (int i = 0; i <arrays.length-1; i++) {
            int min=i;
            for (int j = i+1; j <arrays.length ; j++) {

               if(arrays[min]>arrays[j])
               {
                   min=j;
               }


            }
            if(min !=i)
            {
              int temp;
              temp=arrays[i];
              arrays[i]=arrays[min];
              arrays[min]=temp;
            }

        }
        for (int i : arrays) {
            System.out.println(i);
        }
        int [] arr={1,2,3,4,100,200,700,1000,9999};
        int index=binarySearch1(arr,200);

        System.out.println(index);
         Student student=new Student();
         student.add();

    }

    private static int binarySearch1(int[] arr, int i) {
        int begin = 0;
        int end = arr.length - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (arr[mid] == i) {
                return mid;
            } else if (arr[mid] > i) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }

        }
        return -1;
    }

}
