package com.islandlxl.javalearning.JVM.ClassLoader;

import java.io.FileInputStream;
import java.lang.reflect.Method;

/*
@project:com.islandlxl.javalearning.JVM.ClassLoader
@Title:MyClassLoaderTest
@Auther:lxl
@create:2020/5/5,11:23
*/public class MyClassLoaderTest  {

    static class MyClassLoad extends ClassLoader{
        private String classPath;

        public MyClassLoad(String classPath) {
            this.classPath = classPath;
        }
        private byte[] loadByte(String name)throws Exception{
            name =name.replaceAll("\\.","/");
            System.out.println(name);
            FileInputStream fileInputStream = new FileInputStream(classPath + "/" + name + ".class");
            int length = fileInputStream.available();
            byte[] data = new byte[length];
            fileInputStream.read();
            fileInputStream.close();
            return data;
        }

        @Override
        protected Class<?> findClass(String name) throws ClassNotFoundException {
            try{
                byte[] bytes = loadByte(name);
                return defineClass(name,bytes,0,bytes.length);

            }catch (Exception e){
                e.printStackTrace();
                throw new ClassNotFoundException();
            }
        }
//        protected Class<?> loadClass(String name, boolean resolve)
//                throws ClassNotFoundException
//        {
//            synchronized (getClassLoadingLock(name)) {
//                // First, check if the class has already been loaded
//                Class<?> c = findLoadedClass(name);
//                if (c == null) {
//                    long t0 = System.nanoTime();
//                    if (c == null) {
//                        // If still not found, then invoke findClass in order
//                        // to find the class.
//                        long t1 = System.nanoTime();
//                        if (!name.startsWith("com.islandlxl.javalearning.JVM.entity")){
//                            c=this.getParent().loadClass(name);
//                        }else{
//                            c=findClass(name);
//                        }
//
//                        // this is the defining class loader; record the stats
//                        sun.misc.PerfCounter.getParentDelegationTime().addTime(t1 - t0);
//                        sun.misc.PerfCounter.getFindClassTime().addElapsedTimeFrom(t1);
//                        sun.misc.PerfCounter.getFindClasses().increment();
//                    }
//                }
//                if (resolve) {
//                    resolveClass(c);
//                }
//                return c;
//            }
//        }
    }
//com/islandlxl/javalearning/JVM/entity/User1
    public static void main(String[] args) throws Exception{
        MyClassLoad myClassLoad = new MyClassLoad("D:/test");
        Class<?> aClass = myClassLoad.loadClass("com.islandlxl.javalearning.JVM.entity.User");
        Object obj = aClass.newInstance();
        Method method = aClass.getDeclaredMethod("doSomeThings", null);
        method.invoke(obj,null);
        System.out.println(aClass.getClassLoader().getClass().getName());

    }


}
