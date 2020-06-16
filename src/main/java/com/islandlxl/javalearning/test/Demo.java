package com.islandlxl.javalearning.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
@project:com.islandlxl.javalearning.test
@Title:Demo
@Auther:lxl
@create:2020/5/23,0:27
*/
public class Demo {

    public static void main(String[] args) {

        Map<Integer,Map<Integer,String>> map=new HashMap<>();
        for (int j = 0; j <300 ; j++) {
            Map<Integer,String> map1=new HashMap<>();
            for (int i = 0; i < 5000; i++) {
                map1.put(i,"lxl"+i);
            }
            map.put(j,map1);
        }
        Iterator<Integer> iterator = map.keySet().iterator();

        while (iterator.hasNext()){

            Integer next = iterator.next();

            System.out.println("next的值为:"+next);
            Map<Integer, String> stringMap = map.get(next);

            Iterator<Integer> iterator1 = stringMap.keySet().iterator();
            while (iterator1.hasNext()){
                Integer next1 = iterator1.next();
                String s = stringMap.get(next1);
                System.out.println("s的值为："+s);
            }
        }


    }
}
