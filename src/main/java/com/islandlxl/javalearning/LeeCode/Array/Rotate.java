package com.islandlxl.javalearning.LeeCode.Array;

/*
@project:com.LeeCode.Array
@Title:Rotate
@Auther:lxl
@create:2020/2/16,13:56
https://leetcode-cn.com/problems/rotate-array/  旋转数组
*/public class Rotate {

    public static void main(String[] args) {

       int[] nums={1,2,3,4,5,6,7};
       solution3(nums,3);



    }
    public static void solution(int[] nums,int k){
        int [] tempNums=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            tempNums[(i+k)%nums.length]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=tempNums[i];
        }
        for(int i=0;i<nums.length;i++){
            System.out.println("输出第"+i+"个"+nums[i]);
        }
    }
    //翻转
    public static void solution2(int[] nums,int k){
        k%=(nums.length);
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        for(int i=0;i<nums.length;i++){
            System.out.println("输出:"+nums[i]);
        }
    }
    public static void reverse(int[] nums,int start,int end){
         int temp;
         while (start<end){
             temp=nums[start];
             nums[start]=nums[end];
             nums[end]=temp;
             start++;
             end--;
         }
    }
    //旋转算法
    public static void solution3(int[] nums,int k){
        k%=nums.length;
        int count=0;
        for(int start=0;count<nums.length;start++){
            int current=start;
            int pre=nums[start];
            do {
                int next=(current+k)%nums.length;

                int temp=nums[next];
                nums[next]=pre;
                pre=temp;

                current=next;
                count++;
            }while(start!=current);
        }
        for(int i=0;i<nums.length;i++){
            System.out.println("输出:"+nums[i]);
        }
    }
}
