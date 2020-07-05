package com.islandlxl.javalearning.HUAWEI;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
@project:com
@Title:Demo
@Auther:lxl
@create:2019/10/19,10:07
*/public class Demo {


    public static void main(String[] args) {

        String pattern="\\d";
        String str="123";
        int num=123;
        String stss="123";
        System.out.println(num==Integer.valueOf(stss));
        boolean matches = str.matches(pattern);
        System.out.println(pattern);
        System.out.println("123".matches("^-?[1-9]\\d*$"));
       // String str="hello world  owieowie";
//        Scanner s=new Scanner(System.in);
//          String  str =s.nextLine();
//         lastLength(str);
    }
    public  static void lastLength(String str){

        int begin=str.lastIndexOf(" ")+1;
        String newStr=str.substring(begin);
        int length = newStr.length();
        System.out.print(length);
    }
}
