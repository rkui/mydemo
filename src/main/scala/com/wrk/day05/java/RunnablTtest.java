package com.wrk.day05.java;

public class RunnablTtest {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(1000);
                }catch(Exception e){

                }
                System.out.println("线程1");
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(1000);
                }catch(Exception e){

                }
                System.out.println("线程2");
            }
        });

        System.out.println(1);
        t1.start();
        System.out.println(2);
        t2.start();
        System.out.println(3);
    }
}
