package com.islandlxl.javalearning.tuling.FromBook;

/*
@project:com.tuling.Tulingyangguo
@Title:Demo
@Auther:lxl
@create:2020/1/5,14:52
*/public class Demo3  {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    if (Thread.currentThread().isInterrupted()){
                        System.out.println("中断的");
                        break;
                    }
                    try {
                        Thread.sleep(2000);

                    }catch (InterruptedException e){
                        System.out.println("睡着了  你叫我起来");
                        Thread.currentThread().interrupt();
                    }
                    Thread.yield();
                }
            }
        });
        t1.start();
       Thread.sleep(2000);
        t1.interrupt();
    }
}
