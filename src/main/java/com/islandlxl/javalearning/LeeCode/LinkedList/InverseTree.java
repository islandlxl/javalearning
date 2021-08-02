package com.islandlxl.javalearning.LeeCode.LinkedList;

/**
 * @PACKAGE_NAME: com.islandlxl.javalearning.LeeCode.LinkedList
 * @DESCRIPTION: https://leetcode-cn.com/problems/invert-binary-tree/
 * @COMMENT: 奔跑吧, 骚年 226. 翻转二叉树
 * @USER: longxl
 * @DATE: 2021/8/2 22:53
 */
public class InverseTree {
    public static void main(String[] args) {

    }
    public TreeNode invertTree(TreeNode root) {
       if (root==null){
           return null;
       }
       TreeNode temp=root.left;
       root.left=root.right;
       root.right=temp;
       invertTree(root.left);
       invertTree(root.right);
       return root;
    }

    public static class TreeNode{
        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
