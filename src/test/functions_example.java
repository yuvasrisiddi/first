package test;

import java.util.Scanner;

public class functions_example {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the a value");
        int a= 0;

        if(scanner.hasNextInt()){
            a= scanner.nextInt();
        }
        else{
            System.out.println("integer values only");
            System.exit(0);
        }
        System.out.println("enter the b value");
        int b=0;

        if(scanner.hasNextInt())
        {
            b=scanner.nextInt();
        }
        else{
            System.out.println("integer values only");
            System.exit(0);
        }
        int result= sum(a,b);
        System.out.println("result" +result);

        int result1=sub(a,b);
        System.out.println(result1);

        int result3=mod(a,b);
        System.out.println(result3);
        
    }

    static int sum(int a ,int b){
        System.out.println("ADD");
        return a+b;
    }

    static int sub(int a,int b){
        System.out.println("sub");
        return a-b;
    }

    static int mod(int a,int b){
        if(b==0){
            System.out.println("zero division error");
//            throw new ArithmeticException("zero error");
            System.exit(0);

        }
        return a%b;
    }

}
