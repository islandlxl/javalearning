package com.islandlxl.javalearning.tuling.FromBook;

import java.util.concurrent.locks.LockSupport;

/*
@project:com.tuling.FromBook
@Title:LockSupportDemo
@Auther:lxl
@create:2020/1/19,21:46
*/public class LockSupportDemo {

    public static Object u=new Object();
    static ChangeObjectThead t1=new ChangeObjectThead("t1");
    static ChangeObjectThead t2=new ChangeObjectThead("t2");

    public static class ChangeObjectThead extends Thread{
        public ChangeObjectThead(String name) {
            super.setName(name);
        }

        @Override
        public void run() {

            synchronized (u){
                System.out.println("in:"+getName());

                LockSupport.park();
                if (Thread.interrupted()){
                    System.out.println(getName()+"被中断了！");
                }
            }
            System.out.println(getName()+"执行结束！");
        }

    }

    public static void main(String[] args) throws InterruptedException{
        t1.start();
        Thread.sleep(1000);
        t2.start();

        LockSupport.unpark(t2);
        t1.interrupt();
        t1.join();

        t2.join();

    }

}
