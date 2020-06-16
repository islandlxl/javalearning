package com.islandlxl.javalearning.thread.test2;

/*
@project:com.thread.test2
@Title:Run
@Auther:lxl
@create:2019/2/14,16:10
*/public class Run {
    public static void main(String[] args) {
        Task task=new Task();
        MyThread1 myThread1=new MyThread1(task);
        myThread1.start();

        MyThread2 myThread2=new MyThread2(task);
        myThread2.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime=CommonsUtils.begintime1;
        if (CommonsUtils.begintime2<CommonsUtils.begintime1){
            beginTime=CommonsUtils.begintime2;
        }
        long endTime=CommonsUtils.endtime1;
        if (CommonsUtils.endtime2>CommonsUtils.endtime1){
            endTime=CommonsUtils.endtime2;
        }

        System.out.println("耗时："+(endTime-beginTime)/1000);


    }
}
