package com.islandlxl.javalearning.tuling.Tulingyangguo.excutors;

/*
@project:com.tuling.Tulingyangguo.excutors
@Title:LxlExcutorsThreadPool
@Auther:lxl
@create:2020/2/2,12:04
*/public interface LxlExcutorsThreadPool {
    /**
     * 执行任务
     * @param task
     */
    public void execute(Runnable task);

    public void shutdown();

    public int getCorePoolSize();

    public Runnable getTask();


}
