package com.islandlxl.javalearning.LeeCode.Array;

/*
@project:com.LeeCode.Array
@Title:RemoveDuplicates
@Auther:lxl
@create:2020/1/29,17:13
https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
给你一个数组，要去除重复
*/public class RemoveDuplicates {


    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=nums[n]){
                n+=1;
                nums[n]=nums[i];
            }
        }
        return n+1;
    }
}
