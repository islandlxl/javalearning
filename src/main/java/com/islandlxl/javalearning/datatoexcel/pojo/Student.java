package com.islandlxl.javalearning.datatoexcel.pojo;

/*
@project:com.datatoexcel.pojo
@Title:Student
@Auther:lxl
@create:2019/3/6,16:35
*/public class Student {
    private int sid;
    private String username;
    private int age;
    private String clazz;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
