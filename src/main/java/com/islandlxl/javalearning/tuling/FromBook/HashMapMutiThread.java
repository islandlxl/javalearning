package com.islandlxl.javalearning.tuling.FromBook;

import java.util.HashMap;
import java.util.Map;

/*
@project:com.tuling.FromBook
@Title:MutilThreadArray
@Auther:lxl
@create:2020/1/7,22:20
*/public class HashMapMutiThread {

    static Map<String,String> map=new HashMap<>();
    public static class AddThread implements Runnable{

        int start=0;

        public AddThread(int start) {
            this.start = start;
        }

        @Override
        public void run() {

            for(int i=start;i<1000000;i++){
               map.put(Integer.toString(i),Integer.toBinaryString(i));
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{

        Thread t1 = new Thread(new AddThread(0));
        Thread t2 = new Thread(new AddThread(1));

        t1.start();t2.start();
        t1.join();t2.join();
        Thread.sleep(1000);
        System.out.println("al的size:"+map.size());

    }

}
