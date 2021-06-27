package com.islandlxl.javalearning.HUAWEI.exam;

import java.util.*;

/**
 * 20210627华为测试题：
 * 大概的意思是要 给定一个数组：arrs=[1,2,3,4,2] num=6 连续子串总和为6的最长连续子串？
 */
public class Exam1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String s = in.nextLine();
            int num = in.nextInt();
            int seqNum = getSeqNum(s, num);
            System.out.println("获取的结果："+seqNum);
        }
    }

    public static int getSeqNum(String str,int sum){
        String[] split = str.split(",");
        if (split!=null&&split.length<=0){
            return -1;
        }
       Integer total=0;
        List resultList =new ArrayList<Integer>();
        List<Integer> resultSet=new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            for (int j = i; j < split.length; j++) {
               int currNum=Integer.valueOf(split[j]);
               total+=currNum;
               if (total<sum){
                   resultList.add(currNum);
               }else if (total>sum){
                   resultList.clear();
                   total=0;
                    break;
               }else{
                   resultList.add(currNum);
                   total=0;
                   resultSet.add(resultList.size());
                   resultList.clear();
                   break;
               }
            }
        }
        int max=-1;
        if (resultSet!=null&&resultSet.size()>0){
            for (int i = 0; i <resultSet.size(); i++) {
                 max =Math.max(max , resultSet.get(i));
            }
        }
        return max;
    }

}
