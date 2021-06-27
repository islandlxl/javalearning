package com.islandlxl.javalearning.LeeCode.LinkedList;

/*
@project:com.LeeCode.LinkedList
@Title:MergeTwoList
@Auther:lxl
@create:2019/12/8,12:33
https://leetcode-cn.com/problems/merge-two-sorted-lists/
合并两个有序列表
*/public class MergeTwoList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      ListNode l3=new ListNode(0);
      ListNode curr=l3;
      while (l1!=null&&l2!=null) {
              if (l1.val <= l2.val) {
                  curr.next = l1;
                  l1=l1.next;
              } else {
                  curr.next = l2;
                  l2=l2.next;
              }
              curr=curr.next;
      }
      curr.next=l1==null?l2:l1;
      return l3.next;
    }

    public static class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
   }

    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode curr=head;

        while (l1!=null&&l2!=null){
            if (l1.val<=l2.val){
                curr.next=l1;
                l1=l1.next;
            }else{
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        if (l1!=null){
            curr.next=l1;
        }
        if (l2!=null){
            curr.next=l2;
        }

        return head.next;
    }


    public static void main(String[] args) {
        ListNode ln_1 = new ListNode(1);
        ListNode ln_1_2 = new ListNode(1);
        ListNode ln_2 = new ListNode(2);
        ListNode ln_3 = new ListNode(3);
        ListNode ln_1_4 = new ListNode(4);
        ListNode ln_2_4 = new ListNode(4);
        ln_1.next=ln_2;
        ln_2.next=ln_1_4;
        ln_1_2.next=ln_3;
        ln_3.next=ln_2_4;
        ListNode listNode = mergeTwoLists2(ln_1, ln_1_2);
        while (listNode!=null){
            System.out.print(" "+listNode.val);
            listNode=listNode.next;
        }
    }














}
