package test;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class grade_based {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println(" between 0 and 100");
        int num= scanner.nextInt();
        if(num>=90 && num<=100){
            System.out.println("A+");
        }
        else if(num>=80 && num<=89){
            System.out.println("A");
        }
        else if(num>=70 && num<=79 ){
            System.out.println("B");
        }
        else if(num>=60 && num<=69){
            System.out.println("c");
        }
        else if(num>=50 && num<=59){
            System.out.println("d");
        }
        else if(num>=40 && num<=49){
            System.out.println("e");

        }
        else{
            System.out.println("fail");
        }

    }

}
