package com.islandlxl.javalearning.LeeCode.sort;

import java.util.Arrays;
import java.util.Scanner;

public class MaoPaoSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            String[] split = s.split(",");
            int[] inArr=new int[split.length];
            for (int i = 0; i < split.length; i++) {
                inArr[i]=Integer.valueOf(split[i]);
            }
            int[] sortArr = sort(inArr);
            for (int a:sortArr){
                System.out.print(a+" ");
            }
            System.out.println();

        }

    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <arr.length ; j++) {
                if (arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        return arr;
    }
}
