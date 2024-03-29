package com.islandlxl.javalearning.LeeCode.DynamicProgramming;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/interleaving-string/
 * 97. 交错字符串
 */
public class InterleavingString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            String c = scanner.nextLine();
            InterleavingString interleavingString = new InterleavingString();
            boolean interleave = interleavingString.isInterleave(a, b, c);
            System.out.println("判断是否是交错字符串: "+(interleave?"是":"否"));
        }

    }
    public boolean isInterleave(String s1, String s2, String s3) {
        int m=s1.length();int n=s2.length();int k=s3.length();
        boolean[][] dp=new boolean[m+1][n+1];
        dp[0][0]=true;
        for (int i = 0; i <=m; i++) {
            for (int j = 0; j <= n; j++) {
                int p=i+j-1;
                if (i>0){
                   dp[i][j]=dp[i][j]||(dp[i-1][j]&&s1.charAt(i-1)==s3.charAt(p));
                }
                if (j>0){
                    dp[i][j]=dp[i][j]||(dp[i][j-1]&&s2.charAt(j-1)==s3.charAt(p));
                }
            }
        }

        return dp[m][n];
    }
}
