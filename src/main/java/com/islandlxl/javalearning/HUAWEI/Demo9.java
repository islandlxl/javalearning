package com.islandlxl.javalearning.HUAWEI;

import java.util.Scanner;

public class Demo9{
    /**
     * 合格密码：
     * 1.长度大于8；
     * 2.包括大小写字母，数字，其他字符，以上至少3种
     * 3.不能有相同长度超过2的子串
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            if (s.trim().length()<8||s==null){
                System.out.println("NG");
            }else {
                int m = 0, n = 0, l = 0, k = 0;
                char[] chars = s.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] >= '0' && chars[i] <= '9') {
                        m = 1;
                    } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                        n = 1;
                    } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                        l = 1;
                    } else {
                        k = 1;
                    }

                }
                if (m + n + k + l >= 3) {
                    System.out.println(ifhasSubString(s));
                } else {
                    System.out.println("NG");
                }
            }
        }
    }
    //是否有相同的子串
    public static String ifhasSubString(String str){
        for(int i=0;i<str.length()-3;i++){
            String str1=str.substring(i,i+3);
            String str2=str.substring(i+3);
            if (str2.contains(str1)){
                return "NG";
            }
        }
        return "OK";
    }
}