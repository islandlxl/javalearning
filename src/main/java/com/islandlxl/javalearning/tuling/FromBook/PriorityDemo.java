package com.islandlxl.javalearning.tuling.FromBook;

/*
@project:com.tuling.FromBook
@Title:PriorityDemo
@Auther:lxl
@create:2020/1/7,21:27
*/public class PriorityDemo {
    public static final int Low=1;
    public static final int Nor=5;
    public static final int Max=10;

    public static class HighPriority extends Thread{

        static int count=0;

        @Override
        public void run() {
            while (true){

                synchronized (PriorityDemo.class){
                    count++;
                    if (count>1000000){
                        System.out.println("highpriority is finish");
                        break;
                    }
                }
            }
        }
    }
    public static class LowPriority extends Thread{
        static int count=0;

        @Override
        public void run() {
            while (true){

                synchronized (PriorityDemo.class){
                    count++;
                    if (count>1000000){
                        System.out.println("LowPriority is finish");
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        HighPriority high = new HighPriority();
        LowPriority low = new LowPriority();
        high.setPriority(Max);
        low.setPriority(Low);
        high.start();
        low.start();


    }


}
