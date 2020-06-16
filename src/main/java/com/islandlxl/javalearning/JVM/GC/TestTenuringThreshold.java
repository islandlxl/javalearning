package com.islandlxl.javalearning.JVM.GC;

/*
@project:com.islandlxl.javalearning.JVM.GC
@Title:TestTenuringThreshold
@Auther:lxl
@create:2020/5/10,21:23
-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=15
-XX:PrintTenuringDistribution
*/public class TestTenuringThreshold {

    public static final int _1MB=1024*1024;
    public static void testTenuringThreshold() throws InterruptedException{
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1=new byte[_1MB/4];
        allocation2=new byte[_1MB/4];
        allocation3=new byte[4*_1MB];
        allocation4=new byte[4*_1MB];
        Thread.sleep(Integer.MAX_VALUE);
        allocation4=null;
        allocation4=new byte[4*_1MB];
    }

    public static void main(String[] args) throws InterruptedException {
        testTenuringThreshold();
    }
}
