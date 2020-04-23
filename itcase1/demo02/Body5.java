package cn.itcase1.demo02;

import java.util.Arrays;

/**
 * @author:fjh
 * @Date: 20:20
 */
public class Body5 {
    public static void main(String[] args) {
        int[] array=new int[20];
        array[0]=1;
        array[1]=1;
        for (int i = 0; i <array.length-2 ; i++) {
              array[i+2]=array[i+1]+array[i];
        }
        String s = Arrays.toString(array);
        System.out.println(s);
    }
}
