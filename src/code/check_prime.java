package code;

import java.util.Scanner;

public class check_prime {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter n");
        int n=scanner.nextInt();
        boolean is_prime=true;

        if(n<=1){
            is_prime=false;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    is_prime=false;
                    break;
                }
            }
        }
        if(is_prime){
            System.out.println(n +" is a prime");
        }
        else {
            System.out.println(n + "is not a prime");
        }




    }

}
