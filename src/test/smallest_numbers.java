package test;

import java.util.Scanner;

public class smallest_numbers {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the n1:");
        int n1=scanner.nextInt();
        System.out.println("enter n2 value");
        int n2=scanner.nextInt();
        int smallest;
        if(n1<n2){
            smallest=n1;
        }
        else{
           smallest=n2;
        }
        System.out.println("smaller" +smallest);

    }
}
