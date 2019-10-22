package com.wrk.day05.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool=Executors.newCachedThreadPool();

        for (int i=0;i<5;i++){
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"--"+Thread.currentThread().getId());

                    try{
                        Thread.sleep(5000);
                    }catch (Exception e){

                    }



                }
            });
        }

        try{
            Thread.sleep(5000);
        }catch (Exception e){

        }


        for (int i=0;i<10;i++){
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"--"+Thread.currentThread().getId());

                    try{
                        Thread.sleep(5000);
                    }catch (Exception e){

                    }


                }
            });
        }

    }
}

