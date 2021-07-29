package com.islandlxl.javalearning.LeeCode.sort;

/**
 * @PACKAGE_NAME: com.islandlxl.javalearning.LeeCode.sort
 * @DESCRIPTION:
 * @COMMENT: 奔跑吧, 骚年
 * @USER: longxl
 * @DATE: 2021/7/29 23:09
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr={4,2,8,9,33,1};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" 第 i 个元素是: " +arr[i]);
        }

    }
    public void quickSort(int[] arr,int low,int high){
        int pivot,p_pos,i,t;
        if (low<high){
           p_pos=low;
           pivot= arr[p_pos];
            for (i = low+1; i <=high ; i++) {
                if (arr[i]<pivot){
                    p_pos++;
                    t=arr[p_pos];
                    arr[p_pos]=arr[i];
                    arr[i]=t;
                }
            }
            t=arr[low];
            arr[low]=arr[p_pos];
            arr[p_pos]=t;
            quickSort(arr,low,p_pos-1);
            quickSort(arr,p_pos+1,high);
        }
    }

}
