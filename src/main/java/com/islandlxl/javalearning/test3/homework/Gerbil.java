package com.islandlxl.javalearning.test3.homework;

/*
@project:com.test3.homework
@Title:Gerbil
@Auther:lxl
@create:2019/2/24,17:47
*/public class Gerbil {
    int gerbilNumber;

    public Gerbil() {
    }

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }
    public String hop(){
        System.out.println("沙鼠的号码"+gerbilNumber);


        return "jump"+gerbilNumber;

    }
}
