// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.) (Edited)
// Multidimensional Arrays
//
// Problem 6.20 : Write a program that represents the classical game of Eight Queens where the user
//                is given a chess board, and is asked to place exactly eight queens on the board.
//                In order to win the game, the eight queens must be placed where two queens cannot
//                attack each otherwise the game is lost.
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        String s;           // String to take user input
        int row, column;    // Row and Column values given by the user
        int queens;         // Number of Queens
        char[][] board;     // Chess Board


        // Initializing the chess board values
        board  = new char[8][8];
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {

                board[r][c] = '-';
            }
        }

        // Starting the Game
        queens = 8;
        while (queens > 0 && !conflict(board)) {
            s = JOptionPane.showInputDialog(null, loadBoard(board) +
                    "\nEnter Row Value:", queens + " Queens Left", 1);
            row = Integer.parseInt(s);

            s = JOptionPane.showInputDialog(null, loadBoard(board) +
                    "\nEnter Column Value:", "Queens Left: " + queens, 1);
            column = Integer.parseInt(s);

            board[row][column] = 'Q';
            queens--;
        }

        // Displaying the final result
        if (queens == 0)
            JOptionPane.showMessageDialog(null, "Congratulations. You Won!",
                    "Game Over", 1);

        else
            JOptionPane.showMessageDialog(null, "Better Luck Next Time.",
                    "Game Over", 1);
    }


    // Method that loads the chess board
    public static String loadBoard(char[][] chess) {
        String m;   // String to represent the chess board

        m = "";
        for (int r = 0; r < chess.length; r++) {
            for (int c = 0; c < chess[0].length; c++) {

                m += String.format("|  %c  |", chess[r][c]);
            }
            m += "\n";
        }

        return m;
    }


    // Method that returns true if there is any conflict between two queens,
    // and returns false otherwise
    public static boolean conflict(char[][] chars) {

        for (char[] l : chars)
            if (conflictRow(l))
                return true;


        for (int col = 0; col < chars[0].length; col++)
            if (conflictVertical(chars, col))
                return true;


        for (int r = 0; r < chars.length; r++)
            for (int c = 0; c < chars[0].length; c++)
                if (conflictLRDiagonal(chars, r, c))
                    return true;


        for (int r = 0; r < chars.length; r++)
            for (int c = 0; c < chars[0].length; c++)
                if (conflictRLDiagonal(chars, r, c))
                    return true;


        return false;
    }


    // Method that determines if there are two queens present in the same row
    public static boolean conflictRow(char[] chars) {
        int count;  // Number of occurances


        count = 0;
        for (char c : chars) {

            if (c == 'Q')
                count++;

            if (count == 2)
                return true;
        }

        return false;
    }


    // Method that determines if there are two queens present in the same column
    public static boolean conflictVertical(char[][] chars, int col) {
        int count;  // Number of occurances


        count = 0;
        for (int r = 0; r < chars.length; r++) {

            if (chars[r][col] == 'Q')
                count++;

            if (count == 2)
                return true;
        }

        return false;
    }


    // Method that determines if there are two queens present in the same diagonal from left to right
    public static boolean conflictLRDiagonal(char[][] chars, int row, int col) {
        int count;  // Number of Occurances


        count = 0;
        for (int r = row, c = col;
             r < chars.length && c < chars[0].length;
             r++, c++) {

            if (chars[r][c] == 'Q')
                count++;

            if (count == 2)
                return true;
        }

        return false;
    }


    // Method that determines if there are two queens present in the same diagonal from right to left
    public static boolean conflictRLDiagonal(char[][] chars, int row, int col) {
        int count;  // Number of Occurances


        count = 0;
        for (int r = row, c = col;
             r < chars.length && c >= 0;
             r++, c--) {

            if (chars[r][c] == 'Q')
                count++;

            if (count == 2)
                return true;

        }

        return false;
    }
}