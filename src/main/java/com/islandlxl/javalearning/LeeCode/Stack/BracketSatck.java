package com.islandlxl.javalearning.LeeCode.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/*
@project:com.LeeCode.Stack
@Title:BracketSatck
@Auther:lxl
@create:2019/12/15,10:13
https://leetcode-cn.com/problems/valid-parentheses/
*/public class BracketSatck {


    private  static   Map<Character,Character> map=new HashMap<>();

    static {
       map.put('}','{');
       map.put(']','[');
       map.put(')','(');
    }
    public static boolean isValid(String s){
        Stack<Character> stack=new Stack<Character>();
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){

            if (map.containsKey(chars[i])){
                char topElement=stack.isEmpty()?'#':stack.pop();
                if (topElement!=map.get(chars[i])){
                    return false;
                }
            }else{
                stack.push(chars[i]);
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String next = scanner.next();

            System.out.println(isValid(next));
        }
    }


}
