package com.islandlxl.javalearning.LeeCode.LinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * @PACKAGE_NAME: com.islandlxl.javalearning.LeeCode.LinkedList
 * @DESCRIPTION: https://leetcode-cn.com/problems/symmetric-tree/
 * @COMMENT: 奔跑吧, 骚年 101. 对称二叉树
 * @USER: longxl
 * @DATE: 2021/7/31 21:36
 */
public class SymmetricTree {
/*[1,2,2,3,4,4,3]
* [2,3,3,4,5,5,4,null,null,8,9,null,null,9,8]
* */
    public static void main(String[] args) {
        TreeNode node=new TreeNode(2);
        TreeNode l1=new TreeNode(3);
        TreeNode r1=new TreeNode(3);
        TreeNode l21=new TreeNode(4);
        TreeNode r22=new TreeNode(5);
        TreeNode l23=new TreeNode(5);
        TreeNode r24=new TreeNode(4);
        TreeNode l31=null;
        TreeNode r32=null;
        TreeNode l33=new TreeNode(8);
        TreeNode r34=new TreeNode(9);
        TreeNode l35=null;
        TreeNode r36=null;
        TreeNode l37=new TreeNode(9);
        TreeNode r38=new TreeNode(8);
        node.left=l1;
        node.right=r1;
        l1.left=l21;
        l1.right=r22;
        r1.left=l23;
        r1.right=r24;
        l21.left=l31;
        l21.right=r32;
        r22.left=l33;
        r22.right=r34;
        l23.left=l35;
        l23.right=r36;
        r24.left=l37;
        r24.right=r38;
        SymmetricTree symmetricTree = new SymmetricTree();
        boolean symmetric = symmetricTree.isSymmetric(node);
        System.out.println("symmetric = " + symmetric);
    }
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        return Dfs(root.left,root.right);
    }
    public boolean Dfs(TreeNode left,TreeNode right){
       if (left==null&&right==null){
           return true;
       }
       if (left==null||right==null||left.val!=right.val){
           return false;
       }
       return Dfs(left.left,right.right)&&Dfs(left.right,right.left);
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
