package test;

import java.util.Scanner;

public class vowel_constant {
    public static void main(String[] args){
         Scanner scanner=new Scanner(System.in);
         System.out.println("enter the letter");
         char ch=scanner.next().toLowerCase().charAt(0);
         if (ch>='a' && ch<='z'){
             if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                 System.out.println(ch + "is a vowel");
             }
             else{
                 System.out.println(ch + "is not a vowel");
             }

         }
         else{
             System.out.println("invalid");
         }


    }
}
