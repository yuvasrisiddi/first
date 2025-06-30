package test;

import java.util.Scanner;

public class largest_3_numbers {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter n1:");
        int n1=scanner.nextInt();
        System.out.println("enter n2");
        int n2=scanner.nextInt();
        System.out.println("enter n3");
        int n3=scanner.nextInt();

        int largest;

        if((n1>=n2 && n1>=n3) ||(n2>=n3 && n2>=n1)){
            largest =n1;
            largest=n2;
        }
//        else if(n2>=n3 && n2>=n1){
//            largest=n2;
//        }
        else{
            largest=n3;
        }
        System.out.println("largest number is" +largest);


    }
}
