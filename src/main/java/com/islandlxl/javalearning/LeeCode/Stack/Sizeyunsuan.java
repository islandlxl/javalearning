package com.islandlxl.javalearning.LeeCode.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/*
@project:com.LeeCode.Stack
@Title:Sizeyunsuan
@Auther:lxl
@create:2019/12/15,11:43
 使用栈实现四则运算：加减乘除   数字
*/public class Sizeyunsuan {

    private  static  Map<Character,Character> map=new HashMap<>();
    static {
       map.put('*','1');
       map.put('/','1');
       map.put('+','2');
       map.put('-','2');
    }

    public static int  solution(String s){
        Stack<Integer> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if (map.containsKey(chars[i])){
                 if (stack2.empty()){
                     stack2.push(chars[i]);
                     continue;
                 }

                int a=stack1.pop();
                int b=stack1.pop();
                int sum=0;
                switch (chars[i]){
                   case '*': sum=a*b; break;
                   case '/': sum=a/b; break;
                   case '+': sum=a+b; break;
                   case '-': sum=a-b; break;
                }

            }else{
                String s1 = String.valueOf(chars[i]);
                stack1.push(Integer.parseInt(s1));
            }

        }


        return stack1.pop();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.next();
            int solution = solution(s);
            System.out.println("结果是："+solution);

        }
    }
}
