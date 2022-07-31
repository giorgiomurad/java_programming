// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// String & Text I/O
//
// Problem 9.22 : Write a program that repeatedly prompts the user to enter a state of a city,
//                and upon user input, reports whether the answer is correct or not.
//                Assume the text file contains fifty names of countries, and their states.
//
//
// Author : Giorgio Murad
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
import java.io.File;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // ---- PART 1 ----
        File file    = new File("states.txt");  // File object to reference the file
        Scanner scan = new Scanner(file);                 // Scanner object to read from the file

        // Initializing two string arrays:
        // The first array containing country names
        // The second array containing states
        String[] countries = new String[50];
        String[] states    = new String[50];


        // Filling values from the file to both arrays
        for (int i = 0; i < 50; i++) {
            countries[i] = scan.next();
            states[i]    = scan.next();

            // In case a string contained two words separated by a space
            if (countries[i].contains("_"))
                countries[i] = countries[i].replace('_', ' ');
            if (states[i].contains("_"))
                states[i] = states[i].replace('_', ' ');
        }



        // ---- PART 2 ----
        Random flip = new Random(); // Random object to generate random integers
        String user;                // Inputted string by the user
        String answer;              // Actual Answer
        int index;                  // Integer generated by flip

        // Starting The Game
        do {
            index = flip.nextInt(50);

            // Prompting the user to enter the state of the given country
            user = JOptionPane.showInputDialog("What is " + countries[index] + "\'s state called?");
            answer = states[index];

            // Displaying Result
            if (user.equals(answer))
                JOptionPane.showMessageDialog(null, "You Guessed Correct :)");
            else
                JOptionPane.showMessageDialog(null, "You Guessed Wrong." +
                        "\nThe correct answer is " + answer);
        } while (true);
    }
}