package com.islandlxl.javalearning.test3.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
@project:com.test3.homework
@Title:AsListInterface
@Auther:lxl
@create:2019/2/24,18:53
*/public class AsListInterface {

    public static void main(String[] args) {

        List<Snow> snows1= Arrays.asList(new Crusty(),new Slush(),new Powder());

        System.out.println(snows1);



        List<Snow> snows3 = new ArrayList<Snow>();

        Collections.addAll(snows3, new Heavy(), new Light());
        System.out.println(snows3);

        List<Snow> snows4 = Arrays.asList(new Light(), new Heavy());

        System.out.println(snows4);


    }
}
