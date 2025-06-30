package test;

import java.util.Scanner;

public class smallest_3_numbers {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter th enumbers");
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();
        int smallest;

        if((n1<=n2 && n1<=n3)) {
            smallest=n1;

        }
        else if((n2<=n1 && n2<=n3)){
            smallest=n2;
        }
        else{
            smallest=n3;
        }
        System.out.println("smallest number is:" +smallest);
    }
}
