// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Multidimensional Arrays
//
// Problem 7.9 : Write a program that allows two players to play a game of Tic-Tac-Toe.
//               One player plays as player X, and the other plays as player O.
//               On every person's turn, the program should prompt enter the row and column
//               to insert the players token alternatively.
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        char[][] board = new char[3][3];    // Array representing the game board
        char player;                        // Player
        int turn;                           // Number of turns


        // Filling the array with empty spaces
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                board[i][j] = ' ';


        player = 0;
        turn   = 0;

        // Starting the game
        while (!endGame(board)) {
            turn++;

            player = generatePlayer(turn);
            takeTurn(board, player);
        }

        // Displaying the result of the game
        if (isFull(board))
            JOptionPane.showMessageDialog(null, "Board Full.\nResult: Tie.");
        else
            JOptionPane.showMessageDialog(null, "After " + turn
                    + " Turns,\nCongratulations Player " + player + "!!!");

        input.close();
    }


    // Method that prompts the player to take his turn
    public static void takeTurn(char[][] characters, char player) {
        String s;
        int row, column;


        // Prompting the user to enter the row
        s = JOptionPane.showInputDialog(null, displayBoard(characters) +
                        "Enter row number (0-2) :", "Player " + player + "\'s Turn", 1);
        row = Integer.parseInt(s);

        // Prompting the user to enter the column
        s = JOptionPane.showInputDialog(null, displayBoard(characters) +
                "Enter column number (0-2) :", "Player " + player + "\'s Turn", 1);
        column = Integer.parseInt(s);

        // Inserting the token into the board
        characters[row][column] = player;
    }


    // Method that displays the game board
    public static String displayBoard(char[][] characters) {
        String board;

        board = "";
        for (int x = 0; x < characters.length; x++) {
            board = board.concat("============\n");

            for (int y = 0; y < characters[x].length; y++) {

                board = board.concat(String.format("| %c |", characters[x][y]));
            }

            board = board.concat("\n");
        }
        board = board.concat("============\n");

        return board;
    }


    // Method that calls the game to end
    public static boolean endGame(char[][] characters) {

        // Checking the Rows
        for (char[] j : characters)
            if (checkRow(j))
                return true;

        // Checking the Columns
        for (int col = 0; col < characters.length; col++)
            if (checkCol(characters, col))
                return true;

        // Checking the diagonal from left to right
        if (checkLRDiagonal(characters))
            return true;

        // Checking the diagonal from right to left
        if (checkRLDiagonal(characters))
            return true;

        // Checking if the board is full
        if (isFull(characters))
            return true;


        return false;
    }


    // Method that checks the rows of the Tic-Tac-Toe board
    public static boolean checkRow(char[] characters) {
        int count;

        count = 1;
        for (int i = 0; i < characters.length-1; i++)
            if (characters[i] != ' ')
                if (characters[i] == characters[i+1])
                    count++;

        if (count == 3)
            return true;
        else
            return false;
    }


    // Method that checks the column of the board
    public static boolean checkCol(char[][] characters, int col) {
        int count;

        count = 1;
        for (int row = 0; row < characters.length-1; row++)
            if (characters[row][col] != ' ')
                if (characters[row][col] == characters[row+1][col])
                    count++;

        if (count == 3)
            return true;
        else
            return false;
    }


    // Method that checks the diagonal from left to right
    public static boolean checkLRDiagonal(char[][] characters) {
        int count;

        count = 1;
        for (int i = 0, j = 0; i < characters.length-1; i++, j++)
            if (characters[i][j] != ' ')
                if (characters[i][j] == characters[i+1][j+1])
                    count++;

        if (count == 3)
            return true;
        else
            return false;
    }


    // Method that checks the diagonal from right to left
    public static boolean checkRLDiagonal(char[][] characters) {
        int count;

        count = 1;
        for (int i = 0, j = characters[i].length-1; i < characters.length-1; i++, j--)
            if (characters[i][j] != ' ')
                if (characters[i][j] == characters[i+1][j-1])
                    count++;

        if (count == 3)
            return true;
        else
            return false;
    }


    // Method that checks if the board is full
    public static boolean isFull(char[][] characters) {

        for (int i = 0; i < characters.length; i++) {
            for (char j : characters[i])
                if (j == ' ')
                    return false;
        }

        return true;
    }


    // Method that returns a character based on the given integer
    // If the given integer is even, the method returns the letter O
    // Otherwise, the method returns the letter X
    public static char generatePlayer(int count) {

        if (count % 2 == 0)
            return 'O';
        else
            return 'X';
    }
}