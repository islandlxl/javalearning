package com.islandlxl.javalearning.thread.test2;

/*
@project:com.thread.test2
@Title:Task
@Auther:lxl
@create:2019/2/14,15:57
*/public class Task {
    private String getData1;
    private String getData2;

    public synchronized void doLongTimeTask(){

        try {
            System.out.println("begin time");
            Thread.sleep(3000);
            getData1="长时间处理任务从远程返回值1 threadName="+Thread.currentThread().getName();
            getData2="长时间处理任务从远程返回值2 threadName="+Thread.currentThread().getName();



            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end time");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
