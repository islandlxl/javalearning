package com.islandlxl.javalearning.LeeCode.DynamicProgramming;

/**
 * @PACKAGE_NAME: com.islandlxl.javalearning.LeeCode.DynamicProgramming
 * @DESCRIPTION: https://leetcode-cn.com/problems/unique-paths/
 * @COMMENT: 奔跑吧, 骚年 ====》》》》不同路径
 * @USER: longxl
 * @DATE: 2021/7/14 21:35
 *
 */
public class UniquePaths {

    public static void main(String[] args) {
        int result = uniquePaths(3, 7);
        System.out.println("result = " + result);
    }
    public static int uniquePaths(int m, int n) {
        int [][] dp =new int[m][n];
       // dp[0][1]=1;dp[1][0]=1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0||j==0){
                    dp[i][j]=1;
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }

        return dp[m-1][n-1];
    }
}
