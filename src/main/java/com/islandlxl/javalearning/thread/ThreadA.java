package com.islandlxl.javalearning.thread;

/*
@project:com.thread
@Title:ThreadA
@Auther:lxl
@create:2019/2/14,10:37
*/public class ThreadA extends Thread{

    private HasSelfPrivateNum numRef;
    public ThreadA(HasSelfPrivateNum numRef) {
        super();

        this.numRef=numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.add("a");
    }
}
