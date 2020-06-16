package com.islandlxl.javalearning.tuling.FromBook;

import java.util.ArrayList;

/*
@project:com.tuling.FromBook
@Title:MutilThreadArray
@Auther:lxl
@create:2020/1/7,22:20
*/public class MutilThreadArray {

    static ArrayList<Integer> al=new ArrayList<Integer>(10);

    public static class AddThread implements Runnable{

        @Override
        public void run() {

            for(int i=0;i<1000000;i++){
                al.add(i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{

        Thread t1 = new Thread(new AddThread());
        Thread t2 = new Thread(new AddThread());

        t1.start();t2.start();
      //  t1.join();t2.join();
       Thread.sleep(1000);
        System.out.println("al的size:"+al.size());

    }

}
