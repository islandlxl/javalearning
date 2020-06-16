/*
package com.islandlxl.javalearning.tuling.Tulingyangguo.excutors;

import com.tuling.Tulingyangguo.excutors.Policyhandler.PolicyHandler;

import java.util.HashSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

*/
/*
@project:com.tuling.Tulingyangguo.excutors
@Title:LxlExcutorsThreadPoolImpl
@Auther:lxl
@create:2020/2/2,12:05
*//*
public class LxlExcutorsThreadPoolImpl implements LxlExcutorsThreadPool {


    public LxlExcutorsThreadPoolImpl(int poolsize,int queueSize,long keepAliveTime,PolicyHandler handler){
        if(poolsize <= 0 || poolsize > maxPoolSize )
            throw new IllegalArgumentException("线程池大小不能<=0");
        this.poolsize = poolsize;
        this.handler = handler;
        this.keepAliveTime = keepAliveTime;
        if(keepAliveTime > 0)
            allowThreadTimeOut = true;
        this.workQueue = new ArrayBlockingQueue<Runnable>(queueSize);
    }
    */
/**
     * 默认队列大小
     *//*

    private static final int defaultQueueSize = 5;

    */
/**
     * 默认池的大小
     *//*

    private static final int defaultPoolSize = 5;

    private static final long defaultAliveTime = 60l;

    */
/**
     * 线程池最大的大小
     *//*

    private static final int maxPoolSize = 50;

    */
/**
     * 线程池大小
     *//*

    private volatile int poolsize;

    */
/**
     * 任务容量
     *//*

    private long completedTaskCount;

    */
/**
     * 拒绝策略
     *//*

    private volatile PolicyHandler handler;

    */
/**
     * 是否已经中断
     *//*

    private volatile boolean isShutDown = false;

    */
/**
     * active当前激活线程数
     *//*

    private AtomicInteger ctl = new AtomicInteger();

    */
/**
     * 队列
     *//*

    private  BlockingQueue<Runnable> workQueue;

    */
/**
     * Lock
     *//*

    private final ReentrantLock mainLock = new ReentrantLock();
    */
/**
     * worker集合
     *//*

    private final HashSet<Worker> workers = new HashSet<Worker>();

    */
/**
     * 是否允许超时
     *//*

    private volatile boolean allowThreadTimeOut;

    private volatile long keepAliveTime;
    static AtomicInteger atomic=new AtomicInteger();


    */
/**
     * @param task
     *//*

    @Override
    public void execute(Runnable task) {
        if (task==null)
            throw new NullPointerException("任务不能为空！");
        if (isShutDown)
            throw new IllegalStateException("线程已经销毁，禁止提交任务！");
        int c = ctl.get();
        if (c<poolsize){
            if (addWorker(task,true))
              return;
        }else if (workQueue.offer(task)){

        }else {
            handler.reject(task,this);
        }
    }

    */
/**
     * 添加worker
     * @param task
     * @param startNew
     * @return
     *//*

    */
/**
     *  if(startNew){
     *             ctl.incrementAndGet();
     *         }
     *         boolean workerAdded = false;
     *         boolean workerStarted = false;
     *
     *         Worker w = new Worker(r);
     *         Thread t = w.thread;
     *         if(t != null){
     *             ReentrantLock mainLock = this.mainLock;
     *             mainLock.lock();
     *             try {
     *                 if(!isShutDown){ // 线程池未关闭
     *                     if (t.isAlive()) // 检查线程是否已经处于运行状态，start方法不能重复调用执行
     *                         throw new IllegalThreadStateException();
     *                     workers.add(w);
     *                     workerAdded = true;
     *                 }
     *             } finally {
     *                 mainLock.unlock();
     *             }
     *             if (workerAdded){
     *                 t.start();
     *                 workerStarted = true;
     *             }
     *         }
     *         return workerStarted;
     * @param task
     * @param startNew
     * @return
     *//*

    public boolean addWorker(Runnable task,Boolean startNew){

        if (startNew){
            ctl.incrementAndGet();
        }
        boolean workerStart=false;
        boolean workerAdd=false;

        Worker w=new Worker(task);
        Thread t=w.thread;
        if (t!=null){
            ReentrantLock mainLock=this.mainLock;
            mainLock.lock();
            try {
                if (!isShutDown){
                    if (t.isAlive())
                        throw new IllegalStateException();
                    workers.add(w);
                    workerAdd=true;
                }
            }finally {
                mainLock.unlock();
            }
            if (workerAdd){
                t.start();
                workerStart=true;
            }
        }
        return workerStart;
    }

    class Worker extends ReentrantLock implements Runnable{

        volatile long completedTask;
        final Thread thread;
        Runnable firstTask;

        public Worker(Runnable r){
            this.firstTask = r;
            this.thread = new Thread(this,"thread-name-"+atomic.incrementAndGet());
        }

        public void run() {
            runWorker(this);
        }
    }

    */
/**
     * @param worker
     *//*

    public void runWorker(Worker worker){
        Thread wt = Thread.currentThread();
        Runnable task = worker.firstTask;
        worker.firstTask=null;
        boolean completedAbruptly=true;
        try{
            while (task!=null||(task=getTask())!=null){
                worker.lock();
                if (isShutDown&&!wt.isInterrupted()){
                    wt.interrupt();
                }
                try{
                   task.run();

                }finally {
                    task=null;
                    worker.completedTask++;
                    worker.unlock();
                }
            }
            completedAbruptly=false;
        }finally {
            processWorkerExit(worker,completedAbruptly);
        }
    }

    */
/**
     * @param worker
     * @param completedAbruptly
     *//*

    public void processWorkerExit(Worker worker,Boolean completedAbruptly){

        if (completedAbruptly){
            ctl.decrementAndGet();
        }
        ReentrantLock mainLock=this.mainLock;
        mainLock.lock();
        try {
            completedTaskCount+=worker.completedTask;
            workers.remove(worker);
        }finally {
            mainLock.unlock();
        }
        if (completedAbruptly&&!workQueue.isEmpty()){
            addWorker(null,false);
        }
    }


    @Override
    public void shutdown() {
        final ReentrantLock mainLock = this.mainLock;
        mainLock.lock();
        try {
            isShutDown = true;
            for (Worker w : workers){
                Thread t = w.thread;
                if(!t.isInterrupted() && w.tryLock()){
                    try {
                        t.interrupt();
                    } catch (Exception e) {
                        //e.printStackTrace();
                    } finally {
                        w.unlock();
                    }
                }
            }
        } finally {
            mainLock.unlock();
        }
    }

    @Override
    public int getCorePoolSize() {
        return ctl.get();
    }

    @Override
    public Runnable getTask() {
        try {
            return allowThreadTimeOut ? workQueue.poll(keepAliveTime, TimeUnit.SECONDS) : workQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
*/
