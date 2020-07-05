package com.islandlxl.javalearning.HUAWEI;

import java.util.Scanner;

/*
@project:com.islandlxl.javalearning.HUAWEI
@Title:Lifanggen
@Auther:lxl
@create:2020/7/1,22:25
https://www.nowcoder.com/practice/caf35ae421194a1090c22fe223357dca?tpId=37&rp=1&ru=%2Fta%2Fhuawei&qru=%2Fta%2Fhuawei%2Fquestion-ranking
*/public class Lifanggen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextDouble()){
            String s = scanner.nextLine();
            Double aDouble = Double.valueOf(s);
            System.out.println(getRoot(aDouble));
        }



    }
    public static double getRoot(double num){


        double target=num;
        for (double j = 2.0; j <num/3 ; j++) {
            target=num;
            if (target%j==0){

                int k=0;
                while (target!=1&&target%j==0){
                    target=target/j;
                    k++;
                }
                if (k==3&&target==1){
                    return j;
                }
            }
        }
        return -1;
    }
}
