package com.islandlxl.javalearning.interview.HUAWEI.Array;

import java.util.Scanner;

/*
@project:com.islandlxl.javalearning.interview.HUAWEI.Array
@Title:Matrix
@Auther:lxl
@create:2020/7/4,14:45
两个矩阵相乘 M(x,y)*N(y,z)
*/public class Matrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int x = Integer.valueOf(scanner.nextLine());
            int y = Integer.valueOf(scanner.nextLine());
            int z= Integer.valueOf(scanner.nextLine());
            int[][] A = new int[x][y];
            int[][] B = new int[y][z];

            for (int i = 0; i < x; i++) {
                String[] s = scanner.nextLine().split(" ");
                for (int j = 0; j <y ; j++) {
                    A[i][j]=Integer.valueOf(s[j]);
                }
            }

            for (int i = 0; i < y; i++) {
                String[] s = scanner.nextLine().split(" ");
                for (int j = 0; j <z ; j++) {
                    B[i][j]=Integer.valueOf(s[j]);
                }
            }
            getResult(A,B,x,y,z);
        }

    }

    public static void getResult(int[][] A,int[][] B,int x,int y,int z){

        int[][] result = new int[x][z];

        for (int i = 0; i <x ; i++) {
            for (int j = 0; j < z; j++) {
                for (int k = 0; k <y ; k++) {
                    result[i][j]=A[i][k]*B[k][j]+result[i][j];
                }

            }
        }

        System.out.println("输出为：");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < z; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
