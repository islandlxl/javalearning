package com.islandlxl.javalearning.thread;

/*
@project:com.thread
@Title:PublicCar
@Auther:lxl
@create:2019/2/14,11:12
*/public class PublicCar {
    private String username = "A";

    private String password = "AA";

    synchronized public void setValue(String username, String password) {

        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name=" + Thread.currentThread().getName() +
                    "username=" + username + "password=" + password);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
      public synchronized void getValue(){
       System.out.println("getValue method thread name="+Thread.currentThread().getName()+
               "username="+username+"password="+password);
    }



}



