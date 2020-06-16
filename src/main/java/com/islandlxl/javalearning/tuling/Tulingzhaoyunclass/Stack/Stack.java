package com.islandlxl.javalearning.tuling.Tulingzhaoyunclass.Stack;

/*
@project:com.tuling.Tulingzhaoyunclass.Stack
@Title:Stack
@Auther:lxl
@create:2019/12/14,13:39
*/public interface Stack<T> {

    Stack<T> push(T t);

    T pop();

    boolean isEmpty();

    int size();

}
