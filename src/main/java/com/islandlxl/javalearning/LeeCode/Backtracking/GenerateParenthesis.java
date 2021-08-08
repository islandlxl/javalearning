package com.islandlxl.javalearning.LeeCode.Backtracking;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/generate-parentheses/
 * 22. 括号生成
 */
public class GenerateParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            GenerateParenthesis generateParenthesis = new GenerateParenthesis();
            List<String> list = generateParenthesis.generateParenthesis(n);
            for (String s:list){
                System.out.print(s+" ");
            }
        }

    }
    public List<String> generateParenthesis(int n) {
        List<String> resultList = new ArrayList<>();
        if (n<=0){
            return resultList;
        }
        brackTrace(resultList,n-1,"()",new StringBuilder());

        return resultList;
    }
    public void brackTrace(List<String> resultList,int n,String tarStr,StringBuilder sb){
        if (sb.length()==n*2){
            StringBuilder builder = new StringBuilder();
            builder.append("(").append(sb).append(")");
            if (isValid(builder.toString())&&!resultList.contains(builder.toString())){
                resultList.add(builder.toString());
            }
        }else{
            for (int i = 0; i < tarStr.length(); i++) {
                sb.append(tarStr.charAt(i));
                brackTrace(resultList,n,tarStr,sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
    public boolean isValid(String str){
        if (str!=null&&str.length()<=0){
            return false;
        }
        Deque<String> deque=new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (!deque.isEmpty()&&deque.peekFirst().equals("(")&&!deque.peek().equals(String.valueOf(str.charAt(i)))){
                deque.pop();
            }else{
                deque.push(String.valueOf(str.charAt(i)));
            }
        }
        return deque.isEmpty()?true:false;
    }


}
