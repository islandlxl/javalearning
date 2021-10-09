package com.islandlxl.javalearning.thread.JUC.cowndownlatch;

import java.util.concurrent.CountDownLatch;

public class SeeDoctorTask implements Runnable{

    private CountDownLatch countDownLatch;

    public SeeDoctorTask(CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }

    @Override
    public void run() {

        try {
            System.out.println("正在看医生。。。。");
            Thread.sleep(3000);
            System.out.println("看大夫成功，大夫开了些药单子！");
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            if (countDownLatch!=null){
                countDownLatch.countDown();
            }

        }

    }

}
