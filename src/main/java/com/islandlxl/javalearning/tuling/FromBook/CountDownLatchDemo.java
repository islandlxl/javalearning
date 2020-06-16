package com.islandlxl.javalearning.tuling.FromBook;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
@project:com.tuling.FromBook
@Title:CountDownLatchDemo
@Auther:lxl
@create:2020/1/18,0:00
*/public class CountDownLatchDemo implements Runnable {
    static final CountDownLatch cdt=new CountDownLatch(10);
    static final CountDownLatchDemo demo=new CountDownLatchDemo();
    @Override
    public void run() {

        try{

            Thread.sleep(new Random().nextInt(10)*1000);
            System.out.println("检查完毕!"+new Random().nextInt(10)*1000);
            cdt.countDown();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i <10 ; i++) {
            executorService.submit(demo);
        }
        cdt.await();
        System.out.println("发射！");
        executorService.shutdown();
    }
}
