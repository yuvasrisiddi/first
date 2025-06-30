package test;

import java.util.Scanner;

public class onc_desc {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value");
        int n=scanner.nextInt();

        System.out.println("original value" + n);
        System.out.println("pre-increment" + ++n);
        System.out.println("post-increment" + n++);
//        System.out.println(n);
        System.out.println("pre-decrement" + --n);
        System.out.println("post-decrement" + n--);

    }
}
