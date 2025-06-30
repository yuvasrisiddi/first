package test;

import java.util.Scanner;

public class number_prime {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int n=scanner.nextInt();
        boolean isprime=true;


        if(n<=1){
            isprime=false;
        }
        else{
            for (int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }

            }

        }
        if(isprime){
            System.out.println(n + "is a prime");
        }
        else{
            System.out.println(n + "is not a prime");
        }

    }
}
