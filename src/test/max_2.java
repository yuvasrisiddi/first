package test;

import java.util.Scanner;

public class max_2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter n1 value");
        int n1=scanner.nextInt();
        System.out.println("enter n2 value");
        int n2=scanner.nextInt();
        int max;
        if(n1>n2){
            max=n1;
        }
        else{
            max=n2;
        }
        System.out.println("max" +max);

    }
}
