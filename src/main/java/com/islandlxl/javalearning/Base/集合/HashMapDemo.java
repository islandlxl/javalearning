package com.islandlxl.javalearning.Base.集合;

import java.util.HashMap;

public class HashMapDemo {

    private static Object resource1=new Object();
    private static Object resource2=new Object();

    public static void main(String[] args) {

        new Thread(()->{
                synchronized (resource1){
                    System.out.println(Thread.currentThread().getName()+" try get resource1");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                       e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" wait to get resouces2");
                    synchronized (resource2){
                        System.out.println(Thread.currentThread().getName()+" try to get resouces2");
                        try{
                            Thread.sleep(1000);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }

                }
        },"thead1").start();

        new Thread(()->{
            synchronized (resource1){
                System.out.println(Thread.currentThread().getName()+" try get resource2");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" wait to get resouces1");
                synchronized (resource2){
                    System.out.println(Thread.currentThread().getName()+" try to get resouces1");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

            }
        },"thead2").start();

    }
    public void dfs(String s){

    }
}
