package com.islandlxl.javalearning.LeeCode.LinkedList;

import com.islandlxl.javalearning.test.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @PACKAGE_NAME: com.islandlxl.javalearning.LeeCode.LinkedList
 * @DESCRIPTION: https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 * @COMMENT: 奔跑吧, 骚年 102. 二叉树的层序遍历
 * @USER: longxl
 * @DATE: 2021/7/28 21:52
 */
public class OrderTraversal {

    public static void main(String[] args) {
        OrderTraversal traversal = new OrderTraversal();


        TreeNode root = new TreeNode(3);
        TreeNode l1 = new TreeNode(9);
        TreeNode r1 = new TreeNode(20);
        TreeNode l2 = new TreeNode(15);
        TreeNode r2 = new TreeNode(7);

        root.left=l1;
        root.right=r1;
        r1.left=l2;
        r1.right=r2;
        List<List<Integer>> lists = traversal.levelOrder(root);
        for (List<Integer> ls:lists){

            System.out.println();
            for (Integer l:ls){
                System.out.print("l = " + l + " ");
            }
        }

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<TreeNode> treeNodes = new ArrayList<>();
        treeNodes.add(root);
        Dfs(resultList,treeNodes);
        return resultList;
    }
    public void Dfs(List<List<Integer>> resultList,List<TreeNode> currListNodes){
        List<Integer> list = new ArrayList<>();
        List<TreeNode> nextNodes = new ArrayList<>();
        if (currListNodes.size()<=0||currListNodes.get(0)!=null){
            return;
        }

        for (TreeNode node:currListNodes){
            list.add(node.val);
            if (node.left!=null){
                nextNodes.add(node.left);
            }
            if (node.right!=null){
                nextNodes.add(node.right);
            }
        }
        resultList.add(list);
        currListNodes=nextNodes;
        Dfs(resultList,currListNodes);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
