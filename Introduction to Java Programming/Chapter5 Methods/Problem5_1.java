// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 5 : Methods
//
// Problem 5.1 : Write a method that returns a pentagonal number.
//               A pentagonal number is defined as n(3n - 1)/2 for n = 1,2,3, ...
//               Write a program that uses the method to display the first 100
//               pentagonal numbers with 10 numbers on each line.
//
//
// Author : Giorgio Murad

public class Main {
    public static void main(String[] args) {

        // Displaying the first 100 pentagonal numbers
        for (int i = 1; i <= 100; i++) {
            int tempn; // Temporary Pentagonal Number

            // Computing pentagonal number, and displaying it
            tempn = getPentagonalNumber(i);
            System.out.printf("%10d", tempn);

            // After printing every 10th number, a line break is executed
            if (i % 10 == 0)
                System.out.println();
        }
    }


    // Method that returns a pentagonal number where 'n' is given
    public static int getPentagonalNumber(int n) {
        int result;

        result = (n * (3 * n - 1))/2;
        return result;
    }
}