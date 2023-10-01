// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 2 : Elementary Programming
//
// Problem 2.7 : Write a program that prompts the user to enter the number of minutes,
//               and displays the number of years and days of the minutes entered.
//
//               Ex.: If the user enters 1 billion minutes, the program displays 1902
//                    years and 214 days.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Reference that reads user input
        final int MINUTES_PER_HOUR = 60;        // Constant representing minutes per hour
        final int HOURS_PER_DAY    = 24;        // Constant representing hours per day
        final int DAYS_PER_YEAR    = 365;       // Constant representing days per year
        int minutes;                            // Variable whose value is determined by the user
        int hours;                              // Variable representing hours
        int days;                               // Variable representing days
        int years;                              // Variable representing years


        // Retrieving the number of minutes from the user
        System.out.println("Enter the number of minutes :");
        minutes = input.nextInt();

        // Determining the number of days and years
        hours = minutes / MINUTES_PER_HOUR;
        days  = hours / HOURS_PER_DAY;
        years = days / DAYS_PER_YEAR;

        // Determining the remaining number of days
        // (days = days - (years * DAYS_PER_YEAR))
        days -= years * DAYS_PER_YEAR;

        // Displaying Result
        System.out.println(minutes + " minutes make up " + years + " years and " + days + " days.");
        
        input.close();
    }
}
