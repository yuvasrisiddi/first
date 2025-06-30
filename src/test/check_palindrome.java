package test;

import java.util.Scanner;

public class check_palindrome {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the string");
        String s=scanner.toString();
        if(s==s[::-1]){
            System.out.println(s + "is a palindrome");
        }
        else{
            System.out.println(s + "is not a palindrome");
        }



    }
}
