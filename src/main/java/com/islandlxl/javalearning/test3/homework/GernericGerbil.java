package com.islandlxl.javalearning.test3.homework;

import java.util.ArrayList;

/*
@project:com.test3.homework
@Title:GernericGerbil
@Auther:lxl
@create:2019/2/24,17:50
*/public class GernericGerbil {

    public static void main(String[] args) {

        ArrayList<Gerbil> gerbils=new ArrayList<Gerbil>();
        for (int i=0;i<50;i++)
          gerbils.add(new Gerbil(i));

        for (int i=0;i<gerbils.size();i++)
            System.out.println(gerbils.get(i).hop());
    }
}
