package com.islandlxl.javalearning.HUAWEI.DP;

import java.util.Scanner;

/*
@project:com.islandlxl.javalearning.HUAWEI.DP
@Title:Shop
@Auther:lxl
@create:2020/7/4,11:41
*/public class Shop {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){

            String []s = scanner.nextLine().split(" ");

            if (s.length==2){
                int totalMoney=Integer.valueOf(s[0]);
                int num=Integer.valueOf(s[1]);
                int [] v=new int[num];//价格
                int [] p=new int[num];//权重
                int [] q=new int[num];//主副
                int [] V=new int[num];//主副
                int i=0;
                while (i<num){
                    String[] wu = scanner.nextLine().split(" ");
                    if (wu.length==3){
                        v[i]=Integer.valueOf(wu[0]);
                        p[i]=Integer.valueOf(wu[1]);
                        q[i]=Integer.valueOf(wu[2]);
                        V[i]=v[i]*p[i];
                    }
                    i++;
                }
                getMaxValue(v,V,q,num,totalMoney);
            }

        }



    }

    public static void getMaxValue(int[] v,int[] V,int[] q,int num,int totalMoney){

        int [][] worth=new int[num+1][totalMoney+1];

        for (int i = 1; i <=num ; i++) {
            for (int j = 0; j <=totalMoney ; j=j+10) {

                if (q[i-1]==0){//主件

                    if (v[i-1]<=j){

                        worth[i][j]=Math.max(
                                V[i-1]+worth[i-1][j-v[i-1]]
                                ,worth[i-1][j]
                        );

                    }else{
                        worth[i][j]=worth[i-1][j];
                    }
                }else {//附件

                    if (v[i-1]+v[q[i-1]]<=j){
                        worth[i][j]=Math.max(
                                V[i-1]+worth[i-1][j-v[i-1]]
                                ,worth[i-1][j]
                        );
                    }

                }

            }
        }
        System.out.println(worth[num][totalMoney]);




    }
}
