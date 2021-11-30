package com.islandlxl.javalearning.sort;

/*
@project:com.sort
@Title:Maopao
@Auther:lxl
@create:2019/11/26,9:03
//冒泡排序  [5,4,7,8,2]
第一轮排序：[4,5,7,2,8]
第二轮排序：[4,5,2,7,8]
第三轮排序：[4,2,5,7,8]
第四轮排序：[2,4,5,7,8]
*/
public class Maopao {
    public static void main(String[] args) {

        int[] arr={5,4,7,8,2};

        int[] arrs = maopaoSort(arr);

        for(int i=0;i<arrs.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static int[] maopaoSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
           for(int j=1;j<arr.length-i;j++){
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
