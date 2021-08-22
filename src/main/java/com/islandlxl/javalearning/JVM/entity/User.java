package com.islandlxl.javalearning.JVM.entity;


public class User {
    private String name;
    private int age;
    private String birthday;

    public User() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void doSomeThings() {
        System.out.println("i was load!");
    }
}
