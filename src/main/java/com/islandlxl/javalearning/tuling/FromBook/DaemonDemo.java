package com.islandlxl.javalearning.tuling.FromBook;

/*
@project:com.tuling.Tulingyangguo
@Title:Demo
@Auther:lxl
@create:2020/1/5,14:52
suspend和resume用法
*/public class DaemonDemo {

    public static class DaemonT extends Thread{

        @Override
        public void run() {
            while (true) {
                System.out.println("i am alive");

                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        DaemonT daemonT = new DaemonT();
        daemonT.setDaemon(true);
        daemonT.start();
        Thread.sleep(2000);

    }

}
