package com.islandlxl.javalearning.test3;

import java.util.ArrayList;

/*
@project:com.test3
@Title:GenericsAndUpcasting
@Auther:lxl
@create:2019/2/24,17:42
泛型里面放到是apple 但是添加的是子类，这样也可以
*/public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples=new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple c:apples) {
            System.out.println(c);

        }


    }
}
