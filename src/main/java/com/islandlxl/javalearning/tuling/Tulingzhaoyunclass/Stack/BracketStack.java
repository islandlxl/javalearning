package com.islandlxl.javalearning.tuling.Tulingzhaoyunclass.Stack;

import java.util.Scanner;

/*
@project:com.tuling.Tulingzhaoyunclass.Stack
@Title:BracketStack
@Auther:lxl
@create:2019/12/14,14:48
  实现{【】}括号匹配问题
*/
public class BracketStack{



    public static boolean isOk(String s){
        MyStatck<Character> myStatck = new MyStatck<>(20);
        char[] chars = s.toCharArray();
        Character top;
        for (char c :chars) {
            switch (c){
                case '{' :
                case '[' :
                case '(' :
                    myStatck.push(c);
                    break;
                case '}':
                     top = myStatck.pop();
                    if (top==null){
                        return false;
                    }
                    if (top=='{'){
                        break;

                    }else{
                        return false;
                    }
                case ']':
                     top = myStatck.pop();
                    if (top==null){
                        return false;
                    }
                    if (top=='['){
                        break;
                    }else{
                        return false;
                    }
                case ')':
                    top = myStatck.pop();
                    if (top==null){
                        return false;
                    }
                    if (top=='('){
                        break;
                    }else{
                        return false;
                    }
                   default: break;

            }

        }
        return myStatck.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNext()){
            String str = scanner.next();
            System.out.println(isOk(str));
        }

    }

}
