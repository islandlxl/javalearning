package com.islandlxl.javalearning.tuling.FromBook;

import java.util.concurrent.locks.ReentrantLock;

/*
@project:com.tuling.FromBook
@Title:IntLock
@Auther:lxl
@create:2020/1/14,22:14
*/public class IntLock implements Runnable{
   public static ReentrantLock lock1=new ReentrantLock();
   public static ReentrantLock lock2=new ReentrantLock();
   int lock;

    public IntLock(int lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            if (lock==1){
                lock1.lockInterruptibly();
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){}
                    lock2.lockInterruptibly();
            }else{
                lock2.lockInterruptibly();
                try {
                    Thread.sleep(5000);

                }catch (InterruptedException e){}
                    lock1.lockInterruptibly();
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            if (lock1.isHeldByCurrentThread()){
                lock1.unlock();
            }
            if (lock2.isHeldByCurrentThread()){
                lock2.unlock();
            }
            System.out.println(Thread.currentThread().getId()+"线程退出");
        }
    }

    public static void main(String[] args) throws InterruptedException{
        IntLock in1=new IntLock(1);
        IntLock in2=new IntLock(2);
        Thread t1=new Thread(in1);
        Thread t2=new Thread(in2);
        t1.start();t2.start();
        Thread.sleep(100);
        t2.interrupt();
    }

}
