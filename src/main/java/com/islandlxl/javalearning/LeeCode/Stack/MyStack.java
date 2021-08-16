package com.islandlxl.javalearning.LeeCode.Stack;

import java.util.Deque;
import java.util.LinkedList;

public class MyStack {
    Deque<Integer> masterQueue;
    Deque<Integer> slaveQueue;
    public MyStack() {
        this.masterQueue=new LinkedList<>();
        this.slaveQueue=new LinkedList<>();

    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (!slaveQueue.isEmpty()){
            while (!slaveQueue.isEmpty()){
                masterQueue.push(slaveQueue.pop());
            }
        }
        masterQueue.push(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return masterQueue.pop();
    }

    /** Get the top element. */
    public int top() {
        return masterQueue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return masterQueue.isEmpty();
    }
}
