package com.islandlxl.javalearning.LeeCode.LinkedList;

/*
@project:com.LeeCode.LinkedList
@Title:AddTwoLinkList
@Auther:lxl
@create:2019/12/7,22:42
两个链表相加：https://leetcode-cn.com/problems/add-two-numbers/
*/public class AddTwoLinkList {

    public static void main(String[] args) {


    }
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


}
