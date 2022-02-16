// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 5 : Methods
//
// Listing 5.12 : Write a program that prompts the user to enter a year (eg. 2001), and
//                prints a full calendar representing the months and days of that year.
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String s;   // String that reads user input
        int year;   // Year determined by the user


        // Prompting the user to enter a year
        s    = JOptionPane.showInputDialog("Enter a year:");
        year = Integer.parseInt(s);
        for (int i = 1; i <= 12; i++) {
            printMonth(year, i);

            System.out.println();
        }
    }


    // Method that prints the calendar for a given month
    public static void printMonth(int year, int month) {

        printMonthTitle(year, month);
        printMonthBody(year, month);
    }


    // Method that prints the month title
    public static void printMonthTitle(int year, int month) {

        System.out.println("      " + getMonthName(month) + " " + year);
        System.out.println("———————————————————————————————");
        System.out.println("  Sun Mon Tue Wed Thu Fri Sat  ");
    }


    // Method that returns the name of the given month
    public static String getMonthName(int month) {
        String monthName;

        switch (month) {
            case 1:
                monthName = "January";
                break;

            case 2:
                monthName = "February";
                break;

            case 3:
                monthName = "March";
                break;

            case 4:
                monthName = "April";
                break;

            case 5:
                monthName = "May";
                break;

            case 6:
                monthName = "June";
                break;

            case 7:
                monthName = "July";
                break;

            case 8:
                monthName = "August";
                break;

            case 9:
                monthName = "September";
                break;

            case 10:
                monthName = "October";
                break;

            case 11:
                monthName = "November";
                break;

            case 12:
                monthName = "December";
                break;

            default:
                monthName = null;
        }

        return monthName;
    }


    // Method that prints the body of the month
    public static void printMonthBody(int year, int month) {
        int startDay  = getStartDay(year, month);
        int monthDays = getMonthDays(year, month);

        int i;
        for (i = 0; i < startDay; i++)
            System.out.print("    ");

        for (i = 1; i <= monthDays; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }


    // Method that returns the start day of the month of a given year
    public static int getStartDay(int year, int month) {
        final int START_DAY__JAN_1_1980 = 3;
        int startDay;
        int totalNumberOfDays;

        totalNumberOfDays = getTotalNumberOfDays(year, month);
        return ((totalNumberOfDays + START_DAY__JAN_1_1980) % 7);
    }


    // Method that returns the total number of days from 1800 till the given month of the given year
    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;

        // Returning the total number of days from Jan.1 1800 till Jan.1 of this year
        for (int i = 1800; i < year; i++) {
            if (isLeapYear(year))
                total += 365;
            else
                total += 366;
        }


        //Adding days from Jan to the given month
        for (int i = 1; i < month; i++)
            total += getMonthDays(year, i);

        return total;
    }


    // Method that returns the days of the given month
    public static int getMonthDays(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12)
            return 31;

        else if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        else if (month == 2)
            return (isLeapYear(year)?29:28);

        else
            return 0;
    }


    // Method that returns true if the given year is a leap year, false otherwise
    public static boolean isLeapYear(int year) {

        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
}