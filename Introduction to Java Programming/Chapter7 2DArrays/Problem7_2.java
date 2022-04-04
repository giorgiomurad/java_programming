// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Multidimensional Arrays
//
// Problem 7.4 : Write a program that computes every employee's weekly hours.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nbOfEmployees;  // Number of Employees
        int[][] hours;      // Working Hours
        int sum;            // Sum


        // Prompting the user to enter the number of employees
        System.out.println("Enter the number of employees :");
        nbOfEmployees = input.nextInt();
        hours = new int[nbOfEmployees][7];

        // Prompting the user to enter the working hours of each employee
        System.out.println("Enter the daily working hours of every employee:");
        for (int i = 0; i < hours.length; i++)
            for (int j = 0; j < hours[0].length; j++) {

                hours[i][j] = input.nextInt();
            }

        // Displaying total weekly working hours for each employee
        for (int i = 0; i < hours.length; i++) {
            sum = 0;

            for (int j = 0; j < hours[0].length; j++) {

                sum += hours[i][j];
            }

            System.out.println("Employee " + (i+1) + " works " + sum + " hours a week.");
        }

        input.close();
    }
}