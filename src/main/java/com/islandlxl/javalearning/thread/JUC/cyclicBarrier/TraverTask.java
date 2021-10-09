package com.islandlxl.javalearning.thread.JUC.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class TraverTask implements Runnable{

    private CyclicBarrier cyclicBarrier;
    private String name;
    private long arriveTime;

    public TraverTask(CyclicBarrier cyclicBarrier, String name, long arriveTime) {
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
        this.arriveTime = arriveTime;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(arriveTime*1000);
            System.out.println(name+" 到达集合点！");
            cyclicBarrier.await();
            System.out.println(name+"开始旅行啦..");

        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
