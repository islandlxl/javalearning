package com.islandlxl.javalearning.Base.BinaryTree;

/*
@project:com.BinaryTree
@Title:BinarySearchTree
@Auther:lxl
@create:2020/5/1,9:43
二叉搜索树
*/
public class BinarySearchTree {

    public static class Node{

        private int num;
        private Node left;
        private Node right;
        private Node parent;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public Node(int num) {
            this.num = num;
        }
    }

    /*获取数的深度*/
    public static int getTreeDepth(Node root){

        return root==null?0:(1+Math.max(getTreeDepth(root.left),getTreeDepth(root.right)));
    }


    public static void main(String[] args) {
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node5=new Node(5);

        Node node7=new Node(7);
        Node node8=new Node(8);
        Node node9=new Node(9);

        Node root=new Node(6);
        root.left=node4;
        node4.left=node3;
        node4.right=node5;

        root.right=node8;
        node8.left=node7;
        node8.right=node9;

        int treeDepth = getTreeDepth(root);
        System.out.println("树的深度为:"+treeDepth);
        System.out.println("后继节点为:"+findSuccessor(root).num);

    }
    /*查找后继节点*/
    public static Node findSuccessor(Node node){

        if (node.right==null){
            return node;
        }
        Node curr=node.right;
        Node pre=node.right;

        while (curr!=null){
            pre=curr;
            curr=curr.left;
        }
        return pre;
    }

}
