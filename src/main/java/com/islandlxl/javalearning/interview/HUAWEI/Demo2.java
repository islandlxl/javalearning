package com.islandlxl.javalearning.interview.HUAWEI;

import java.util.Scanner;

/*
@project:com
@Title:Demo
@Auther:lxl
@create:2019/10/19,10:07
*/public class Demo2 {


    public static void main(String[] args) {

       // String str="hello world  owieowie";
        Scanner s1=new Scanner(System.in);
         String  str1 =s1.nextLine();
          String  c=s1.next();

       int num= matchLength(str1,c);
        System.out.print(num);
    }
    public  static int matchLength(String str,String c){
        int count=0;
        String [] cc=str.split("");
      
        for (String s :cc) {
            if(s.equalsIgnoreCase(c)){
                count++;
            }

        }

      return count;
    }
}
