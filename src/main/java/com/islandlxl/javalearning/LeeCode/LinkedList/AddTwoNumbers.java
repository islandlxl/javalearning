package com.islandlxl.javalearning.LeeCode.LinkedList;

import java.util.*;

/**
 * @PACKAGE_NAME: com.islandlxl.javalearning.LeeCode.LinkedList
 * @DESCRIPTION: https://leetcode-cn.com/problems/add-two-numbers-ii/
 * @COMMENT: 奔跑吧, 骚年 445. 两数相加 II
 * @USER: longxl
 * @DATE: 2021/7/19 22:02
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre=null;
        Deque<Integer> li1 = new LinkedList<>();
        Deque<Integer> li2 = new LinkedList<>();
        while (l1!=null){
            li1.push(l1.val);
            l1=l1.next;
        }
        while (l2!=null){
            li2.push(l2.val);
            l2=l2.next;
        }

        int floatNum=0;
        while (!li1.isEmpty()||!li2.isEmpty()||floatNum!=0){
            int a=li1.isEmpty()?0:li1.pop();
            int b=li2.isEmpty()?0:li2.pop();
            int currNum=a+b+floatNum;
            floatNum=currNum/10==1?1:0;

            ListNode currNode=new ListNode(currNum%10);
            currNode.next=pre;
            pre=currNode;
        }

        return pre;

    }


    static class ListNode{
        int val;
        ListNode next;

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

    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(3);
        ListNode r1 = new ListNode(5);
        ListNode r2 = new ListNode(6);
        ListNode r3 = new ListNode(4);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;

        r1.next=r2;
        r2.next=r3;

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode n3 = addTwoNumbers.addTwoNumbers(l1, r1);

        while (n3!=null){
            System.out.println("n3.val = " + n3.val);
            n3=n3.next;

        }
    }
}
