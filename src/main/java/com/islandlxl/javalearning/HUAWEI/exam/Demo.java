package com.islandlxl.javalearning.HUAWEI.exam;

import java.util.*;

/*
@project:com.islandlxl.javalearning.HUAWEI.exam
@Title:Demo
@Auther:lxl
@create:2020/7/4,17:22
*/public class Demo {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int  num1 = Integer.valueOf(scanner.nextLine());

            int  num2 = Integer.valueOf(scanner.nextLine());
            if (num1>=1&&num1<=9){
                Set<String> set=new TreeSet<>();

                  while (set.size()!=getjiec(num1)){

                    StringBuilder sb=new StringBuilder();
                    while (sb.length()!=num1){
                        String a=String.valueOf(Math.round(Math.random()*(num1)));
                        if (a.equals("0")){
                            continue;
                        }
                        if (!sb.toString().contains(a)){
                            sb.append(a);
                        }
                    }

                    set.add(sb.toString());
                }
                Object[] objects = set.toArray();
                //Arrays.sort(objects);
                System.out.println(objects[num2-1]);
            }


        }
    }
    public static int getjiec(int num){
        if (num==1)
          return 1;

        return getjiec(num-1)*num;
    }


}
