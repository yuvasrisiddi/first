package test;

import java.util.Scanner;

public class comparison_logical {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a value");
        int a=scanner.nextInt();
        System.out.println("enter b value");
        int b=scanner.nextInt();
        if (a==b){
            System.out.println("False");
        }
        else if (a>0 && a>b){
            System.out.println(" true");
        }
        else if(a>=b){
            System.out.println("True");
        }
        else if(a<=b){
            System.out.println("False");
        }
        else if(a!=b){
            System.out.println("0");
        }

    }
}
