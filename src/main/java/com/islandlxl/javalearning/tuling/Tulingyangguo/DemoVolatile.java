package com.islandlxl.javalearning.tuling.Tulingyangguo;

import com.islandlxl.javalearning.tuling.FromBook.ReenterLock;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

/*
@project:com.tuling.Tulingyangguo
@Title:DemoVolatile
@Auther:lxl
@create:2020/1/1,22:11
volatile无法保证原子性 线程数量越多越容易复现这个问题
*/
@Slf4j
public class DemoVolatile {

    private static int  count=0;
    private static Object object=new Object();
    private static ReentrantLock lock=new ReentrantLock();



    public static void main(String[] args) throws InterruptedException{
        CountDownLatch countDownLatch=new CountDownLatch(1);
        for(int i=0;i<50;i++){
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    countDownLatch.countDown();
                    try{
                        lock.lock();
                        for(int i=0;i<1000;i++){
                                count++;
                        }
                    }catch (Exception E){
                        //   log.error(E.getMessage());
                    }finally {
                        lock.unlock();
                    }

                }
            });
            thread.start();
        }
        countDownLatch.await();
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }



        System.out.println("输出的count值为："+count);
    }


}
