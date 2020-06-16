package com.islandlxl.javalearning.RTTI;

/*
@project:com.RTTI
@Title:Shape
@Auther:lxl
@create:2019/2/25,9:39
*/ abstract class Shape {

    void draw(){
        System.out.println(this+".draw()");

    }
    abstract public String toString();


}
