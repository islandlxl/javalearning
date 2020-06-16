package com.islandlxl.javalearning.HUAWEI;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo5{

    /**
     * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）
     * @param args
     */
    public static void main(String[] args) {

        String regx1="[0x0-9]";
        String regx2="[0xA-F]";
      String[] s16tr={"A","B","C","D","E","F"};
      Scanner scanner=new Scanner(System.in);
      while (scanner.hasNext()){

          String c=scanner.next();

          if (Pattern.matches(regx2, c)==true){
              int toNum = exchangeToNum(s16tr, c);
              if (toNum==-1){
                  return;
              }
          }
          if (Pattern.matches(regx1,c)==true){
              System.out.println(c);
          }

      }


    }
    /**
     * 进制转换
     */
    public static int exchangeToNum(String[] s16tr , String c){


        for(int i=0;i<s16tr.length;i++){
           if (s16tr[i].equals(c)){
               return 10+i;
           }

        }
        return -1;
    }

}