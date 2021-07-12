package com.islandlxl.javalearning.LeeCode.LinkedList;

import java.util.ArrayList;
import java.util.List;

/*
@project:com.LeeCode.LinkedList
@Title:AddTwoLinkList
@Auther:lxl
@create:2019/12/7,22:42
两个链表相加：https://leetcode-cn.com/problems/add-two-numbers/
*/public class AddTwoLinkList {

    public static void main(String[] args) {

        ListNode p1 = new ListNode(2);
        ListNode p2 = new ListNode(4);
        ListNode p3 = new ListNode(3);

        p1.next=p2;
        p2.next=p3;

        ListNode q1 = new ListNode(5);
        ListNode q2 = new ListNode(6);
        ListNode q3 = new ListNode(4);

        q1.next=q2;
        q2.next=q3;

        ListNode listNode = addTwoNumbers(p1, q1);
        ListNode curr=listNode;
        while (curr!=null){
            System.out.print("curr = " + curr.val);
            curr=curr.next;
        }
    }
    //此答案错误
    public static ListNode solution(ListNode l1, ListNode l2){
        ListNode l3 = new ListNode(0);
        ListNode prev = l3;
        while (l1 != null && l2 != null){
            int val = l1.val + l2.val;
            if(val > 9){
                prev.val += 1;
            }
            l1 = l1.next;
            l2 = l2.next;
            ListNode ld = new ListNode(val > 9 ? val-10 : val);
            prev.next = ld;
            prev = prev.next;
        }

        return l3.next;
    }
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val = x;
        }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int floatNum=0;
        int sumNum=0;
        int  nextVal=0;
        List<Integer> list=new ArrayList<>();
        while (l1!=null||l2!=null){
            if (l1!=null&&l2!=null){
                sumNum= l1.val+l2.val+floatNum;
                l1=l1.next;
                l2=l2.next;
            }else if (l1!=null&&l2==null){
                sumNum=l1.val+floatNum;
                l1=l1.next;
            }else if (l1==null&&l2!=null){
               sumNum =l2.val+floatNum;
                l2=l2.next;
            }
            nextVal=sumNum%10;
            floatNum=sumNum/10;
            list.add(nextVal);
        }

        if (floatNum>0){
            list.add(1);
        }
        ListNode head=new ListNode(0);
        ListNode cur=head;
        for (Integer val:list){
            ListNode curr=new ListNode(val);
            cur.next=curr;
            cur=cur.next;
        }
        return head.next;
    }
























}
