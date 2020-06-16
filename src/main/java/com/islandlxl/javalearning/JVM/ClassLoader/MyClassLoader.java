package com.islandlxl.javalearning.JVM.ClassLoader;

/*
@project:com.islandlxl.javalearning.JVM.ClassLoader
@Title:MyClassLoader
@Auther:lxl
@create:2020/5/5,11:23
*/public class MyClassLoader extends ClassLoader {
    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {

        System.out.println("ss");

        return super.loadClass(name);
    }

    public static void main(String[] args) throws Exception{
        MyClassLoader myClassLoader=new MyClassLoader();
        Class<?> aClass = myClassLoader.loadClass("java.lang.String");
        System.out.println(aClass);
    }
}
