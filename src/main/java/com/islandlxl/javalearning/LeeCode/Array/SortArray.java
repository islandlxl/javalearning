package com.islandlxl.javalearning.LeeCode.Array;

public class SortArray {

    public static void main(String[] args) {
        int [] arr={2,33,71,41,1};
        sortArray(arr);
        for (int i:arr) {
            System.out.print(" "+i);
        }
    }
    /**
     * 插入排序
     */
    public static int[] sortArray(int[] nums) {
        for (int i = 1; i <nums.length ; i++) {
            int temp=nums[i];
            int j;
            for ( j = i-1; j >= 0; j--) {
                if (nums[j]>temp){
                    nums[j+1]=nums[j];
                }else{
                    break;
                }
            }
            nums[j+1]=temp;
        }
        return nums;
    }
}
