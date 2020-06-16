package com.islandlxl.javalearning.test;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /*public static void getName(){
        System.out.println("hello island");
    }
    public static void main(String[] args) {

        System.out.println(10%(Math.pow(2,4)));

        System.out.println(Integer.toBinaryString((int)(Math.pow(2,4)-1)));
        System.out.println(2&((int)(Math.pow(2,4)-1)));

    }*/

    public static void main(String[] args) {

        Animal dog = new Dog();

        System.out.println(dog.say("dog"));

        List<Pig> pigs=new ArrayList<>();
        List<Dog> dogs=new ArrayList<>();
        List<Animal> animal=new ArrayList<>();
       // demo(pigs);
        demo(dogs);
        demo(animal);
        new Test().test(animal,dogs);

        List<Animal> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();

        /*demo3(list1,list2);*/
    }


    public static void demo(List<? super Dog> list){



    }

    public static<T>  void demo2(Class<T> clazz) throws Exception {

      /*  return clazz.newInstance();*/
    }

    public static <T extends Animal> void demo3(List<T> t,List<T> s){

    }
}
