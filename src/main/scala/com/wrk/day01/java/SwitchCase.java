package com.wrk.day01.java;

import java.util.Scanner;

public class SwitchCase {
    //TODO Fuck
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt()-5;
        getLeave(num);

    }

    public static void getLeave(int num){

        switch (num/10){
            case 10:
            case 9:
                System.out.println("a+");
                break;
            case 8:
                System.out.println("a");
                break;
            case 7:
                System.out.println("b");
                break;
            case 6:
                System.out.println("c");
                break;
            default:
                System.out.println("不及格");

        }
    }
}
