package com.islandlxl.javalearning.LeeCode.LinkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 * 相交链表
 */
public class SinglyLinkedList {

    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode8 = new ListNode(8);
        ListNode listNode42 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        headA.next=listNode1;
        listNode1.next=listNode8;
        listNode8.next=listNode42;
        listNode42.next=listNode5;

        ListNode headB = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        ListNode listNod1 = new ListNode(1);
        ListNode listNod8 = new ListNode(8);
        ListNode listNod4 = new ListNode(4);
        ListNode listNod5 = new ListNode(5);
        headB.next=listNode6;
        listNode6.next=listNod1;
        listNod1.next=listNod8;
        listNod8.next=listNod4;
        listNod4.next=listNod5;

        System.out.println(getIntersectionNd(headA,headB));
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA=headA;
        ListNode currB=headB;
        int lenA=0,lenB=0;
        while (currA!=null){
            currA=currA.next;
            lenA++;
        }
        while (currB!=null){
            currB=currB.next;
            lenB++;
        }
        currA=headA;
        currB=headB;
        if (lenA<lenB){
            int temp=lenA;
            lenA=lenB;
            lenB=temp;
            ListNode tempNode=currA;
            currA=currB;
            currB=tempNode;
        }

        int gap=lenA-lenB;
        while (gap>0){
           currA=currA.next;
            gap--;
        }
        for (int i = 0; i <lenB ; i++) {
            if (currA.val==currB.val){
                System.out.println(currA.val);
                return currA;
            }
            currA=currA.next;
            currB=currB.next;
        }

        return null;
    }
    private static class  ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    //官方题解
    public static ListNode getIntersectionNd(ListNode headA, ListNode headB) {

        Set<ListNode> visited = new HashSet<>();
        ListNode temp = headA;
        while (temp != null) {
            visited.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null) {
            if (visited.contains(temp)) {
                System.out.println(temp.val);
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }


}
