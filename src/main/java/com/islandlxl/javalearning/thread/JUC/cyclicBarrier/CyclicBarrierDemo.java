package com.islandlxl.javalearning.thread.JUC.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new TourGuideTask());
        Executor excutor = Executors.newFixedThreadPool(3);

        excutor.execute(new TraverTask(cyclicBarrier,"张三",5l));
        excutor.execute(new TraverTask(cyclicBarrier,"李四",2l));
        excutor.execute(new TraverTask(cyclicBarrier,"王五",3l));

    }
}
