package com.islandlxl.javalearning.thread.test2;

/*
@project:com.thread.test2
@Title:MyThread1
@Auther:lxl
@create:2019/2/14,16:06
*/
public class MyThread2 extends Thread{

    private Task  task;

    public MyThread2(Task task) {
        super();
        this.task=task;
    }

    @Override
    public void run() {
        super.run();
        CommonsUtils.begintime2=System.currentTimeMillis();
        task.doLongTimeTask();
        CommonsUtils.endtime2=System.currentTimeMillis();



    }
}
