package com.islandlxl.javalearning.JVM.ClassLoader;

import java.io.IOException;
import java.io.InputStream;

/*
@project:com.islandlxl.javalearning.JVM.ClassLoader
@Title:ClassLoaderTest
@Auther:lxl
@create:2020/5/5,10:27
*/public class ClassLoaderTest {

    public static void main(String[] args) throws Exception{
        ClassLoader myloader=new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try{
                  String filename=name.substring(name.lastIndexOf(".")+1)+".class";

                    InputStream is = getClass().getResourceAsStream(filename);

                    if (is==null){
                        return super.loadClass(name);
                    }

                    byte[] b=new byte[is.available()];
                    is.read(b);
                    return defineClass(name,b,0,b.length);

                }catch(IOException e){

                  throw new ClassNotFoundException(name);
                }
            }
        };
        Object obj = myloader.loadClass("com.islandlxl.javalearning.JVM.ClassLoader.ClassLoaderTest")
                .newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof ClassLoaderTest);
    }

}
