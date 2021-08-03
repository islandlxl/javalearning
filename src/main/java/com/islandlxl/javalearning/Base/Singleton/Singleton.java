package com.islandlxl.javalearning.Base.Singleton;

/*
@project:com.Singleton
@Title:Singleton
@Auther:lxl
@create:2020/5/4,9:31
单例模式---懒汉式  -Xss128K
*/
public class Singleton {

    private static  volatile Singleton single;

    private Singleton(){

    }
    //双重检测机制  Dcl
    public static  Singleton getInstance(){
        if (single==null){
            synchronized (Singleton.class){
                if (single==null){
                    single = new Singleton();
                }
            }
        }
        return single;
    }

    private static  int  count;

    public static void main(String[] args) {
        Singleton instance = getInstance();
        System.out.println(instance);


    }

}
