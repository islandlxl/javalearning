package com.islandlxl.javalearning.LeeCode.Easy;

/*
@project:com.islandlxl.javalearning.LeeCode.String
@Title:IsPalindrome
@Auther:lxl
https://leetcode-cn.com/problems/palindrome-number/  判断是否是回文数
@create:2020/6/25,18:59
*/public class IsPalindrome {

    public static void main(String[] args) {

        boolean palindrome = isPalindrome2(12321);
        System.out.println("输出结果："+palindrome);
    }
    public static boolean isPalindrome(int x) {

        StringBuilder sb=new StringBuilder();
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        for(int i=chars.length-1;i>=0;i--){
            sb.append(chars[i]);
        }
        if (sb.toString().equals(s)){
            return true;
        }

        return false;

    }
    //官方解法
    public static boolean isPalindrome2(int x){
        if (x<=0){
            return false;
        }
        int sum=0;
        while (x!=0){
           sum=sum*10+x%10;
           x=x/10;
            if (sum==x||sum/10==x){
              return true;
            }

        }
        System.out.println("sum:"+sum);


        return false;
    }


}
