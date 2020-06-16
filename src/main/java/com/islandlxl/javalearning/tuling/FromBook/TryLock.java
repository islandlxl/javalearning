package com.islandlxl.javalearning.tuling.FromBook;

import java.util.concurrent.locks.ReentrantLock;

/*
@project:com.tuling.FromBook
@Title:TryLock
@Auther:lxl
@create:2020/1/15,21:36
*/public class TryLock implements Runnable {
    static ReentrantLock lock1=new ReentrantLock();
    static ReentrantLock lock2=new ReentrantLock();
     int lock;

    public TryLock(int lock) {
        this.lock = lock;
    }

    @Override
    public void run() {

        if (lock==1){
            while (true){
                if (lock1.tryLock()){
                    try{
                        try{
                            Thread.sleep(500);
                        }catch(InterruptedException e){

                        }
                        if (lock2.tryLock()){
                            try{
                                System.out.println(Thread.currentThread().getId()+"my job done");
                                return;
                            }finally {
                                lock2.unlock();
                            }
                        }

                    }finally {

                        lock1.unlock();
                    }
                }
            }
        }else{
            while (true){
                if (lock2.tryLock()){
                    try{
                        try{
                            Thread.sleep(500);
                        }catch(InterruptedException e){

                        }
                        if (lock1.tryLock()){
                            try{
                                System.out.println(Thread.currentThread().getId()+"my job done");
                                return;
                            }finally {
                                lock1.unlock();
                            }
                        }

                    }finally {
                        lock2.unlock();
                    }
                }
            }
        }
        
    }

    public static void main(String[] args) {
        TryLock tryLock1=new TryLock(1);
        TryLock tryLock2=new TryLock(2);

        Thread t1=new Thread(tryLock1);
        Thread t2=new Thread(tryLock2);
        t1.start();t2.start();
        
    }
}
