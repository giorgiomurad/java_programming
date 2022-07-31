// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// String & Text I/O
//
// Problem 9.31 : Write a hangman that randomly generates a word and prompts the user to
//                guess one letter at a time. Each letter in the word is displayed as an
//                asterisk. When the user makes a correct guess, the actual letter is then
//                displayed.
//                When the whole word is guessed, the program then displays the number of
//                wrong guesses, and asks if the user wishes to guess another word or not.
//
//
// Author : Giorgio Murad

import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] guesses;  // Boolean Array
        char[] chars;       // Array of Characters
        Random random;      // Random Value Generator
        String word;        // Given Word to Guess
        char letter;        // Letter guessed by the user
        int mistakes;       // Number of Mistakes
        int choice;         // Choice Character
        int index;          // Generated Index

        // Array of different words
        String[] words = {
                "Program", "Java", "Computer", "Science",
                "Coding", "Algorithm", "Logic", "Data",
                "Structure", "Objects", "Classes", "Files",
                "String", "Integer", "Double", "Float",
                "Boolean", "Mobile", "Desktop", "Browser"
            };


        // Starting the game
        random  = new Random();
        do {
            // Generating new word to guess
            index   = random.nextInt(words.length);
            word    = words[index];
            chars   = word.toCharArray();
            guesses = new boolean[word.length()];


            mistakes = 0;
            do {

                System.out.print("Enter your guess: " + displayWord(chars, guesses) + " > ");
                letter = input.next().charAt(0);

                mistakes += lookUp(chars, guesses, letter);
            } while (!fullyGuessed(guesses));

            // Displaying the user's result
            System.out.println();
            System.out.println("Congratulations. You have guessed the full word.");
            System.out.println("The guessed word is " + new String(chars));
            System.out.println("Number of Mistakes: " + mistakes);

            // Reading the inputted character, and converting to upper case
            // If the input was N or n, the game will stop
            // Otherwise, it will continue
            System.out.println("would you like to guess another word? (0 for no)");
            choice = input.nextInt();

        } while (choice != 0);

        System.out.println("Thank you for your time.\nHave a Nice Day :)");
        input.close();
    }


    // Method that returns the given word depending on whether each letter is guessed or not
    // For guessed letters, they are displayed as they are.
    // For unknown letters, every letter is displayed as an asterisk (*)
    public static String displayWord(char[] characters, boolean[] guess) {
        StringBuilder builder = new StringBuilder(characters.length);


        for (int i = 0; i < builder.capacity(); i++) {

            if (guess[i])
                builder.append(characters[i]);
            else
                builder.append('*');
        }

        return builder.toString();
    }

    // Method that looks up a particular character in the word.
    // If a mistake is found, the method returns one.
    // If no mistake is found, the method returns zero.
    public static int lookUp(char[] characters, boolean[] guess, char letter) {
        String temp = new String(characters);   // Creating an instance of the word
        boolean updated;


        // Setting all string characters to lower case in case the letter is in upper or lower case
        temp    = temp.toLowerCase();
        letter  = Character.toLowerCase(letter);

        updated = false;
        for (int i = 0; i < characters.length; i++)
            if (temp.charAt(i) == letter) {

                // If letter is already guessed, the function stops, and returns one
                if (guess[i]) {
                    System.out.println("Letter Already Guessed.");

                    return 1;
                }
                // If letter was not previously guessed
                else {
                    guess[i] = true;    // Indication that this letter was guessed

                    updated = true;     // Indication that the boolean array was updated
                }
            }


        // If the guess array was updated, means the given letter is found.
        // Otherwise, it's obvious that the given letter was not found.
        if (updated) {

            return 0;
        }
        else {
            System.out.println("Letter Not Available.");

            return 1;
        }
    }

    // Returns true if all guesses are true, and false otherwise.
    public static boolean fullyGuessed(boolean[] guesses) {
        int count;  // Number of Correct Guesses


        count = 0;
        for (boolean bool : guesses)
            if (bool)
                count++;

        return (count == guesses.length);
    }
}