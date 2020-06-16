package com.islandlxl.javalearning.test3;

import java.util.ArrayList;

/*
@project:com.test3
@Title:AppleAndOrangesWithoutGenerics
@Auther:lxl
@create:2019/2/24,17:19
使用了泛型之后，arraylist知道存了什么类型
*/public class AppleAndOrangesWithGenerics {
    public static void main(String[] args) {

        ArrayList<Apple> apples=new ArrayList();
        for (int i=0;i<3;i++)
            apples.add(new Apple());
//存orange的话会报错。
          //  apples.add(new Orange());
         for (int i=0;i<apples.size();i++)
             System.out.println(apples.get(i).id());


        for (Apple c:apples) {
            System.out.println(c.id());

        }
    }

}
