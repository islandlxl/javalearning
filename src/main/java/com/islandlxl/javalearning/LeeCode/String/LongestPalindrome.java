package com.islandlxl.javalearning.LeeCode.String;

import java.util.*;

/**
 * @PACKAGE_NAME: com.islandlxl.javalearning.LeeCode.String
 * @DESCRIPTION:https://leetcode-cn.com/problems/longest-palindromic-substring/
 * @COMMENT: 奔跑吧, 骚年 5. 最长回文子串
 * @USER: longxl
 * @DATE: 2021/7/18 21:52
 */
public class LongestPalindrome {
    public static  char[] chars;
    public static void main(String[] args) {
        String aa="abb";
        LongestPalindrome palindrome = new LongestPalindrome();
        String s = palindrome.longestPalindrome(aa);
        System.out.println("s = " + s);

    }
    public  String longestPalindrome(String s) {
        chars=s.toCharArray();
        if (chars.length<=1){
            return s;
        }
        if (chars.length==2){
            return chars[0]==chars[1]?s:String.valueOf(chars[0]);
        }
        Map<Integer,String> map =new HashMap();
        for (int i = 1; i < chars.length-1 ; i++) {
            String str = getPalindrome(i - 1, i);
            if (!map.containsValue(str)){
                map.put(str.length(),str.toString());
            }
            String str2 = getPalindrome(i - 1, i+1);
            if (!map.containsValue(str2)){
                map.put(str2.length(),str2.toString());
            }
            String str3 = getPalindrome(i , i+1);
            if (!map.containsValue(str3)){
                map.put(str3.length(),str3.toString());
            }
        }
        Iterator iterator = map.keySet().iterator();
        int max=1;
        while (iterator.hasNext()){
            Integer next = (Integer) iterator.next();
            max = Math.max(max, next);
        }
        return map.get(max);
    }

    public String getPalindrome(int left, int right){
        StringBuilder sb=new StringBuilder();
        int start=0;
        int end=0;
        while (chars[left]== chars[right]){
            start=left;
            end=right;

            left-=1;
            right+=1;
            if (left<0||right>=chars.length){
                 start=left+1;
                 end=right-1;
                break;
            }
        }
        if (start==end){
            start=left;
            end=left;
        }
        while (start<=end){
            sb.append(chars[start]);
            start++;
        }
        return sb.toString() ;
    }
}
