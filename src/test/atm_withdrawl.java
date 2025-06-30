package test;

import java.util.Scanner;

public class atm_withdrawl {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the withdraw amount");
        int withdraw= scanner.nextInt();
        int balance=10000;
        if(withdraw>=0){
            if(withdraw%100==0){
                if (withdraw > balance) {
                    System.out.println(" Withdrawal amount exceeds the account balance.");
                } else if (withdraw <= 0) {
                    System.out.println("Withdrawal amount must be greater than zero.");
                } else {
                    // Deduct the amount from the balance
                    balance -= withdraw;
                    System.out.println("Withdrawal successful! Updated balance rs.: " + balance);
                }
            }
        }
    }
}
