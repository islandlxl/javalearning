package com.islandlxl.javalearning.tuling.Tulingzhaoyunclass.Queue;

/*
@project:com.tuling.Tulingzhaoyunclass.Queue
@Title:ArrayQueue  循环队列
@Auther:lxl
@create:2020/1/12,22:28
*/public class CircleQueue {

    static int[] data;//队列的元素
    static  int head;//队列的头
    static int tail;//队列的尾部
    static  int n;//队列的总长度

    public CircleQueue(int[] data, int head, int tail, int n) {
        this.data = data;
        this.head = head;
        this.tail = tail;
        this.n = n;
    }
    //队列入站
    public static  void push(int m){
        //判断是否满了
        if ((tail+1)%n==head) return;
        data[tail]=m;
        tail=(tail+1)%n;
    }
    //队列出站
    public static int  pop(){
        //先判断是否是空
        if (isEmpty()){
            return -1;
        }
        int m=data[head];
        head= (head+1)%n;
        return m;
    }
    //队列判断是否是空
    public static boolean isEmpty(){
        if (head==(tail+1)%n){
            return true;
        }else{
            return false;
        }
    }

}
