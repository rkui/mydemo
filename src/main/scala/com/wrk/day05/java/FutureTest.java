package com.wrk.day05.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest  {
    public static void main(String[] args)throws Exception {

        ExecutorService cachedThreadPool=Executors.newCachedThreadPool();

        System.out.println(1);
        Future<String>future=cachedThreadPool.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1500);
                return "执行成功";
            }
        });

       Thread.sleep(1000);
        String msg="";
       if(future.isDone()){
           msg="正常执行";
       }else{
           Thread.sleep(1000);
           if (!future.isDone()){
               msg="执行异常";
               future.cancel(true);
           }
           else {
               msg=future.get();
           }
       }
        System.out.println(msg);



    }
}
