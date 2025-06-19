package problems;

import java.util.Scanner;

public class fizz_buzz {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the num:");
        int  num=scanner.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("FizzBuzz");
        }
        else if(num%5==0){
            System.out.println("Buzz");

        }
        else if(num%3==0 ){
            System.out.println("Fizz");
        }
        else{
            System.out.println(num);

        }

    }

}
