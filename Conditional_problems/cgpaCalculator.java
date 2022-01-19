package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class cgpaCalculator {

    public static void main(String[] args){

        int numOfSubject;
        float totalMarks = 0,marks,average;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Subjects: ");

        numOfSubject = scanner.nextInt();

        float marksList[] = new float[numOfSubject];
        double marksToGradeList[] = new double[numOfSubject];
        double totalGPA = 0,cgpa;

        System.out.println("Enter the of "+ numOfSubject +" Subjects");
        for (int i = 0; i < numOfSubject; i++){
             marks = scanner.nextInt();

             marksList[i] = marks; //creating an array with all the marks

             totalMarks += marks; // Calculate total marks
        }

        average = (totalMarks / numOfSubject);


        // marks to gpa

        for(int j = 0; j < marksList.length; j++){
            if(marksList[j] >= 80 && marksList[j] <= 100){
                marksToGradeList[j] = 4.00;
            }
            else if(marksList[j] >= 75 && marksList[j] <= 79){
                marksToGradeList[j] = 3.75;
            }
            else if(marksList[j] >= 70 && marksList[j] <= 74){
                marksToGradeList[j] = 3.50;
            }
            else if(marksList[j] >= 65 && marksList[j] <= 69){
                marksToGradeList[j] = 3.25;
            }
            else if(marksList[j] >= 60 && marksList[j] <= 64){
                marksToGradeList[j] = 3.00;
            }
            else if(marksList[j] >= 55 && marksList[j] <= 59){
                marksToGradeList[j] = 2.75;
            }
            else if(marksList[j] >= 50 && marksList[j] <= 54){
                marksToGradeList[j] = 2.50;
            }
            else if(marksList[j] >= 45 && marksList[j] <= 49){
                marksToGradeList[j] = 2.25;
            }
            else if(marksList[j] >= 40 && marksList[j] <= 44){
                marksToGradeList[j] = 2.00;
            }
            else {
                marksToGradeList[j] = 0;
            }
        }

        //Calculate CGPA

        for (int k = 0; k < marksToGradeList.length; k++){
             totalGPA += marksToGradeList[k];

        }

        cgpa = totalGPA/marksToGradeList.length;

        System.out.println("CGPA: " + cgpa);

        //Printing Grade

        if(average >= 80 && average <= 100){
            System.out.println("Grade: A+");
        }
        else if(average >= 75 && average <= 79){
            System.out.println("Grade: A");
        }
        else if(average >= 70 && average <= 74){
            System.out.println("Grade: A-");
        }
        else if(average >= 65 && average <= 69){
            System.out.println("Grade: B+");
        }
        else if(average >= 64 && average <= 60){
            System.out.println("Grade: B");
        }
        else if(average >= 55 && average <= 59){
            System.out.println("Grade: B-");
        }
        else if(average >= 50 && average <= 54){
            System.out.println("Grade: C");
        }
        else if(average >= 45 && average <= 49){
            System.out.println("Grade: C-");
        }
        else if(average >= 40 && average <= 45){
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }

    }
}
