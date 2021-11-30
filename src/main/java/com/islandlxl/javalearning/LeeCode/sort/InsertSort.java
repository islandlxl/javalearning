package com.islandlxl.javalearning.LeeCode.sort;

import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            String[] split = s.split(",");
            int[] newArr = new int[split.length];
            for (int i = 0; i <split.length ; i++) {
                newArr[i]=Integer.valueOf(split[i]);
            }
            int[] sortArr = insertSort(newArr);
            for (int a:sortArr){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
    public static int[] insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int j;
            for ( j = i-1; j >=0 ; j--) {
                if (arr[j]>temp){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+1]=temp;
        }
        return arr;
    }
}
