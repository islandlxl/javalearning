package com.islandlxl.javalearning.HUAWEI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
@project:com.islandlxl.javalearning.HUAWEI
@Title:IsPrime
@Auther:lxl
@create:2020/6/30,22:50
*/public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int i = scanner.nextInt();
//            boolean prime = isPrime(i);
//            System.out.println(prime?"是素数":"不是素数");

            get(i);


        }

    }
    //判断是不是素数!
    public static boolean isPrime(int num){
        int i=2;
        for (; i <num ; i++) {
            if (num%i==0){
                return false;
            }
        }
        if (i==num){
            return true;
        }
        return false;
    }
    //求所有的质数
    public static List<Integer> getAllzhi(int num){
        List<Integer> list=new ArrayList<>();

        int i=2;
        int target=num;
        while (target!=0||i<num){
            if (target%i==0){
                target=target/i;
                list.add(i);
                i=2;
                continue;
            }
            if (i==num){
                list.add(i);
            }
            i++;
        }
        return list;
    }

    public static void get(int num){
        int i=2;
        int temp;
        if (num%i==0){
            System.out.println(i);
           get(num/i);
        }
        i++;
        if (i==num){
            System.out.println(i);
        }

    }

}
