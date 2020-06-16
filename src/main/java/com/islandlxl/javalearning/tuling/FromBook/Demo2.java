package com.islandlxl.javalearning.tuling.FromBook;

/*
@project:com.tuling.Tulingyangguo
@Title:Demo
@Auther:lxl
@create:2020/1/5,14:52
*/public class Demo2 {

    static int i=0;
    public  static class JoinThread extends Thread{
        @Override
        public void run() {
            for ( i = 0; i <2000000000 ; i++) ;

        }
    }

    public static void main(String[] args) throws InterruptedException{

        JoinThread joinThread = new JoinThread();
        joinThread.start();
        joinThread.join();
        System.out.println("i="+i);

    }
}
