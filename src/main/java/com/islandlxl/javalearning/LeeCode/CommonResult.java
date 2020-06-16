package com.islandlxl.javalearning.LeeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
@project:com.IO
@Title:IOTest
@Auther:lxl
@create:2019/9/8,11:20
https://leetcode-cn.com/explore/featured/card/top-interview-questions-easy/1/array/26/
*/
public class CommonResult extends ClassLoader{

    public static void main(String[] args) {


        int[] arr1={1,2,2,1};
        int[] arr2={2,2};
        int[] intersect = intersect(arr1, arr2);

        for (Integer o :intersect) {
            System.out.print(o+" ");
        }

    }



    public static int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list=new ArrayList<>();
       int i=0,j=0;
       while (i<nums1.length&&j<nums2.length) {
           if (nums1[i]<nums2[j]) i++;
           else if (nums1[i]>nums2[j]) j++;
           else {
               list.add(nums1[i]);
               i++;
               j++;
           }

       }
       int[] arr=new int[list.size()];
       for(int k=0;k<list.size();k++){
            arr[k]=list.get(k);
       }

       return arr;
    }

}
