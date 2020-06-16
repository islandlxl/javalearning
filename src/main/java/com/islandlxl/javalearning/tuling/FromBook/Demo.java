package com.islandlxl.javalearning.tuling.FromBook;

/*
@project:com.tuling.Tulingyangguo
@Title:Demo
@Auther:lxl
@create:2020/1/5,14:52
*/public class Demo implements Runnable{
    static Demo demo=new Demo();
    static  int count=0;


    public void increase(){
        count++;
    }

    @Override
    public void run() {

        for(int i=0;i<10000000;i++){
            synchronized (demo){
                increase();
            }


       }

    }

    public static void main(String[] args) throws InterruptedException{
        Thread t1=new Thread(new Demo());
        Thread t2=new Thread(new Demo());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("i的值为："+count);

    }
}
