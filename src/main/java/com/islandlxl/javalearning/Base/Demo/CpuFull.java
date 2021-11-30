package com.islandlxl.javalearning.Base.Demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CpuFull {
    public static void main(String[] args) {

    }
    @RequestMapping("/cpu/loop")
    public void cpuFull(){
        System.out.println(".......Cpu 打满.......");
        Thread.currentThread().setName("loop-thread-cpu");
        int num=0;
        while (true){
            num++;
            if (num==Integer.MAX_VALUE){
                System.out.print("reset");

            }
            System.out.println("num: "+num);
        }
    }

}
