package com.company;

import java.util.Scanner;


public class loginValidation {

    public static void main(String[] args){
        String _userName = "UserName";
        String _passWord = "Password";

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your Username: ");

        String username = in.nextLine();

        System.out.println("Enter your Password: ");

        String password = in.nextLine();

        if( _userName.equals(username) && _passWord.equals(password)){
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Login Failed");
        }

    }

}
