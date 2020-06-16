package com.islandlxl.javalearning.tuling.FromBook;

/*
@project:com.tuling.Tulingyangguo
@Title:Demo
@Auther:lxl
@create:2020/1/5,14:52
suspend和resume用法
*/public class Demo6 {

      static int count=0;

      public static void main(String[] args) throws InterruptedException {
          while (true) {
              count=0;

              for (int i = 0; i < 10; i++) {
                  Thread t1 = new Thread(new Runnable() {
                      @Override
                      public void run() {
                          for (int j = 0; j < 1000; j++) {
                              count++;
                          }
                      }
                  });
                  t1.start();
                  //  t1.join();
              }
              Thread.sleep(1000);
              System.out.println("count的值" + count);
          }
      }
}
