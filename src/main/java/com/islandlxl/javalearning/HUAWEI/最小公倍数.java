package com.islandlxl.javalearning.HUAWEI;

import java.util.Scanner;

/*
@project:com.islandlxl.javalearning.HUAWEI
@Title:最小公倍数
@Auther:lxlhttps://www.nowcoder.com/practice/22948c2cad484e0291350abad86136c3?tpId=37&&tqId=21331&rp=1&ru=/ta/huawei&qru=/ta/huawei/question-ranking
@create:2020/6/29,21:13
*/
public class 最小公倍数 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String[] s = scanner.nextLine().split(" ");
            int num1,num2,temp;

            if (s.length==2){
                 num1=Integer.valueOf(s[0]);
                 num2=Integer.valueOf(s[1]);

                int i = MaxCommonDivide(num1, num2);
                System.out.println("最小公倍数："+(num1*num2)/i);

            }
        }
    }
    //最大公约数
    public static int MaxCommonDivide(int x,int y){
        if (y==0)
            return 0;

        while (x%y!=0){
            int z=x%y;
            x=y;
            y=z;
        }
        return y;
    }



}
