package com.islandlxl.javalearning.test;

/*
@project:com.islandlxl.javalearning.exam
@Title:Pig
@Auther:lxl
@create:2020/5/21,22:01
*/public class Pig implements Animal {
    @Override
    public String say(Object o) {
        System.out.println("i am pig");

        return "pig";
    }
}
