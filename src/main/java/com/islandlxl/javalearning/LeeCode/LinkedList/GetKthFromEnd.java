package com.islandlxl.javalearning.LeeCode.LinkedList;

/**
https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
剑指 Offer 22. 链表中倒数第k个节点
 */
public class GetKthFromEnd {

    public static void main(String[] args) {
        ListNode root = new ListNode(1);

        ListNode l2 = new ListNode(2);

        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        root.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        GetKthFromEnd getKthFromEnd = new GetKthFromEnd();
        ListNode kthFromEnd = getKthFromEnd.getKthFromEnd(root, 2);
        while (kthFromEnd!=null){
            System.out.println("输出第K个数字:"+kthFromEnd.val);
            kthFromEnd=kthFromEnd.next;
        }

    }
    //顺序数第几个   先算链表总长，再找第N个
    public ListNode getKthFromEnd2(ListNode head, int k) {
       int count=0;
       ListNode p=head;
        while (p!=null){
          count++;
            p= p.next;
        }
        int SeqNum=(count-k)+1;
        ListNode pre=null;
        int n=0;
        while (head!=null){
            n++;
            if (n==SeqNum){
                pre=head;
                break;
            }
            head=head.next;

        }
        return pre;
    }

    /**
     * 官方解法:  快慢指针
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slowPoint=head;
        ListNode fastPoint=head;
        int m=k;
        while (m>0){
            fastPoint=fastPoint.next;
            m-=1;
        }
        while (fastPoint!=null){
            slowPoint=slowPoint.next;
            fastPoint=fastPoint.next;
        }
        return slowPoint;
    }
        static public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
