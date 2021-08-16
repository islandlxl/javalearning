package com.islandlxl.javalearning.interview.HUAWEI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/*
@project:com
@Title:Demo
@Auther:lxl
@create:2019/10/19,10:07
*/public class Demo3 {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
     //   int N=scanner.nextInt();
        int N=scanner.nextInt();
        int arr[]=new int[N];
       for (int i=0;i<N;i++){
           arr[i]=scanner.nextInt();
       }
        ArrayList<Integer> outArr = quchong(arr);
        Object[] objects = outArr.toArray();
        Arrays.sort(objects);
        for (int i=0;i<objects.length;i++) {
            System.out.println(objects[i]);
        }

    }
    public static ArrayList quchong(int[] arr) {
       ArrayList<Integer> list=new ArrayList<Integer>();
        for ( Integer a :arr) {
            if (!list.contains(a)){
                  list.add(a);
            }
        }


        return list;
    }
    public static void solve2(){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){

            int num = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<Integer>();
            for(int i = 0 ; i < num ;i++){
                int curr = sc.nextInt();
                set.add(curr);
            }
            for(Integer i : set){
                System.out.println(i);
            }
        }
    }


}
