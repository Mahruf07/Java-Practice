package com.company;

import java.util.Scanner;

public class smallCapital {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a alphabet: ");

        char alpha = in.next().charAt(0);

        if(alpha >= 'A' && alpha <= 'Z'){
            System.out.println(alpha + " is a Uppercase letter");
        }
        else if(alpha >= 'a' && alpha <= 'z'){
            System.out.println(alpha + " is a Lowercase letter");
        }
        else {
            System.out.println(alpha + " is not a letter");
        }
    }
}
