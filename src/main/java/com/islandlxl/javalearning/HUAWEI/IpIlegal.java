package com.islandlxl.javalearning.HUAWEI;

import java.util.Scanner;

/*
@project:com.islandlxl.javalearning.HUAWEI
@Title:IpIlegal
@Auther:lxl
@create:2020/7/4,16:01
是否是合法IP
https://www.nowcoder.com/practice/995b8a548827494699dc38c3e2a54ee9?tpId=37&rp=1&ru=%2Fta%2Fhuawei&qru=%2Fta%2Fhuawei%2Fquestion-ranking
10.137.17.1
*/public class IpIlegal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){

            String[] split = scanner.nextLine().split("\\.");
            if (split.length==4){
                boolean flag=false;
                for(int i=0;i<split.length;i++){
                     flag = getResult(split[i]);

                     if (!flag){
                         break;
                     }
                }
                System.out.println(flag?"YES":"NO");
            }

        }
    }

    public static boolean getResult(String str){

      String  regex="[0-9]+";
      if (str==null||str.trim().equals("")||Integer.valueOf(str)<0||Integer.valueOf(str)>255){
          return false;
      }

         return str.matches(regex);

    }
}
