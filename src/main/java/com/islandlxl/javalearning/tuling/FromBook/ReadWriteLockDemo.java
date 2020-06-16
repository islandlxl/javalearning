package com.islandlxl.javalearning.tuling.FromBook;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
@project:com.tuling.FromBook
@Title:ReadWriteLock
@Auther:lxl
@create:2020/1/17,23:34
*/public class ReadWriteLockDemo {

    private static ReentrantLock lock=new ReentrantLock();
    private static ReentrantReadWriteLock readWriteLock=new ReentrantReadWriteLock();
    private static Lock readLock=readWriteLock.readLock();
    private static Lock writeLock=readWriteLock.writeLock();
    private int value;

    public Object handleRead(Lock lock)throws InterruptedException {
        try {
            lock.lock();
            Thread.sleep(1000);
            return value;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
       return value;
    }
    public void handleWrite(Lock lock,int index)throws InterruptedException {
        try {
            lock.lock();
            Thread.sleep(1000);
             value=index;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
       final ReadWriteLockDemo demo=new ReadWriteLockDemo();

        Runnable runnable1 = new Runnable(){

            @Override
            public void run() {
                try{
                  demo.handleRead(readLock);
                //demo.handleRead(lock);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        };
        Runnable runnable2 = new Runnable(){

            @Override
            public void run() {
                try{
                    demo.handleWrite(writeLock,10);
                    //demo.handleWrite(lock,10);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        };

        for(int i=0;i<18;i++){
           new Thread(runnable1).start();
        }
        for(int i=18;i<20;i++){
          new Thread(runnable2).start();
        }
    }
}
