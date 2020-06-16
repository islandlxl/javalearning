package com.islandlxl.javalearning.LeeCode.Array;

import java.util.HashMap;
import java.util.Map;

/*
@project:com.LeeCode.Array
@Title:AddTwo
@Auther:lxl
@create:2019/12/10,23:07
两数之和：https://leetcode-cn.com/problems/two-sum/
*/public class AddTwo {

    public static void main(String[] args) {

        int[] nums={2,5,8,11};
        int[] in = twoSum2(nums, 10);
        for(int i=0;i<in.length;i++){
            System.out.println(in[i]);
        }


    }
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
       for(int i=0;i<nums.length;i++){
           int element=target-nums[i];
           if (map.containsKey(element)){
               return new int[]{map.get(element),i};
           }
           map.put(nums[i],i);
       }
       return null;
    }

    public static int[] twoSum2(int[] nums,int target){

        for (int i=0;i<nums.length;i++) {
            int n=target-nums[i];
            for(int j=0;j<nums.length;j++){
             if (i!=j){
                 if (n==nums[j]){
                     return new int[]{i,j};
                 }
             }else{
                 continue;
             }

            }
        }
        return null;
    }
}
