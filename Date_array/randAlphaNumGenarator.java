package com.company;

import java.util.Scanner;
// Write a program to generate random number from 1 to 10 but print by it's alphabetical version. suppose random number is 3.
// But it will print Three.
// Each time you will press enter, it will generate new random numbers from 1-10 and will show its alphabetical version.

public class randAlphaNumGenarator {
    public static void main(String[] args){

        while (true){
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            if (input.equals("")){

                int randomNumber = (int) Math.round(Math.random() * (10-1) + 1);
                System.out.println(randomNumber);

                if (randomNumber == 0){
                    System.out.println("Zero");
                }
                else if (randomNumber == 1){
                    System.out.println("One");
                }
                else if (randomNumber == 2){
                    System.out.println("Two");
                }
                else if (randomNumber == 3){
                    System.out.println("Three");
                }
                else if (randomNumber == 4){
                    System.out.println("Four");
                }
                else if (randomNumber == 5){
                    System.out.println("Five");
                }
                else if (randomNumber == 6){
                    System.out.println("Six");
                }
                else if (randomNumber == 7){
                    System.out.println("Seven");
                }
                else if (randomNumber == 8){
                    System.out.println("Eight");
                }
                else if (randomNumber == 9){
                    System.out.println("Nine");
                }else if (randomNumber == 10){
                    System.out.println("Ten");
                }

            }
            else {
                System.exit(0);
            }
        }
    }
}
