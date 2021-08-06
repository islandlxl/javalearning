package com.islandlxl.javalearning.HUAWEI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/*
@project:com
@Title:Demo
@Auther:lxl
@create:2019/10/19,10:07
*/public class Demo {


    public static void main(String[] args) {

        double a=0.5f-0.4f;
        double b=0.7d-0.6d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a==b);

        Integer [] arr={1,2,3};
        List list = Arrays.asList(arr);
        System.out.println("输出前");
//        for (String s:list){
//            System.out.println(s);
//
//        for (String s:list){
//            System.out.println(s);
//        }
        List collect = Arrays.stream(arr).collect(Collectors.toList());
       // collect.forEach(System.out::println);

        Object[] objects = collect.toArray();
        for (Object o:objects){
            System.out.println(o);
        }

    }
}
