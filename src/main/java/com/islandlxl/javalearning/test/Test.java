package com.islandlxl.javalearning.test;

import java.util.List;

/*
@project:com.islandlxl.javalearning.test
@Title:Test
@Auther:lxl
@create:2020/5/21,22:29
*/public class Test {

    public <T> void test(List<? super T> des,List<T> list){
        for (T t:list){
            des.add(t);
        }
    }
}
