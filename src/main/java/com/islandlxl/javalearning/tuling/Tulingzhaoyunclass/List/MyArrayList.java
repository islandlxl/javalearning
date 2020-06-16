package com.islandlxl.javalearning.tuling.Tulingzhaoyunclass.List;

/*
@project:com.tuling.Tulingzhaoyunclass
@Title:ArrayTest
@Auther:lxl
@create:2019/12/3,18:00
  数组在内存中是一块连续的内存空间，定义之后，分配内存空间，
     特性：索引下标从0 开始
           支持快速随机访问，
           插入，删除慢。
*/
public class MyArrayList {

    private static  int size;
    private static  int  data[];
    private  static int index;

    public MyArrayList(int size){
        this.size=size;
        this.data=new int[size];
        this.index=0;
    }


    //新增
    public static   void  insert(int loc,int n){

        if (index++<size) {
            for (int i = size - 1; i > loc; i--) {
                data[i] = data[i - 1];
            }
            data[loc] = n;
        }

    }
//删除
    public static  void delete(int loc){
      for(int i=loc;i<size;i++){

          if (!(loc==size-1)){
              data[i]=data[i+1];
          }else{
              data[i]=0;
          }
      }
      index--;
    }

    //update
    public static  void update(int loc,int n){

        data[loc]=n;
    }
    //查询
    public  static int get(int loc){
        return data[loc];
    }

    public static  void print(){
        System.out.println("输出"+index+"个数");
        for(int i=0;i<size;i++){
            System.out.print(data[i]+" ");
        }
    }

    public static void main(String[] args) {
        MyArrayList arr=new MyArrayList(5);

        arr.insert(0,1);
        arr.insert(1,2);
        arr.insert(2,3);
        arr.insert(1,8);
        print();
    }
}
