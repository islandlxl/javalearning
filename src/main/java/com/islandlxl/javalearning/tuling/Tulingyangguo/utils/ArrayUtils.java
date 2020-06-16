package com.islandlxl.javalearning.tuling.Tulingyangguo.utils;

import java.util.Random;

/*
@project:com.tuling.Tulingyangguo.utils
@Title:ArrayUtils
@Auther:lxl
@create:2020/2/3,21:32
*/public class ArrayUtils {

    public static int[] buildRandomIntArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Random().nextInt(100);
        }
        return array;
    }

    public static int[] buildRandomIntArray() {
        int size = new Random().nextInt(100);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Random().nextInt(100);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] ints = ArrayUtils.buildRandomIntArray();

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

}
