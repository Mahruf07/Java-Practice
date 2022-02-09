package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class ageCalcFromBday {

//    Using localdate to calculate
    static void ageCalculator() {
        LocalDate myBirthday = LocalDate.of(1996,11,23);
        LocalDate today = LocalDate.now();

        Period difference = Period.between(myBirthday, today);

        System.out.println("I am "+ difference.getYears() + " years "+difference.getMonths() + " months " +
                difference.getDays()+" days");
    }
//     Parsing date and time and get date difference
    static void dateDifference() throws ParseException {
        String myBday = "23/11/1999 08:00:00 PM";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        Date date1 = formatter.parse(myBday);
        Date date2 = new Date();

        long d = date2.getTime() - date1.getTime();
        long year = d / (1000l * 60 * 60 * 24 * 365);
        long day = d / (1000 * 60 * 60 * 24) % 365;
        long hour = (d / (1000 * 60 * 60)) % 24;
        long minutes = (d / (1000 * 60)) % 60;
        long second = (d / 1000) % 60;
        System.out.println("The certified age is " + year + " Year " + day + " day " + hour+ " hour "
                                + minutes +" minutes "+second+" seconds");
    }

    public static void main(String[] args) throws ParseException{
        ageCalculator();
        dateDifference();
    }
}
