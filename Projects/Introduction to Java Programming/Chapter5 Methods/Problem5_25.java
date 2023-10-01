// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 5 : Methods
//
// Problem 5.25 : Write a method that takes a value in milliseconds, and returns a string value
//                in a following format: hh/mm/ss
//                Example: convertMillis(5500) returns 00:00:05
//                         convertMillis(100000) returns 00:01:40
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String s;       // String that takes user input
        long millis;    // Millisecond value determined by the user


        // Prompting the user to enter a value in milliseconds
        s      = JOptionPane.showInputDialog("Enter a value in milliseconds :");
        millis = Long.parseLong(s);

        // Printing the time in format hh/mm/ss
        JOptionPane.showMessageDialog(null, "The time is " + convertMillis(millis),
                "Success", 1);
    }


    // Method that takes a value in milliseconds and returns a string representing time in the format hh/mm/ss
    public static String convertMillis(long millis) {
        String shours;  // String of hours
        String sminutes;// String of minutes
        String sseconds;// String of seconds
        int hours;      // Hours
        int minutes;    // Minutes
        int seconds;    // Seconds


        // Deducing the value of seconds
        seconds = (int)(millis / 1000);

        // Deducing the value of minutes, and updating seconds
        minutes  = seconds / 60;
        seconds -= minutes * 60;

        // Deducing the value of hours, and updating minutes
        hours    = minutes / 60;
        minutes -= hours * 60;


        // Updating string of hours
        if (hours >= 10)
            shours = String.valueOf(hours);
        else
            shours = String.format("0%d", hours);

        if (minutes >= 10)
            sminutes = String.valueOf(minutes);
        else
            sminutes = String.format("0%d", minutes);

        if (seconds >= 10)
            sseconds = String.valueOf(seconds);
        else
            sseconds = String.format("0%d", seconds);


        // Returning string in format hh/mm/ss
        return String.format("%s:%s:%s", shours, sminutes, sseconds);
    }
}