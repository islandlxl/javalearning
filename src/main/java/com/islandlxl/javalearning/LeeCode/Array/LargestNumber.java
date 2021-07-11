package com.islandlxl.javalearning.LeeCode.Array;

import java.math.BigInteger;

/**
 * @PACKAGE_NAME: com.islandlxl.javalearning.LeeCode.Array
 * @DESCRIPTION:  https://leetcode-cn.com/problems/largest-number/
 * @COMMENT: 奔跑吧, 骚年
 * @USER: longxl
 * @DATE: 2021/7/10 22:45
 */
public class LargestNumber {

    public static void main(String[] args) {
        int[] arr={3,30,34,5,9};
        //int[] arr={432,43243};
       // int[] arr={999999991,9};
        //int[] arr={999999998,999999997,999999999};
       // int[] arr={10,2};
        String s = largestNumber(arr);
        System.out.println("s = " + s);

    }
    public static String largestNumber(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for ( int j = i+1; j < nums.length ; j++) {
                long aa=Long.valueOf(String.valueOf(nums[i])+String.valueOf(nums[j]));
                long bb=Long.valueOf(String.valueOf(nums[j])+String.valueOf(nums[i]));
                if (bb>aa){
                   int temp=nums[i];
                   nums[i]= nums[j];
                   nums[j]=temp;

                }
            }

        }
        StringBuilder sb=new StringBuilder();
        for (int a:nums){
            sb.append(a);
        }
        ;
        if (sb.toString().charAt(0)=='0'){
            return "0";
        }
        return sb.toString();
    }

}
