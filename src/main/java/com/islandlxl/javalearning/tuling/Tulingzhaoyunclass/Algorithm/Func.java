package com.islandlxl.javalearning.tuling.Tulingzhaoyunclass.Algorithm;

/*
@project:com.tuling.Tulingzhaoyunclass.Algorithm
@Title:Func
@Auther:lxl
@create:2020/1/30,16:26
递归---
*/public class Func {

    private static  int[] data;
    public static void main(String[] args) {

        //int sum = qjc(5);
    /*    int sum = nofbl(2);

        System.out.println("最終的结果:"+sum);*/
     //   System.out.println("这次的结果是:"+tailarch(5,1));
        data=new int[46];
        for(int i=2;i<=45;i++){

            long start=System.currentTimeMillis();
            System.out.println(i+":"+tailarch(i,1)+"所花费的时间！"+(System.currentTimeMillis()-start));
        }

    }
    /*
    * 理解递归--：一个队伍的人排成长队，在一个漆黑的晚上，某某士兵想知道自己是多少号
    * */
    public static  int  funcdg(int n){
        if (n<2){
            return 1;
        }

        return funcdg(n-1)+1;
    }
    /*
    * 求一个斐波拉
    * */
    public static int fbl(int n){
        System.out.println("每次的值为:"+n);
        if (n<=2){
            return 1;
        }
        return  fbl(n-1)+fbl(n-2);
    }

    /**
     *使用非菲薄啦求解===》递归算法一定可以转化为非递归算法
     */
    public static int nofbl(int n){
        if (n<=2){
            return 1;
        }
        int f1=1;
        int f2=1;
        int f3=0;
        for(int i=3;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
   //使用缓存作用降低空间复杂度O(n)
    public static int fbl2(int n){
        if (n<=2){
            return 1;
        }
        if (data!=null&&data[n]!=0){
            return data[n];
        }
        int res=fbl2(n-1)+fbl2(n-2);
        data[n]=res;
        return res;
    }
    /*
    * 求一个阶乘！
    *
    * */
    public static int qjc(int n){
        System.out.println("求出的值为:"+n);
        if (n<2){
            return 1;
        }
        return n*qjc(n-1);
    }

    /**
     * 1.尾递归--只有递的过程没有归的过程，每次会把总的结果数带过去
     * 2.return 中只有函数名，没有其他的参数
       求阶乘的递归大概是这样！！！
       5,1
       4,5
       3,20
       2,60
       1,240
     */
    public static int tailarch(int n,int res){

        if (n<2){
            return n*res;
        }
        return tailarch(n-1,n*res);
    }

    /**
     * 前两个数之和，是斐波拉契数
     * @param n
     * @param res
     * @return
     */
    public static int tailarch2(int pre,int res,int n){
        if (n<=2){
            return 1;
        }
        return tailarch2(res,pre+res,n-1);
    }
}