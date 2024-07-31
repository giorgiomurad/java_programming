package com.company;

// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 3 : Selections
//
// Problem 3.11 : Write a program that asks the user to enter a month number and a year,
//                and displays how many days this month has.
//
//                Note: A year that is divisible by four and one-hundred, or is only divisible by four-hundred
//                      is a leap year.
//                      In every leap year, February has 29 days.
//
//
// Author : Giorgio Murad
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     // Scanner reference to read user input
        String monthName;                           // Name of the month
        int nbOfDays;                               // Number of days
        int monthNB;                                // Month number given by the user
        int year;                                   // Year given by the user
        boolean isLeapYear;                         // Verifies if the given year is a leap year or not
        boolean isValid;                            // Verifies if the input values are valid


        // Prompting the user to input the month number followed by the year
        System.out.println("Enter the month number and the year:");
        monthNB = input.nextInt();
        year = input.nextInt();

        // Verifying if the inputted year is a leap year of not
        isLeapYear = ((year % 4 == 0 && year % 100 == 0) || year % 400 == 0);

        // Calculating Results
        switch (monthNB) {
            case 1: {
                monthName = "January";
                nbOfDays = 31;

                isValid = true;
                break;
            }
            case 2: {
                monthName = "February";
                nbOfDays = (isLeapYear) ? 29 : 28;

                isValid = true;
                break;
            }
            case 3: {
                monthName = "March";
                nbOfDays = 31;

                isValid = true;
                break;
            }
            case 4: {
                monthName = "April";
                nbOfDays = 30;

                isValid = true;
                break;
            }
            case 5: {
                monthName = "May";
                nbOfDays = 31;

                isValid = true;
                break;
            }
            case 6: {
                monthName = "June";
                nbOfDays = 30;

                isValid = true;
                break;
            }
            case 7: {
                monthName = "July";
                nbOfDays = 31;

                isValid = true;
                break;
            }
            case 8: {
                monthName = "August";
                nbOfDays = 31;

                isValid = true;
                break;
            }
            case 9: {
                monthName = "September";
                nbOfDays = 30;

                isValid = true;
                break;
            }
            case 10: {
                monthName = "October";
                nbOfDays = 31;

                isValid = true;
                break;
            }
            case 11: {
                monthName = "November";
                nbOfDays = 30;

                isValid = true;
                break;
            }
            case 12: {
                monthName = "December";
                nbOfDays = 31;

                isValid = true;
                break;
            }
            default: {
                monthName = "";
                nbOfDays = 0;
                isValid = false;
            }
        }

        // Displaying the result
        if (isValid)
            System.out.printf("%s has %d days.", monthName, nbOfDays);
        else
            System.out.println("Invalid month number. (A year usually has 12 months)");

        // Closing the input
        input.close();
    }
}
