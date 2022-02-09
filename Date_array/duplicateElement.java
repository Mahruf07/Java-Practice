package com.company;

//Find the duplicate element in an array

public class duplicateElement {
    static void duplicateFinder(int[] arr){
        String[] duplicates = new String[10];

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j])
                    System.out.println("The Duplicate element:" + arr[i]);
            }
        }
    }

    public static void main(String[] args){
        int[] myArray = new int[]{1,2,2,3,4,4,5,6,6,7,8,8,9};
        duplicateFinder(myArray);
    }
}
