package com.islandlxl.javalearning.HUAWEI;

/*
@project:com
@Title:Str
@Auther:lxl
@create:2019/2/19,22:21
*/public class Str {


    public static void main(String[] args) {

        String a="abc";
        String b="abc";
        String aa=new String("abc");
        System.out.println(a==b);
        System.out.println(a.equals(aa));
        String s = new String("a" + "b" + "c");
        System.out.println(aa==s);

        System.out.println("=============");
        int x=50;
        int y=50;
        System.out.println(x==y);
        int m=200;
        int n=200;
        System.out.println(m==n);
        

    }

}

