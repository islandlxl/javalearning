package com.islandlxl.javalearning.tuling.FromBook;

/*
@project:com.tuling.Tulingyangguo
@Title:Demo
@Auther:lxl
@create:2020/1/5,14:52
wait和notisfy用法
*/public class Demo4 {
    static Object object=new Object();
    public static class T1 extends Thread{
        @Override
        public void run() {
            synchronized (object){
                System.out.println(System.currentTimeMillis()+"t1 START");
                try {
                    System.out.println(System.currentTimeMillis()+"t1 等待");
                    object.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(System.currentTimeMillis()+" t1 end");

            }
        }
    }

    public static class T2 extends Thread{
        @Override
        public void run() {
            synchronized (object){
                System.out.println(System.currentTimeMillis()+"t2 START notify one thread");
                object.notify();
                System.out.println(System.currentTimeMillis()+" t2 end");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        }
    }
    public static void main(String[] args) throws InterruptedException{

        T1 t1 = new T1();
        T2 t2 = new T2();
        t1.start();
        t2.start();


    }
}
