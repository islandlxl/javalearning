package com.islandlxl.javalearning.集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
@project:com.集合
@Title:ArraytoList
@Auther:lxl
@create:2019/2/23,11:09
*/
public class ArraytoList {

    public static void main(String[] args) {
        int[] array={};
        array=new int[]{1, 2, 3, 4, 5};

        Integer[] iarray=new Integer[array.length];
        for (int i=0;i<array.length;i++){
            iarray[i]=array[i];
        }
//        接下来可以进行转换
        List<Integer> list=new ArrayList<>(Arrays.asList(iarray));
        System.out.println("数组转换list输出："+list.get(0));

        System.out.println("===============list转化为数组=================");

        Object[] toArray = list.toArray();

        int[] ints = new int[toArray.length];

        for (int i=0;i<toArray.length;i++){
            ints[i]=(int)toArray[i];
        }
        for (int i:ints) {

            System.out.println("list最后输出的是数组:"+i);
        }

    }


}
