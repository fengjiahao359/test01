package cn.itcase1.demo02;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author:fjh
 * @Date: 19:47
 */
public class Body4 {
    public static void main(String[] args) {
        int[] array={1,10,5,4,3,9,12,50,7};
        int temp;
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
        String s = Arrays.toString(array);
        System.out.println(s);
    }
}
