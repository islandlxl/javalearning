package com.islandlxl.javalearning.test3;

/*
@project:com.test3
@Title:Apple
@Auther:lxl
@create:2019/2/24,17:03
*/public class Apple {

    private  static long counter;
    private  final long id=counter++;
    public long id(){
        return id;
    }


}
