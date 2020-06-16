package com.islandlxl.javalearning.test3.homework;

import java.util.*;

/*
@project:com.test3.homework
@Title:AddingGroups
@Auther:lxl
@create:2019/2/24,18:39
*/public class AddingGroups {
    public static void main(String[] args) {

        Collection<Integer> collections=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Integer[] moreints={6,7,8,9};

        collections.addAll(Arrays.asList(moreints));
        System.out.println(collections);

        Collections.addAll(collections,11,12,13,14,15);
        System.out.println(collections);

        Collections.addAll(collections,moreints);
        System.out.println(collections);

        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);

        list.set(1,99);
        System.out.println(list);
        list.add(21);
        System.out.println(list);





    }
}
