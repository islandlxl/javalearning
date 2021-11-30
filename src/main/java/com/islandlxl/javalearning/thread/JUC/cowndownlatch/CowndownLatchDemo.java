package com.islandlxl.javalearning.thread.JUC.cowndownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CowndownLatchDemo {
    public static void main(String[] args) throws Exception{
        long now = System.currentTimeMillis();
        CountDownLatch countDownLatch = new CountDownLatch(2);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new SeeDoctorTask(countDownLatch));
        executorService.execute(new QueueTask(countDownLatch));
        /*new Thread(new SeeDoctorTask(countDownLatch)).start();
        new Thread(new QueueTask(countDownLatch)).start();
        */
        countDownLatch.await();
        executorService.shutdown();
        System.out.println(" over,回家 cost time "+(System.currentTimeMillis()-now));
    }
}
