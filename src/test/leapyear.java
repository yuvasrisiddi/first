package test;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter a n:");
        int n=scanner.nextInt();
        if((n%4==0 && n%100!=0) || (n%400==0)){
            System.out.println(n + "is  aleap year");
        }
        else {
            System.out.println(n + "is not a leap year");
        }
    }
}
