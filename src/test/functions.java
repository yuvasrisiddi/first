package test;

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the a value");
//        int a=scanner.nextInt();
//        int b=scanner.nextInt();
        sum();
        String msg=sum1();
        System.out.println(msg);

       sum2(24,"yuva");


       int add=add(5,2);
       System.out.println(add);


    }

    //    with parameter without return
    static void sum() {
        System.out.println("without parameter without return");

    }

    //    without parameter with return
    static String sum1() {
        System.out.println("without  parameter with return");
        return "yuva";

    }

    //with parameter without return

    static void sum2(int age,String name){
        System.out.println("with parameter without return");
        System.out.println("ur age is" +age+ "ur name is" +name);
    }

    //with parameter with return

    static int add(int a ,int b){
        System.out.println("with parameter with return");
        System.out.println("add");
        return a+b;
    }
}



