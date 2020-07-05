package com.islandlxl.javalearning.HUAWEI;

import com.sun.corba.se.impl.oa.poa.POAPolicyMediatorImpl_NR_UDS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
@project:com.islandlxl.javalearning.HUAWEI
@Title:MajorityElement
@Auther:lxl
@create:2020/6/30,21:54
https://www.nowcoder.com/practice/3584a44114ea4805a9f6814e99285835?tpId=0
*/public class MajorityElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String[] s = scanner.nextLine().replace("[","").replace("]","").split(",");
            String[] strs = insertSort(s);
            System.out.println(strs[strs.length/2]);
        }
    }

    public static String[] insertSort(String[] s){
        for (int i = 1; i <s.length ; i++) {
            int data=Integer.valueOf(s[i]);
            int j=i-1;
            for(;j>=0;j--) {
                if (Integer.valueOf(s[j]) > data){
                    s[j + 1] = s[j];
                }else{
                    break;
                }

            }
            s[j+1]=String.valueOf(data);
        }

        return s;
    }


}
