package com.islandlxl.javalearning.interview.HUAWEI;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo8 {

    /*单播地址：全0
       环回地址:最后为1
       链路本地地址：FE80
       站点本地地址：FEC0
       全球单播：--
     * 组播地址 FF00
     * 任播：。。
     * @param args
     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            Boolean legalIp = ifLegalIp(s);
            if (legalIp==true){
                String[] spS = s.split("\\:");

                for(int i=0;i<spS.length;i++){
                    if (spS[0].equals("FE80")) {
                        System.out.println("LinkLocal");
                        break;
                    }else if (spS[0].equals("FEC0")) {
                        System.out.println("SiteLocal");
                        break;
                    }else if(spS[0].equals("FF00")){
                        System.out.println("Multicast");
                        break;
                    }
                    while (spS[i].equals("0000")){
                        if (i==spS.length-1) {
                            System.out.println("Unspecial");
                            break;
                        }
                        if (spS[3].equals("0001")){
                            System.out.println("GlobalLocal");
                            break;
                        }
                    }
                    System.out.println("全球单播");
                }
            }else{
                System.out.println("Error");
            }
        }
    }
    //先判断是不是合法的IPV6地址
    public static Boolean ifLegalIp(String s){
        String[] strs = s.split("\\:");
        if (strs.length!=4){
            return false;
        }
        String regex="^[0-9A-F]+$";
        for(int i=0;i<strs.length;i++){
            if(Pattern.matches(regex,strs[i])){
                if (i!=3)
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
    //判断是不是0-9和A-F组成的16进制
    /*public static Boolean ifHex(String s){
        if (s.trim().length()!=4){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if((c>='A'&&c<='F')||Character.isDigit(c)){
               continue;
            }else{
                return false;
            }
        }
        return true;
    }*/
}
