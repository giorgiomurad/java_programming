// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.) (Edited)
// Multidimensional Arrays
//
// Problem 6.21 : Write a program that represents a bean machine, also known as the Galton Box.
//                Each ball is dropped from the opening of the board, and every nail it hits, it
//                would have a 50% chance of falling left or right till all the balls are piled up
//                in the slots at the bottom of the board.
//                The program should prompt the user to enter the number of balls to be dropped, and
//                the number of pegs, and display how the balls are accumulated in the bottom slot as
//                well as displays the path of every ball.
//
//                (Hint: The number of rights of a ball determines which column it falls into the bottom slot)
//                (      If the fallen ball has 5 rights, the ball ends up in column 5.                      )
//                (      If the fallen ball has no rights, the ball ends up in column 0.                     )
//
//
// Author : Giorgio Murad
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] slot;  // Bottom Slot
        int nbOfBalls;  // Number of Balls
        int nbOfPegs;   // Number of Pegs


        // Prompting the user to enter the number of balls followed by the number of pegs
        System.out.println("Enter below the number of balls to be dropped followed by the number of " +
                "pegs in the board:");
        nbOfBalls = input.nextInt();
        nbOfPegs  = input.nextInt();
        slot = new char[nbOfBalls][nbOfPegs+1];


        // Filling the slot board with empty values
        for (int r = 0; r < slot.length; r++) {
            for (int c = 0; c < slot[0].length; c++) {

                slot[r][c] = ' ';
            }
        }


        for (int b = 0; b < nbOfBalls; b++) {

            // Getting the direction of the ball
            char[] direction = getDirection(nbOfPegs);

            // Printing the direction
            System.out.println(direction);

            // Getting the number of rights, and dropping it in the specified column
            dropBall(slot, rights(direction));
        }

        System.out.println();
        System.out.println();

        // Displaying Output
        displaySlot(slot);
    }



    // Method that returns the direction sequence of each ball
    public static char[] getDirection(int max) {
        char[] d = new char[max];   // Ball direction
        int temp;                   // Temporary Integer


        // Left 'L' or Right 'R' for each fall
        for (int f = 0; f < max; f++) {
            temp = (int)(Math.random() + 0.5);

            d[f] = (temp == 1)?'R':'L';
        }

        return d;
    }


    // Method that generates the number of rights of a ball
    public static int rights(char[] pegs) {
        int count;              // Variable to store the number of occurances


        count = 0;
        for (char d : pegs)
            if (d == 'R')
                count++;

        return count;
    }


    // Method that drops one ball in the specified column of the slot
    public static void dropBall(char[][] s, int col) {
        char temp;  // Temporary Integer

        int row;
        for (row = 0; row < s.length; row++) {
            temp = s[row][col];

            if (temp != ' ')
                break;
        }

        s[row-1][col] = '0';
    }


    // Method that displays the slot
    public static void displaySlot(char[][] s) {

        for (int r = 0; r < s.length; r++) {
            for (int c = 0; c < s[0].length; c++) {

                System.out.print("| " + s[r][c] + " |");
            }
            System.out.println();
        }
    }
}