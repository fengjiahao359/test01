package cn.itcase1.demo02;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author:fjh
 * @Date: 15:29
 */
public class Body2 {
    public static void main(String[] args) {
        int[] array={3,7,16,0,5,0,0,6,7,0,5};
        int num=0;



        for (int i = 0; i < array.length; i++) {
             if(array[i]==0)
             {
              continue;
             }
            System.out.println(array[i]);
             num++;
        }
        System.out.println("===========");
        System.out.println(num);
        int [] arrays=new int[num];
    int k=0;
        for (int i = 0; i < array.length; i++) {
             if(array[i]!=0)
             {
                 arrays[k]=array[i];
                 k++;
             }
        }
        String s = Arrays.toString(arrays);
        System.out.println(s);


    }
}
