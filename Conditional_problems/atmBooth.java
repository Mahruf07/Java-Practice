package com.company;

import java.util.Scanner;

public class atmBooth {

    public static void main(String[] args){
        int balance = 50000,withdraw;

        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("Choose 1 for withdraw");
            System.out.println("Choose 2 to check balance");
            System.out.println("Choose 3 to Exit");
            //give input
            int input = in.nextInt();

            switch (input){

                case 1:
                    System.out.println("Enter Amount you wish to withdraw: ");

                    withdraw = in.nextInt();

                    if(balance >= withdraw){
                        balance = balance - withdraw;
                        System.out.println("Please Collect your money");
                    }
                    else {
                        System.out.println("Insufficient Balance");
                    }

                    break;

                case 2:
                    System.out.println("Balance: " + balance);
                    break;


                case 3:
                    System.exit(0);

            }

        }

    }

}
