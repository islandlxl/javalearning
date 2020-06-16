package com.islandlxl.javalearning.tuling.FromBook;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
/*
@project:com.tuling.FromBook
@Title:CyclicBarrierDemo
@Auther:lxl
@create:2020/1/18,14:44
*/public class CyclicBarrierDemo {
    public static class Soldier implements Runnable{
        private String soldier;
        private final CyclicBarrier cyclic;

        public Soldier(String soldier, CyclicBarrier cyclic) {
            this.soldier = soldier;
            this.cyclic = cyclic;
        }

        @Override
        public void run() {

            try{
                cyclic.await();
                doWork();
                cyclic.await();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        void doWork(){
            try{
                Thread.sleep(Math.abs(new Random().nextInt()%1000));

            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println(soldier+"任务完成！");
        }

    }
    public static class BarrierRun implements Runnable{

        boolean flag;
        int N;

        public BarrierRun(boolean flag, int n) {
            this.flag = flag;
            N = n;
        }

        @Override
        public void run() {
            if (flag){
                System.out.println("司令：【士兵"+N+"个】任务完成！");

            }else {
                System.out.println("司令：【士兵"+N+"个】集合完成！");
                flag=true;
            }
        }
    }

    public static void main(String[] args) {
        int N=10;
        Thread[] soldiers=new Thread[N];
        boolean flag=false;
        CyclicBarrier cyclic=new CyclicBarrier(N,new BarrierRun(flag,N));
        //设置屏障点
        System.out.println("集合队伍");
        for(int i=0;i<N;i++){
            System.out.println("士兵"+i+"报道！");
            soldiers[i]=new Thread(new Soldier("士兵"+i,cyclic));
            soldiers[i].start();
        }
    }
}