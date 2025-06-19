package problems;

import java.util.Scanner;

public class string_reverse {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the string:");
        String input=scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println("reversed String:" +reversed);
        if(input.equalsIgnoreCase(reversed))
        {
            System.out.println(input +"is a palindrome");
        }
        else{
            System.out.println(input +"is not a palindrome");
        }
        scanner.close();
    }
    public static String reverseString(String s){
        StringBuilder reversed=new StringBuilder();
        System.out.println("reversed" + s.length()) ;
        for(int i=s.length()-1;i>=0;i--){
            System.out.println("appened" +s.charAt(i));
            reversed.append(s.charAt(i));
        }
        return reversed.toString();

    }
}
