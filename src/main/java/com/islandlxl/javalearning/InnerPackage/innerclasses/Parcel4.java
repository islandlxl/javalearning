package com.islandlxl.javalearning.InnerPackage.innerclasses;

/*
@project:com.InnerPackage.innerclasses
@Title:Parcel4
@Auther:lxl
@create:2019/11/11,21:30
*/public class Parcel4 {

    private String aa="aaa";
    private String getAa(){
        System.out.println(aa);
        return this.aa;
    }

    class Parcel3{
        private String bb="bb";
        public void change(){
            aa ="acc";
            getAa();
        }

    }

    public static void main(String[] args) {
        Parcel4 parcel4=new Parcel4();
        Parcel3 parcel3 = parcel4.new Parcel3();
        System.out.println(parcel3.bb);
        parcel3.change();

    }

}
