package com.islandlxl.javalearning.Base.innerclasses;

/*
连接到外部内
@project:com.InnerPackage
@Title:Sequence
@Auther:lxl
@create:2019/11/11,18:54
*/public class Sequence {
    private Object[] items;
    private int next=0;
    public Sequence(int size){
        items=new Object[size];
    }
    public void add(Object x){
        if (next<items.length){
            items[next++]=x;
        }
    }
    private class SequenceSelector implements Selector{
        private int i=0;

        @Override
        public boolean end() {
            return i==items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i<items.length) i++;
        }
    }
    public Selector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence=new Sequence(10);
        for(int i=0;i<10;i++){
          sequence.add(new Str());
        }
        Selector selector = sequence.selector();

       while (!selector.end()){
            System.out.print(selector.current()+" ");
            selector.next();
        }

    }


}
