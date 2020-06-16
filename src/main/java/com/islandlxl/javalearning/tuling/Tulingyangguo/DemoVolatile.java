package com.islandlxl.javalearning.tuling.Tulingyangguo;

/*
@project:com.tuling.Tulingyangguo
@Title:DemoVolatile
@Auther:lxl
@create:2020/1/1,22:11
volatile无法保证原子性 线程数量越多越容易复现这个问题
*/public class DemoVolatile {

    private static int  count=0;


    public static void main(String[] args) {
        for(int i=0;i<50;i++){
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<1000;i++){
                      count++;
                    }

                }
            });
            thread.start();
        }

        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }


        System.out.println("输出的count值为："+count);
    }


}
