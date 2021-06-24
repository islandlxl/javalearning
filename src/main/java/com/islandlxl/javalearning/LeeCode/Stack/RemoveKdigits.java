package com.islandlxl.javalearning.LeeCode.Stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/remove-k-digits/
 * 移除K位数字
 */
public class RemoveKdigits {

    public static String removeKdigits(String num, int k) {

        if (num.length()<=k){
            return "0";
        }
        Deque<Character> deque=new LinkedList<>();
        char[] chars = num.trim().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i==0){
                deque.push(chars[i]);
            }
            if (i>0){

                Integer lastNum=Integer.valueOf(String.valueOf(deque.peek()));
                Integer currentNum=Integer.valueOf(String.valueOf(chars[i]));
                while (!deque.isEmpty()&&lastNum>currentNum&&k>0) {
                    deque.pop();
                    if (deque.peek()!=null){
                        lastNum=Integer.valueOf(String.valueOf(deque.peek()));
                    }
                    k--;
                }
                deque.push(chars[i]);
            }
        }
        while (k>0){
            deque.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while (!deque.isEmpty()){
            if (sb.length()==0&&deque.peekLast()=='0'){
                deque.pollLast();
                continue;
            }
            sb.append(deque.pollLast());
        }
        return sb.toString().length()>0?sb.toString():"0";
    }

    public static void main(String[] args) {

        String sb="1432219";
        System.out.println(removeKdigits(sb,3));
    }
}
