package test;

import java.util.Scanner;

public class classification_number {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the no:");
        int n=scanner.nextInt();

        if (n>=1){
            System.out.println("+ve");
        }
        else if(n<=-1){
            System.out.println("-ve");
        }
        else{
            System.out.println("zero");
        }
    }
}
