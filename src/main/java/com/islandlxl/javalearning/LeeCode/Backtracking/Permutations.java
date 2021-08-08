package com.islandlxl.javalearning.LeeCode.Backtracking;

import java.util.*;

/**
 * 46. 全排列
 * https://leetcode-cn.com/problems/permutations/
 *
 */
//
// StringBuffer 类型删除 delete最后两位 delete(start,end) end 应该取大于所在位置的值
public class Permutations {

    public static void main2(String[] args) {

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
        brackTrace(resultLists,0,nums,new ArrayList<Integer>(),new boolean[nums.length],new StringBuffer(),new ArrayList<String>());
        return resultLists;
    }
    public void brackTrace(List<List<Integer>> resultList,int index,int [] nums,ArrayList<Integer> subResult,boolean[] traceLists,StringBuffer traceStr,List<String> resultStr){
        if (index==nums.length){
            List<Integer> copyList = new ArrayList<>();
            copyList.addAll(subResult);
            if (!resultStr.contains(traceStr.toString())){
                resultList.add(copyList);
                resultStr.add(traceStr.toString());
            }
        }else{
            for (int i = 0; i < nums.length; i++) {
                if (!traceLists[i]){
                    subResult.add(nums[i]);
                    traceLists[i]=true;
                    traceStr.append(String.valueOf(nums[i]));
                    brackTrace(resultList,index+1,nums,subResult,traceLists,traceStr,resultStr);
                    subResult.remove(subResult.size()-1);
                    traceLists[i]=false;
                    if (traceStr.length()-2>=0&&traceStr.charAt(traceStr.length()-2)=='-')
                        traceStr.deleteCharAt(traceStr.length()-1).deleteCharAt(traceStr.length()-1);
                    else{
                        traceStr.deleteCharAt(traceStr.length()-1);
                    }
                }
            }
        }

    }


}

