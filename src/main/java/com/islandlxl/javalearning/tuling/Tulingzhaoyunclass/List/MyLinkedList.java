package com.islandlxl.javalearning.tuling.Tulingzhaoyunclass.List;

/*
@project:com.tuling.Tulingzhaoyunclass
@Title:SingleList
@Auther:lxl
@create:2019/12/4,11:59
单向链表：内存中存储不连续，每个节点指向下一个节点，
   特点：增删快，查询慢

*/public class MyLinkedList {

    private LinkNode head;
    private int size;
    private LinkNode tail;
//插入头部
    public void insertHead(int data){
        LinkNode newNode=new LinkNode(data);
        newNode.next=head;
        head=newNode;
    }

    //插入尾部
    public void insetLast(int data){
        LinkNode newNode=new LinkNode(data);
        tail.next=newNode;
        newNode.next=null;
    }

    //插入中间
    public void insertMedile(int data,int position){
        LinkNode newNode=new LinkNode(data);
        LinkNode curr=head;
        if (position==0){
            insertHead(data);
        }else {
            for(int i=0;i<position;i++){
                curr=curr.next;
            }
            newNode.next=curr.next;
            curr.next=newNode;
        }
    }

    //删除头节点
    public void deleteHead(){
        head = head.next;

    }
    //删除中间节点
    public void deleteMedile(int data,int position){
        if (position==0){
            deleteHead();
        }else{
            LinkNode curr=head;
            for(int i=0;i<position;i++){
              curr=curr.next;
            }
            curr.next=curr.next.next;
        }
    }

    //删除中间节点



    class LinkNode{
        private int value;
        private LinkNode next;
        public LinkNode(int value){
            this.value=value;
            this.next=null;
        }
    }



}
