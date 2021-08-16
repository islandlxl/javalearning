package com.islandlxl.javalearning.interview.HUAWEI;

import java.util.*;

public class Demo7 {
    /**
     * 数据表记录包含表索引和数值（int范围的整数），
     * 请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，
     * 输出按照key值升序进行输出。
     *
     * 先输入键值对的个数
     * 然后输入成对的index和value值，以空格隔开
     *
     * 输出合并后的键值对（多行）
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            int n = scanner.nextInt();
            String s1="";
            String s2="";
            String[] s=new String[n];
            for(int i=0;i<n;i++){
                 s[i] = scanner.nextLine();
                 s1+= s[i].charAt(0);
                 s2+= s[i].charAt(3);
            }
            char[] chars1 = s1.toCharArray();
            char[] chars2 = s2.toCharArray();
            Map map=new HashMap();
            for(int i=0;i<n;i++){
              map.put(chars1[i],chars2[i]);
                for(int j=i+1;j<n;j++){
                    while (chars1[i]==chars1[j]){
                        int a = Integer.parseInt(String.valueOf(chars2[i]));
                        int b = Integer.parseInt(String.valueOf(chars2[j]));
                        map.put(chars1[i],a+b);

                    }
                }
            }
            for(int i=0;i<map.size();i++){
                System.out.println(map.keySet()+" "+map.values());
            }

        }

    }
}
