package com.islandlxl.javalearning.thread;

/*
@project:com.thread
@Title:ThreadC
@Auther:lxl
@create:2019/2/14,11:21
*/public class ThreadC extends Thread{

    private  PublicCar publicCar;
    public ThreadC(PublicCar publicCar) {
        super();
        this.publicCar=publicCar;
    }

    @Override
    public void run() {
        super.run();
        publicCar.setValue("B","BB");
    }
}
