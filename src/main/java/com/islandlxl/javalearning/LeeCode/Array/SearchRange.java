package com.islandlxl.javalearning.LeeCode.Array;

/**
 * @PACKAGE_NAME: com.islandlxl.javalearning.LeeCode.Array
 * @DESCRIPTION: https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * @COMMENT: 奔跑吧, 骚年--->>> 34. 在排序数组中查找元素的第一个和最后一个位置
 * @USER: longxl
 * @DATE: 2021/7/11 10:39
 */
public class SearchRange {
    public static void main(String[] args) {
        int[] arr={1,4};
        //int[] arr={5,7,7,8,8,10};
        int[] ints = searchRange(arr, 4);
        for (int a:ints){
            System.out.println("a = " + a);
        }
    }
    public static  int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int start=-1;
        int end =-1;
        int [] result=new int[2];
        if (low==high&&nums[low]==target){
            start=low;
            end=low;
        }
        while (low<=high){
            int mid=(low+high)/2;
            if (nums[mid]>target){
                high=mid-1;
            }else if (nums[mid]<target){
                low=mid+1;
            }else{
               start= mid;
               end=mid;
               while (nums[start]==target){
                   start--;
                   if (start<0||nums[start]!=target){
                       start++;
                       break;
                   }
               }
                while (nums[end]==target){
                    end++;
                    if (end>nums.length-1||nums[end]!=target){
                        end--;
                        break;
                    }
                }
                break;
            }

        }
        result[0]=start;
        result[1]=end;

        return result;
    }
}
