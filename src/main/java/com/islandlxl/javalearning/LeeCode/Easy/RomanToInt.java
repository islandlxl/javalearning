package com.islandlxl.javalearning.LeeCode.Easy;

import com.sun.org.apache.regexp.internal.RE;

/*
@project:com.islandlxl.javalearning.LeeCode.Easy
@Title:RomanToInt
@Auther:lxl
https://leetcode-cn.com/problems/roman-to-integer/
@create:2020/6/25,20:13
*/public class RomanToInt {

    public static void main(String[] args) {

        int xlix = romanToInt("DXLIX");
        System.out.println("输出的罗马数字为:"+xlix);
    }

    public static int romanToInt(String s) {


        char[] chars = s.toCharArray();
        int sum=0;
        int last=getNum(chars[0]);
        for (char c:chars){

            int num = getNum(c);

            if (num==-1){
                throw new RuntimeException("不存在！");
            }
            if (last<num){
                sum=sum-last;
                sum=sum+num-last;
            }else{
                sum=sum+num;
            }
            last=num;

        }

        return sum;
    }

    public static int getNum(int c){
        if (c=='I'){
            return 1;
        }else if (c=='V'){
            return 5;
        }else if (c=='X'){
            return 10;
        }else if (c=='L'){
            return 50;
        }else if (c=='C'){
            return 100;
        }else if (c=='D'){
            return 500;
        }else if (c=='M'){
            return 1000;
        }
        return -1;
    }

}
