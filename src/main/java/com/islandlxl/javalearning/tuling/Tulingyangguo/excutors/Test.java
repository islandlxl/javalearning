/*
package com.islandlxl.javalearning.tuling.Tulingyangguo.excutors;

import com.tuling.Tulingyangguo.excutors.Policyhandler.DefaultPolicy;

*/
/*
@project:com.tuling.Tulingyangguo.excutors
@Title:Test
@Auther:lxl
@create:2020/2/2,14:50
*//*
public class Test {

    public static void main(String[] args) {
        LxlExcutorsThreadPool pool = new LxlExcutorsThreadPoolImpl(3, 3, 3, new DefaultPolicy());

        for(int i=0;i<3;i++){
          pool.execute(new Task(i));
        }
        try{
          Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
        pool.shutdown();
    }
}
*/
