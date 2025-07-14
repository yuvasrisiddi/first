package code;

import java.util.Scanner;

public class swap_2_no {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the n1:");
        int n1=scanner.nextInt();
        System.out.println("enter the n2:");
        int n2=scanner.nextInt();
        int temp;

//        int n1=7;
//        int n2=8;
//        int temp;
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println(n1);
        System.out.println(n2);

    }
}
