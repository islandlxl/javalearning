package com.islandlxl.javalearning.thread.JUC.cyclicBarrier;

public class TourGuideTask implements Runnable{
    @Override
    public void run() {
        System.out.println("*****导游分发护照签证*****");

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
