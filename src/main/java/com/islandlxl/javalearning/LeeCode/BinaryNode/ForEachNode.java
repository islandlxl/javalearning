package com.islandlxl.javalearning.LeeCode.BinaryNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/
 * 剑指 Offer 32 - II. 从上到下打印二叉树 II
 */
public class ForEachNode {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        TreeNode l1 = new TreeNode(9);
        TreeNode ll1 = new TreeNode(4);
        TreeNode rr2 = new TreeNode(10);
        TreeNode r1 = new TreeNode(20);
        TreeNode l2 = new TreeNode(15);
        TreeNode r2 = new TreeNode(7);
        root.left=l1;
        l1.left=ll1;
        l1.right=rr2;
        root.right=r1;
        r1.left=l2;
        r1.right=r2;
        ForEachNode forEachNode = new ForEachNode();
        List<List<Integer>> lists = forEachNode.levelOrder(root);
        for (List<Integer> l:lists){
            System.out.println();
            for (Integer i:l){
                System.out.print(i+" ");
            }
        }

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultList =new ArrayList<>();
        if (root==null){
            return resultList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for (int i = queue.size(); i >0 ; i--) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
            resultList.add(temp);
        }
        return resultList;
    }



    static public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
   }
}
