package ex_01_Java_Basic;

import java.util.Scanner;

public class solution {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the side:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if(a==b && b==c){
            System.out.println("all sides are equal");
        }
        else if(a==b || b==c || a==c){
            System.out.println("2 sides are equal");
        }
        else{
            System.out.println("no sides are equal");
        }
        scanner.close();

    }
}
