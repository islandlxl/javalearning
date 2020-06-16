package com.islandlxl.javalearning.sort;

/*
@project:com.sort
@Title:insertSort
@Auther:lxl
@create:2019/11/26,13:41
插入排序：
*/
public class insertSort {

    public static void main(String[] args) {

        int[] arr={2,5,1,9,4};

        int[] arrs = insert(arr);
        for (int a :arrs) {
            System.out.print(a+" ");
        }
    }
    public static int[] insert(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
           /* int j=i-1;
            while (j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }*/
           int j;
           for(j=i-1;j>=0;j--){
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
