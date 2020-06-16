package com.islandlxl.javalearning.InnerPackage;

/*
@project:com.test
@Title:Outter
@Auther:lxl
@create:2019/11/11,17:31
*/public class Outter {

    private  String s;
    public Outter(String s){
        this.s=s;
    }
    class Inner{
        String aa;
        public Inner(){
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public Inner getInne(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outter outter=new Outter("abc");
        Inner inne = outter.getInne();
        System.out.println(inne.toString());

    }


}
