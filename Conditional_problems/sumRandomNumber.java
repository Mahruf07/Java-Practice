package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class sumRandomNumber {

    public static void main(String[] args){

        int Sum = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("How many random numbers you want to sum: ");

        int numOfRand = in.nextInt();

        int randValues[] = new int[numOfRand];

        for (int i = 0; i < numOfRand; i++){
            int rand = (int)Math.round(Math.random()*100);
            randValues[i] = rand;
            Sum += rand;
        }

        System.out.println(Arrays.toString(randValues));
        System.out.println(Sum);

    }
}
