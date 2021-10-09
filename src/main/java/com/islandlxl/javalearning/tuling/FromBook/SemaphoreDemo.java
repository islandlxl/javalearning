package com.islandlxl.javalearning.tuling.FromBook;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/*
@project:com.tuling.FromBook
@Title:Semaphore
@Auther:lxl
@create:2020/1/17,23:12
*/public class SemaphoreDemo implements Runnable {
    final Semaphore semaphore=new Semaphore(5);
    @Override
    public void run() {
        try{
          semaphore.acquire();
          Thread.sleep(2000);
          System.out.println(Thread.currentThread().getName()+ " " +Thread.currentThread().getId()+":done");
       //   semaphore.release();


        }catch(Exception e){
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        final SemaphoreDemo demo=new SemaphoreDemo();
        for(int i=0;i<20;i++){
         executorService.submit(demo);
        }

    }
}
