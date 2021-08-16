package com.islandlxl.javalearning.LeeCode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
@project:com.LeeCode.Array
@Title:AddThree
@Auther:lxl
@create:2019/12/30,23:23
https://leetcode-cn.com/problems/3sum/  3个数之和
*/public class AddThree {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String next = scanner.next();

        }


    }
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> lists=new ArrayList<>();

        if (nums.length<3){
            return lists;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if (nums[i]>=0){
                break;
            }
            int l=i+1;
            int r=nums.length-1;
            if (i>0&&nums[i-1]==nums[i]) continue;

            while (l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if (sum==0){
                    lists.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while (l<r&&nums[l]==nums[l+1]){
                        l++;
                    }
                    while (l<r&&nums[r]==nums[r-1]){
                        r--;
                    }
                    l++;
                    r--;
                }else if (sum>0){
                    r--;
                }else if (sum<0){
                    l++;
                }
            }

        }

     return null;
    }
}



