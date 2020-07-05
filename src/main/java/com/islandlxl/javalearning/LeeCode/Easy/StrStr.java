package com.islandlxl.javalearning.LeeCode.Easy;

/*
@project:com.islandlxl.javalearning.LeeCode.Easy
@Title:StrStr
@Auther:lxl
https://leetcode-cn.com/problems/implement-strstr/
@create:2020/6/25,21:04
*/public class StrStr {

    public static void main(String[] args) {

        String a=" ";
        System.out.println(strStr("aabbad","bba"));
        System.out.println("aabbad".substring(2,5));
    }

    public static int strStr(String haystack, String needle) {

        if (needle.equals("")||needle.equals(" ")){
            return 0;
        }
        if (haystack.trim().equals("")||needle.length()>haystack.length()){
            return -1;
        }
        char[] chars = haystack.toCharArray();

        int needLength = needle.length();
        for(int start=0;start<chars.length-needLength;start++){
            if (haystack.substring(start,start+needLength).equals(needle)){
                return start;
            }
        }
        return -1;
    }
}
