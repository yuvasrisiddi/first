package ex_01_Java_Basic;

import java.util.Scanner;

public class switch_class {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the num");
        int num=scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            default:
                System.out.println("not allowed");
                break;

        }
        scanner.close();
    }
}
