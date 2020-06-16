package com.islandlxl.javalearning.LeeCode.LinkedList;

/*
@project:com.LeeCode.LinkedList
@Title:MergeTwoList
@Auther:lxl
@create:2019/12/8,12:33
https://leetcode-cn.com/problems/merge-two-sorted-lists/
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

    public class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
