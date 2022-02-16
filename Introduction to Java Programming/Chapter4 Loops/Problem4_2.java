// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 4 : Loops
//
// Problem 4.2 : Write a program that generates ten random addition questions.
//               Each question consists of two random integers with each integer
//               between 1 and 15.
//               The user is prompted to answer all ten questions before the
//               program displays the users' score, and the time taken to answer
//               all the questions.
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String s;       // String to read user input
        int nb1, nb2;   // Two generated integers
        int userAns;    // Answer provided by the user
        int sysAns;     // Official Answer
        int correct;    // Number of correct answers
        long time;      // Total time taken in seconds


        // Starting the timer
        long timer1 = System.currentTimeMillis();

        // Starting the quiz
        correct = 0;
        for (int i = 1; i <= 10; i++) {

            // Generating two random integers for each integer is between 1 and 15
            nb1 = (int)((Math.random() * 15) + 1);
            nb2 = (int)((Math.random() * 15) + 1);

            // Prompting the user to input answer
            s       = JOptionPane.showInputDialog(
                    null, "What is " + nb1 + " + " + nb2 + " ?", "Question " + i,
                    1);
            userAns = Integer.parseInt(s);

            // Checking if the users answer is correct
            sysAns = nb1 + nb2;
            if (userAns == sysAns)
                correct++;
        }

        // Computing the total quiz time
        long timer2 = System.currentTimeMillis();
        time        = (timer2 - timer1) / 1000;

        // Displaying Final Result
        JOptionPane.showMessageDialog(null, "Your Score:  " + correct + " / 10" +
                                      "\nTime Taken : " + time + " seconds.");
    }
}