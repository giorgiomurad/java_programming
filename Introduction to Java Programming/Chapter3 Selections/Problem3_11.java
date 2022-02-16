// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 3 : Selections
//
// Problem 3.11 : Write a program that asks the user to enter a month number and a year,
//                and displays how many days this month has.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner reference to read user input
        String monthName;                       // Name of the month
        int monthNB;                            // Month Number
        int year;                               // Year
        int days;                               // Number of days
        boolean valid;                          // True if the user's input is valid, false otherwise
        boolean leapYear;                       // True if the year is a leap year, false otherwise


        // Prompting the user to enter month and year
        System.out.println("Enter the month number (1-12) and year");
        monthNB = input.nextInt();
        year    = input.nextInt();

        // Verifying if the year is a leap year or not
        leapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));

        // Deducing the number of days in the given month
        valid = true;
        switch (monthNB) {
            case 1: {
                monthName = "January";
                days      = 31;
                break;
            }

            case 2: {
                monthName = "February";
                days      = (leapYear)?29:28;
                break;
            }

            case 3: {
                monthName = "March";
                days      = 31;
                break;
            }

            case 4: {
                monthName = "April";
                days      = 30;
                break;
            }

            case 5: {
                monthName = "May";
                days      = 31;
                break;
            }

            case 6: {
                monthName = "June";
                days      = 30;
                break;
            }

            case 7: {
                monthName = "July";
                days      = 31;
                break;
            }

            case 8: {
                monthName = "August";
                days      = 31;
                break;
            }

            case 9: {
                monthName = "September";
                days      = 30;
                break;
            }

            case 10: {
                monthName = "October";
                days      = 31;
                break;
            }

            case 11: {
                monthName = "November";
                days      = 30;
                break;
            }

            case 12: {
                monthName = "December";
                days      = 31;
                break;
            }

            default:{
                valid     = false;
                monthName = "";
                days      = 0;
            }
        }


        // Displaying Result
        if (valid)
            System.out.printf("%s %d has %d days", monthName, year, days);
        else
            System.out.printf("Invalid Month Number. \nA year usually has 12 months.");

        input.close();
    }
}