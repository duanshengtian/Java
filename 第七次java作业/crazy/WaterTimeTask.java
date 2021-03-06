package com.captain.demo.crazy;

import com.captain.demo.utils.ThreadUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * 定期放水类
 * Created by captain on 2017/7/27.
 */
public class WaterTimeTask extends TimerTask {

    @Override
    public void run() {
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10000);
        InputThread thread1 = new InputThread(queue);
        InputThread thread3 = new InputThread(queue);
        InputThread2 thread4 = new InputThread2(queue);
        OutputThread thread2 = new OutputThread(queue);
        List<Callable<Object>> threadList = new ArrayList<>();
        threadList.add(thread1);
        threadList.add(thread3);
        threadList.add(thread4);
        threadList.add(thread2);
        List<Object> returnValue = null;
        try {
            returnValue = ThreadUtil.runCheckCallable(threadList,true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("泳池已经注满");
        for(int i=0;i<returnValue.size();i++){
        	 System.out.println(returnValue.get(i));
        	
        }
       
      //  System.out.println(returnValue.get(1));
    }
}
