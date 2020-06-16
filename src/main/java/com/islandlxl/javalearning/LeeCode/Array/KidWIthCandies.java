package com.islandlxl.javalearning.LeeCode.Array;

import java.util.ArrayList;
import java.util.List;

/*
@project:com.islandlxl.javalearning.LeeCode.Array
@Title:KidWIthCandies
@Auther:lxl
@create:2020/6/15,18:36
https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
*/public class KidWIthCandies {

    public static void main(String[] args) {


        int[] arr={1,20,9,4,5};
        System.out.println(  solution(arr,11).toString());
    }

    public static List<Boolean> solution(int[] candies,int extraCandies){

        List<Boolean> list=new ArrayList<>();
        int max = getMax(candies);
        for (int  c :candies) {
            if (extraCandies+c>=max){
                list.add(true);
            }else{
                list.add(false);
            }
        }


        return list;
    }
    public static int getMax(int[] candies){


        if (candies!=null&&candies.length>0){

            if (candies.length==1){
                return candies[0];
            }
            int max= Math.max(candies[0],candies[1]);
            for (int i = 2; i <candies.length ; i++) {
                 max = Math.max(max, candies[i]);
            }
            return max;
        }
        return -1;
    }


}
