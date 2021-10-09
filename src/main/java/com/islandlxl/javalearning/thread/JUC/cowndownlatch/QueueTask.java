package com.islandlxl.javalearning.thread.JUC.cowndownlatch;

import java.util.concurrent.CountDownLatch;

public class QueueTask implements Runnable{

    private CountDownLatch countDownLatch;

    public QueueTask(CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }

    @Override
    public void run() {

        try {
            System.out.println("正在排队。。。。");
            Thread.sleep(5000);
            System.out.println("排队成功，可以开始交费了");
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            if (countDownLatch!=null){
                countDownLatch.countDown();
            }

        }

    }

}
