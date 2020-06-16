package com.islandlxl.javalearning.LeeCode.String;

import jdk.nashorn.internal.ir.annotations.Ignore;
import sun.security.util.Length;

/*
@project:com.islandlxl.javalearning.LeeCode.String
@Title:findMaxSequence
@Auther:lxl
@create:2020/5/20,22:12
https://leetcode-cn.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/
*/public class findMaxSequence {


    public static void main(String[] args) {
//  a e i o u
        String s="sdasdasegtre";


    }

    public static int findMaxSequence(String s){


        String str = ifHasSequence(s);
        if (str!=null&& str.length()>0){

        }else{
            return s.length();
        }
        return 0;
    }

    public static String  ifHasSequence(String s){
      StringBuilder sb=new StringBuilder();
       if (s!=null&&s.trim().length()>0){
           char[] chars = s.toCharArray();

           for (int i = 0; i <chars.length ; i++) {
               if (chars[i]=='a'){
                   sb.append(chars[i]);
               }else if (chars[i]=='e'){
                   sb.append(chars[i]);
               }else if (chars[i]=='i'){
                   sb.append(chars[i]);
               }else if (chars[i]=='o'){
                   sb.append(chars[i]);
               }else if (chars[i]=='u'){
                   sb.append(chars[i]);
               }
           }
       }
        return sb.toString();
    }

}
