package com.islandlxl.javalearning.thread;

/*
@project:com.thread
@Title:Test
@Auther:lxl
@create:2019/2/14,11:23
*/public class Test {

    public static void main(String[] args) {

        try {
            PublicCar publicCar=new PublicCar();
            ThreadC threadC=new ThreadC(publicCar);

            threadC.start();
            threadC.sleep(2000);
            publicCar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
