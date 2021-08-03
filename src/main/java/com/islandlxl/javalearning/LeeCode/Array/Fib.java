package com.islandlxl.javalearning.LeeCode.Array;

/**
 * https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 斐波拉契
 */
 public class Fib {
    public static void main(String[] args) {
        System.out.println(fib(44));
    }
    public  static  int fib(int n) {
        if (n<2){
            return n;
        }
        long[] res =new long[n+1];
        res[0]=0;
        res[1]=1;
        for (int i = 2; i <= n; i++) {
            res[i]=res[i-1]+res[i-2];
            res[i]%=(Math.pow(10,9)+7);
        }

        return (int) res[n];
    }

}
