package com.islandlxl.javalearning.thread;

import java.text.SimpleDateFormat;
import java.util.*;

public class TheadLocalDemo implements Runnable{
//   private static final ThreadLocal<SimpleDateFormat> f=ThreadLocal.withInitial(
//           ()->new SimpleDateFormat("yyyyMMDD hhmmss"));
    private static final ThreadLocal<SimpleDateFormat> f=new ThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue(){
            return new SimpleDateFormat();
        }
    };

    @Override
    public void run() {
        System.out.println("thead name= "+Thread.currentThread().getName()+" default formatter ="+f.get().toPattern());
        try{
            Thread.sleep(new Random().nextInt(1000));

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        f.set(new SimpleDateFormat());
        System.out.println("thead name= "+Thread.currentThread().getName()+"  formatter ="+f.get().toPattern());


    }

}
