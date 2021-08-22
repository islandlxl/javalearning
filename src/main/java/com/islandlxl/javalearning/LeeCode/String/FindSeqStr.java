package com.islandlxl.javalearning.LeeCode.String;

import java.util.Scanner;

public class FindSeqStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            String t = scanner.nextLine();
            FindSeqStr findSeqStr = new FindSeqStr();
            boolean subsequence = findSeqStr.isSubsequence(s, t);
            System.out.println("s是否是t的子序列:"+subsequence);
        }

    }
    //使用双指针
    public boolean isSubsequence(String s, String t) {
        if (t.trim().equals("")||s.trim().equals("")){
            return true;
        }
        if (s.length()<t.length()){
            return false;
        }

        int pointS=0;//s串的指针
        int pointT=0;//t串的指针
        int LS=s.length();
        int TL=t.length();
        while (pointT<TL){

            char cc = s.charAt(pointS);
            char sc = t.charAt(pointT);
            if (cc==sc){
                pointS++;
                pointT++;
                if (pointS>=LS){
                    return true;
                }
            }else{
                pointT++;
            }
        }
        return false;
    }
}
