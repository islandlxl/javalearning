package com.islandlxl.javalearning.JVM.ClassLoader;

public class MainTestLoad {
    public static int initData=888;
    //private static User user=new User();
    public static void main(String[] args) {

        MainTestLoad testLoad = new MainTestLoad();
        int addNum = testLoad.add();
        System.out.println(addNum);
    }
    public int add(){
        int a=10;
        int b=9;
        int c=(a+b)*10;
        return c;
    }
}
