// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// String & Text I/O
//
// Problem 9.5 : Write a program that calls a function that counts the number of occurances of every
//               digit in a string.
//
//               - public static int[] count(String s)
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {
        int[] counts;
        String s;

        // Prompting the user to enter a string
        s = JOptionPane.showInputDialog("Enter a string that includes digits:");

        // Calling the function and returning the array
        counts = count(s);

        // Displaying the occurrence of every digit in the string
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {

                System.out.println(i + " occurred " + counts[i] + " " + ((counts[i] > 1)?"times":"time"));
            }
        }
    }

    // Method that returns the number of occurances of every digit in a given string
    public static int[] count(String s) {
        int[] occ = new int[10];    // Array that should contain the occurrence of every integer


        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int temp;               // Temporary Integer

                temp = (int)(ch) - '0'; // Explicit casting from char to int
                occ[temp]++;
            }
        }

        return occ;
    }
}