package com.islandlxl.javalearning.thread;

/*
@project:com.thread
@Title:ThreadB
@Auther:lxl
@create:2019/2/14,10:42
*/public class ThreadB extends Thread {

    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        super();

        this.numRef=numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.add("b");
    }
}
