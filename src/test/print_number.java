package test;

import java.util.Scanner;

public class print_number {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the n value:");
        int n=scanner.nextInt();



        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
