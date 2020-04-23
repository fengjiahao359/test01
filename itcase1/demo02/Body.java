package cn.itcase1.demo02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.java2d.pipe.SpanIterator;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/** //匿名内部类 用于接口数据只被其调用一次
 * @author:fjh
 * @Date: 22:10
 */
public class Body {

    public static void main(String[] args) {
           boolean flag = true;
         int[] array={1,2,3,1,0};
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j <array.length-1 ; j++) {
                if(array[i]==array[j])
                {
                    System.out.println(array[i]);
                }

            }
        }
        if(!flag)
        {
            System.out.println("没重复");
        }





    }





}
