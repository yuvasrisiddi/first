package ex_01_Java_Basic;

import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;

public class ternary_opeartor {
    public static void main(String[] args){
//        int age=18;
//        String result= age > 20 ? "True":"False";
//        System.out.println(result);

//        int num=-20;
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("enter the num");
//        int num=scanner.nextInt();
//        String  result=num>0? "positive":"negative";
//        System.out.println(result);

//        int x=20;
//        int y=30;
//        String result=x>y?"True":"False";
//        System.out.println(result);

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the num:");
        int num=scanner.nextInt();
//        String result= num%2==0? "Even":"odd";
//        System.out.println(result);

        String result=(num<18)? "Minor":(num<60)? "Adult":"senior";

        System.out.println(result);



    }
}
