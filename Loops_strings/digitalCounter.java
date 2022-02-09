package com.company;
import java.util.Scanner;

//press enter to continue the counter, if 0 is taken as input the system ends

public class digitalCounter {
    public static void main(String[] args){
        int count=0;
        String input;

        while (true){
            Scanner in = new Scanner(System.in);
            input = in.nextLine();

            if(input.equals("")){
                count += 1;
            }else if(input.equals("0")){
                System.exit(0);
            }
            System.out.println(count);
        }
    }
}
