package com.company;

import java.util.Scanner;

//Find the number of notes from input amount in given array [1000,500,100,50,20,10,5,2]
public class notesCalculator {
    static void countNotes(int amount){
        int[] notes = new int[]{1000,500,100,50,20,20,5,2};
        int[] noteCounter = new int[notes.length];

        for (int i = 0; i < notes.length; i++){
            if (amount >= notes[i]){
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        System.out.println("Notes Count :");
        for (int i = 0; i < notes.length; i++){
            if(noteCounter[i] != 0){
                System.out.println( notes[i] + " : " + noteCounter[i]);
            }
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your amount: ");
        int amount = in.nextInt();
        countNotes(amount);
    }
}

