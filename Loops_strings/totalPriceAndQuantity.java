package com.company;

import java.util.Arrays;
import java.util.List;

//This is incomplete

public class totalPriceAndQuantity {

    public static void main(String[] args) {
        String str = "1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk";
        str = str.replaceAll("[^-?0-9]+", " ");
        System.out.println(Arrays.asList(str.trim().split(" ")));

    }
}