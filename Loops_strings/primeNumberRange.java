package com.company;
import java.util.Scanner;


public class primeNumberRange {

//    boolean function to check the number is prime or  not
    static boolean isPrime(int n){
        if(n == 0 || n == 1){
            return false;
        }
        for (int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int number,i = 1,count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you desired number: ");
        number = in.nextInt();

        while (i < number){
            if(isPrime(i)){
                System.out.println(i + " ");
                count = count + 1;
            }
            i++;
        }

        System.out.println("No of Prime numbers: " + count);

    }

}
