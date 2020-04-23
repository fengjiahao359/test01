package cn.itcase1.demo02;

import java.util.Scanner;

/**
 * @author:fjh
 * @Date: 17:48
 */
public class Body3 {
    public static void main(String[] args) {
        int[] array=new int[10];
        int temp;
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
             array[i]=scanner.nextInt();
        }

              for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j <array.length-1-i ; j++) {
                 if(array[j]>array[j+1])
                 {
                     temp=array[j];
                     array[j]=array[j+1];
                     array[j+1]=temp;
                 }
            }
        }
              int sum=0;
        for (int i = 1; i <array.length-1 ; i++) {

            sum+=array[i];

        }
        System.out.println(sum/8);



    }
}
