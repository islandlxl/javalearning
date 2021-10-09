package com.islandlxl.javalearning.thread.JUC.semaphore;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * 停车场剩余车位显示场景:
 *    1.车辆入库车位减一
 *    2.车辆离库车位加一
 */
public class TestCar {

    private static Semaphore semaphore=new Semaphore(10);

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        System.out.println("=========="+Thread.currentThread().getName()+"来到停车场！");
                         if (semaphore.availablePermits()==0){
                             System.out.println("车位不足，请耐心等候！！！");
                             Thread.sleep(5000);

                         }
                         semaphore.acquire();
                         System.out.println(Thread.currentThread().getName()+" 成功进入停车场！");
                        Thread.sleep(new Random().nextInt(10000));
                        System.out.println(Thread.currentThread().getName()+"车辆驶出停车场！");
                        semaphore.release();

                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                }
            },i+"号车").start();

        }


    }
}
