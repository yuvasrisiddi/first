package test;

import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter n number");
        int n=scanner.nextInt();


        for(int i=1;i<=n;i++){
            int result=n*i;
            System.out.println(n +"*"+i + "=" +result );
        }
    }
}
