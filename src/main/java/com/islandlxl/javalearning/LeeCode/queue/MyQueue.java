package com.islandlxl.javalearning.LeeCode.queue;

import java.util.Deque;
import java.util.LinkedList;
/**
 * 两个栈实现一个队列
 * https://leetcode-cn.com/problems/implement-queue-using-stacks/
 */
public class MyQueue {
    Deque<Integer> inDeque;
    Deque<Integer> outDeque;

    public MyQueue() {
        this.inDeque=new LinkedList<>();
        this.outDeque=new LinkedList<>();
    }
    //push入栈操作
    public void push(Integer num){
        inDeque.push(num);
    }
    //pop出栈操作
    public Integer pop(){
        if (outDeque.isEmpty()){
            while (!inDeque.isEmpty()){
                outDeque.push(inDeque.pop());
            }
        }
       return outDeque.pop();
    }
    //size操作
    public Integer size(){
        return inDeque.size()+outDeque.size();
    }
    //isEmpty
    public boolean isEmpty(){
        return inDeque.isEmpty()&&outDeque.isEmpty();
    }
    //peek操作
    public Integer peek(){
        if (outDeque.isEmpty()){
            while (!inDeque.isEmpty()){
                outDeque.push(inDeque.pop());
            }
        }
        return outDeque.peek();
    }
}
