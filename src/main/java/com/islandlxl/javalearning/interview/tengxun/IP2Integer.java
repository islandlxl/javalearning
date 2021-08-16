package com.islandlxl.javalearning.interview.tengxun;

import java.util.Arrays;
import java.util.Scanner;

/**
 * date:2021-08-09
 写一个函数将 ipv4 地址字符串 (仅包含数字，点，空格) 转化成 32 位整数，
 另外，数字和点之间的空格是合法的，其他情况均为非法地址，要求输出合法地址的 32 位整型结果
 eg：
 10.10.10.10

 */
public class IP2Integer {
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            IP2Integer ip2Integer = new IP2Integer();
            String s = ip2Integer.IpConvert(line);
            System.out.println("输出的数字为:"+s);
            String longConvert = ip2Integer.longConvert(s);
            System.out.println("输出的IP为:"+longConvert);
        }

    }
    public String IpConvert(String ip){
        String[] split = ip.split("\\.");
        System.out.println(Arrays.toString(split));
        long iP=(Long.parseLong(split[0])<<24)+
                (Long.parseLong(split[1])<<16)+
                (Long.parseLong(split[2])<<8)+
                (Long.parseLong(split[3]));
        return String.valueOf(iP);
    }
    //举一反三 数字转为字符串
    public String longConvert(String number){
        long num = Long.parseLong(number);
        long A=num>>24;
        long B=(num&0X00FFFFFF)>>16;
        long C=(num&0X0000FFFF)>>8;
        long D=num&0X000000FF;
        String IP=new StringBuilder().append(A).append(".")
                .append(B).append(".").append(C).append(".")
                .append(D).toString();

        return IP;
    }

    public static void main(String[] args) {


    }
}
