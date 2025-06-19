package problems;

import java.util.Scanner;

public class scale_grade {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the no:");
        int num=scanner.nextInt();
        if(num>=90 && num<=100){
            System.out.println("scale is" + "A");
        }
        else if(num>=80 && num<=89){
            System.out.println("B");
        }
        else if(num>=70 && num<=79){
            System.out.println("C");
        }
        else if(num>=60 && num<=69){
            System.out.println("D");
        }
        else if(num>=50 && num<=59){
            System.out.println("E");
        }
        else{
            System.out.println("invalid");
        }
    }
}
