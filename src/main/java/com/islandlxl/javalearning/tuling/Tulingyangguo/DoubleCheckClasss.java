package com.islandlxl.javalearning.tuling.Tulingyangguo;

/*
@project:com.tuling.Tulingyangguo
@Title:DoubleCheckClasss
@Auther:lxl
@create:2020/1/1,20:23
*/public class DoubleCheckClasss {

    private   static int a,b;
    private  volatile static int x,y;
    static Object object=new Object();



    public static void main(String[] args) {
        System.out.println("主线程+"+Thread.currentThread());
        int i=0;
        for(;;){
            i++;
           a=0;b=0;
           x=0;y=0;
           Thread threadA = new Thread(new Runnable() {
                @Override
                public void run() {
                   shortWait(1000);
                    a=1;
                    x=b;
                }
           },"t1");

           Thread threadB=new Thread(new Runnable() {
               @Override
               public void run() {
                   b=1;
                   y=a;
               }
           },"t2");
           threadA.start();
           threadB.start();
            try {
                threadA.join();
                threadB.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String result="这是第"+i+"次"+"x="+x+" "+"y="+y;
            if (x==0&&y==0){
                System.err.println(result);
                break;
            }else{
                System.out.println(result);
            }



        }


    }
    public static void shortWait(long shortTime){
        long start = System.nanoTime();

        long end;
        do{
            end=System.nanoTime();
        }while (start+shortTime>=end);
    }


}
