package com.islandlxl.javalearning.集合;

import java.util.*;

/*
@project:com.集合
@Title:MaptoList
@Auther:lxl
@create:2019/2/23,12:19
*/public class MaptoList {

    public static void main(String[] args) {

//        这是map转为set集合
        Map<String,String> map=new HashMap<String, String>();
        map.put("1","aa");
        map.put("2","bb");
        map.put("3","cc");

        System.out.println("map中的key转为set");
        Set<String> set = map.keySet();

        set=new HashSet(map.values());
        System.out.println("map中的value转为set"+set);

        System.out.println("================map转为list====================");

        List<String> list=new ArrayList<>(map.keySet());
        list=new ArrayList<>(map.values());

        System.out.println("输出是map转为list："+list);





    }

}
