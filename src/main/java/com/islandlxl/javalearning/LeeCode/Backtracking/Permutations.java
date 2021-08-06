package com.islandlxl.javalearning.LeeCode.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Permutations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String nextLine = scanner.nextLine();
            String[] splitStr = nextLine.split(" ");
            int[] nums=new int[splitStr.length];
            for (int i = 0; i < splitStr.length; i++) {
                nums[i]=Integer.valueOf(splitStr[i]);
            }
            Permutations permutations = new Permutations();
            List<List<Integer>> permute = permutations.permute(nums);
            System.out.println("所有的可能排列");
            for (List<Integer> p:permute){
                for (Integer i:p){
                    System.out.print(i+" ");
                }
                System.out.println();
            }

        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultLists = new ArrayList<>();
        if (nums==null||nums.length==0){
            return resultLists;
        }
        boolean[] used = new boolean[nums.length];
        brackTrace(resultLists,0,nums,new ArrayList<Integer>());
        return resultLists;
    }
    public void brackTrace(List<List<Integer>> resultList,int index,int [] nums,List<Integer> subResult){
        if (index==nums.length){
            List<Integer> copyList = new ArrayList<>();
            copyList.addAll(subResult);
            resultList.add(copyList);
        }else{
            for (int i = 0; i < nums.length; i++) {
                if (!subResult.contains(nums[i])){
                    subResult.add(nums[i]);
                    brackTrace(resultList,index+1,nums,subResult);
                    subResult.remove(subResult.size()-1);
                }
            }
        }

    }
}

