package com.company;

import java.util.Scanner;

public class PositiveNegetive {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Number: ");
        int input = in.nextInt();

        if (input >= 0){
            System.out.println("The number is Positive");
        }
        else {
            System.out.println("The number is negative");
        }

    }
}
