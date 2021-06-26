package com.islandlxl.javalearning.LeeCode.LinkedList;

import com.islandlxl.javalearning.test.Main;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * 反转链表
 */
public class ReverseList {
    public static ListNode reverseList(ListNode head) {

        ListNode newhead=new ListNode();
        ListNode currentNode= head;
        while (currentNode!=null){
            System.out.print(currentNode.val+" ");
            currentNode=currentNode.next;
        }
        reverse(head,newhead);
        System.out.println();
        while (newhead!=null){
            System.out.print(newhead.val+" ");
            newhead=newhead.next;
        }
        
        return null;
    }

    public static  void reverse(ListNode head,ListNode newHead){
        if (head==null){
            return;
        }
        reverse(head.next,newHead);
        head.next=null;
        newHead=head;
        newHead=newHead.next;

    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;

        ListNode headm = MainreverseList2(head);
        while (headm!=null){
            System.out.print(" " +headm.val);
            headm=headm.next;
        }
    }

    //官方解法--迭代
    public static ListNode MainreverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    //官方解法--递归

    public static ListNode MainreverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = MainreverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }




    public static class ListNode{
        private int val;
        private ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
