package com.islandlxl.javalearning.LeeCode.LinkedList;

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
    public class ListNode{
        int value;
        ListNode next;
        public ListNode(int val){
            this.value=val;
        }
    }
}
