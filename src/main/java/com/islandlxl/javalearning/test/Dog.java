package com.islandlxl.javalearning.test;

/*
@project:com.islandlxl.javalearning.test
@Title:Dog
@Auther:lxl
@create:2020/5/21,22:00
*/public class Dog implements Animal {
    @Override
    public String say(Object o) {
        System.out.println("i am dog");

        return "dog";
    }
}
