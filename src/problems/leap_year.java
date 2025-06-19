package problems;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the no:");
        int num=scanner.nextInt();
        if((num%4==0 && num%100!=0) || (num%400==0)){
            System.out.println(num + "is a leap year");
        }
        else{
            System.out.println(num + " is not a leap year");
        }
    }
}
