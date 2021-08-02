package com.islandlxl.javalearning.LeeCode.LinkedList;

/**
 * @PACKAGE_NAME: com.islandlxl.javalearning.LeeCode.LinkedList
 * @DESCRIPTION: https://leetcode-cn.com/problems/unique-binary-search-trees/
 * @COMMENT: 奔跑吧, 骚年 96. 不同的二叉搜索树
 * @USER: longxl
 * @DATE: 2021/8/1 11:58
 */
public class UniqueBinarySearchTrees {

    public static void main(String[] args) {

    }
    public int numTrees(int n) {
        int[] G=new int[n+1];
        G[0]=1;
        G[1]=1;
        for (int i = 2; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                G[i]+=G[j-1]*G[i-j];
            }
        }

        return G[n];
    }
}
