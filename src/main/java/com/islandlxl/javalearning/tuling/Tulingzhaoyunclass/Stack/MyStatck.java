package com.islandlxl.javalearning.tuling.Tulingzhaoyunclass.Stack;

/*
@project:com.tuling.Tulingzhaoyunclass.Stack
@Title:MyStatck
@Auther:lxl
@create:2019/12/14,13:54
*/public class MyStatck<T> implements Stack<T> {
    T[] t  = (T[]) new Object[1];
     int n=0;//初始化栈的长度
//有参构造类中，如果不实现一个无参构造就会在子类实现类中报错


    public MyStatck( int cap) {
        t=(T[]) new Object[cap];
    }

    @Override
    public Stack push(T x) {
        judgeSize();
        t[n++]=x;
        return null;
    }
    public void judgeSize(){
        if (n>=t.length){
            resize(2*t.length);
        }else if(n > 0 && n <= t.length / 2){
            resize(t.length / 2);
        }
    }
    public void resize(int size){
        T[] temp= (T[]) new Object[size];
      for(int i=0;i<n;i++){
          temp[i]=t[i];
      }
      t=temp;
    }

    @Override
    public T pop() {
        if (isEmpty()){
            return null;
        }
        T x=t[--n];
        t[n]=null;
        return x;
    }

    @Override
    public boolean isEmpty() {
        return n==0;
    }

    @Override
    public int size() {
        return n;
    }
}
