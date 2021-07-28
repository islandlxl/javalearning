package com.islandlxl.javalearning.LeeCode.LinkedList;

/**
 * @PACKAGE_NAME: com.islandlxl.javalearning.LeeCode.LinkedList
 * @DESCRIPTION: https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * @COMMENT: 奔跑吧, 骚年 105. 从前序与中序遍历序列构造二叉树
 * @USER: longxl
 * @DATE: 2021/7/25 22:30
 */
public class Traversal {
    public static void main(String[] args) {

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {


        return null;
    }
    public void binary(TreeNode head){
        if (head==null){
            return;
        }
        binary(head.left);
        binary(head.right);

    }


     public  static class TreeNode{
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
