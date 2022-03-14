package com.company;

import java.util.Scanner;

//This code prints two random numbers and asks user to input the summation of the 2 numbers 5 times and give points based on the inputs

public class mathQuiz {
    public static void main(String[] args){

        int sum = 0;

        for(int i = 0; i < 5; i++){
            int rand1 = (int)Math.round(Math.random()*100);
            int rand2 = (int)Math.round(Math.random()*100);
            int answer = rand1 + rand2;

            System.out.println("The numbers are:"+rand1+" and "+rand2);

            Scanner in = new Scanner(System.in);

            System.out.println("Your input is: ");

            int userInput = in.nextInt();

            if(userInput == answer){
                sum += 1;
            }
        }
        System.out.println("Points: "+ sum);
    }
}
