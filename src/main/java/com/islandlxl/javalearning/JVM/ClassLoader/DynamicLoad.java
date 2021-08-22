package com.islandlxl.javalearning.JVM.ClassLoader;

public class DynamicLoad {
    static {
        System.out.println("initial DynamicLoad!");
    }
    public DynamicLoad(){
        System.out.println("load DynamicLoad!");
    }
    public static void main(String[] args) {
       new A();
       System.out.println("load test");
       B b=null;
    }
}

class A{
    static {
        System.out.println("load A");
    }
    public A(){
        System.out.println("initial A");
    }

}
class B{
    static {
        System.out.println("load B");
    }
    public B(){
        System.out.println("initail B");
    }
}