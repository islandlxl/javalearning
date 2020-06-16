package com.islandlxl.javalearning.RTTI;

import java.util.Arrays;
import java.util.List;

/*
@project:com.RTTI
@Title:Shapes
@Auther:lxl
@create:2019/2/25,9:44
*/public class Shapes {


    public static void main(String[] args) {

        List<Shape> shapeList= Arrays.asList(new Circle(),new Square(),new Triangle());

        for (Shape shape:shapeList) {
            shape.draw();
        }

    }
}
