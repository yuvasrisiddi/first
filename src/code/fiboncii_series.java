package code;

import java.util.Scanner;

public class fiboncii_series {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the no");
        int n=scanner.nextInt();
        int c;
        int a=0,b=1;
        for(int i=1;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c + " ");


        }

    }
}
