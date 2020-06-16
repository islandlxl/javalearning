package com.islandlxl.javalearning.tuling.Tulingzhaoyunclass.List;

/*
@project:com.tuling.Tulingzhaoyunclass
@Title:yuesefuList
@Auther:lxl
@create:2019/12/5,22:51
  约瑟夫问题：一群人围成一个圈，并从某个人开始数数，并且数到m下之后，这个人自动退出，接着从下个人开始数，以此类推，最后只留下一人
*/public class yuesefuList {


    public static void main(String[] args) {
        int nums[]={2,3,4,7,9,12};
        CycleLink cycleLink=new CycleLink(nums,2,3);

    }

    public static class LinkNode{
        int num;
        LinkNode next;
        public LinkNode(int num){
            this.num=num;
        }
    }

    public static  class CycleLink{

        int size;//循环链表长度
        int k;//从第K个人开始
        int m;//数m下
        int n=1;//第n个人退出

        public CycleLink(int nums[],int k,int m){
            this.size=nums.length;
            this.k=k;
            this.m=m;
            LinkNode link= creakLink(nums);
            showLink(size,link);
            play(link);
        }

        public LinkNode creakLink(int[] num){

            //创建一个单向的循环列表
            LinkNode pre=new LinkNode(0);
            LinkNode curr=pre;

            if (num.length==1){
                return null;
            }else{
                for(int i=0;i<num.length;i++){
                    LinkNode newNode=new LinkNode(num[i]);
                    curr.next=newNode;
                    curr=curr.next;
                }
                curr.next=pre.next;
            }
            return curr;
        }

        public void showLink(int size,LinkNode curr){
            for(int i=1;i<=size;i++){
                System.out.println("第"+i+"个人是:"+curr.num);
                curr=curr.next;
            }

        }
        public void play(LinkNode link){
            LinkNode curr = link;
            while (size!=1) {

                for (int i = 1; i < m-1; i++) {
                    curr = curr.next;
                }
                System.out.println("此时是第" + n + "个人退出:" + curr.next.num);

                curr.next=curr.next.next;
                curr=curr.next;
                n++;

                size--;
            }
            System.out.println("最后的人生赢家是："+curr.num);

        }



    }
}

