package com.islandlxl.javalearning.tuling.Tulingyangguo.excutors;

/*
@project:com.tuling.Tulingyangguo.excutors
@Title:Task
@Auther:lxl
@create:2020/2/2,14:56
*/public class Task implements Runnable{
    private int nov;

    public Task(int i){
        this.nov = i;
    }
    public void run() {
        System.out.println("执行当前任务的线程是："+Thread.currentThread().getName());
        System.out.println("我是任务:"+nov+"我在执行...");
    }
}
