package com.islandlxl.javalearning.test3;

import java.util.ArrayList;

/*
@project:com.test3
@Title:AppleAndOrangesWithoutGenerics
@Auther:lxl
@create:2019/2/24,17:04
结果：报错了，越界报错。
*/public class AppleAndOrangesWithoutGenerics {
    public static void main(String[] args) {

        ArrayList apples=new ArrayList();
        for (int i=0;i<3;i++)
            apples.add(new Apple());

            apples.add(new Orange());
         for (int i=0;i<apples.size();i++)
             ((Apple)apples.get(i)).id();

    }

}
