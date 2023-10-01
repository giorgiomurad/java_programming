// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Multidimensional Arrays
//
// Problem 7.20 : Write a program representing a Connect-Four board game, where two players
//                compete, and alternatively drop colored disks into a seven-column, six row,
//                and vertically suspended grid.
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        String s;       // String to read user input
        char[][] board; // The Game Board
        char player;    // Player
        int column;     // Column number inputted by the user
        int turns;      // Number of Turns


        // Filling the array with empty characters
        board = new char[6][7];
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                board[r][c] = ' ';
            }
        }

        // Starting the game
        turns  = 0;
        player = ' ';
        while (!endGame(board)) {
            turns++;
            player = generatePlayer(turns);


            s = JOptionPane.showInputDialog(null, loadBoard(board)
                    + "\n\nEnter Column Number:", "Player " + player + "'s Turn", 1);
            column = Integer.parseInt(s);

            drop(board, player, column);
        }

        JOptionPane.showMessageDialog(null, "Player " + player + " Wins.");
    }

    // Method that generates a player to take a turn
    public static char generatePlayer(int turn) {

        return (turn % 2 == 0)?'B':'R';
    }

    // Method that reloads the game board
    public static String loadBoard(char[][] m) {
        String board;

        board = "";
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[0].length; c++) {
                board += "| " + m[r][c] + " |";
            }

            board += "\n";
        }

        return board;
    }

    // Method that drops the given character in the specified column
    public static void drop(char[][] m, char character, int col) {
        char temp;  // Temporary Character
        int row;    // Row

        for (row = 0; row < m.length; row++) {
            temp = m[row][col];

            if (temp != ' ')
                break;
        }

        m[row-1][col] = character;
    }

    // Method that returns true if the game should stop, false otherwise
    public static boolean endGame(char[][] arr) {

        for(char[] d1 : arr)
            if (consHorizontal(d1))
                return true;

        for(int col = 0; col < arr[0].length; col++)
            if (consVertical(arr, col))
                return true;

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                if (consLRDiagonal(arr, r, c))
                    return true;
            }
        }

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                if (consRLDiagonal(arr, r, c))
                    return true;
            }
        }

        return false;
    }

    // Method that determines if the given array has four consecutive values
    public static boolean consHorizontal(char[] m) {
        int count;  // Number of occurrences

        count = 1;
        for (int e = 0; e < m.length-1; e++) {
            if (m[e] == m[e+1] && m[e] != ' ')
                count++;

            else
                count = 1;


            if (count == 4)
                return true;
        }

        return false;
    }

    // Method that determines if the multidimensional array has four consecutive values vertically
    // within the specified column
    public static boolean consVertical(char[][] m, int col) {
        int count;  // Number of occurrences

        count = 1;
        for (int r = 0; r < m.length-1; r++) {
            if (m[r][col] == m[r+1][col] && m[r][col] != ' ')
                count++;

            else
                count = 1;


            if (count == 4)
                return true;
        }

        return false;
    }

    // Method that determines if the multidimensional array has four consecutive values diagonally
    // from left to right within the specified row and column
    public static boolean consLRDiagonal(char[][] m, int row, int col) {
        int count;  // Number of Occurrences

        count = 1;
        for (int r = row, c = col; r < m.length-1 && c < m[0].length-1; r++, c++) {

            if (m[r][c] == m[r+1][c+1] && m[r][c] != ' ')
                count++;

            else
                count = 1;


            if (count == 4)
                return true;
        }

        return false;
    }


    // Method that determines if the multidimensional array has four consecutive values diagonally
    // from right to left within the specified row and column
    public static boolean consRLDiagonal(char[][] m, int row, int col) {
        int count;  // Number of Occurrences

        count = 1;
        for (int r = row, c = col; r > 0 && c > 0; r--, c--) {
            if (m[r][c] == m[r-1][c-1] && m[r][c] != ' ')
                count++;

            else
                count = 1;


            if (count == 4)
                return true;
        }

        return false;
    }
}