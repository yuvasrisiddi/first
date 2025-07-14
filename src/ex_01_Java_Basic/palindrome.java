package ex_01_Java_Basic;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the string");
        String input=scanner.nextLine();

        String newstring_reversed=reverse_string(input);
        if(newstring_reversed.equalsIgnoreCase(input)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }




    }
//    static String reverse_string(String input){
//        StringBuilder builder=new StringBuilder(input);
//        return builder.reverse().toString();
//
//    }

    static String reverse_string(String input){
        String reverse="";
        for(int i=input.length()-1;i>=0;i--){
            reverse=reverse+input.charAt(i);
        }
        return reverse;
    }
}
