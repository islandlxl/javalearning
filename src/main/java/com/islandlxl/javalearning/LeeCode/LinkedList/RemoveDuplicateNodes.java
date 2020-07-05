package com.islandlxl.javalearning.LeeCode.LinkedList;

import java.util.HashSet;
import java.util.Set;

/*
@project:com.islandlxl.javalearning.LeeCode.LinkedList
@Title:RemoveDuplicateNodes
@Auther:lxl
@create:2020/6/26,10:01
https://leetcode-cn.com/problems/remove-duplicate-node-lcci/
*/public class RemoveDuplicateNodes {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode head2 =new ListNode(2);

        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(3);
        ListNode head5 = new ListNode(2);
        ListNode head6 = new ListNode(1);

        head.next=head2;
        head2.next=head3;
        head3.next=head4;
        head4.next=head5;
        head5.next=head6;

        ListNode listNode = removeDuplicateNodes(head);
        printf(listNode);
//        ListNode 2 = new ListNode(2);

        Set<Integer> set=new HashSet<>();
        System.out.println(set.add(1));
        System.out.println(set.add(1));
    }

    public static ListNode removeDuplicateNodes(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode pre=new ListNode(head.val);
        ListNode pnext=pre;
        while (head.next!=null){
            ListNode next = head.next;
            while (pnext!=null){
                if (pnext.val==next.val){
                    head.next=head.next.next;
                    break;
                }
                if (pnext.next==null){
                    ListNode nextNode=new ListNode(next.val);
                    pnext.next=nextNode;
                }
                pnext=pnext.next;
            }

            pnext=pre;
            head=next;
        }

        return pre;
    }

    public static void printf(ListNode head){
        int i=0;
        while (head!=null){
            System.out.println("第"+i+"个节点："+head.val);
            head = head.next;
            i++;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }

    }
}