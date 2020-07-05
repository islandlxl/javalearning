package com.islandlxl.javalearning.HUAWEI.DP;

import java.util.Scanner;

/*
@project:com.islandlxl.javalearning.HUAWEI.DP
@Title:Apple
@Auther:lxl
@create:2020/7/4,11:00
将M个苹果放到N个盘子中
*/
public class Apple {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String[] s = scanner.nextLine().split(" ");
            if (s.length==2){
                int num1=Integer.valueOf(s[0]);
                int num2=Integer.valueOf(s[1]);
                int allMethod = getAllMethod(num1, num2);
                System.out.println("===>>>"+allMethod);

            }
        }
    }

    public static int getAllMethod(int num1,int num2){
       if (num1<0){
           return 0;
       }
       if (num1==1||num2==1){
           return 1;
       }

       return getAllMethod(num1,num2-1)+getAllMethod(num1-num2,num2);

    }
}
