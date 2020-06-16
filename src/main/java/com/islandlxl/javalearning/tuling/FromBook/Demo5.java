package com.islandlxl.javalearning.tuling.FromBook;

/*
@project:com.tuling.Tulingyangguo
@Title:Demo
@Auther:lxl
@create:2020/1/5,14:52
suspend和resume用法
*/public class Demo5 {
    private static Object object=new Object();

   static ChangeObjectThread t1=  new ChangeObjectThread("t1");

   static ChangeObjectThread t2=  new ChangeObjectThread("t2");

    public static class ChangeObjectThread extends Thread{

        public ChangeObjectThread(String name) {
            super.setName(name);
        }


        @Override
        public void run() {
           synchronized (object){
               System.out.println("in"+getName());
               Thread.currentThread().suspend();
           }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        t1.start();
        Thread.sleep(1000);
        t2.start();
        t1.resume();
        t2.resume();
        t1.join();
        t2.join();
    }

}
