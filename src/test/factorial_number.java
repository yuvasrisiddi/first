package test;

import java.util.Scanner;

public class factorial_number {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int n=scanner.nextInt();
//        int i=scanner.nextInt();
////
        if(n<0){
            System.out.println("only +ve numbers");
        }

        int fact=1;
        int i=n;
        while( i>0){
            fact=fact*i;
            i--;
        }
        System.out.println(fact);
    }
}
