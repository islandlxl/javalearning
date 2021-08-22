package com.islandlxl.javalearning.LeeCode.String;

/**
 * https://leetcode-cn.com/problems/add-strings/
 * 415. 字符串相加
 */
public class AddTwoString {
    public static void main(String[] args) {

        String a="456";
        String b="77";
        AddTwoString addTwoString = new AddTwoString();
        String s = addTwoString.addStrings(a, b);
        System.out.println(s);

    }
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int add=0;
        int res=0;
        StringBuilder sb=new StringBuilder();
        while (i>=0||j>=0){
           int N1= i>=0?num1.charAt(i)-'0':0;
           int N2= j>=0?num2.charAt(j)-'0':0;
           res=(N1+N2+add)%10;
           sb.append(res);
           add=(N1+N2+add)/10>0?1:0;
           i-=1;
           j-=1;
        }
        if (add>0){
            sb.append("1");
        }
        sb.reverse();
        return sb.toString();
    }

}
