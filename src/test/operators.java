package test;

import java.util.Scanner;

public class operators {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a a value");
        int a=scanner.nextInt();
        System.out.println("enter b value");
        int b=scanner.nextInt();

        int sum1=sum(a,b);
        System.out.println(sum1);

        int sub1=sub(a,b);
        System.out.println(sub1);

        int mul1=mul(a,b);
        System.out.println(mul1);

        int mod1=mod(a,b);
        System.out.println(mod1);



    }

    static int sum(int a,int b){
        System.out.println("Addition:");
        return a+b;
    }

    static int sub(int a,int b){
        System.out.println("sub:");
        return a-b;
    }

    static int mul(int a,int b){
        System.out.println("mul");
        return a*b;
    }

    static int mod(int a,int b) {
        System.out.println("mod");
        return a % b;
    }

}
