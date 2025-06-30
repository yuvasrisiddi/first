package test;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args){
        System.out.println("prime numbers  between 1 and 100");
        for (int n=2;n<=100;n++){
            boolean number=true;

            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    number=false;
                    break;
                }
            }
            if (number){
                System.out.println( n + "");
            }


        }
        System.out.println();


    }

}
