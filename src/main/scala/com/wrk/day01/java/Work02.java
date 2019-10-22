package com.wrk.day01.java;

import java.util.Scanner;

public class Work02 {
    public static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {

        double speed=setSpeed();
        double distance=setDistance();

        double time=getTime(speed,distance);
        System.out.println("时间为"+time*60+"分");

    }

    public static double getTime(double speed,double distance){

        double time=distance/speed;

        return time;
    }

    public static double setSpeed(){

        System.out.println("平均速度选择:1.默认     2.自定义");
        int flag=scan.nextInt();
        double speed=0.0;
        switch (flag){
            case 1:speed=30.0;
            break;
            case 2:{
                System.out.println("输入平均速度(Km/h)");
                speed=scan.nextDouble();
            }
            break;
            default:
                System.out.println("选择错误");
        }
        return speed;
    }

    public static double setDistance(){

        System.out.println("输入两地距离(Km)");
        double distance=scan.nextDouble();
        return distance;
    }
}
