/*
package com.islandlxl.javalearning.RTTI.Class;


import java.io.IOException;
import java.io.InputStream;

*/
/*
@project:com.RTTI.Class
@Title:Candy
@Auther:lxl
@create:2019/2/25,10:51
*//*
public class Candy {
    static {

        System.out.println("ok");

    }

    public static void main(String[] args) throws Exception{
        System.out.println("aiiii");
       ClassLoader cl=new ClassLoader() {
           @Override
           public Class<?> loadClass(String name) throws ClassNotFoundException {
               try {
                   String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                   InputStream in=getClass().getResourceAsStream(fileName);
                   if(in==null){
                       return super.loadClass(name);
                   }
                   byte[] bytes=new byte[in.available()];
                   in.read(bytes);
                   return defineClass(name,bytes,0,bytes.length);

               }catch ( IOException e){
                   throw new ClassNotFoundException(name);
               }

           }
       };
       Object object=new Object();
       Object obj=cl.loadClass("com.RTTI.Class.Candy").newInstance();
       System.out.println(obj.getClass().toString());
        System.out.println(obj instanceof com.RTTI.Class.Candy);
        System.out.printf("=======");
    }

}
*/
