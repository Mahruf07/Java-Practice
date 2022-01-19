package com.company;

import java.util.Scanner;

public class greatestOf3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the First Number ");
        int num1 = in.nextInt();

        System.out.println("Input the second Number ");
        int num2 = in.nextInt();

        System.out.println("Input the third Number ");
        int num3 = in.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("The greatest number is " + num1);
        }

        else if(num2 > num1 && num2 > num3 ){
            System.out.println("The greatest number is " + num2);
        }

        else{
            System.out.println("The greatest number is " + num3);
        }

    }
}