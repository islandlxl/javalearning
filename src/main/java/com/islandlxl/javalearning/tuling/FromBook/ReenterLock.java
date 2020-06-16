package com.islandlxl.javalearning.tuling.FromBook;

import java.util.concurrent.locks.ReentrantLock;

/*
@project:com.tuling.FromBook
@Title:ReenterLock
@Auther:lxl
@create:2020/1/14,21:46
*/public class ReenterLock implements Runnable{
   public static ReentrantLock lock=new ReentrantLock();
   public static int i=0;
   @Override
    public void run() {

        for(int j=0;j<10000000;j++){
            lock.lock();
            try {
                i++;
            }finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        ReenterLock lock=new ReenterLock();
        Thread t1=new Thread(lock);
        Thread t2=new Thread(lock);

        t1.start();t2.start();
        t1.join();t2.join();
        System.out.println("i=:"+i);

    }



}
