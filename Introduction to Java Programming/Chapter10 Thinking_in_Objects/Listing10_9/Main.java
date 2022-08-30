// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Thinking in Objects
//
// Listing 10.9 : Write an object that gives the user different sets of numbers, and allows
//                the user to enter yes or no if the given set includes the user's day of
//                birth.
//                The program must use the object in order to guess the day of the user's
//                date of birth, and displays the day in the output.
//
//
// Author : Giorgio Murad

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int date = 0;   // Date to be determined
        int answer;     // Answer to be entered by the user

        // Creating a scanner object
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Is the birthday in set number " + (i+1) + "?");

            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++)
                    System.out.println(GuessDate.getValue(i, j, k) + " ");
                System.out.println();
            }

            System.out.print("\nEnter 0 for No, and 1 for Yes : ");
            answer = input.nextInt();

            if (answer == 1)
                date += GuessDate.getValue(i, 0, 0);
        }

        // Displaying the user's day of birth
        System.out.println("Your birthday is " + date);
        input.close();
    }
}