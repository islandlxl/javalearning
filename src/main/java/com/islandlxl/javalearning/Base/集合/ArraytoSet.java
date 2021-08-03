package com.islandlxl.javalearning.Base.集合;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
@project:com.集合
@Title:ArraytoSet
@Auther:lxl
@create:2019/2/23,11:52
*/
public class ArraytoSet {


    public static void main(String[] args) {

        int[] array=new int[]{1,2,3,4,5};
        Integer[] Iarray=new Integer[array.length];
        for (int i=0;i<array.length;i++){
            Iarray[i]=array[i];
        }
        Set<Integer> set=new HashSet<>(Arrays.asList(Iarray));
        System.out.println("数组转化为set："+set);

        System.out.println("==================set集合转为数组==================");

        Object[] objects = set.toArray();

        int[] ints=new int[objects.length];
        for (int i=0;i<objects.length;i++){
            ints[i]=(int)objects[i];
        }

        for (int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }


    }
}
