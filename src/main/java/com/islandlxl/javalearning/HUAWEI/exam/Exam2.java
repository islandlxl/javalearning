package com.islandlxl.javalearning.HUAWEI.exam;

import java.util.*;

/**
 * 20210627华为机测
 * 求输入 a ctrl+c ctrl+x ctrl+v ctrl+a 分别用1,2,3,4,5代表:最后留在界面上的数字的长度？
 *
 */
public class Exam2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String s = in.nextLine();
            int seqNum = getResult(s);
            System.out.println("获取的结果："+seqNum);
        }
    }

    public static int getResult(String str){
        String[] strs = str.split(" ");
        if (strs!=null&&strs.length<=0){
            return 0;
        }
        Deque<Integer> resultStack = new LinkedList<>();
        Deque<Integer> cacheStack = new LinkedList<>();
        Boolean isSelect=false;
        for (int i = 0; i <strs.length ; i++) {
            Integer currNum = Integer.valueOf(strs[i]);
            if (currNum==1){
                if (!resultStack.isEmpty()){
                    Integer peek = resultStack.peek();
                    if (peek==2||peek==3||peek==5){
                        resultStack.clear();
                        resultStack.push(currNum);
                    }else {
                        resultStack.push(currNum);
                    }
                }else{
                    resultStack.push(currNum);
                }
            }else if (currNum==2){
                isSelect=true;
                while (!resultStack.isEmpty()){
                    cacheStack.push(resultStack.pollLast());
                }
            }else if (currNum==3||currNum==5){
                isSelect=true;
                while (!resultStack.isEmpty()){
                    cacheStack.push(resultStack.pollLast());
                }
            }else if (currNum==4){
                if (!resultStack.isEmpty()){
                    Integer peek = resultStack.peek();
                    if (peek==2||peek==3||peek==5){
                        while (!cacheStack.isEmpty())
                        resultStack.push(cacheStack.pollLast());
                    }

                }

            }
        }

        return resultStack.size();
    }


}
