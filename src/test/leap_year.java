package test;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the year:");
        int year=scanner.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("leap year:" +year);
        }
        else{
            System.out.println("not a leap year:" +year);
        }
    }
}
