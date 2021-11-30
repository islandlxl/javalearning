package com.islandlxl.javalearning.LeeCode.sort;

import java.util.Scanner;

/***
 * Selection sort
 * 时间复杂度 O(n2)
 */
public class SelectSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            String[] split = s.split(",");
            int[] newArr=new int[split.length];
            for (int i = 0; i < split.length; i++) {
                newArr[i]=Integer.valueOf(split[i]);
            }
            int[] sortArr = selectSort(newArr);
            for (int a:sortArr) {
                System.out.print(a+" ");
            }
            System.out.println();
        }

    }
    public static int[] selectSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
