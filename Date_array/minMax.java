package com.company;

//Find the max and min number from a given array

public class minMax {
    //    Method for getting the max value
    static int getMaxValue(int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    //    Method for getting the min value
    static int getMinValue(int[] arr){
        int minVal = arr[0];
        for (int i = 0;i < arr.length; i++){
            if (arr[i] < minVal){
                minVal = arr[i];
            }
        }
        return minVal;
    }

    public static void main(String[] args){
        int[] array = new int[]{10,45,2,99,45,95,67,35,5,34,64,48,85};
        int max,min;
        max = getMaxValue(array);
        min = getMinValue(array);

        System.out.println("The max value is "+max);
        System.out.println("The min value is: "+min);
    }
}
