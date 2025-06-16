package ex_01_Java_Basic;

import java.util.Scanner;

public class if_elseif_else {
//    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//
//
//        System.out.println("enter the num:");
//        int num=scanner.nextInt();
//
//        if(num<18){
//            System.out.println("Minor");
//
//        }
//
//    }

    public static void main(String[] args){
        int num=Integer.parseInt(args[0]);
        if(num<=18){
            System.out.println("minor");

        }
        else if(num>=19){
            System.out.println("major");
        }
        else{
            System.out.println("outofrange");
        }

    }
}
