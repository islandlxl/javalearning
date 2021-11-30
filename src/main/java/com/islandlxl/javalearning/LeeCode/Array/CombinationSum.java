package com.islandlxl.javalearning.LeeCode.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/combination-sum/
 * 39. 组合总和
 */
public class CombinationSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String[] split = line.split(",");
            int[] array=new int[split.length];
            for (int i = 0; i < split.length; i++) {
                array[i]=Integer.valueOf(split[i]);
            }
            int target = scanner.nextInt();
            List<List<Integer>> lists = combinationSum(array, target);
            System.out.println("============输出结果==========");
            for (List<Integer> list:lists) {
                System.out.println();
                for (Integer i:list) {
                    System.out.print(" "+i);
                }
            }

        }

    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resultList=new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(candidates,target,resultList,list,0);
        return resultList;
    }
    public static void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int idx) {

        if (idx==candidates.length){
            return;
        }
        if (target==0){
            ans.add(new ArrayList<Integer>(combine));
            return;
        }
        dfs(candidates,target,ans,combine,idx+1);
        if (target-candidates[idx]>=0){
            combine.add(candidates[idx]);
            dfs(candidates,target-candidates[idx],ans,combine,idx);
            combine.remove(combine.size()-1);
        }

    }


}
