package com.islandlxl.javalearning.LeeCode.Array;

import java.util.Arrays;

/*
@project:com.LeeCode.Array
@Title:AddThreeClosed
@Auther:lxl
@create:2020/1/26,11:05
https://leetcode-cn.com/problems/3sum-closest/ 三个数之和且最接近的
*/public class AddThreeClosed {

    public static void main(String[] args) {

        int []nums={3,46,78,233,9};
        int sumClosest = threeSumClosest(nums, 79);

        System.out.println("sumClosest:"+sumClosest);

    }
    public static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int ans=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++){
           int start=i+1,end=nums.length-1;

            while (start<end){
                int sum=nums[start]+nums[end]+nums[i];
                if (Math.abs(target-sum)<Math.abs(target-ans)){
                    ans=sum;
                }
                if (sum>target){
                    end--;
                }else if (sum<target){
                    start++;
                }else{
                    return ans;
                }
            }

        }

        return ans;
    }
}
