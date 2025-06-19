package test;

import java.util.Scanner;

public class number_classification {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter a n:");
        int n=scanner.nextInt();
        if (n>=1){
            System.out.println(n +"is positive");
        }
        else if(n<=-1){
            System.out.println(n + "is negative");
        }
        else{
            System.out.println(n + "is zero");
        }

    }
}
