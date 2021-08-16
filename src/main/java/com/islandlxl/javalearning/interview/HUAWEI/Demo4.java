package com.islandlxl.javalearning.interview.HUAWEI;

import java.util.Scanner;

/*
@project:com
@Title:Demo
@Auther:lxl
@create:2019/10/19,10:07
*/public class Demo4 {
    /**
     *

     •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
     •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
     * @param args
     */

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

            while (scanner.hasNext()){
                int num = Integer.valueOf(scanner.nextLine());
                String[] s = new String[num];
                for(int i=0;i<num;i++){
                     s[i] = scanner.nextLine();
                }
                for (String ss :s) {
                    int ssSize=ss.length();

                    while (ssSize>8) {
                        System.out.println(ss.substring(0, 8));
                        ss=ss.substring(8);
                        ssSize = ss.length();

                    }
                    if(ssSize<=8&&ssSize>0){
                        System.out.println(addZeroToStr(ss));
                    }

                }
        }
    }
    /**
     * 字符串补0
     */
     public static String addZeroToStr(String s){

         while (s.length()<8){
           StringBuffer sb=new StringBuffer();
           sb.append(s).append("0");
           s=sb.toString();

       }

        return s;
     }

}
