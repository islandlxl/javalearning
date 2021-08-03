package com.islandlxl.javalearning.tuling.Tulingyangguo.JUC;

import lombok.extern.slf4j.Slf4j;
import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.locks.ReentrantLock;

@Slf4j
public class JUC_lockOnClass {

    private static int count;
    private static Object object=new Object();
    private static ReentrantLock lock=new ReentrantLock();
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                for (int j = 0; j <1000 ; j++) {
                   synchronized (object){
                       //System.out.print(ClassLayout.parseInstance(object).toPrintable());
                       count++;
                   }
                }
            }).start();
        }

        try{
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
        System.out.println("输出的count为: "+count);

        System.out.print(ClassLayout.parseInstance(object).toPrintable());
    }

}
