package com.islandlxl.javalearning.LeeCode.Array;

/*
@project:com.islandlxl.javalearning.LeeCode.Array
@Title:LongestCommonStr
@Auther:lxl
@create:2020/6/15,19:17
https://leetcode-cn.com/problems/longest-common-prefix/
*/public class LongestCommonStr {


    public static void main(String[] args) {

        String[] strings={"flower","flow","flight"};
        String[] strings2 ={"abab","aba","a"};
        StringBuilder sb=new StringBuilder();
        String s = longestCommonPrefix(strings2);
        System.out.println("最长子串"+s);


    }

    public  static String longestCommonPrefix(String[] strs) {

        StringBuilder sb=new StringBuilder();
        if (strs!=null&&strs.length>0){

            if (strs.length==1){
                return strs[0];
            }

            String str=strs[0];
            if (str.trim().equals("")){
                return "";
            }
            int length = str.length();
            int index=0;
            int count=0;
            while (length>index){

                char sss = str.charAt(index);
                for(int i=1;i<strs.length;i++){

                    if (strs[i].equals("")){
                        return sb.toString().equals("")?"":sb.toString();
                    }
                    if (strs[i].length()-1>=index){
                        if (sss==strs[i].charAt(index)){
                            count++;
                        }else{
                            return sb.toString().equals("")?"":sb.toString();
                        }
                        if (count==strs.length-1){
                            count=0;
                            sb.append(sss);
                        }
                    }else{
                        return sb.toString().equals("")?"":sb.toString();
                    }

                }
                index++;
            }

            return sb.toString().equals("")?"":sb.toString();
        }
        return sb.toString().equals("")?"":sb.toString();
    }

}
