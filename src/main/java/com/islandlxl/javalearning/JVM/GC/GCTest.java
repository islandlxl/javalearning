package com.islandlxl.javalearning.JVM.GC;

/*
@project:com.islandlxl.javalearning.JVM.GC
@Title:GCTest
@Auther:lxl
@create:2020/5/5,21:46
*/public class GCTest {

    public static void main(String[] args) {

        byte[] bytes1,bytes2,bytes3,bytes4,bytes5;


        bytes1=new byte[60000*1024];

        bytes2=new byte[10000*1024];
        bytes3=new byte[10000*1024];
        bytes4=new byte[1000*1024];
        bytes5=new byte[1000*1024];
    }

}
