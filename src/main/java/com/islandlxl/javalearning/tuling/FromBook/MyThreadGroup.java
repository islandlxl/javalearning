package com.islandlxl.javalearning.tuling.FromBook;

/*
@project:com.tuling.Tulingyangguo
@Title:Demo
@Auther:lxl
@create:2020/1/5,14:52
suspend和resume用法
*/public class MyThreadGroup implements Runnable{
    @Override
    public void run() {
        String groupName=Thread.currentThread().getThreadGroup().getName()+"-"+
                Thread.currentThread().getName();
        while (true){
            System.out.println("i am "+groupName);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }


        }

    }

    public static void main(String[] args) {
        ThreadGroup printGrop = new ThreadGroup("printGrop");
        Thread t1 = new Thread(printGrop, new MyThreadGroup(), "t1");
        Thread t2 = new Thread(printGrop, new MyThreadGroup(), "t2");
        t1.start();
        t2.start();
        System.out.println(printGrop.activeCount());
        printGrop.list();

    }

}
