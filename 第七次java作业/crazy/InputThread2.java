package com.captain.demo.crazy;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * 注水线程
 * Created by captain on 2017/7/27.
 */
public class InputThread2 implements Callable<Object>{

    private BlockingQueue<String> queue;

    public InputThread2(BlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public Object call() throws InterruptedException {
        while(true){
            boolean flag = true;
            for(int cnt=0;cnt<7;cnt++){
                flag = queue.offer("一立方米");
                if(!flag){
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName()+"---"+"注水7立方米，当前水量："+queue.size());
            if(!flag){
                break;
            }
            TimeUnit.MILLISECONDS.sleep(1);
        }
        return "success";
    }
}