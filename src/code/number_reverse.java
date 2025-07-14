package code;

import java.util.Scanner;

public class number_reverse {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=scanner.nextInt();
        int rev=reverse(n);
        System.out.println("reverse number" +rev);
        if(is_palindrome(n)){
            System.out.println("is apalindrome");
        }
        else{
            System.out.println("is not a palinrome");
        }


    }
    static int reverse(int n){
        int reversed=0;
        while(n!=0){
            int digit=n%10;
            reversed=reversed*10 + digit;
            n=n/10;

        }
        return  reversed;
    }

    static boolean is_palindrome(int n){
        int original=n;
        int rev=reverse(n);
        return original==rev;
    }
}
