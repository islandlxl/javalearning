package com.islandlxl.javalearning.LeeCode.LinkedList;

import org.springframework.web.servlet.tags.HtmlEscapingAwareTag;

import java.util.Deque;
import java.util.LinkedList;

/*
@project:com.LeeCode.LinkedList
@Title:DeleteNodeFromEnd
@Auther:lxl
@create:2019/12/8,10:34
*/public class DeleteNodeFromEnd {
//两次遍历通过
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre=new ListNode(0);
        pre.next=head;
        ListNode curr=pre;
        int lenth=0;
        while (head!=null){
            lenth++;
            head=head.next;
        }
        for(int i=0;i<lenth-n;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return pre.next;
    }
    //一次遍历解决问题
    public ListNode removeNthFromEnd2(ListNode head,int n){
        ListNode pre=new ListNode(0);//作为头节点
        pre.next=head;
        ListNode frist=pre,second=pre;
        for(int i=0;i<n+1;i++){
            frist=frist.next;
        }
        while (frist!=null){
            frist=frist.next;
            second=second.next;
        }
        second.next=second.next.next;
        return pre.next;
    }
    public static class ListNode{
        int value;
        ListNode next;
        public ListNode(int val){
            this.value=val;
        }
    }
    /**
     * 使用栈deque解决问题
     */
    public static ListNode removeNthFromEnd3(ListNode head,int n){
       ListNode pre=new ListNode(0);
       pre.next=head;
        Deque<ListNode> deque = new LinkedList();
        ListNode curr=pre;
        while (curr!=null){
            deque.push(curr);
            curr=curr.next;
        }
        for (int i = 0; i < n; i++) {
            deque.pop();
        }

        ListNode targetNode=deque.peek();
        targetNode.next=targetNode.next.next;

        return pre.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = removeNthFromEnd3(listNode, 1);
        System.out.println(listNode1.value);

    }
}
