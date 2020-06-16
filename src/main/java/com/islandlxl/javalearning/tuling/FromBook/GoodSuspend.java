package com.islandlxl.javalearning.tuling.FromBook;

/*
@project:com.tuling.Tulingyangguo
@Title:Demo
@Auther:lxl
@create:2020/1/5,14:52
GoodSuspend用法
*/public class GoodSuspend {
    static Object object=new Object();
    public static class ChangeObjectThread extends Thread{
        volatile  boolean suspendme=false;

        public void suspendMe(){
            suspendme=true;
        }
        public void resumeMe(){
            suspendme=false;
            synchronized (this){
                notify();
            }
        }


        @Override
        public void run() {
            while(true) {
                synchronized (this){
                    while (suspendme){
                        try {
                           wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
                synchronized (object){
                    System.out.println("in changeObjectThread");
                }
                Thread.yield();
            }
        }
    }

    public static class ReadObjectThread extends Thread{
        @Override
        public void run() {
            while(true) {
                synchronized (object){
                    System.out.println("in readObjectThread");
                }
                Thread.yield();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {

        ChangeObjectThread t1 = new ChangeObjectThread();
        ReadObjectThread t2 = new ReadObjectThread();
        t1.start();
        t2.start();
        Thread.sleep(100);
        t1.suspendMe();
        System.out.println(" suspend t1 2sec");
        Thread.sleep(20000);
        System.out.println("resume t1");
        t1.resumeMe();
    }

}
