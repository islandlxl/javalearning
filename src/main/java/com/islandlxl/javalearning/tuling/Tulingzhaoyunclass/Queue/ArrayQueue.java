package com.islandlxl.javalearning.tuling.Tulingzhaoyunclass.Queue;

/*
@project:com.tuling.Tulingzhaoyunclass.Queue
@Title:ArrayQueue  数组队列
@Auther:lxl
@create:2020/1/12,22:28
*/public class ArrayQueue {

    static int[] data;//队列的元素
    static  int head;//队列的头
    static int tail;//队列的尾部
    static  int n;//队列的总长度

    public ArrayQueue(int[] data, int head, int tail, int n) {
        this.data = data;
        this.head = head;
        this.tail = tail;
        this.n = n;
    }
    //队列入站
    public static  void push(int m){
        //判断是否满了
        if (tail==n) return;
        data[tail]=m;
        tail++;
    }
    //队列出站
    public static int  pop(){
        //先判断是否是空
        if (isEmpty()){
            return -1;
        }
        int m=data[head];
        head++;
        return m;
    }
    //队列判断是否是空
    public static boolean isEmpty(){
        if (head==tail){
            return true;
        }else{
            return false;
        }
    }
    //队列输出
    public  static void printf(){
        while (tail!=head){
            System.out.println("输出元素："+data[head]);
            head++;
        }
    }


    public static void main(String[] args) {

        int [] data={1,2,3,4,5};
        ArrayQueue arrayQueue = new ArrayQueue(data, 0, 5, 5);


        printf();
    }

}
