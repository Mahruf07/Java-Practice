package com.company;
import java.util.Scanner;

//This program takes a number as input and show the summation of all the digits in that number

public class sumDigitFromNumber {

    public static void main(String[] args) {
        int number,digit,sum = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        number = in.nextInt();

        while (number > 0){
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        System.out.println("Sum of digits " + sum);

    }
}
