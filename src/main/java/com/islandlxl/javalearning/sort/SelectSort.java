package com.islandlxl.javalearning.sort;

/*
@project:com.sort
@Title:SelectSort
@Auther:lxl
@create:2019/11/26,9:45
//选择排序  [5,4,7,8,2]


*/
public class SelectSort {

    public static void main(String[] args) {
        int[] arr={5,4,7,8,2};
        int[] sort = selectSort(arr);
        for (int  i :sort) {
            System.out.print(i+" ");
        }


    }
    public static int[] selectSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
           int min=i;
           for(int j=i+1;j<arr.length-i;j++){
               if (arr[min]>arr[j]){
                   min=j;
               }
           }
           int temp=arr[i];
           arr[i]=arr[min];
           arr[min]=temp;
        }
        return arr;
    }

}
