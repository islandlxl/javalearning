package com.islandlxl.javalearning.interview.HUAWEI.exam;

import java.util.*;

public class Exam3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String nums = in.nextLine();
            String colors = in.nextLine();
            int seqNum = getResult(nums,colors);
            System.out.println("获取的结果："+seqNum);
        }
    }

    public static int getResult(String nums,String colors){
        String[] snums = nums.split(" ");
        String[] scolors = colors.split(" ");
        if ((scolors!=null&&scolors.length<=0)||(snums!=null&&snums.length<=0)){
            return 0;
        }
       List<Card> cardArrayList  = new ArrayList<Card>();
        for (int i = 0; i < snums.length; i++) {
            Card card  =new Card(Integer.valueOf(snums[i]),scolors[i]);
            cardArrayList.add(card);
        }
        for (int i = 0; i < cardArrayList.size(); i++) {
           Card cd =  cardArrayList.get(i);
            for (int j = i+1; j < cardArrayList.size()-i; j++) {

            }
        }

        return 0;
    }

    static class Card{

        private String color;
        private int num;

        public Card() {
        }

        public Card(int num,String color ) {
            this.color = color;
            this.num = num;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }

}
