package com.islandlxl.javalearning.Base.集合;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
@project:com.集合
@Title:ListtoSet
@Auther:lxl
@create:2019/2/23,12:05
*/public class ListtoSet {


    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");

        Set<String> set=new HashSet<>(list);
        System.out.println("输出的list转化为set:"+set);

        System.out.println("=============set转为list==============");

        list=new ArrayList<>(set);
        System.out.println("set转为list"+list);

    }
}
